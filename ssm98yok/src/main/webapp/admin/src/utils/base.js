const base = {
    get() {
                return {
            url : "http://localhost:8080/ssm98yok/",
            name: "ssm98yok",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm98yok/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "外卖点餐系统"
        } 
    }
}
export default base
