/**
Интерфейс клиники для животных
@author Tachkin
@since 14.05.2017
*/

public interface Clinic {
	
	/**
	Добавление нового клиента
	@param client новый клиент клиники
	@return добавлен/нет
	*/
	public boolean addClient(Client client);
	
	/**
	Удаление клиента
	@param client клиент клиники
	@return id удаленного клиента
	*/
	public boolean removeClient(Client client);
	
	/**
	Поиск клиента по имени животного
	@param petName имя животного
	@return массив клиентов у которых есть животное с именем
	*/
	public Client[] findClientsByPetName(String petName);
	
	/**
	Поиск клиента по имени животного
	@return массив всех клиентов
	*/
	public Client[] getAllClients();

}