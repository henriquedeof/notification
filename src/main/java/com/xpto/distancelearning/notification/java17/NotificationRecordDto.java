package com.xpto.distancelearning.notification.java17;

import com.xpto.distancelearning.notification.enums.NotificationStatus;
import jakarta.validation.constraints.NotNull;

public record NotificationRecordDto(@NotNull NotificationStatus notificationStatus) {

}
