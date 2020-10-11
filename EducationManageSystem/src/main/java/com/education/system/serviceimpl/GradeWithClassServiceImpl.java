package com.education.system.serviceimpl;

import com.education.system.dto.StuClassDto;
import com.education.system.dto.StuGradeDto;
import com.education.system.entity.eduStuClass;
import com.education.system.entity.eduStuClassExample;
import com.education.system.entity.eduStuInfoExample;
import com.education.system.mapper.dtoMapper.StuGradeDtoMapper;
import com.education.system.mapper.eduStuClassMapper;
import com.education.system.mapper.eduStuInfoMapper;
import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeWithClassServiceImpl {
    @Autowired
    private StuGradeDto stuGradeDto;

    @Autowired
    private StuGradeDtoMapper stuGradeDtoMapper;

    @Autowired
    private eduStuClassMapper eduStuClassMapper;

    @Autowired
    private eduStuInfoMapper eduStuInfoMapper;

    public int addGrade(StuGradeDto stuGradeDto){
        eduStuClassExample eduStuClassExample = new eduStuClassExample();
        eduStuClassExample.Criteria criteria = eduStuClassExample.createCriteria();
        criteria.andGradeNameEqualTo(stuGradeDto.getGradeName());
        if (eduStuClassMapper.selectByExample(eduStuClassExample).isEmpty()) {
            return stuGradeDtoMapper.insert(stuGradeDto);
        } else {
            return 0;
        }
    }

    public int updateGrade(StuGradeDto stuGradeDto){
        eduStuClassExample eduStuClassExample = new eduStuClassExample();
        eduStuClassExample.Criteria criteria = eduStuClassExample.createCriteria();
        criteria.andGradeNameEqualTo(stuGradeDto.getGradeName()).andGradeNameGreaterThan("1");
        List<eduStuClass> eduStuClassExamples =  eduStuClassMapper.selectByExample(eduStuClassExample);
        if(eduStuClassExamples.size()> 1){
            return 0;
        }
        criteria.andParentIdEqualTo(eduStuClassExamples.get(0).getId());
        if (eduStuClassMapper.selectByExample(eduStuClassExample).size()>0) {
            return 0;
        }
        criteria.andGradeNameEqualTo(stuGradeDto.getGradeName());
        return eduStuClassMapper.updateByExample(stuGradeDto,eduStuClassExample);
    }

    public int deleteGrade(int id){
        return eduStuClassMapper.deleteByPrimaryKey(id);
    }

    public int addClass(StuClassDto stuClassDto){
        eduStuClassExample eduStuClassExample = new eduStuClassExample();
        eduStuClassExample.Criteria criteria = eduStuClassExample.createCriteria();
        criteria.andParentIdEqualTo(stuClassDto.getParentId()).andClassNameEqualTo(stuClassDto.getClassName());
        List<eduStuClass> eduStuClasses = eduStuClassMapper.selectByExample(eduStuClassExample);
        if (eduStuClasses.size()>1) {
            return 0;
        }else {
            stuClassDto.setStatus(1);
            return eduStuClassMapper.insert(stuClassDto);
        }
    }

    public int updateClass(StuClassDto stuClassDto){

        eduStuClassExample eduStuClassExample = new eduStuClassExample();
        eduStuClassExample.Criteria criteria = eduStuClassExample.createCriteria();
        criteria.andClassNameEqualTo(stuClassDto.getClassName());
        if(eduStuClassMapper.selectByExample(eduStuClassExample).size()>1){
            return 0;
        }

        eduStuInfoExample eduStuInfoExample = new eduStuInfoExample();
        eduStuInfoExample.Criteria criteria1 = eduStuInfoExample.createCriteria();
        criteria1.andClassIdEqualTo(stuClassDto.getId());
        if(eduStuInfoMapper.selectByExample(eduStuInfoExample).size()>0){
            return 0;
        }
        criteria.andIdEqualTo(stuClassDto.getId());
        eduStuClassMapper.updateByExample(stuClassDto,eduStuClassExample);
        return 1;
    }
}
