package controller;

public class CommunicateController {
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    //对项目的聊天室进行编写


    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }


    @Override
    public String toString() {
        return "CommunicateController{" +
                "a=" + a +
                ", b=" + b +
                ", sum=" + sum +
                '}';
    }
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
