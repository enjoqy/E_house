package org.junhi.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 管理员
 * @author junhi
 * @date 2019/7/15 8:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Admin implements Serializable {

    private Integer aId;
    private String aName;

}
