import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class awc extends aux implements awi
{
    public final int e;
    public final awj f;
    public awd g;
    private aum h;
    
    public awc(final awj f) {
        this.e = 54321;
        this.f = f;
        if (f.e == null) {
            f.e = (awi)this;
            f.d = 54321;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }
    
    public final void a() {
        final aum h = this.h;
        final awd g = this.g;
        if (h != null && g != null) {
            super.l((auy)g);
            ((auu)this).g(h, (auy)g);
        }
    }
    
    protected final void i() {
        if (awb.b(2)) {
            new StringBuilder("  Starting: ").append(this);
        }
        final awj f = this.f;
        f.g = true;
        f.i = false;
        f.h = false;
        final awh awh = (awh)f;
        final List c = awh.c;
        if (c != null) {
            awh.b(c);
            return;
        }
        f.d();
        awh.a = new awg(awh);
        awh.a();
    }
    
    protected final void j() {
        if (awb.b(2)) {
            new StringBuilder("  Stopping: ").append(this);
        }
        final awj f = this.f;
        f.g = false;
        f.d();
    }
    
    public final void l(final auy auy) {
        super.l(auy);
        this.h = null;
        this.g = null;
    }
    
    public final void o() {
        if (awb.b(3)) {
            new StringBuilder("  Destroying: ").append(this);
        }
        this.f.d();
        this.f.h = true;
        final awd g = this.g;
        if (g != null) {
            ((auu)this).l((auy)g);
            if (g.c) {
                if (awb.b(2)) {
                    new StringBuilder("  Resetting: ").append(g.a);
                }
                final qke qke = (qke)g.b;
                qke.a.clear();
                qke.a.notifyDataSetChanged();
            }
        }
        final awj f = this.f;
        final awi e = f.e;
        if (e == null) {
            throw new IllegalStateException("No listener register");
        }
        if (e == this) {
            f.e = null;
            f.i = true;
            f.g = false;
            f.h = false;
            f.j = false;
            return;
        }
        throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    }
    
    public final void p(final aum h, final awa awa) {
        final awd g = new awd(this.f, awa);
        ((auu)this).g(h, (auy)g);
        final awd g2 = this.g;
        if (g2 != null) {
            ((auu)this).l((auy)g2);
        }
        this.h = h;
        this.g = g;
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.e);
        sb.append(" : ");
        sb.append(this.f.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this.f)));
        sb.append("}}");
        return sb.toString();
    }
}
