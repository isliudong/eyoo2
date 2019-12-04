package interceptor;

public class Communicaterecepter extends LoginInterceptor {
    //接受聊天室服务端的请求
    private String receptor;

    public Communicaterecepter(String receptor) {

        this.receptor = receptor;
        if (receptor=="admin")
        {
            System.out.println("Recive the misiion");
            receptor="success";
        }
        else
        {
            System.out.println("Reception is erro!");
            receptor="faile";
        }
        //发送到远程服务端
        //完成服务端的请求并返回
    }
    public void Reback(String receptor)
    {
        if(receptor == "success")
        {
            System.out.println("请求成功");
        }
        else
        {
            System.out.println("请求失败");
        }
    }

}
