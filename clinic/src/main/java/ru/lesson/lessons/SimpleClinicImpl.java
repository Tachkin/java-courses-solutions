package ru.lesson.lessons;

import static java.util.Arrays.*;

/**
Простая реализация клиники домашних животных
@author Tachkin
@since 14.05.2017
*/

public class SimpleClinicImpl implements Clinic{
	/**
	Клиенты
	*/
	private Client[] clients;
	
	public SimpleClinicImpl(Client[] clients){
		this.clients = clients;
		
	}
	/**
	Добавление нового клиента
	@param client новый клиент клиники
	@return добавлен/нет
	*/
	public boolean addClient(Client client){
		clients = copyOf(clients, clients.length+1);
		clients[clients.length-1] = client;
		return true;
	}
	
	/**
	Удаление клиента
	@param client клиент клиники
	@return удален/не найден
	*/
	public boolean removeClient(Client client){
		boolean find = false;
		for (int i = 0; i < clients.length - 1; i++){
			if (find || clients[i].equals(client)){
				find = true;
				clients[i] = clients[i+1];
			}
		}
		if (clients[clients.length-1].equals(client)){
			find = true;
		}
		this.clients = copyOf(clients, clients.length - 1);
		return find;
	}
	
	/**
	Поиск клиента по имени животного
	@param petName имя животного
	@return массив клиентов у которых есть животное с именем
	*/
	public Client[] findClientsByPetName(String petName){
		int counter = 0;
		Client[] findClients = new Client[clients.length];
		for (Client client : clients){
			for (Pat pat : client.getAllPats()){
				if (pat.getName().equals(petName)){
					findClients[counter] = client;
					counter++;
					break;
				}
			}
		}
		return copyOf(findClients, counter);
	}
	
	/**
	Поиск клиента по имени животного
	@return массив всех клиентов
	*/
	public Client[] getAllClients(){
		return clients;
	}
	
}
