package _09_board;

class Task {    //パッケージプライベート
    private String title;   //タスクのタイトル
    TaskStateEnum state;    //タスクの進行状況（最初は未着手）
    int point = 0;  //タスクのポイント

    static Task manorTraining = new Task("マナー研修", 8); //毎週発生するマナー研修

    //コンストラクタ
    Task(String title, int point) {
        this.title = title;
        this.point = point;
        this.state = TaskStateEnum.Waiting; //初期値は未着手
    }

    //タスクを進行中にするメソッド
    void changeStateToDoing() {
        state = TaskStateEnum.Doing;
    }

    //タスクを完了にするメソッド
    void changeStateToDone() {
        state = TaskStateEnum.Done;
    }

}
