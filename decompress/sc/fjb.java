import java.util.Map;
import java.util.List;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fjb implements vcy
{
    public WeakReference a;
    
    public final void a(final aiqj aiqj) {
        vcx.a((vcy)this, aiqj);
    }
    
    public final void b(final List list) {
        vcx.b((vcy)this, list);
    }
    
    public final void c(final aiqj aiqj, final Map map) {
        final WeakReference a = this.a;
        vcy vcy;
        if (a != null) {
            vcy = (vcy)a.get();
        }
        else {
            vcy = null;
        }
        if (vcy == null) {
            zlm.b(zll.a, zlk.a, "Attempting to route command without a resolver ".concat(String.valueOf(String.valueOf(aiqj))));
            return;
        }
        vcy.c(aiqj, map);
    }
    
    public final void d(final List list, final Map map) {
        vcx.c((vcy)this, list, map);
    }
    
    public final void e(final List list, final Object o) {
        vcx.d((vcy)this, list, o);
    }
}
