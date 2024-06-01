package com.b304.bobs.api.response;

import lombok.Getter;

import java.util.List;
@Getter
public class ModifyRes {
    private int result;
    private Long id;
    private Object object;
    private List<?> contents;

    public boolean getResult() {
        return this.result == 1;
    }

    public Long getId() {
        return id;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<?> getContents() {
        return this.contents;
    }

    public void setContents(List<?> contents) {
        this.contents = contents;
    }

    public void setContent(Object object){
        this.object = object;
    }
}
