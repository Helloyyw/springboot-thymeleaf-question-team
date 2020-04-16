package com.question.question.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author yyw
 * @since 2020-04-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Question implements Serializable {

    private static final long serialVersionUID = 1L;

    private String bsm;

    /**
     * 关联问卷类型bsm
     */
    @TableField("typeBsm")
    private String typeBsm;

    /**
     * 问卷题目
     */
    @TableField("questionTtile")
    private String questionTtile;

    /**
     * 是不是单选
     */
    @TableField("isSigle")
    private String isSigle;


}
