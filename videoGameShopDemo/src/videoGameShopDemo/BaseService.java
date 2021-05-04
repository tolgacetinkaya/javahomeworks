package videoGameShopDemo;

public interface BaseService<T> {

	void add(T entity);
	void delete(T entity);
	void update(T entity);	
	
}
