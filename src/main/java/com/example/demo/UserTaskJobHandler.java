/*
 * Copyright (c) 2021-present ZHOUXUANHONG(安一老厨)<anyilanxin@aliyun.com>
 *
 * 本软件 AnYi Zeebe EE 为 AnYi Cloud 的Zeebe流程引擎商业授权软件。未经过商业授权禁止使用，违者必究。
 *
 * AnYi Zeebe EE 为商业授权软件，您在使用过程中，需要注意以下几点：
 *   1.不允许在国家法律法规规定的范围外使用，如出现违法行为作者本人不承担任何责任；
 *   2.软件使用的第三方依赖皆为开源软件，如需要修改第三方依赖请遵循第三方依赖附带的开源协议，因擅自修改第三方依赖所引起的争议，作者不承担任何责任；
 *   3.不得基于AnYi Zeebe EE的基础，修改包装而成一个与AnYi Cloud EE、AnYi Zeebe EE、AnYi Standalone EE功能类似的程序，进行销售或发布，参与同类软件产品市场的竞争；
 *   4.不得将软件源码以任何开源方式公布出去；
 *   5.不得对授权进行出租、出售、抵押或发放子许可证；
 *   6.您可以直接使用在自己的网站或软件产品中，也可以集成到您自己的商业网站或软件产品中进行出租或销售；
 *   7.您可以对上述授权软件进行必要的修改和美化，无需公开修改或美化后的源代码；
 *   8.本软件流程部分请遵循camunda zeebe开源协议：
 *     https://github.com/camunda/zeebe/blob/main/licenses/ZEEBE-COMMUNITY-LICENSE-1.1.txt
 *     https://github.com/camunda/zeebe/blob/main/licenses/APACHE-2.0.txt
 *   9.除满足上面条款外，在其他商业领域使用不受影响。同时作者为商业授权使用者在使用过程中出现的纠纷提供协助。
 */

package com.example.demo;

import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.client.api.worker.JobClient;
import io.camunda.zeebe.client.api.worker.JobHandler;
import io.camunda.zeebe.spring.client.annotation.JobWorker;
import org.springframework.stereotype.Component;


/**
 * 用户任务自动完成job
 *
 * @author zxh
 * @copyright zhouxuanhong（https://anyilanxin.com）
 * @date 2023-03-24 13:04
 * @since 1.0.0
 */
@Component
public class UserTaskJobHandler implements JobHandler {

    @Override
    @JobWorker(timeout = 2592000000L, autoComplete = false)
    public void handle(JobClient client, ActivatedJob job) {

    }
}
