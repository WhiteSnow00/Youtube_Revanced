import j$.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abnd implements abnc
{
    private static final xab c;
    public final wyw a;
    public String b;
    private final abpu d;
    private final asiq e;
    private final ashi f;
    private String g;
    
    static {
        c = xaa.b(28631);
    }
    
    public abnd(final wyw a, final abpu d, final ashi f) {
        this.a = a;
        this.d = d;
        this.f = f;
        this.e = new asiq();
    }
    
    public final void a(final abmq abmq) {
        if (abmq.c().h()) {
            this.a.l((wzz)new wyt((xab)abmq.c().c()));
        }
    }
    
    public final void b(final abmq abmq) {
        if (abmq.c().h()) {
            this.a.J(3, (wzz)new wyt((xab)abmq.c().c()), (alhi)null);
        }
    }
    
    public final void c() {
        if (this.e.a() == 0) {
            this.e.c(this.d.H((aezf)abdc.s, (aezf)abdc.t).am((asjm)new abja(this, 13)));
            this.e.c(this.f.am((asjm)new abja(this, 14)));
        }
        final String b = this.b;
        if (b != null) {
            if (!Objects.equals((Object)this.g, (Object)b)) {
                this.a.b(abnd.c, (aiqj)null, (alhi)null);
                this.g = this.b;
            }
        }
    }
    
    public final void d() {
        this.a.J(3, (wzz)new wyt(xaa.c(49485)), (alhi)null);
    }
    
    public final void e() {
        if (this.e.a() > 0) {
            this.a.s();
            this.g = null;
            this.b = null;
            this.e.b();
        }
    }
}
