import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public class eva implements rrv
{
    private final rru a;
    private final sfh b;
    private final sdr c;
    private final ajkj d;
    private final euz e;
    private final euy f;
    private final eum g;
    
    public eva(final eum g, final rru a, final sfh b, final sdr c, final ajkj d, final euz e, final euy f) {
        this.g = g;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public void I() {
        throw null;
    }
    
    public final void J() {
        final ViewGroup a = this.e.a();
        if (a == null) {
            this.a.t(this.b, this.c, new rvz("No view available when trying to start rendering", 48), 10);
            return;
        }
        final acij a2 = this.f.a();
        a.addView(this.g.a());
        a.setVisibility(0);
        this.g.a().setVisibility(0);
        this.g.c(this.c.j, a2, this.d);
        this.a.a(this.b, this.c);
    }
    
    public final void K(final int n) {
        try {
            this.g.b();
            this.g.a().setVisibility(8);
            final ViewGroup a = this.e.a();
            if (a == null) {
                throw new rvz("No view available when trying to reset container", 48);
            }
            a.removeAllViews();
            a.setVisibility(8);
        }
        catch (final rvz rvz) {
            qcv.w(this.b, rvz.getMessage());
        }
        this.a.d(this.b, this.c, n);
    }
    
    public final sdr a() {
        throw null;
    }
    
    public void b() {
        throw null;
    }
}
