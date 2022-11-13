import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class absv
{
    public final List a;
    public Long b;
    public yqb c;
    public yqb d;
    
    public absv() {
        this.a = new ArrayList();
    }
    
    public final void a(final List list) {
        if (list != null && !list.isEmpty()) {
            this.a.addAll(list);
        }
    }
    
    public final void b(final long n) {
        if (this.b == null) {
            this.b = n;
        }
    }
}
