package dao;

import entity.Blog;

public interface BlogMapper {
    Blog selectBlog(Long id);
    Integer selectCount();
}
