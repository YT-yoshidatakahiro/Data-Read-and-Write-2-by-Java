import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

class DatRW{

	public static void main(String[] args) {
		try {
			//ファイル読み込み設定
			String pathr =
					"C:\\Users\\yoshida4\\Documents\\課題テスト\\kadai2_1Java\\src\\kadaiDBr2_1.csv";
			File fi1 = new File(pathr);
			//ファイル書き込み設定
			String pathw =
					"C:\\Users\\yoshida4\\Documents\\課題テスト\\kadai2_1Java\\src\\kadaiDBw2_1.csv";
			File fiw1 = new File(pathw);

			//パスの有無
	        if (!fi1.exists()||!fiw1.exists()) {

	        	System.out.println("ファイルパス確認");
	        }else {
	        	//読込設定
				FileReader fi2 = new FileReader(fi1);
				BufferedReader br =  new BufferedReader(fi2);
				//書き込み設定
				FileWriter fw1 = new FileWriter(fiw1,false);
		        BufferedWriter fw2 =new BufferedWriter(fw1);
		        PrintWriter fp = new PrintWriter(fw2);

		        //読込み・書き込み同時進行
				int i=0;
				String line1= br.readLine();
				while (line1 !=null) {

					String line2[]=line1.split(",");

					// 行数＋半角スペース表記に変換:同時に書き込み
					System.out.print(i+" ");
					fp.print(i+" ");
					for(int j=0;j<line2.length;j++) {
						System.out.print(line2[j]+" ");
						fp.print(line2[j]+" ");
					}
					System.out.println("\n");
					fp.print("\n");
					 line1= br.readLine();
					i++;
				}
				fp.close();
			}
        }catch(Exception e) {
			System.out.println("file not found");
		}

		//出力

	}
}
