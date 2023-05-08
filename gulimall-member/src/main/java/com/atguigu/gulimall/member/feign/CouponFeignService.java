package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 这是一个声明式的远程调用 FeignClient注解会先找注册中心中的名称，然后找到这个服务后去找对应的
 * 1）、引入open-feign
 * 2）、编写一个接口，告诉SpringCloud这个接口需要调用远程服务
 *   1、声明接口的每一个方法都是调用哪个远程服务的那个请求
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    //
    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();

}
