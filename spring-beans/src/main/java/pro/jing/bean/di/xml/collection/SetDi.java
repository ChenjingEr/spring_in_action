package pro.jing.bean.di.xml.collection;

import java.util.Set;

public class SetDi {

	private Set<String> set;

	public void printOut() {
		System.out.println(set);
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}
	
	
}
