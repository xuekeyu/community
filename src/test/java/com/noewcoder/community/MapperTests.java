package com.noewcoder.community;


import com.noewcoder.community.dao.DiscussPostMapper;
import com.noewcoder.community.dao.UserMapper;
import com.noewcoder.community.entity.DiscussPost;
import com.noewcoder.community.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MapperTests {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private DiscussPostMapper discussPostMapper;
    @Test
    public  void test1(){
        User user = userMapper.selectById(101);
        System.out.println(user);
    }
    @Test
    public void test2(){
        List<DiscussPost> list = discussPostMapper.selectDiscussPost(0, 0, 10);
        for(DiscussPost post:list){
            System.out.println(post);
        }
        int rows = discussPostMapper.selectDiscussPostRows(0);
        System.out.println(rows);
    }

}
