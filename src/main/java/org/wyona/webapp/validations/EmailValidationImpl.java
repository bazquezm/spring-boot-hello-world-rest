package org.wyona.webapp.validations;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.wyona.webapp.interfaces.EmailValidation;

@Service
public class EmailValidationImpl implements EmailValidation {

    @Override
    public Boolean isEmailValid(String email) {
        
        return email.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$"); //Sensitive
    }
	

    @Override
    public String isSubjectEmpty(String subject) {
        if (subject == null || subject.isEmpty()) {
            return "Greetings";
        }
        return subject;
    }

    @Override
    public String isTextEmpty(String text) {
        if (text == null || text.isEmpty()) {
            return "Machine says hello.";
        }
        return text;
    }
}
