package com.b304.bobs.api.response.Study;

import com.b304.bobs.api.response.StudyMember.StudyMemberInfoRes;
import com.b304.bobs.db.entity.Study;
import com.b304.bobs.db.entity.User;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class StudyRes {
    //leader
    private Long user_id;
    private Long study_id;
    private String user_name;
    private String user_profile;
    private String study_title;
    private String study_content;
    private int member_count;
    private List<StudyMemberInfoRes> members;
    private boolean study_onair;

    public StudyRes() {
    }

    public StudyRes(Study study) {
        User user = study.getUser();
        List<StudyMemberInfoRes> lst = new ArrayList<>();
        lst.add(new StudyMemberInfoRes(study.getUser()));

        this.user_id = user.getUser_id();
        this.study_id = study.getStudy_id();
        this.user_name = user.getUser_name();
        this.user_profile = user.getUser_profile();
        this.study_title = study.getStudy_title();
        this.study_content = study.getStudy_content();
        this.members = lst;
        this.study_onair = study.isStudy_onair();
        this.member_count = 1;
    }



}
