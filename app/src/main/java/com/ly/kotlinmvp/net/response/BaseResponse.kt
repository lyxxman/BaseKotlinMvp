package com.ly.kotlinmvp.net.response


/**
 * @Package com.ly.kotlinmvp.net.response
 * @Description: TODO(请输入一段描述)
 * @author ly
 * @date 2018/5/11 16:18
 * @version V1.0
 */
class BaseResponse<T> {

    var succsess: Boolean? = false

    var statusCode: Int = 0

    var count:Int = 0

   var statusMessage:String ="";

    var  message:String ="";

    var data:T?= null;
}