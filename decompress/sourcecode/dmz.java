import java.util.Iterator;
import java.util.Collection;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dmz implements dmh
{
    public final Set a;
    
    public dmz() {
        this.a = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
    }
    
    public final void k() {
        final Iterator iterator = dpg.i((Collection)this.a).iterator();
        while (iterator.hasNext()) {
            ((doc)iterator.next()).k();
        }
    }
    
    public final void l() {
        final Iterator iterator = dpg.i((Collection)this.a).iterator();
        while (iterator.hasNext()) {
            ((doc)iterator.next()).l();
        }
    }
    
    public final void m() {
        final Iterator iterator = dpg.i((Collection)this.a).iterator();
        while (iterator.hasNext()) {
            ((doc)iterator.next()).m();
        }
    }
}
