package com.huohuaadx.cms.common;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author: Frenude
 * @mail: frenude@gmail.com
 * @date: created in 07 12,2021
 * @desc: //todo
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageResult<T> {
    private long current;   // 当前页
    private long size;      // 当前也数量
    private long pages;     // 总页数
    private long total;     // 总记录数
    private List<T> data;   // 数据
    public static <T> PageResult<T> pageToPageResult(Page<T> page) {
        return new PageResult<>(page.getCurrent(), page.getSize(), page.getPages(), page.getTotal(), page.getRecords());
    }
}
