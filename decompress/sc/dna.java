import java.util.Iterator;
import java.util.Collection;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dna implements dmi
{
    public final Set a;
    
    public dna() {
        this.a = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
    }
    
    public final void k() {
        final Iterator iterator = dph.h((Collection)this.a).iterator();
        while (iterator.hasNext()) {
            ((dod)iterator.next()).k();
        }
    }
    
    public final void l() {
        final Iterator iterator = dph.h((Collection)this.a).iterator();
        while (iterator.hasNext()) {
            ((dod)iterator.next()).l();
        }
    }
    
    public final void m() {
        final Iterator iterator = dph.h((Collection)this.a).iterator();
        while (iterator.hasNext()) {
            ((dod)iterator.next()).m();
        }
    }
}
