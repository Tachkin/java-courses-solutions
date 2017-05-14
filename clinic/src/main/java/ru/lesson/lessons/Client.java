/**
Интерфейс клиента клиники для животных
@author Tachkin
@since 14.05.2017
*/

public interface Client {
	
	/**
	Имя клиента
	*/
	public String getName();
	
	/**
	Добавление животного
	@param pat животное
	@return добавлен/нет
	*/
	public boolean addPet(Pat pat);
	
	/**
	Удажение животного
	@param pat животное
	@return удален/нет
	*/
	public boolean removePet(Pat pat);
	
	/**
	Вернуть всех животных
	@return удален/нет
	*/	
	public Pat[] getAllPats();
}
