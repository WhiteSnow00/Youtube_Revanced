import java.util.Iterator;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class idm extends ict
{
    private final Map a;
    private final Map b;
    private final atjj c;
    
    public idm(final atjj c) {
        this.a = (Map)new ConcurrentHashMap();
        this.b = (Map)new ConcurrentHashMap();
        this.c = c;
    }
    
    private static final alyl s(final zzl zzl, final boolean b) {
        if (zzl.q() && b) {
            return null;
        }
        return fbp.p(zzl.a);
    }
    
    public final ListenableFuture a(final vdv vdv, final zyz zyz) {
        final HashSet set = new HashSet(zyz.b);
        this.b.put(zyz.a.a, set);
        final afie k = this.r(set).k();
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
        fbp.B(vdv, this.b, zyz, (aexg)new hwh(this, 8), null);
        return aftm.a;
    }
    
    public final ListenableFuture d(final vdv vdv, final zyz zyz) {
        fbp.B(vdv, this.b, zyz, (aexg)new hwh(this, 8), null);
        return aftm.a;
    }
    
    public final afdu k(final aack aack) {
        final aacp l = aack.l();
        final afds i = afdu.i();
        final Iterator iterator = l.j().iterator();
        while (iterator.hasNext()) {
            final alyl s = s((zzl)iterator.next(), true);
            if (s != null) {
                i.h(s);
            }
        }
        return i.g();
    }
    
    public final void l(final vdv vdv, final zyz zyz) {
        final HashSet set = new HashSet(zyz.b);
        this.a.put(zyz.a.a, set);
        final afie k = this.r(set).k();
        while (((Iterator)k).hasNext()) {
            vdv.j((vdj)((Iterator)k).next());
        }
    }
    
    public final void m(final vdv vdv, final String s) {
        this.a.remove(s);
    }
    
    public final void n(final vdv vdv, final zyz zyz) {
        fbp.B(vdv, this.a, zyz, (aexg)new hwh(this, 8), null);
    }
    
    public final void o(final vdv vdv, final zzl zzl) {
        final alyl s = s(zzl, false);
        if (s != null) {
            vdv.j((vdj)s);
        }
    }
    
    public final void p(final vdv vdv, final String s) {
        vdv.g(gkt.bl(s));
    }
    
    public final void q(final vdv vdv, final zyz zyz) {
        fbp.B(vdv, this.a, zyz, (aexg)new hwh(this, 8), null);
    }
    
    public final afdu r(final Set set) {
        final afds i = afdu.i();
        final aacp l = ((zzu)this.c.a()).a().l();
        final Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            final zzl e = l.e((String)iterator.next());
            if (e != null) {
                i.h(fbp.p(e.a));
            }
        }
        return i.g();
    }
}
