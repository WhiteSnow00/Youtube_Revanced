import java.util.Comparator;
import java.util.Set;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afhh extends afdr implements Serializable
{
    public static final afhh a;
    public static final afhh b;
    private final transient afgh c;
    
    static {
        a = new afhh(afgh.q());
        b = new afhh(afgh.r(afjt.a));
    }
    
    public afhh(final afgh c) {
        this.c = c;
    }
    
    public static adgg d() {
        return new adgg((byte[])null, (short[])null);
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }
    
    @Override
    public final /* bridge */ Set c() {
        Object a;
        if (this.c.isEmpty()) {
            a = afkg.a;
        }
        else {
            a = new afkh(this.c, (Comparator)afjt.c());
        }
        return (Set)a;
    }
    
    Object writeReplace() {
        return new afhg(this.c);
    }
}
