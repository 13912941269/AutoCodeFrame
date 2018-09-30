package com.chemguan.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import io.swagger.annotations.*;

/**
* Created with  on Sun Sep 30 11:46:29 CST 2018.
*/
@Entity
@Data
@Table(name = "pc_colum")
@NoArgsConstructor
@AllArgsConstructor
public class PcColum  implements Serializable{

    /** colum_id */
    @Id
    @ApiModelProperty(value = "colum_id")
    private Integer columId;
    /** 分类名称 */
    @ApiModelProperty(value = "分类名称")
    private String columName;
    /** 添加时间 */
    @ApiModelProperty(value = "添加时间")
    private Date addtime;
    /** 父id */
    @ApiModelProperty(value = "父id")
    private Integer parentId;
    /** 排序 */
    @ApiModelProperty(value = "排序")
    private Integer orderVal;

}

