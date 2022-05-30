public class Repository {

    IdGenerator idGenerator = new IdGenerator(new StringHelper());

    String save(Object object){

        if(object==null) throw new EmptyObjectException("Entity must not be null");
        String str = idGenerator.generateId(7);
        System.out.println("Cущность с id = "+str+" сохранена.");
        return str;
    }
}
