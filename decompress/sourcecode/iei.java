import java.util.Iterator;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iei extends ict
{
    private final Map a;
    private final Map b;
    private final atjj c;
    
    public iei(final atjj c) {
        this.a = (Map)new ConcurrentHashMap();
        this.b = (Map)new ConcurrentHashMap();
        this.c = c;
    }
    
    private final afdu s(final zyz zyz, final Map map) {
        final HashSet set = new HashSet(zyz.b);
        map.put(zyz.a.a, set);
        return this.r(set);
    }
    
    private static apwg t(final zzl zzl, final boolean b) {
        if (zzl.q() && b) {
            return null;
        }
        return fbp.t(zzl.a(), zzl.i);
    }
    
    public final ListenableFuture a(final vdv vdv, final zyz zyz) {
        final afie k = this.s(zyz, this.b).k();
        while (((Iterator)k).hasNext()) {
            vdv.j((vdj)((Iterator)k).next());
        }
        return aftm.a;
    }
    
    public final ListenableFuture b(final vdv vdv, final String s) {
        this.b.remove(s);
        return aftm.a;
    }
    
    public final ListenableFuture c(final vdv vdv, final zyz zyz) {
        fbp.B(vdv, this.b, zyz, (aexg)new hwh(this, 12), null);
        return aftm.a;
    }
    
    public final ListenableFuture d(final vdv vdv, final zyz zyz) {
        final afie k = this.s(zyz, this.b).k();
        while (((Iterator)k).hasNext()) {
            vdv.j((vdj)((Iterator)k).next());
        }
        return aftm.a;
    }
    
    public final afdu k(final aack aack) {
        final aacp l = aack.l();
        final afds i = afdu.i();
        final Iterator iterator = l.j().iterator();
        while (iterator.hasNext()) {
            final apwg t = t((zzl)iterator.next(), true);
            if (t != null) {
                i.h(t);
            }
        }
        return i.g();
    }
    
    public final void l(final vdv vdv, final zyz zyz) {
        final afie k = this.s(zyz, this.a).k();
        while (((Iterator)k).hasNext()) {
            vdv.j((vdj)((Iterator)k).next());
        }
    }
    
    public final void m(final vdv vdv, final String s) {
        this.a.remove(s);
    }
    
    public final void n(final vdv vdv, final zyz zyz) {
        fbp.B(vdv, this.a, zyz, (aexg)new hwh(this, 12), null);
    }
    
    public final void o(final vdv vdv, final zzl zzl) {
        final apwg t = t(zzl, false);
        if (t != null) {
            vdv.j((vdj)t);
        }
    }
    
    public final void p(final vdv vdv, final String s) {
        vdv.g(gkt.aZ(s));
    }
    
    public final void q(final vdv vdv, final zyz zyz) {
        final afie k = this.s(zyz, this.a).k();
        while (((Iterator)k).hasNext()) {
            vdv.j((vdj)((Iterator)k).next());
        }
    }
    
    public final afdu r(final Set set) {
        final afds i = afdu.i();
        final aacp l = ((zzu)this.c.a()).a().l();
        for (final String s : set) {
            final zzl e = l.e(s);
            if (e != null) {
                i.h(fbp.t(s, e.i));
            }
        }
        return i.g();
    }
}
