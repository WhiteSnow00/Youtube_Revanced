import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.concurrent.atomic.AtomicLong;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afvr extends Number implements Serializable
{
    private static final long serialVersionUID = 0L;
    private transient AtomicLong value;
    
    public afvr() {
        this.value = new AtomicLong(Double.doubleToRawLongBits(0.0));
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.value = new AtomicLong();
        this.b(objectInputStream.readDouble());
    }
    
    private void writeObject(final ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeDouble(this.a());
    }
    
    public final double a() {
        return Double.longBitsToDouble(this.value.get());
    }
    
    public final void b(final double n) {
        this.value.set(Double.doubleToRawLongBits(n));
    }
    
    @Override
    public final double doubleValue() {
        return this.a();
    }
    
    @Override
    public final float floatValue() {
        return (float)this.a();
    }
    
    @Override
    public final int intValue() {
        return (int)this.a();
    }
    
    @Override
    public final long longValue() {
        return (long)this.a();
    }
    
    @Override
    public final String toString() {
        return Double.toString(this.a());
    }
}
