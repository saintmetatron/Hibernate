package hibernate;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class ExportDB {

	public static void main(String[] args) {
		
//		��ȡhibernate.cfg.xml�ļ�
		Configuration cfg = new Configuration().configure();
		
//		
		SchemaExport export = new SchemaExport(cfg);
		
//		��Դ������DDL		
		export.create(true, true);
	}

}