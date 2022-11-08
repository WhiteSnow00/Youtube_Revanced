import java.util.Set;
import com.google.protobuf.MessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afyj
{
    private final Map a;
    public final Class b;
    public final Class c;
    
    @SafeVarargs
    protected afyj(final Class b, final afyp... array) {
        this.b = b;
        final HashMap hashMap = new HashMap();
        for (int i = 0; i <= 0; ++i) {
            final afyp afyp = array[i];
            if (hashMap.containsKey(afyp.a)) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(afyp.a.getCanonicalName())));
            }
            hashMap.put(afyp.a, afyp);
        }
        this.c = array[0].a;
        this.a = Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public afyi a() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }
    
    public abstract agbi b();
    
    public abstract MessageLite c(final agyc p0);
    
    public abstract String d();
    
    public abstract void e(final MessageLite p0);
    
    public int f() {
        return 1;
    }
    
    public final Object i(final MessageLite messageLite, final Class clazz) {
        final afyp afyp = this.a.get(clazz);
        if (afyp != null) {
            return afyp.a(messageLite);
        }
        final String canonicalName = clazz.getCanonicalName();
        final StringBuilder sb = new StringBuilder("Requested primitive class ");
        sb.append(canonicalName);
        sb.append(" not supported.");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final Set j() {
        return this.a.keySet();
    }
}
