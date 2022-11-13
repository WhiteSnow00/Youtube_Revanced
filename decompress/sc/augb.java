import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class augb extends auhp
{
    private static final long serialVersionUID = -4481126543819298617L;
    public augc a;
    public aufn b;
    
    public augb(final augc a, final aufn b) {
        this.a = a;
        this.b = b;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        this.a = (augc)objectInputStream.readObject();
        this.b = ((aufp)objectInputStream.readObject()).a(this.a.b);
    }
    
    private void writeObject(final ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.a);
        objectOutputStream.writeObject(this.b.p());
    }
    
    protected final long a() {
        return this.a.a;
    }
    
    protected final aufl b() {
        return this.a.b;
    }
    
    public final aufn c() {
        return this.b;
    }
}
