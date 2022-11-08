import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

@rxl(a = ahne.ax, b = ahnh.d, c = { scg.class, scx.class }, d = { scv.class })
public final class eve extends eva implements eui
{
    private final sey a;
    private final euj b;
    private final akve c;
    private final eum d;
    private final hlo e;
    
    public eve(final eum d, final rru rru, final sfh sfh, final sdr sdr, final ajkj ajkj, final sey a, final hlo e, final euj b, final akve c) {
        a.getClass();
        super(d, rru, sfh, sdr, ajkj, new evc(a, 0), evd.a);
        this.d = d;
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private final void g(final sey sey, final boolean b) {
        if (!aeda.v(sey.a, this.a.a)) {
            return;
        }
        if (b) {
            this.d.a.l((wxz)new wws(this.c.v));
        }
        else {
            this.d.a.y();
        }
        this.e.e(b);
    }
    
    @Override
    public final void I() {
        this.b.b(this);
    }
    
    @Override
    public final void b() {
        if (this.a.e) {
            this.e.e(true);
        }
        this.b.a(this);
    }
    
    @Override
    public final void k(final sey sey) {
        this.g(sey, true);
    }
    
    @Override
    public final void q(final int n, final sey sey) {
        this.g(sey, false);
    }
}
