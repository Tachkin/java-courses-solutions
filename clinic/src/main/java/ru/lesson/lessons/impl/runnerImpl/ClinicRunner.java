package ru.lesson.lessons;

/**
Запуск клиники домашних животных
@author Tachkin
@since 14.05.2017
*/

public class ClinicRunner{
	public static void main (String[] args){
		Pat[] pats1 = new Pat[]{
			new SimplePatImpl("Murc","Cat"),
			new SimplePatImpl("Shar","Dog"),
		};
		Pat[] pats2 = new Pat[]{
			new SimplePatImpl("Buren","Cow"),
			new SimplePatImpl("Borc","Pig"),
		};
		Pat[] pats3 = new Pat[]{
			new SimplePatImpl("Riaba","Chickn"),
			new SimplePatImpl("Ushast","Rabbit"),
		};
		
		Client client1 = new SimpleClientImpl("Vasia", pats1);
		Client client2 = new SimpleClientImpl("Dasia", pats2);
		Client client3 = new SimpleClientImpl("Sasha", pats3);
		
		Clinic clinic = new SimpleClinicImpl(new Client[]{client1, client2});
		printClinic(clinic);
		
		clinic.addClient(client3);
		printClinic(clinic);
		
		clinic.removeClient(client2);
		printClinic(clinic);
		
	}
	
	public static void printClinic (Clinic clinic){
		Client[] clients = clinic.getAllClients();
		System.out.println("Clinic. Count of Clients " + clients.length);
		for (Client client : clients){
			System.out.println("  CLient " + client.getName());
			for (Pat pat : client.getAllPats()){
				System.out.println("    Pat " + pat.getName() + ", breed: " + pat.getBreed());
			}
		}
	}
}