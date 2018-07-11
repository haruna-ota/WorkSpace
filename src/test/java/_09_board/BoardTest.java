package _09_board;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class BoardTest {
    //テスト1パターン目
    @Test
    public void Board() {
        Task task1 = new Task("java", 3);

        Task task2 = new Task("small leadership", 5);

        Task task3 = Task.manorTraining;    //毎週発生するマナー研修

        List<Task> tasks = new ArrayList<>(Arrays.asList(task1, task2, task3));//タスクをリスト化

        Board board = new Board(tasks);

        assertSame(3, board.countTheNumberOfTasks());

        assertSame(16, board.countTheTasksPoint());

        assertEquals("0.0%", board.countTheDoneNumber());
    }

    //テスト2パターン目
    @Test
    public void Board2() {
        Task task1 = new Task("java", 3);

        Task task2 = new Task("small leadership", 5);

        Task task3 = Task.manorTraining;    //毎週発生するマナー研修

        task2.changeStateToDoing(); //タスク2を進行中にする
        task3.changeStateToDone();  //タスク3を完了にする

        List<Task> tasks = Arrays.asList(task1, task2, task3);//タスクをリスト化

        Board board = new Board(tasks);

        assertSame(3, board.countTheNumberOfTasks());

        assertSame(16, board.countTheTasksPoint());

        assertEquals("50.0%", board.countTheDoneNumber());
    }

}
