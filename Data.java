package MyShoppingSystem_0_1;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

/**
 * @author 李宗
 * 本类用于存放购物系统的初始化数据的数据类。
 */


public class Data {
    /*====================定义该类所拥有的变量====================*/
    public Master master	;	// 管理员类
    public List<User> users = new ArrayList<User>();
    public List<Goods> goods = new ArrayList<Goods>();
    public String name;
    public Data() {
        users   = new ArrayList<>();
        master  = new Master();
    }
    public void initial_people() throws BiffException, IOException {
        File file = new File("D:\\data1.xls");
        Workbook wb =  Workbook.getWorkbook(file);
        Sheet sheet = wb.getSheet("Sheet1");
        for (int i = 0; i < sheet.getRows(); i++) {
            int j =0;
            while (j < sheet.getColumns()-1) {
                User u = new User();
                Cell cell = sheet.getCell(j,i);
                u.userID = parseInt(cell.getContents());
                j++;
                cell = sheet.getCell(j,i);
                u.userName = cell.getContents();
                j++;
                cell = sheet.getCell(j,i);
                u.userLever = cell.getContents();
                j++;
                cell = sheet.getCell(j,i);
                u.password = cell.getContents();
                j++;
                cell = sheet.getCell(j,i);
                u.user_email = cell.getContents();
                j++;
                cell = sheet.getCell(j,i);
                u.user_phoneNumber = cell.getContents();
                j++;
                cell = sheet.getCell(j,i);
                u.user_rg_time  = cell.getContents();
                j++;
                cell = sheet.getCell(j,i);
                u.user_bill = parseInt(cell.getContents());
                users.add(u);
                System.out.println(sheet.getColumns());
            }
        }
        wb.close();
        master.M_username="admin";
        master.M_password="ynuinfo#777";
    }
    public void update_people(){

    }


    public void initial_goods() throws BiffException, IOException {
        File file = new File("D:\\data.xls");
        Workbook wb =  Workbook.getWorkbook(file);
        Sheet sheet = wb.getSheet("Sheet1");
        for (int i = 0; i < sheet.getRows(); i++) {
            int j = 0;
            while(j <sheet.getColumns()-1){
                Goods g = new Goods();
                Cell cell = sheet.getCell(j,i);
                g.goodsID = parseInt(cell.getContents());
                j++;
                cell = sheet.getCell(j,i);
                g.goodsName = cell.getContents();
                j++;
                cell = sheet.getCell(j,i);
                g.Producer  = cell.getContents();
                j++;
                cell = sheet.getCell(j,i);
                g.goods_Date = cell.getContents();
                j++;
                cell = sheet.getCell(j,i);
                g.goods_size = cell.getContents();
                j++;
                cell = sheet.getCell(j,i);
                g.goods_number = cell.getContents();
                j++;
                cell = sheet.getCell(j,i);
                g.goods_count = parseInt(cell.getContents());
                j++;
                cell = sheet.getCell(j,i);
                g.goods_s_count = parseInt(cell.getContents());
                goods.add(g);
            }
        }
        wb.close();
    }

    public void update_goods(){

    }
}
/*User u = new User();
 *u.userID = rs.getInt("userID");
 * u.userName = rs.getString("userName");
 * u.userLever= rs.getString("userLever");
 * u.password = rs.getString("password");
 * u.user_email= rs.getString("user_email");
 * u.user_phoneNumber= rs.getString("user_phoneNumber");
 * u.user_rg_time= rs.getString("user_re_time");
 * u.user_bill = rs.getInt("user_bill");
 * users.add(u);*/
/*Goods g = new Goods();
g.goodsID = rs.getInt("goodsID");
g.goodsName = rs.getString("goodsName");
g.Producer  = rs.getString("Producer");
g.goods_Date = rs.getString("goods_Date");
g.goods_size = rs.getString("goods_size");
g.goods_number = rs.getString("goods_number");
g.goods_count  = rs.getInt("goods_count");
g.goods_s_count  = rs.getInt("goods_s_count");
goods.add(g);*/