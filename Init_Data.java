package MyShoppingSystem_0_1;
/**
 * @author ����
 * @date 2021/8/4
 */
import java.io.File;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class Init_Data {
    public static void main(String[] args) throws Exception {
        //Excel�칫���Ա����ʽ����
        //���ʵ�֣�1.fastExcel 2.jxl�������������� 3.poi��ʽ����������
        //ͨ��jxl��ʽ����Excel�������£�
        //1. ����jxl��jar��
        //2. ��ȡ��Excel�ļ�
        File file = new File("D:\\data.xls");
        Workbook wb =  Workbook.getWorkbook(file);
        //3. ��ȡָ����sheetҳ��   ͨ��ָ����Sheetҳ�����ֻ�ȡָ����Sheetҳ��Ҳ����ͨ��������ȡSheet
        Sheet sheet = wb.getSheet("Sheet1");

        //4.1 ѭ����ȡָ�����к��еĵ�Ԫ���ֵ     ��ѭ�������У���ѭ��������
        for (int i = 0; i < sheet.getRows(); i++) {
            for (int j = 0; j < sheet.getColumns(); j++) {
                Cell cell = sheet.getCell(j,i);
                System.out.print(cell.getContents()+"\t");      //\t����tab�����ַ�
            }
            System.out.println();               //����ÿ��ѯ��һ�оͻ���
        }
        wb.close();    //������������Դ�ر�
    }

}