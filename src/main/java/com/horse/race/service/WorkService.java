package com.horse.race.service;

import com.horse.race.entity.Work;
import com.horse.race.repository.WorkRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Setter
@EnableScheduling
public class WorkService {

    @Autowired
    private WorkRepository workRepository;

    @Value("${url}")
    private String url;

    @Scheduled(cron = "*/60 * * * * *")
    public void run() {

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Work> responseEntity = restTemplate.getForEntity(url, Work.class);
        if (responseEntity.getStatusCode().equals(HttpStatus.valueOf(204))) {
            run();
        } else {
            save(responseEntity.getBody());
        }
    }

    private void save(Work work) {
        workRepository.save(work);
    }

}
