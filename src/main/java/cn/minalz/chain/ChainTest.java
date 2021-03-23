package cn.minalz.chain;

/**
 * @description:
 * @author: minalz
 * @date: 2021-03-23 22:56
 **/
public class ChainTest {

    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        memberService.login("tom", "666");
    }
}
