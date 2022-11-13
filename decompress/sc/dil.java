import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class dil implements ddy, ddx
{
    private final List a;
    private final akr b;
    private int c;
    private dca d;
    private ddx e;
    private List f;
    private boolean g;
    
    public dil(final List a, final akr b) {
        this.b = b;
        clm.k((Collection)a);
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
        clm.h((Object)this.f);
        this.e.e(new dfu("Fetch failed", new ArrayList(this.f)));
    }
    
    @Override
    public final Class a() {
        return this.a.get(0).a();
    }
    
    @Override
    public final void b(final Object o) {
        if (o != null) {
            this.e.b(o);
            return;
        }
        this.h();
    }
    
    @Override
    public final void d() {
        final List f = this.f;
        if (f != null) {
            this.b.b((Object)f);
        }
        this.f = null;
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((ddy)iterator.next()).d();
        }
    }
    
    @Override
    public final void e(final Exception ex) {
        final List f = this.f;
        clm.h((Object)f);
        f.add(ex);
        this.h();
    }
    
    @Override
    public final void f(final dca d, final ddx e) {
        this.d = d;
        this.e = e;
        this.f = (List)this.b.a();
        this.a.get(this.c).f(d, this);
        if (this.g) {
            this.lq();
        }
    }
    
    @Override
    public final int g() {
        return this.a.get(0).g();
    }
    
    @Override
    public final void lq() {
        this.g = true;
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((ddy)iterator.next()).lq();
        }
    }
}
