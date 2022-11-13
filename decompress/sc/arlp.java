import java.util.Collections;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class arlp implements arls
{
    public final Map a;
    
    public arlp(final Map map) {
        this.a = Collections.unmodifiableMap((Map<?, ?>)map);
    }
}
