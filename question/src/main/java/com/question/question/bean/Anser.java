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
public class Anser implements Serializable {

    private static final long serialVersionUID = 1L;

    private String bsm;

    /**
     * 关联问题bsm
     */
    @TableField("questionBsm")
    private String questionBsm;

    /**
     * 选项（ABCD,任意一个）
     */
    @TableField("selectItem")
    private String selectItem;

    /**
     * 每个选项对应的分数
     */
    private String score;

    /**
     * 选项内容
     */
    private String content;

    /**
     * 每个选项的评估内容
     */
    @TableField("itemPingGu")
    private String itemPingGu;

    /**
     * 每个选项的保障内容
     */
    @TableField("itemBaoZhang")
    private String itemBaoZhang;


}
