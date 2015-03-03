package base;

import java.util.ArrayList;

import base.*;

public class Blog {
	
	private User user;
	private ArrayList<Post> allPosts;
	
	public Blog(User user) {
		super();
		this.user = user;
		allPosts = new ArrayList<Post>();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public void post(Post p){
		if (allPosts.add(p)){
			System.out.println("A new Post:");
			System.out.println(p.getDate());
			System.out.println(p.getContent());
		}
		
	}
	
	public void list(){
		System.out.println("Current posts:");
		int i=1;
		for (Post p : allPosts){
			System.out.println("Post[" + i + "]:" + p.getDate());
			System.out.println(p.getContent());
			i++;
		}
		
	}
	
	public void delete(int index){
		if (index>=1 && index<=allPosts.size()){
			allPosts.remove(index-1);
		} else{
			System.out.println("Illegal deletion.");
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((allPosts == null) ? 0 : allPosts.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Blog other = (Blog) obj;
		if (allPosts == null) {
			if (other.allPosts != null)
				return false;
		} else if (!allPosts.equals(other.allPosts))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Blog [user=" + user + ", allPosts=" + allPosts + "]";
	}

	
	
	
	
}
