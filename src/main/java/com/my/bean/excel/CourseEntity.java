package com.my.bean.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelCollection;
import cn.afterturn.easypoi.excel.annotation.ExcelEntity;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@ExcelTarget("courseEntity")
@Data
public class CourseEntity implements Serializable {
    /** 主键 */
    private String        id;
    /** 课程名称 */
    @Excel(name = "课程名称", orderNum = "1", width = 25,needMerge = true)
    private String        name;
    /** 老师主键 */
    @ExcelEntity(id = "absent")
    private TeacherEntity mathTeacher;

    @ExcelEntity(id = "major",name = "教师")
    private TeacherEntity teacher;

    @ExcelCollection(name = "学生", orderNum = "4")
    private List<StudentEntity> students;
}
