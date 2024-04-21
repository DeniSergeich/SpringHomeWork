package ru.sergeich.hw_5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.sergeich.hw_5.models.Task;
import ru.sergeich.hw_5.models.TaskStatus;
import ru.sergeich.hw_5.repositories.TaskRepository;
import ru.sergeich.hw_5.services.TaskService;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class TaskServiceSimpleTest {
    @Mock
    private TaskRepository taskRepository;

    @InjectMocks
    private TaskService taskService;

    @Test
    public void testGetAllTasks() {
        taskService.getAllTasks();
    }

    @Test
    public void updateTaskStatus() {
        Task task = new Task();
        task.setStatus(TaskStatus.NOT_STARTED);
        given(taskRepository.findById(1L)).willReturn(Optional.of(task));
        taskService.updateTaskStatus(1L);
        verify(taskRepository).save(any(Task.class));
    }
}
