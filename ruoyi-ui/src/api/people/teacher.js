import request from '@/utils/request'

// 查询teacher列表
export function listTeacher(query) {
  return request({
    url: '/people/teacher/list',
    method: 'get',
    params: query
  })
}

// 查询teacher详细
export function getTeacher(id) {
  return request({
    url: '/people/teacher/' + id,
    method: 'get'
  })
}

// 新增teacher
export function addTeacher(data) {
  return request({
    url: '/people/teacher',
    method: 'post',
    data: data
  })
}

// 修改teacher
export function updateTeacher(data) {
  return request({
    url: '/people/teacher',
    method: 'put',
    data: data
  })
}

// 删除teacher
export function delTeacher(id) {
  return request({
    url: '/people/teacher/' + id,
    method: 'delete'
  })
}
