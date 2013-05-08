package datautil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversor {

	public Date dataToJava(String data){
		
		String dt[] = data.split("-");
		
		return new Date(dt[1] + "/" + dt[2] + "/" + dt[0]);
		
	}

	public String javaToMysql(Date data) {

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		return df.format(data);

	}

	// 1984 - 03 - 23
	//  0     1    2
	public Date mysqlToJava(String data) {

		String dt[] = data.split("-");

		return new Date(dt[1] + "/" + dt[2] + "/" + dt[0]);

	}

}
