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
import com.competition.education.domain.Works;
import com.competition.education.service.IWorksService;
import com.competition.common.utils.poi.ExcelUtil;
import com.competition.common.core.page.TableDataInfo;

/**
 * 作品Controller
 * 
 * @author crimson
 * @date 2024-06-25
 */
@RestController
@RequestMapping("/education/works")
public class WorksController extends BaseController
{
    @Autowired
    private IWorksService worksService;

    /**
     * 查询作品列表
     */
    @PreAuthorize("@ss.hasPermi('education:works:list')")
    @GetMapping("/list")
    public TableDataInfo list(Works works)
    {
        startPage();
        List<Works> list = worksService.selectWorksList(works);
        return getDataTable(list);
    }

    /**
     * 导出作品列表
     */
    @PreAuthorize("@ss.hasPermi('education:works:export')")
    @Log(title = "作品", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Works works)
    {
        List<Works> list = worksService.selectWorksList(works);
        ExcelUtil<Works> util = new ExcelUtil<Works>(Works.class);
        util.exportExcel(response, list, "作品数据");
    }

    /**
     * 获取作品详细信息
     */
    @PreAuthorize("@ss.hasPermi('education:works:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(worksService.selectWorksById(id));
    }

    /**
     * 新增作品
     */
    @PreAuthorize("@ss.hasPermi('education:works:add')")
    @Log(title = "作品", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Works works)
    {
        return toAjax(worksService.insertWorks(works));
    }

    /**
     * 修改作品
     */
    @PreAuthorize("@ss.hasPermi('education:works:edit')")
    @Log(title = "作品", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Works works)
    {
        return toAjax(worksService.updateWorks(works));
    }

    /**
     * 删除作品
     */
    @PreAuthorize("@ss.hasPermi('education:works:remove')")
    @Log(title = "作品", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(worksService.deleteWorksByIds(ids));
    }
}
