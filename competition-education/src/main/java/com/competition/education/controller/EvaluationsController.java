package com.competition.education.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.competition.common.annotation.Log;
import com.competition.common.core.controller.BaseController;
import com.competition.common.core.domain.AjaxResult;
import com.competition.common.enums.BusinessType;
import com.competition.education.domain.Evaluations;
import com.competition.education.service.IEvaluationsService;
import com.competition.common.utils.poi.ExcelUtil;
import com.competition.common.core.page.TableDataInfo;

/**
 * 评价Controller
 * 
 * @author crimson
 * @date 2024-06-25
 */
@RestController
@RequestMapping("/education/evaluations")
public class EvaluationsController extends BaseController
{
    @Autowired
    private IEvaluationsService evaluationsService;

    /**
     * 查询评价列表
     */
    @PreAuthorize("@ss.hasPermi('education:evaluations:list')")
    @GetMapping("/list")
    public TableDataInfo list(Evaluations evaluations)
    {
        startPage();
        List<Evaluations> list = evaluationsService.selectEvaluationsList(evaluations);
        return getDataTable(list);
    }

    /**
     * 导出评价列表
     */
    @PreAuthorize("@ss.hasPermi('education:evaluations:export')")
    @Log(title = "评价", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Evaluations evaluations)
    {
        List<Evaluations> list = evaluationsService.selectEvaluationsList(evaluations);
        ExcelUtil<Evaluations> util = new ExcelUtil<Evaluations>(Evaluations.class);
        util.exportExcel(response, list, "评价数据");
    }

    /**
     * 获取评价详细信息
     */
    @PreAuthorize("@ss.hasPermi('education:evaluations:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(evaluationsService.selectEvaluationsById(id));
    }

    /**
     * 新增评价
     */
    @PreAuthorize("@ss.hasPermi('education:evaluations:add')")
    @Log(title = "评价", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Evaluations evaluations)
    {
        return toAjax(evaluationsService.insertEvaluations(evaluations));
    }

    /**
     * 修改评价
     */
    @PreAuthorize("@ss.hasPermi('education:evaluations:edit')")
    @Log(title = "评价", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Evaluations evaluations)
    {
        return toAjax(evaluationsService.updateEvaluations(evaluations));
    }

    /**
     * 删除评价
     */
    @PreAuthorize("@ss.hasPermi('education:evaluations:remove')")
    @Log(title = "评价", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(evaluationsService.deleteEvaluationsByIds(ids));
    }
}
