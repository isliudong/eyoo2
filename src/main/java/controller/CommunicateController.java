package controller;

public class CommunicateController {
    //对项目的聊天室进行编写
    private int a;
    private int b;
    private int sum;
    public void CommunicateController(int a,int b)
    {
        sum=a+b;
    }
    //a发送一个请求到服务端，服务端响应然后把请求的内容发给林一个人，
    // 这样就实现了聊天的功能
}
