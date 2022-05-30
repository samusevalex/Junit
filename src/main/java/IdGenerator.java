public class IdGenerator {

    StringHelper stringHelper;

    IdGenerator(StringHelper stringHelper){
        this.stringHelper=stringHelper;
    }

    String generateId(int idLength){
        return stringHelper.generate(idLength);
    }
}
