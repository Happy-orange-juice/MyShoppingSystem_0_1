package MyShoppingSystem_0_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ����
 * �������ڴ�Ź���ϵͳ�ĳ�ʼ�����ݵ������ࡣ
 */


public class Data {
    /*====================���������ӵ�еı���====================*/
    public Master master	;	// ����Ա��
    public List<User> users = new ArrayList<User>();
    public List<Goods> goods = new ArrayList<Goods>();
    public String name;
    public Data() {
        users   = new ArrayList<>();
        master  = new Master();
    }
    public void initial_people()
    {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:data.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM COMPANY;" );

            while ( rs.next() ) {
                User u = new User();
                u.userID = rs.getInt("userID");
                u.userName = rs.getString("userName");
                u.userLever= rs.getString("userLever");
                u.password = rs.getString("password");
                u.user_email= rs.getString("user_email");
                u.user_phoneNumber= rs.getString("user_phoneNumber");
                u.user_rg_time= rs.getString("user_re_time");
                u.user_bill = rs.getInt("user_bill");
                users.add(u);
            }
            rs.close();
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Operation done successfully");
        master.M_username="admin";
        master.M_password="ynuinfo#777";
    }


    public void update_people(){

    }


    public void initial_goods(){
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:data.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM GOODS;" );
            while ( rs.next() ) {
                Goods g = new Goods();
                g.goodsID = rs.getInt("goodsID");
                g.goodsName = rs.getString("goodsName");
                g.Producer  = rs.getString("Producer");
                g.goods_Date = rs.getString("goods_Date");
                g.goods_size = rs.getString("goods_size");
                g.goods_number = rs.getString("goods_number");
                g.goods_count  = rs.getInt("goods_count");
                g.goods_s_count  = rs.getInt("goods_s_count");
                goods.add(g);
            }
            rs.close();
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Operation done successfully");
    }

    public void update_goods(){

    }
}

