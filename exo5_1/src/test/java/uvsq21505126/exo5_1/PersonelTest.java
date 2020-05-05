package uvsq21505126.exo5_1;

import static org.junit.Assert.*;
import java.io.*;
import java.nio.file.attribute.AclEntry.Builder;
import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonelTest {
	
	Builder b = new Builder("li","arnold","etudiant",LocalDate.of(2015, 12, 31));
	
	
	private Object deserialize(final byte[] bytes) throws ClassNotFoundException, IOException {
        ByteArrayInputStream a = new ByteArrayInputStream(bytes);
        ObjectInputStream b = new ObjectInputStream(a);
        return b.readObject();
 }
 
 private byte[] serialize(final Object obj) throws IOException {
        ByteArrayOutputStream a = new ByteArrayOutputStream();
        ObjectOutputStream b = new ObjectOutputStream(a);
        b.writeObject(obj);
        return a.toByteArray();
    }
 
	@Test
    public void serialisableTest() throws IOException, ClassNotFoundException {
        byte[] serialisable = serialize(b);
        byte[] serialisable2 = serialize(b);

        Object deserialisable = deserialize(serialisable);
        Object deserialisable2 = deserialize(serialisable2);
        
        Assert.assertEquals(deserialisable, deserialisable2);
        Assert.assertEquals(b, deserialisable);
        Assert.assertEquals(b, deserialisable2);
 }

}
