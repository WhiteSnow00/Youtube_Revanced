import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ien extends icx
{
    public final Map a;
    private final Executor b;
    private final Map c;
    
    public ien(final Executor b) {
        this.c = (Map)new ConcurrentHashMap();
        this.a = (Map)new ConcurrentHashMap();
        this.b = b;
    }
    
    public static afdu k(final zyz zyz, final Set set) {
        final afds i = afdu.i();
        final Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            i.h(fbp.u(zyz.a.a, (String)iterator.next()));
        }
        return i.g();
    }
    
    public static void l(final vdv vdv, final zyz zyz, final Set set) {
        final Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            vdv.g(gkt.bu(zyz.a.a, (String)iterator.next()));
        }
    }
    
    public static final afdu m(final zyz zyz, final Map map) {
        final afds i = afdu.i();
        final String a = zyz.a.a;
        final Iterator iterator = zyz.b.iterator();
        while (iterator.hasNext()) {
            i.h(fbp.u(a, (String)iterator.next()));
        }
        map.put(a, new HashSet(zyz.b));
        return i.g();
    }
    
    public final ListenableFuture a(final vdv vdv, final zyz zyz) {
        fbp.A(vdv, m(zyz, this.a));
        return aftm.a;
    }
    
    public final ListenableFuture b(final vdv vdv, final String s) {
        final Set set = this.a.remove(s);
        if (set != null) {
            final Iterator iterator = set.iterator();
            while (iterator.hasNext()) {
                vdv.g(gkt.bu(s, (String)iterator.next()));
            }
        }
        return aftm.a;
    }
    
    public final ListenableFuture c(final vdv vdv, final zyz zyz) {
        fbp.B(vdv, this.a, zyz, (aexg)new hwh(zyz, 13), (idn)new idj(vdv, zyz, 3));
        return aftm.a;
    }
    
    public final ListenableFuture d(final vdv vdv, final zyz zyz) {
        fbp.B(vdv, this.a, zyz, (aexg)new hwh(zyz, 17), (idn)new idj(vdv, zyz, 2));
        return aftm.a;
    }
    
    public final afdu e(final aack aack) {
        final afds i = afdu.i();
        final Iterator iterator = aack.i().l().iterator();
        while (iterator.hasNext()) {
            i.j((Iterable)m((zyz)iterator.next(), this.c));
        }
        return i.g();
    }
    
    public final ListenableFuture f(final aack aack) {
        return (ListenableFuture)aete.f(aack.i().k()).g((aexg)new hwh(this, 14), this.b);
    }
    
    public final void g(final vdv vdv, final zyz zyz) {
        fbp.A(vdv, m(zyz, this.c));
    }
    
    public final void h(final vdv vdv, final String s) {
        final Set set = this.c.remove(s);
        if (set != null) {
            final Iterator iterator = set.iterator();
            while (iterator.hasNext()) {
                vdv.g(gkt.bu(s, (String)iterator.next()));
            }
        }
    }
    
    public final void i(final vdv vdv, final zyz zyz) {
        fbp.B(vdv, this.c, zyz, (aexg)new hwh(zyz, 15), (idn)new idj(vdv, zyz, 4));
    }
    
    public final void j(final vdv vdv, final zyz zyz) {
        fbp.B(vdv, this.c, zyz, (aexg)new hwh(zyz, 16), (idn)new idj(vdv, zyz, 5));
    }
}
