package com.aiguigu.springboot.elastic.repository;

import com.aiguigu.springboot.elastic.bean.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * Created by Administrator on 2019/9/10.
 */
public interface BookRepository extends ElasticsearchRepository<Book,Integer> {
    //参照https://docs.spring.io/spring-data/elasticsearch/docs/3.1.10.RELEASE/reference/html/  只需要写方法名 不需要写实现
    public List<Book> findByBookNameLike(String bookName);
}
