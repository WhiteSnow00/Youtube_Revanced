import com.facebook.litho.ComponentTree;

// 
// Decompiled by Procyon v0.6.0
// 

public class owp
{
    public final olq a;
    public final osi b;
    public final boolean c;
    public final dzt d;
    public final asib e;
    public dss f;
    public ComponentTree g;
    public int h;
    public final afcr i;
    public final abzh j;
    private final dsw k;
    private dwr l;
    private boolean m;
    
    public owp(final olq a, final osi b, final orq orq, final boolean c, final dsw k, final dzt d, final abzh j) {
        this.f = null;
        this.g = null;
        this.h = -1;
        this.l = null;
        this.m = false;
        this.a = a;
        this.b = b;
        this.c = c;
        this.k = k;
        this.d = d;
        this.e = new asib();
        this.j = j;
        this.i = afcr.r((Object)orq);
    }
    
    public final ComponentTree a() {
        if (this.g == null) {
            final dsw k = this.k;
            if (this.f == null) {
                final qpt a = new qpt(this);
                final dzt d = this.d;
                final owm owm = new owm();
                owm.d(owm, (dsw)d, new owo());
                owm.a.a = a;
                owm.d.set(0);
                this.f = owm.c();
            }
            final dtf b = ComponentTree.b(k, this.f);
            b.h = this.l;
            b.i = this.m;
            b.d = this.c;
            this.g = b.a();
        }
        return this.g;
    }
    
    public final void b() {
        final ComponentTree g = this.g;
        if (g != null) {
            this.l = g.c();
            this.m = this.g.q;
            this.e.b();
            this.g.n();
            this.g = null;
            this.h = -1;
        }
    }
}
