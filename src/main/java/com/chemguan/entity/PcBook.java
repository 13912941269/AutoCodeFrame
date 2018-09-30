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
@Table(name = "pc_book")
@NoArgsConstructor
@AllArgsConstructor
public class PcBook  implements Serializable{

    /** book_id */
    @Id
    @ApiModelProperty(value = "book_id")
    private Integer bookId;
    /** 书籍名称 */
    @ApiModelProperty(value = "书籍名称")
    private String bookName;
    /** 封面图 */
    @ApiModelProperty(value = "封面图")
    private String bookImg;
    /** 作者 */
    @ApiModelProperty(value = "作者")
    private String bookAuth;
    /** 简介 */
    @ApiModelProperty(value = "简介")
    private String bookDesc;
    /** colum_id */
    @ApiModelProperty(value = "colum_id")
    private Integer columId;

}

