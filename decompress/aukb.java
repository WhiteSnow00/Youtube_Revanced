import java.util.Collections;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aukb implements auka
{
    private static final Set a;
    
    static {
        a = Collections.singleton("UTC");
    }
    
    public final Set a() {
        return aukb.a;
    }
    
    public final auft b(final String s) {
        if ("UTC".equalsIgnoreCase(s)) {
            return auft.a;
        }
        return null;
    }
}
