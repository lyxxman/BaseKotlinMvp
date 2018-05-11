package com.ly.kotlinmvp.net.service

import com.ly.kotlinmvp.bean.GeoArea
import com.ly.kotlinmvp.net.response.BaseResponse
import io.reactivex.Observable
import retrofit2.http.GET


/**
 * @Package com.ly.kotlinmvp.net.service
 * @Description: TODO(请输入一段描述)
 * @author ly
 * @date 2018/5/11 16:14
 * @version V1.0
 */
interface MainService {

    @GET("geoarea/getAllGeoEnable")
    fun getAllEnableGeo(): Observable<BaseResponse<ArrayList<GeoArea>>>;
}