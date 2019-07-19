package org.junhi.util;

import com.yunpian.sdk.YunpianClient;
import com.yunpian.sdk.api.SmsApi;
import com.yunpian.sdk.model.Result;
import com.yunpian.sdk.model.SmsSingleSend;

import java.util.Map;

/**
 * 短信条数太贵，玩不起
 * @author junhi
 * @date 2019/7/16 10:33
 */
public final class yunpianClientUtil {

    public static void main(String[] args) {
        //初始化clnt,使用单例方式
        YunpianClient client = new YunpianClient("02aad6c744d62aeb59adb16377705e26").init();

        //发送短信API
        Map<String, String> param = client.newParam(2);
        param.put(YunpianClient.MOBILE, "18355182591");
        param.put(YunpianClient.TEXT, "【hacker网】您的验证码是qaq");
        Result<SmsSingleSend> r = client.sms().single_send(param);
        //获取返回结果，返回码:r.getCode(),返回码描述:r.getMsg(),API结果:r.getData(),其他说明:r.getDetail(),
        // 调用异常:r.getThrowable()
        //账户:client.user().* 签名:client.sign().* 模版:client.tpl().* 短信:client.sms().* 语音:client.voice().*
        // 流量:client.flow().* 隐私通话:client.call().*

        Integer code = r.getCode();
        System.out.println(code);
        System.out.println(r.getMsg());
        System.out.println(r.getDetail());

        client.close();
    }
}
