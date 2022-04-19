package com.noewcoder.community.dao;

import com.noewcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    List<DiscussPost> selectDiscussPost(@Param("userId") int userId,@Param("offset") int offset,@Param("limit") int limit);

    int selectDiscussPostRows(@Param("userId") int userId);



}
