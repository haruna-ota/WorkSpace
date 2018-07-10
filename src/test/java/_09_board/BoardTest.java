package _09_board;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BoardTest {
    @Test
    public void Board() {
        Task task1 = new Task("java", 3);

        Task task2 = new Task("small leadership", 5);

        Task task3 = Task.manorTraining;    //毎週発生するマナー研修

        List<Task> tasks = new ArrayList<>();//タスクをリスト化
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);

        Board board = new Board(tasks);

        assertSame(board.countTheNumberOfTasks(), 3);

        assertSame(board.countTheTasksPoint(), 16);

        assertEquals(board.countTheDoneNumber(), "0.0%");
    }

    @Test
    public void Board2() {
        Task task1 = new Task("java", 3);

        Task task2 = new Task("small leadership", 5);

        Task task3 = Task.manorTraining;    //毎週発生するマナー研修

        task2.changeStateToDoing(); //
        task3.changeStateToDone();

        List<Task> tasks = new ArrayList<>();//タスクをリスト化
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);

        Board board = new Board(tasks);

        assertSame(3, board.countTheNumberOfTasks());

        assertSame(16, board.countTheTasksPoint());

        assertEquals("50.0%", board.countTheDoneNumber());
    }

}
