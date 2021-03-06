package org.junhi.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 用户
 * @author junhi
 * @date 2019/7/14 15:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User implements Serializable {

    private Integer uid;
    private String uName;
    private String uPassword;
    private Character uSex;
    private String uPhone;
    private String uEmail;
    /**
     * 是否使用邮箱验证过，默认为N
     */
    private String uStatus;

}
