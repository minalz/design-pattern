package cn.minalz.composite.demo2;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-17 23:53
 **/
public class Test2 {

    public static void main(String[] args) {
        System.out.println("=========安全模式组合===========");

        File qq = new File("QQ.exe");
        File wx = new File("微信.exe");

        Folder office = new Folder("办公软件", 2);

        File word = new File("word.exe");
        File ppt = new File("PowerPoint.exe");
        File excel = new File("Excel.exe");

        office.add(word);
        office.add(ppt);
        office.add(excel);

        Folder root = new Folder("根目录", 1);

        root.add(qq);
        root.add(wx);
        root.add(office);

        System.out.println("-----------show()方法效果-----------");
        root.show();

        System.out.println("-----------list()方法效果-----------");
        root.list();
    }

    /**
     * =========安全模式组合===========
     * -----------show()方法效果-----------
     * 根目录
     *    +-QQ.exe
     *    +-微信.exe
     *    +-办公软件
     *       +--word.exe
     *       +--PowerPoint.exe
     *       +--Excel.exe
     * -----------list()方法效果-----------
     * QQ.exe
     * 微信.exe
     * 办公软件
     */
}
