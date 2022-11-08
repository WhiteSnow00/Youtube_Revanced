import java.util.Collections;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aujl implements aujk
{
    private static final Set a;
    
    static {
        a = Collections.singleton("UTC");
    }
    
    public final Set a() {
        return aujl.a;
    }
    
    public final aufc b(final String s) {
        if ("UTC".equalsIgnoreCase(s)) {
            return aufc.a;
        }
        return null;
    }
}
