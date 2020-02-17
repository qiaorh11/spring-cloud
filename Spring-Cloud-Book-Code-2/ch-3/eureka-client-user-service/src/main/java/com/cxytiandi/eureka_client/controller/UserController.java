package com.cxytiandi.eureka_client.controller;

import org.apache.commons.lang.math.RandomUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private static int maxSleepMillis = 1;

    @GetMapping("/user/hello")
    public String hello() {
        int sleepMillis = RandomUtils.nextInt(UserController.maxSleepMillis);
        try {
            Thread.sleep(sleepMillis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello";
    }

	@GetMapping("/maxSleepMillis")
    public int getMaxSleepMillis() {
		return UserController.maxSleepMillis;
    }

	@PostMapping("/maxSleepMillis")
	public void setMaxSleepMillis(int maxSleepMillis) {
		UserController.maxSleepMillis = maxSleepMillis;
	}

}
