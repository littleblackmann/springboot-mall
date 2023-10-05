package com.ltiileblack.springbootmall.util;

import java.util.List;

public class Page<T>{

    private Integer limt;
    private Integer offset;
    private Integer total;
    private List<T> results;

    public Integer getLimt() {
        return limt;
    }

    public void setLimt(Integer limt) {
        this.limt = limt;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }
}
