import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class aufb implements Serializable
{
    private static final long serialVersionUID = -6471952376487863581L;
    private transient String a;
    
    public aufb(final String a) {
        this.a = a;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        this.a = objectInputStream.readUTF();
    }
    
    private Object readResolve() {
        return aufc.i(this.a);
    }
    
    private void writeObject(final ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeUTF(this.a);
    }
}
