# test-springcloud
- eureka 服务器：192.144.212.237:10080
- user服务：192.144.212.237:10001
   - 接口1：/getUser
   - 接口2：/user/{id}
- journal服务：192.144.212.237:10002
   - 接口1：/getJournal
- journal服务调用了user服务的接口2
