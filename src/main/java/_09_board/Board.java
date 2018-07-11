package _09_board;

import java.util.List;

class Board {
    private List<Task> tasks;   //タスクのかたまり（task1,task2......）

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
        int totalPoint = 0;   //タスクの総ポイント

        for (Task task : tasks) {   //拡張for文（全ての要素に対して行う）
            totalPoint = totalPoint + task.getPoint();    //task i個目のポイントを取ってくる
        }
        return totalPoint;
    }

    //かんばんは全部のタスクの完了ポイント/総ポイントを計算できる
    String countTheDoneNumber() {
        //tasksの中で各taskのstateがTaskStateEnum.Doneのもののpointを計算
        //上記のポイント/タスクの総ポイント＊100+"%"を返す
        double achievementPoint = 0;   //完了タスクのポイント

        for (Task task : tasks) {//拡張for文（全ての要素に対して行う）
            if (task.getState() == TaskStateEnum.Done) {
                achievementPoint = achievementPoint + task.getPoint();
            }
        }
        int totalPoint = countTheTasksPoint();  //タスクの総ポイントを計算
        double achievementRate = achievementPoint / totalPoint * 100;  //  タスクの達成率を計算
        return String.valueOf(achievementRate) + "%";
    }
}
