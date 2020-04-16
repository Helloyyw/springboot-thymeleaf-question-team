package com.question.question.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class SysType implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键bsm
     */
    @TableId(value = "bsm",type = IdType.UUID)
    private String bsm;

    /**
     * 问卷类型
     */
    @TableField("typeName")
    private String typeName;


}
