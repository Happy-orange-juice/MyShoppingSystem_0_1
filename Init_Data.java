package MyShoppingSystem_0_1;
/**
 * @author 李宗
 * @date 2021/8/4
 */
import java.io.File;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class Init_Data {
    public static void main(String[] args) throws Exception {
        //Excel办公，以表格形式存在
        //如何实现：1.fastExcel 2.jxl解析（第三方） 3.poi方式（第三方）
        //通过jxl方式解析Excel步骤如下：
        //1. 导入jxl的jar包
        //2. 获取到Excel文件
        File file = new File("D:\\data.xls");
        Workbook wb =  Workbook.getWorkbook(file);
        //3. 获取指定的sheet页码   通过指定的Sheet页的名字获取指定的Sheet页，也可以通过索引获取Sheet
        Sheet sheet = wb.getSheet("Sheet1");

        //4.1 循环获取指定的行和列的单元格的值     外循环控制行，内循环控制列
        for (int i = 0; i < sheet.getRows(); i++) {
            for (int j = 0; j < sheet.getColumns(); j++) {
                Cell cell = sheet.getCell(j,i);
                System.out.print(cell.getContents()+"\t");      //\t代表tab键的字符
            }
            System.out.println();               //设置每查询完一行就换行
        }
        wb.close();    //将工作簿的资源关闭
    }

}