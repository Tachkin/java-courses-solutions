package ru.lesson.lessons.impl.patImpl;

import ru.lesson.lessons.interf.*;
import ru.lesson.lessons.utils.exception.ValidationException;
import ru.lesson.lessons.utils.validator.NameValidator;


/**
Простая реализация домашнего животного
@author Tachkin
@since 14.05.2017
*/

public class SimplePatImpl implements Pat{
	private final  String name;
	private final String breed;
	
	public SimplePatImpl(String name, String breed) throws ValidationException {
        if (NameValidator.patNameValidate(name)) {
            this.name = name;
        }else {
            throw new ValidationException("Error in client name");
        }
		this.breed = breed;
	}
	
	public String getName(){
		return name;
	}
	public String getBreed(){
		return breed;
	}

	
	@Override
	public boolean equals(Object obj){
		if (!(obj instanceof Pat)){
			return false;
		}
		Pat eq = (Pat)obj;
		return (this.name.equals(eq.getName()) && this.breed.equals(eq.getBreed()));
	}
}
