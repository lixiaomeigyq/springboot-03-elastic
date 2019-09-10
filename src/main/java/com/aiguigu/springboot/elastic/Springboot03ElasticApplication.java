package com.aiguigu.springboot.elastic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot 默认支持两种技术来和ES交互；
 * 1.Jest，@ConditionalOnClass(JestClient.class) ,由于没有导入JestClient相关包，默认是不生效的
 *   需要导入jest的工具包（io.searchbox.client.JestClient）
 *   如果生效，则是用JestClient与es的9200端口进行http交互
 * 2.SpringData ElasticSearch【ES版本有可能不合适】
 * 		版本适配说明：https://github.com/spring-projects/spring-data-elasticsearch
 * 	    如果版本不适配
 * 	         1）升级SpringBoot版本
 * 	         2）安装对应版本的ES
 *
 *      1）、Client  节点信息clusterNodes;clusterName
 *      2）、ElasticsearchTemplate 操作es  ElasticsearchConverter SimpleElasticsearchMappingContext
 *      3)、编写一个ElasticsearchRepository的子接口来操作ES
 *  两种用法： https://github.com/spring-projects/spring-data-elasticsearch
 *  1）编写一个ElasticsearchRepository
 *  2）ElasticsearchTemplate 
 */

@SpringBootApplication
public class Springboot03ElasticApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot03ElasticApplication.class, args);
	}

}
