package MyShoppingSystem_0_1;


import java.io.File;
import jxl.*;
/**
 * @author ����
 * @date 2021/8/4
 */
public class Init_Data {
    public static void main(String[] args) {
        int i;
        Sheet sheet;
        Workbook book;
        Cell cell1,cell2,cell3,cell4,cell5,cell6,cell7;
        try {
            //hello.xlsΪҪ��ȡ��excel�ļ���
            book= Workbook.getWorkbook(new File("D://hello.xls"));

            //��õ�һ�����������(ecxel��sheet�ı�Ŵ�0��ʼ,0,1,2,3,....)
            sheet=book.getSheet(0);
            //��ȡ���Ͻǵĵ�Ԫ��
            cell1=sheet.getCell(0,0);
            System.out.println("���⣺"+cell1.getContents());

            i=1;
            while(true)
            {
                //��ȡÿһ�еĵ�Ԫ��
                cell1=sheet.getCell(0,i);//���У��У�
                cell2=sheet.getCell(1,i);
                cell3=sheet.getCell(2,i);
                cell4=sheet.getCell(3,i);
                cell5=sheet.getCell(4,i);
                cell6=sheet.getCell(5,i);
                cell7=sheet.getCell(6,i);
                if("".equals(cell1.getContents())==true)    //�����ȡ������Ϊ��
                    break;
                System.out.println(cell1.getContents()+"\t"+cell2.getContents()+"\t"+cell3.getContents()+"\t"+cell4.getContents()
                        +"\t"+cell5.getContents()+"\t"+cell6.getContents()+"\t"+cell7.getContents());
                i++;
            }
            book.close();
        }
        catch(Exception e)  { }
    }
}
