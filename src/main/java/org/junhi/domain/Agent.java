package org.junhi.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 代理人实体类
 * @author junhi
 * @date 2019/7/15 8:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Agent implements Serializable {


    private Integer aId;
    private String aName;
    private Integer aAge;
    private Character aSex;
    private String aPhone;
    private String aEmail;
    private String aDepartment;
    private String aImages;



}
