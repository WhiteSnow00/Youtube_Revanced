import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public class ebi
{
    public Map a;
    
    public final void a(final String s, final Object o) {
        if (this.a == null) {
            this.a = DesugarCollections.synchronizedMap((Map)new HashMap());
        }
        this.a.put(s, o);
    }
    
    public final void b(final boolean b) {
        this.a("is_full_span", b);
    }
    
    public final void c(final boolean b) {
        this.a("is_sticky", b);
    }
    
    public final void d(final int n) {
        this.a("span_size", n);
    }
}
