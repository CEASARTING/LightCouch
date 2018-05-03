import model.Foo;
import org.lightcouch.CouchDbClient;

import java.util.List;

/**
 * Created by dp on 2018/5/3.
 */
public class Main {
    public static void main(String[] args){
        CouchDbClient couchDbClient = new CouchDbClient("dp",true,"http","localhost",5984,"","");
        System.out.println("456456");
        List<Foo> foos = couchDbClient.view("haha").key("id").includeDocs(true).query(Foo.class);
        System.out.println("123123");
    }
}
