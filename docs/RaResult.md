## RaResult.scala
###返回格式：

```json
{
	status: 0,
	message: "",
	data: { }
}

```

### 字段说明
字段名 | 值举例 | 具体说明
------|-------|----------
status| 0,1	| 0: 成功， 1：系统失败， 2：业务逻辑错误， 126：无权限，127：未登录
message | “error essage” | 如果status为1或2，message为具体错误说明，其他情况下为空字符串
data | {"name":"lilei"} | data为具体返回的数据，默认为空{}
