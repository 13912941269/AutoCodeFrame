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
@Table(name = "pc_chapter")
@NoArgsConstructor
@AllArgsConstructor
public class PcChapter  implements Serializable{

    /** chapter_id */
    @Id
    @ApiModelProperty(value = "chapter_id")
    private Integer chapterId;
    /** chapter_name */
    @ApiModelProperty(value = "chapter_name")
    private String chapterName;
    /** 章节标题 */
    @ApiModelProperty(value = "章节标题")
    private String chapterTitle;
    /** 所属书籍 */
    @ApiModelProperty(value = "所属书籍")
    private Integer bookId;

}

