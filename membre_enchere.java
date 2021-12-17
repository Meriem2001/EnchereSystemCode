package mini_projet1;

import java.net.*;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


public class membre_enchere {

	private static final AtomicInteger ID_FACTORY = new AtomicInteger();
	private int Id;
private String name;
private int port;
private InetAddress address;
public static List<offre_membre> offres =new ArrayList<offre_membre>();

public membre_enchere (String name1,InetAddress address,int port) {
	name=name1;
    this.address = address;
    this.port = port;
	Id=ID_FACTORY.getAndIncrement();

}
public int GetId () {

	return(Id);
}
public String GetName () {
	return(name);
}
public void SetId (int id1) {
	do 
		this.Id=id1;
	while(id1>Id);

}
public void SetName (String name) {
	 
		this.name=name;}
public int getPort() {
	return port;
}
public void setPort(int port) {
	this.port = port;
}
public InetAddress getAddress() {
	return address;
}
public void setAddress(InetAddress address) {
	this.address = address;
}
public void addoffre(offre_membre o){

    membre_enchere.offres.add(o);

}


	
}
