package com.designPatterns.creational.singleton;
/*in case of singleton pattern when the object is serialized or class is implementing any serializable interface in that case the singleton will be violated
and many objects will be created but we can avoid it by either making the object transient or  by using the below code
private Object readResolve(){
        return INSTANCE;
    }

but if the object has to maintain the state then the above code has to me more complicated maintaining it states.
when we use enum serilaization  and thread safety is guaranted by JVM */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.designPatterns.creational.singleton.enom.Singleton;
//test this class using commenting readresolve on singleton class two instance will be created
public class TestSingleton implements Cloneable{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//System.out.println(Singleton.INSTANCE.hashCode());
System.out.println(SingletonClass.INSTANCE.hashCode());
System.out.println(SingletonClass.getInstance().hashCode());
System.out.println(SingletonClass.getInstance().hashCode());
/*FileOutputStream fos = new FileOutputStream("text.txt");
ObjectOutputStream oos = new ObjectOutputStream(fos);
*///oos.writeObject(SingletonClass.INSTANCE);

//oos.writeObject(Singleton.INSTANCE);

/*FileInputStream fs=new FileInputStream("text.txt");
ObjectInputStream is=new ObjectInputStream(fs);
*///Singleton s1=(Singleton)is.readObject();
//oos.writeObject(SingletonClass.INSTANCE);
/*SingletonClass s2=(SingletonClass)is.readObject();
*/SingletonClass s1=(SingletonClass)SingletonClass.INSTANCE.clone();
System.out.println("  " +s1.hashCode() );
/*System.out.println(SingletonClass.INSTANCE);
System.out.println(Singleton.INSTANCE.test1() +"    ");
Singleton.INSTANCE.test();*/
	} 

}
