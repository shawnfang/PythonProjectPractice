package com.education.system.common;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;

import java.util.Date;

public class SchoolYear {
    private static Date date;
    public static final int schoolYear = DateUtil.year(date);
    public static final String schoolTermFirstHalf = "firstHalf";
    public static final String schoolTermSecondHalf = "secondHalf";
}
