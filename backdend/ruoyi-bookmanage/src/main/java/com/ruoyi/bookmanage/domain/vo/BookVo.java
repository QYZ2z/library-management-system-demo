package com.ruoyi.bookmanage.domain.vo;

import com.ruoyi.bookmanage.domain.Book;
import lombok.Data;

@Data
public class BookVo extends Book {
    //所属区域名称
    private String regionName;
    //所属类别名称
    private String categoryName;
}
