import java.io.ObjectOutputStream;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

class afjt implements Serializable
{
    private static final long serialVersionUID = 0L;
    final Object f;
    final Object g;
    
    public afjt(Object o, final Object o2) {
        o.getClass();
        this.f = o;
        o = o2;
        if (o2 == null) {
            o = this;
        }
        this.g = o;
    }
    
    private void writeObject(final ObjectOutputStream objectOutputStream) {
        synchronized (this.g) {
            objectOutputStream.defaultWriteObject();
        }
    }
    
    @Override
    public final String toString() {
        synchronized (this.g) {
            return this.f.toString();
        }
    }
}
