package cn.afterturn.easypoi.test.entity.samename;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelCollection;
import cn.afterturn.easypoi.test.entity.StudentEntity;

import java.util.List;

public class ClassName {
    
    @Excel(name="班级")
    private String name;
    
    @ExcelCollection(name="小组A")
    private List<StudentEntity> arrA;
    
    @ExcelCollection(name="小组B")
    private List<StudentEntity> arrB;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StudentEntity> getArrA() {
        return arrA;
    }

    public void setArrA(List<StudentEntity> arrA) {
        this.arrA = arrA;
    }

    public List<StudentEntity> getArrB() {
        return arrB;
    }

    public void setArrB(List<StudentEntity> arrB) {
        this.arrB = arrB;
    }
    
    

}
