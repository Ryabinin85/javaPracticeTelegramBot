package com.example.javapracticetelegrambot.repository;

import com.example.javapracticetelegrambot.entity.NotificationTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface NotificationTaskRepository extends JpaRepository<NotificationTask, Long> {

    List<NotificationTask> findNotificationTaskByDateTime(LocalDateTime localDateTime);

    List<NotificationTask> findNotificationTaskByDateTimeAndChatId(LocalDateTime localDateTime, long chatId);

}
