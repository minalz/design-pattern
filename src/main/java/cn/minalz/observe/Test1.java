package cn.minalz.observe;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-14 23:39
 **/
public class Test1 {

    public static void main(String[] args) {
        AppSquare appSquare = AppSquare.getInstance();
        Teacher zhangsan = new Teacher("张三");
        Teacher lisi = new Teacher("李四");

        appSquare.addObserver(zhangsan);
        appSquare.addObserver(lisi);

        // 业务逻辑代码
        Question question = new Question();
        question.setUsername("昭武");
        question.setContent("观察者模式适用于哪些场景？");

        appSquare.publishQuestion(question);
    }

}
