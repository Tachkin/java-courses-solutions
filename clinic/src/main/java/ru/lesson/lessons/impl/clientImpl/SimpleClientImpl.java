package ru.lesson.lessons.impl.clientImpl;

import ru.lesson.lessons.interf.*;
import ru.lesson.lessons.utils.exception.ValidationException;
import ru.lesson.lessons.utils.validator.NameValidator;

import java.util.Arrays;

/**
Простая реализация клиента клиники домашних животных
@author Tachkin
@since 14.05.2017
*/

public class SimpleClientImpl implements Client {
	/**
	Имя клиента, выступает идентификатором
	*/
	private final String name;
	
	/**
	Животные
	*/
	private Pat[] pats;
	
	public SimpleClientImpl(String name, Pat[] pats) throws ValidationException {
		if (NameValidator.clientNameValidate(name)) {
			this.name = name;
		}else {
			throw new ValidationException("Error in client name");
		}
		this.pats = pats;
	}
	
		/**
	Имя клиента
	*/
	public String getName(){
		return name;
	}

	/**
	Добавление животного
	@param pat животное
	@return добавлен/нет
	*/
	public boolean addPet(Pat pat){
		this.pats = Arrays.copyOf(pats, pats.length + 1);
		this.pats[pats.length - 1] = pat;
		return true;
	}
	
	/**
	Удажение животного
	@param pat животное
	@return удален/нет
	*/
	public boolean removePet(Pat pat){
		boolean find = false;
		for (int i = 0; i < pats.length - 1; i++){
			if (find || pats[i].equals(pat)){
				find = true;
				pats[i] = pats[i + 1];
			}
		}
		if (pats[pats.length - 1].equals(pat)){
			find = true;
		}
		this.pats = Arrays.copyOf(pats, pats.length - 1);
		return find;
	}
	
	/**
	Вернуть всех животных
	@return удален/нет
	*/	
	public Pat[] getAllPats(){
		return pats;
	}
	
	@Override
	public boolean equals(Object obj){
		if (!(obj instanceof Client)){
			return false;
		}
		Client eq = (Client)obj;
		return this.name.equals(eq.getName());
	}

}
