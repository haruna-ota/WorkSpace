package _09_board;

import java.util.List;

class Board {
    private List<Task> tasks;   //タスクのかたまり（task1,task2......）
    private int totalPoint = 0; //タスクの総ポイント

    //コンストラクタ
    Board(List<Task> tasks) {
        this.tasks = tasks;
    }

    //かんばんはタスクの枚数を計算できる
    int countTheNumberOfTasks() {
        return tasks.size();    //タスクの数を返す(tasksの要素の数)
    }

    //かんばんはタスクの総ポイントを計算できる
    int countTheTasksPoint() {
        //Taskのpointをfor文でまわして数える
        int i;

        for (i = 0; i < tasks.size(); i++) {
            totalPoint = totalPoint + tasks.get(i).point;    //task i個目のポイントを取ってくる
        }
        return totalPoint;
    }

    //かんばんは全部のタスクの完了ポイント/総ポイントを計算できる
    String countTheDoneNumber() {
        //tasksの中で各taskのstateがTaskStateEnum.Doneのもののpointを計算
        //上記のポイント/タスクの総ポイント＊100+"%"を返す
        int i;
        double achievementPoint = 0;   //完了タスクのポイント
        double achievementRate = 0;    //タスクの達成率
        for (i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).state == TaskStateEnum.Done) {
                achievementPoint = achievementPoint + tasks.get(i).point;
            }
            achievementRate = achievementPoint / totalPoint * 100;
        }
        return String.valueOf(achievementRate) + "%";
    }
}
