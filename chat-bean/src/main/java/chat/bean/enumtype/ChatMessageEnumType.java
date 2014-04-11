package chat.bean.enumtype;

public enum ChatMessageEnumType {
	
	/**枚举类型以索引为0开始，所以第一个0设置为None类型*/
	TypeNone,
	
	
	/**定义一个基本的错误枚举类型
	 * 错误类型包含了客户端请求超时的异常,404（该异常服务端处理不了，需要客户端自己处理然后由底层tcp管理类进行封装，然后交由上层ui部分给用户进行提示）
	 * */
	ChatError,
	
	/**枚举类型-定义规则
	 * _下划线之前的部分属于该枚举类型所在的功能模块的命名空间
	 * 比如ChatUserAuthorization就属于登录模块部分
	 * _下划线以后的部分属于某一个功能模块部分下的某一功能（service）的命名
	 * 比如UserLogin就是注册登录模块中的用户登录功能
	 * 注意：一个功能模块可以使用一个bean对象只是其中所使用的变量字段不一样而已
	 * */
	ChatUserAuthorization_UserLogin,
	ChatUserAuthorization_UserForgetPassword,
	ChatUserAuthorization_NewUserRegister,

}
