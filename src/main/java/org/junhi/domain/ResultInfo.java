package org.junhi.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 用于封装后端返回前端数据对象
 * @author junhi
 * @date 2019/7/16 11:48
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResultInfo implements Serializable {

    /**
     * 后端返回结果正常为true，发生异常返回false
     */
    private boolean flag;
    /**
     * 后端返回结果数据对象
     */
    private Object data;
    /**
     * 发生异常的错误消息
     */
    private String errorMsg;

}
