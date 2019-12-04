package interceptor;

public class Communicaterecepter extends LoginInterceptor {
    //接受聊天室服务端的请求
    private String receptor;

    public Communicaterecepter(String receptor) {

        this.receptor = receptor;
        if (receptor=="admin")
        {
            System.out.println("Recive the misiion");
        }
        else
        {
            System.out.println("Reception is erro!");
        }
        //发送到远程服务端
    }
}
