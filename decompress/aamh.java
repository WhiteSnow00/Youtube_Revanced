import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aamh
{
    public final Executor a;
    public final atnb b;
    final aske c;
    final aske d;
    final aske e;
    public final arna f;
    final aslm g;
    public volatile boolean h;
    public boolean i;
    public final abqc j;
    private final abrp k;
    private final abnd l;
    
    public aamh(final abqc j, final abrp k, final arna f, final Executor a, final atnb b, final aske c, final aske d, final aske e, final abnd l, final byte[] array) {
        this.g = new aslm();
        this.j = j;
        this.k = k;
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.l = l;
    }
    
    public final void a() {
        if (this.g.a() == 0) {
            this.g.c(((aske)this.k.a).an(new aaid(this, 5), (asmi)uzs.q));
            this.g.c(this.d.an(new aaid(this, 6), (asmi)uzs.q));
            this.g.c(this.c.an(new aaid(this, 7), (asmi)uzs.q));
            this.g.c(this.e.an(new aaid(this, 8), (asmi)uzs.q));
            this.g.c(this.l.c().an(new aaid(this, 9), (asmi)uzs.q));
        }
    }
}
