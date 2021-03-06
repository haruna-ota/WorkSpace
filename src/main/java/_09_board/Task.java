package _09_board;

public class Task {    //パッケージプライベート
    private String title;   //タスクのタイトル
    private TaskStateEnum state;    //タスクの進行状況（最初は未着手）
    private int point = 0;  //タスクのポイント

    public static final Task manorTraining = new Task("マナー研修", 8); //毎週発生するマナー研修

    //コンストラクタ
    public Task(String title, int point) {
        this.title = title;
        this.point = point;
        this.state = TaskStateEnum.Waiting; //初期値は未着手
    }

    //getter(privateの値を参照するために使う）
    public TaskStateEnum getState() {
        return state;
    }

    public int getPoint() {
        return point;
    }

    //タスクを進行中にするメソッド
    public void changeStateToDoing() {
        state = TaskStateEnum.Doing;
    }

    //タスクを完了にするメソッド
    public void changeStateToDone() {
        state = TaskStateEnum.Done;
    }

}
