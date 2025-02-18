package com.xpto.distancelearning.notification.services;

import com.xpto.distancelearning.notification.models.NotificationModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;
import java.util.UUID;

// For sealed interface, I need to set the class that will implement the interface, and this class must be in the same package level as the interface.
// I also need to make the NotificationServiceImpl class as final or non-sealed.
// The sealed interface is a feature that allows us to restrict which classes can implement an interface.
public sealed interface NotificationService permits NotificationServiceImpl {

    NotificationModel saveNotification(NotificationModel notificationModel);

    Page<NotificationModel> findAllNotificationsByUser(UUID userId, Pageable pageable);

    Optional<NotificationModel> findByNotificationIdAndUserId(UUID notificationId, UUID userId);
}