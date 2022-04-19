package com.noewcoder.community.service;

import com.noewcoder.community.dao.DiscussPostMapper;
import com.noewcoder.community.entity.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscussPostService {

    @Autowired
    private DiscussPostMapper discussPostMapper;

    public List<DiscussPost> findeDiscussPost(int userId, int offset, int limit){
        return discussPostMapper.selectDiscussPost(userId,offset,limit);
    }
    public int findDiscussPostRows(int userId){
        return discussPostMapper.selectDiscussPostRows(userId);
    }
}
