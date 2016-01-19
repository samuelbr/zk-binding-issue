package com.github.samuelbr.zk.binding.issue;

import org.zkoss.zul.ListModelList;
import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.BindingParam;

public class TestViewModel {

	private ListModelList<Person> persons = new ListModelList<Person>();

	@Init
	public void init() {
		persons.add(new Person("Click delete", "first"));
		persons.add(new Person("Click delete", "second"));
	}

	@Command
	public void deletePerson(@BindingParam("item") Person person) {
		if (person == null) {
			Clients.alert("Object is null");
		}
		persons.remove(person);
	}

	public ListModelList<Person> getPersons() {
		return persons;
	}
}
