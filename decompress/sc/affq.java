import java.util.Comparator;
import java.util.Set;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class affq extends afbz implements Serializable
{
    public static final affq a;
    public static final affq b;
    private final transient afeq c;
    
    static {
        a = new affq(afeq.q());
        b = new affq(afeq.r((Object)afid.a));
    }
    
    public affq(final afeq c) {
        this.c = c;
    }
    
    public static adet d() {
        return new adet((byte[])null, null, (byte[])null);
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }
    
    public final /* bridge */ Set c() {
        Object a;
        if (this.c.isEmpty()) {
            a = afiq.a;
        }
        else {
            a = new afir(this.c, (Comparator)afid.c());
        }
        return (Set)a;
    }
    
    Object writeReplace() {
        return new affp(this.c);
    }
}
