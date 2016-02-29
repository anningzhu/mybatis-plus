/**
 * Copyright (c) 2011-2014, hubin (jobob@qq.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.baomidou.mybatisplus.mapper;

/**
 * <p>
 * MybatisPlus 支持 SQL 方法
 * </p>
 * 
 * @author hubin
 * @Date 2016-01-23
 */
public enum SqlMethod {

	/**
	 * 插入
	 */
	INSERT_ONE("insert", "插入一条数据", "<script>INSERT INTO %s %s VALUES %s</script>"),
	
	/**
	 * 删除
	 */
	DELETE_BY_ID("deleteById", "根据ID 删除一条数据", "DELETE FROM %s WHERE %s=#{%s}"),
	DELETE_BATCH("deleteBatchIds", "根据ID集合，批量删除数据", "<script>DELETE FROM %s WHERE %s IN (%s)</script>"),
	
	/**
	 * 修改
	 */
	UPDATE_BY_ID("updateById", "根据ID 修改数据", "<script>UPDATE %s %s</script>"),
	
	/**
	 * 查询
	 */
	SELECT_BY_ID("selectById", "根据ID 查询一条数据", "SELECT %s FROM %s WHERE %s=#{%s}"),
	SELECT_BATCH("selectBatchIds", "根据ID集合，批量查询数据", "<script>SELECT %s FROM %s WHERE %s IN (%s)</script>"),
	SELECT_ONE("selectOne", "查询满足条件一条数据", "<script>SELECT %s FROM %s %s</script>"),
	SELECT_LIST("selectList", "查询满足条件所有数据", "<script>SELECT %s FROM %s %s</script>");
	
	private final String method;
	
	private final String desc;

	private final String sql;


	SqlMethod( final String method, final String desc, final String sql ) {
		this.method = method;
		this.desc = desc;
		this.sql = sql;
	}


	public String getMethod() {
		return this.method;
	}


	public String getDesc() {
		return this.desc;
	}


	public String getSql() {
		return this.sql;
	}

}
