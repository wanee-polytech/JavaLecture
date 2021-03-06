package kr.ac.kopo.day17.homework.util;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class FileClose {

	public static void close(Reader r) {
		// TODO Auto-generated method stub
		if(r != null) {
			try {
				r.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void close(Writer w) {
		// TODO Auto-generated method stub
		if(w != null) {
			try {
				w.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void close(InputStream i) {
		// TODO Auto-generated method stub
		if(i != null) {
			try {
				i.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void close(OutputStream o) {
		// TODO Auto-generated method stub
		if(o != null) {
			try {
				o.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void close(ObjectInputStream i) {
		// TODO Auto-generated method stub
		if(i != null) {
			try {
				i.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void close(ObjectOutputStream o) {
		// TODO Auto-generated method stub
		if(o != null) {
			try {
				o.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void close(Reader br, Reader r) {
		close(br);
		close(r);
	}
	
	public static void close(Writer bw, Writer w) {
		close(bw);
		close(w);
	}
	
	public static void close(Reader r, Writer w) {
		close(r);
		close(w);
	}
	public static void close(InputStream i,OutputStream o) {
		close(i);
		close(o);
	}
}