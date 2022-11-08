import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aufk extends augy
{
    private static final long serialVersionUID = -4481126543819298617L;
    public aufl a;
    public auew b;
    
    public aufk(final aufl a, final auew b) {
        this.a = a;
        this.b = b;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        this.a = (aufl)objectInputStream.readObject();
        this.b = ((auey)objectInputStream.readObject()).a(((aufv)this.a).b);
    }
    
    private void writeObject(final ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.a);
        objectOutputStream.writeObject(this.b.p());
    }
    
    protected final long a() {
        return ((aufv)this.a).a;
    }
    
    protected final aueu b() {
        return ((aufv)this.a).b;
    }
    
    public final auew c() {
        return this.b;
    }
}
