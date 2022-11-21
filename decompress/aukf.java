import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class aukf implements Serializable
{
    private static final long serialVersionUID = -6212696554273812441L;
    private transient auip a;
    
    public aukf(final auip a) {
        this.a = a;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        this.a = (auip)objectInputStream.readObject();
    }
    
    private Object readResolve() {
        return aukg.P(this.a);
    }
    
    private void writeObject(final ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.a);
    }
}
