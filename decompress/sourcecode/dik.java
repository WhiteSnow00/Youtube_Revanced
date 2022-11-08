import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class dik implements ddx, ddw
{
    private final List a;
    private final akq b;
    private int c;
    private dbz d;
    private ddw e;
    private List f;
    private boolean g;
    
    public dik(final List a, final akq b) {
        this.b = b;
        cll.k((Collection)a);
        this.a = a;
        this.c = 0;
    }
    
    private final void h() {
        if (this.g) {
            return;
        }
        if (this.c < this.a.size() - 1) {
            ++this.c;
            this.f(this.d, this.e);
            return;
        }
        cll.h((Object)this.f);
        this.e.e((Exception)new dft("Fetch failed", (List)new ArrayList(this.f)));
    }
    
    public final Class a() {
        return this.a.get(0).a();
    }
    
    public final void b(final Object o) {
        if (o != null) {
            this.e.b(o);
            return;
        }
        this.h();
    }
    
    public final void d() {
        final List f = this.f;
        if (f != null) {
            this.b.b((Object)f);
        }
        this.f = null;
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((ddx)iterator.next()).d();
        }
    }
    
    public final void e(final Exception ex) {
        final List f = this.f;
        cll.h((Object)f);
        f.add(ex);
        this.h();
    }
    
    public final void f(final dbz d, final ddw e) {
        this.d = d;
        this.e = e;
        this.f = (List)this.b.a();
        this.a.get(this.c).f(d, (ddw)this);
        if (this.g) {
            this.lq();
        }
    }
    
    public final int g() {
        return this.a.get(0).g();
    }
    
    public final void lq() {
        this.g = true;
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((ddx)iterator.next()).lq();
        }
    }
}
