import request from '@/utils/request'

// 查询student列表
export function listStudent(query) {
  return request({
    url: '/people/student/list',
    method: 'get',
    params: query
  })
}

// 查询student详细
export function getStudent(id) {
  return request({
    url: '/people/student/' + id,
    method: 'get'
  })
}

// 新增student
export function addStudent(data) {
  return request({
    url: '/people/student',
    method: 'post',
    data: data
  })
}

// 修改student
export function updateStudent(data) {
  return request({
    url: '/people/student',
    method: 'put',
    data: data
  })
}

// 删除student
export function delStudent(id) {
  return request({
    url: '/people/student/' + id,
    method: 'delete'
  })
}
