package com.luos.model;

import com.luos.util.DateFormatUtil;

import java.util.Date;

/**
 * 日志类
 *
 * Created by luos on 2016/11/1.
 */

public class Diary {
    /**
     * 日志ID
     */
    private int diaryId;

    /**
     * 日志标题
     */
    private String title;

    /**
     * 日志内容
     */
    private String content;

    /**
     * 日志类别id
     */
    private int typeId = -1;

    /**
     * 日志类别名称
     */
    private String typeName;

    /**
     * 日志发布日期
     */
    private Date releaseDate;

    private String releaseDateStr;
    private int diaryCount;

    public int getDiaryId() {
        return diaryId;
    }

    public void setDiaryId(int diaryId) {
        this.diaryId = diaryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }


    public String getReleaseDateStr() {
        return releaseDateStr;
    }

    public void setReleaseDateStr(String releaseDateStr) {
        this.releaseDateStr = releaseDateStr;
    }

    public int getDiaryCount() {
        return diaryCount;
    }

    public void setDiaryCount(int diaryCount) {
        this.diaryCount = diaryCount;
    }

    @Override
    public String toString() {
        return "diaryId:"+diaryId
                +"\ndiaryTitle:"+title
                +"\ndiaryContent:"+content
                +"\ndiaryTypeId:"+typeId
                +"\ndiaryTypeName:"+typeName
                +"\ndiaryReleaseDate"+ DateFormatUtil.DateToString(releaseDate,"yyyy-MM-dd HH:mm:ss");
    }
}
