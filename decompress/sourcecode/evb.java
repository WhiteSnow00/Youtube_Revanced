import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

@rxl(b = ahnh.d, c = { scg.class, scy.class })
public final class evb extends eva implements eui
{
    private final sez a;
    private final euj b;
    private final eum c;
    private final hlo d;
    
    public evb(final eum c, final rru rru, final sfh sfh, final sdr sdr, final ajkj ajkj, final sez a, final hlo d, final euj b) {
        a.getClass();
        super(c, rru, sfh, sdr, ajkj, new evc(a, 1), evd.b);
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
    }
    
    private final void g(final sez sez, final boolean b) {
        if (!aeda.v(sez, this.a)) {
            return;
        }
        if (!b) {
            this.c.a.y();
        }
        this.d.e(b);
    }
    
    @Override
    public final void I() {
        this.b.b(this);
    }
    
    @Override
    public final void b() {
        if (this.a.e) {
            this.d.e(true);
        }
        this.b.a(this);
    }
    
    @Override
    public final void l(final sez sez) {
        this.g(sez, true);
    }
    
    @Override
    public final void r(final int n, final sez sez) {
        this.g(sez, false);
    }
}
