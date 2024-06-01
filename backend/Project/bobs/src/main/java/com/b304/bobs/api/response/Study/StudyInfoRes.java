package com.b304.bobs.api.response.Study;

import com.b304.bobs.api.response.StudyMember.StudyMemberInfoRes;
import com.b304.bobs.db.entity.Study;
import com.b304.bobs.db.entity.User;
import lombok.Getter;

import java.util.List;

@Getter
public class StudyInfoRes {
    private Long user_id;
    private Long study_id;
    private boolean check_write;
    private String user_name;
    private String user_profile;
    private boolean study_lock;
    private String study_title;
    private String study_content;
    private String study_time;
    private int member_count;
    private boolean study_onair;
    private List<StudyMemberInfoRes> member_list;

    public StudyInfoRes() {
    }

    public StudyInfoRes(Study study, List<StudyMemberInfoRes> member_list, Long Origin_user_id) {
        User user = study.getUser();

        this.user_id = user.getUser_id();
        this.study_id = study.getStudy_id();
        this.user_name = user.getUser_name();
        this.user_profile = user.getUser_profile();
        this.check_write = Origin_user_id.equals(user_id);
        this.study_lock = study.getStudy_lock();
        this.study_title = study.getStudy_title();
        this.study_content = study.getStudy_content();
        this.study_time = study.getStudy_time();
        this.study_onair = study.isStudy_onair();
        this.member_list = member_list;
        this.member_count = member_list.size();
    }
}
