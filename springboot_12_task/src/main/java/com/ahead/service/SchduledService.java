package com.ahead.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Yang
 * @version 1.0
 * @time 2019/4/7
 */
@Service
public class SchduledService {

    /**
     * second(秒) minute(分), hour(时), day of month(日), month(月) , day of week(周几).
     *
     * 【0 0/5 14,18 * * ?】每天14点整和18点整，每隔5分钟执行一次
     * 【0 15 10 ? * 1-6】每个月的周一至周六10:15分执行一次；?冲突匹配，*是代表每次，而这里又指定了周一到周六，如果用*就会冲突，使用?来冲突匹配
     * 【0 0 2 ? * 6L】每个月的最后一个周六凌晨2点执行一次
     * 【0 0 2 LW * ?】每个月的最后一个工作日凌晨2点执行一次
     * 【0 0 2-4 ? * 1#1】每个月的第一个周一凌晨2点到4点期间，每个整点都执行一次
     */
//    @Scheduled(cron = "0 * * * * 1-7") //(周一到周日每分钟的0秒执行一次)
//    @Scheduled(cron = "0 43-44 * * * 1-7") (周一到周日每小时的43-44分钟的0秒执行一次)
    @Scheduled(cron = "0-4 * * * * 1-7")
    public void hello() {
        System.out.println("hello");
    }
}
