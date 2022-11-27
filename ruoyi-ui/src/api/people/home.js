import request from '@/utils/request'

// 查询home列表
export function listHome(query) {
  return request({
    url: '/people/home/list',
    method: 'get',
    params: query
  })
}

// 查询home详细
export function getHome(id) {
  return request({
    url: '/people/home/' + id,
    method: 'get'
  })
}

// 新增home
export function addHome(data) {
  return request({
    url: '/people/home',
    method: 'post',
    data: data
  })
}

// 修改home
export function updateHome(data) {
  return request({
    url: '/people/home',
    method: 'put',
    data: data
  })
}

// 删除home
export function delHome(id) {
  return request({
    url: '/people/home/' + id,
    method: 'delete'
  })
}

// 删除home
export function demo(data) {
  return request({
    url: '/people/home/demo',
    method: 'get',
    params: data
  })
}

// 删除home
export function echartdemo1() {
  return request({
    url: '/people/home//chart/demo1',
    method: 'get',
    params: ""
  })
}
