import java.util.Comparator;
import java.util.Set;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afdr extends afaa implements Serializable
{
    public static final afdr a;
    public static final afdr b;
    private final transient afcr c;
    
    static {
        a = new afdr(afcr.q());
        b = new afdr(afcr.r((Object)afgd.a));
    }
    
    public afdr(final afcr c) {
        this.c = c;
    }
    
    public static adcr d() {
        return new adcr((short[])null, (byte[])null);
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }
    
    Object writeReplace() {
        return new afdq(this.c);
    }
}
