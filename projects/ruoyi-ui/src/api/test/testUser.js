import request from '@/utils/request'

// 查询测试代码自动生成列表
export function listTestUser(query) {
  return request({
    url: '/test/testUser/list',
    method: 'get',
    params: query
  })
}

// 查询测试代码自动生成详细
export function getTestUser(id) {
  return request({
    url: '/test/testUser/' + id,
    method: 'get'
  })
}

// 新增测试代码自动生成
export function addTestUser(data) {
  return request({
    url: '/test/testUser',
    method: 'post',
    data: data
  })
}

// 修改测试代码自动生成
export function updateTestUser(data) {
  return request({
    url: '/test/testUser',
    method: 'put',
    data: data
  })
}

// 删除测试代码自动生成
export function delTestUser(id) {
  return request({
    url: '/test/testUser/' + id,
    method: 'delete'
  })
}
