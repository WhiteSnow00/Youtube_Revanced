import java.util.Iterator;
import java.util.Collection;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

final class dlw implements dmh
{
    private final Set a;
    private boolean b;
    private boolean c;
    
    public dlw() {
        this.a = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
    }
    
    public final void a(final dmi dmi) {
        this.a.add(dmi);
        if (this.c) {
            dmi.k();
            return;
        }
        if (this.b) {
            dmi.l();
            return;
        }
        dmi.m();
    }
    
    final void b() {
        this.c = true;
        final Iterator iterator = dph.h((Collection)this.a).iterator();
        while (iterator.hasNext()) {
            ((dmi)iterator.next()).k();
        }
    }
    
    final void c() {
        this.b = true;
        final Iterator iterator = dph.h((Collection)this.a).iterator();
        while (iterator.hasNext()) {
            ((dmi)iterator.next()).l();
        }
    }
    
    final void d() {
        this.b = false;
        final Iterator iterator = dph.h((Collection)this.a).iterator();
        while (iterator.hasNext()) {
            ((dmi)iterator.next()).m();
        }
    }
    
    public final void e(final dmi dmi) {
        this.a.remove(dmi);
    }
}
