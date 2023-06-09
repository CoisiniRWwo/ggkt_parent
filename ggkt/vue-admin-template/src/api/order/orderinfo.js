import request from '@/utils/request'

const api_name = '/admin/order/orderinfo'

export default {

    getPageList(page, limit, searchObj) {
        return request({
        url: `${api_name}/${page}/${limit}`,
        method: 'get',
        params: searchObj
        })
    }
}