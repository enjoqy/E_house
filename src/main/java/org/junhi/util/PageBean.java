package org.junhi.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 分页工具类
 * @author junhi
 * @date 2019/7/15 21:58
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PageBean<T> implements Serializable {

    /**
     * 当前页
     */
    private Integer currentPage;

    /**
     * 每页显示的总条数
     */
    private Integer pageSize;

    /**
     * 总条数
     */
    private Integer totalNum;

    /**
     * 是否有下一页
     */
    private Integer isMore;

    /**
     * 总页数
     */
    private Integer totalPage;

    /**
     * 开始索引
     */
    private Integer startIndex;

    /**
     * 分页结果
     */
    private List<T> items;

}
