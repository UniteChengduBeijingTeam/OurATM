package chat.bean.enumtype;

public enum ChatServiceResponseStatusType {
	
	/**服务器响应类型
	 * 下列的枚举类型都属于服务器返回200的code
	 *
	 * */
	
	/**拒绝客户端这次发起的请求（注：这个目前还没有想到是否有用）*/
	ChatServiceResponseStatus_Denied(""),
	/**客户端这次发起的请求无权限做此次操作(注：这个目前还没有想到是否有用,因为ui部分应该将没有权限的功能给屏蔽掉)*/
	ChatServiceResponseStatus_Forbidden(""),
	/**客户端session已过期需要重新登录*/
	ChatServiceResponseStatus_SessionExpried("您的账号长期未登录,请重新登录"),
	/**客户端这次发起的请求提交的参数不正确*/
	ChatServiceResponseStatus_ParamsError("请填写正确的内容"),
	/**客户端这次发起的请求被服务器正确处理并返回*/
	ChatServiceResponseStatus_OK("OK啦");
	
	private String message;
	
	ChatServiceResponseStatusType(String message){
		
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
