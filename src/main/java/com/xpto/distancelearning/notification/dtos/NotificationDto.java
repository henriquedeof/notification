package com.xpto.distancelearning.notification.dtos;

import com.xpto.distancelearning.notification.enums.NotificationStatus;
import jakarta.validation.constraints.NotNull;

public class NotificationDto {

    @NotNull
    private NotificationStatus notificationStatus;

    public NotificationStatus getNotificationStatus() {
        return notificationStatus;
    }

    public void setNotificationStatus(NotificationStatus notificationStatus) {
        this.notificationStatus = notificationStatus;
    }
}