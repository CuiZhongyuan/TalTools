package com.taltools.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Setter
@Getter
@Data
public class AppraiseResultEntity  {
    //工单号
    private String wo_number;
    //节点
    private  String node;
    /**评价状态: （评价已解决（result：1）|评价未解决（result：2）|未评价（result：3）
     * |邀评未评价（result：4）|邀评中（result：5）|邀评终止（result：6））
     */
    private String result;
    //推送次数
    private int num;
    //最大推送次数
    private int max_num;
    //创建时间
    private String create_time;
    private String  modify_time;

}
