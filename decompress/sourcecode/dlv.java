import java.util.Iterator;
import java.util.Collection;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

final class dlv implements dmg
{
    private final Set a;
    private boolean b;
    private boolean c;
    
    public dlv() {
        this.a = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
    }
    
    public final void a(final dmh dmh) {
        this.a.add(dmh);
        if (this.c) {
            dmh.k();
            return;
        }
        if (this.b) {
            dmh.l();
            return;
        }
        dmh.m();
    }
    
    final void b() {
        this.c = true;
        final Iterator iterator = dpg.i((Collection)this.a).iterator();
        while (iterator.hasNext()) {
            ((dmh)iterator.next()).k();
        }
    }
    
    final void c() {
        this.b = true;
        final Iterator iterator = dpg.i((Collection)this.a).iterator();
        while (iterator.hasNext()) {
            ((dmh)iterator.next()).l();
        }
    }
    
    final void d() {
        this.b = false;
        final Iterator iterator = dpg.i((Collection)this.a).iterator();
        while (iterator.hasNext()) {
            ((dmh)iterator.next()).m();
        }
    }
    
    public final void e(final dmh dmh) {
        this.a.remove(dmh);
    }
}
