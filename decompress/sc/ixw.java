import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ixw implements abps
{
    public final acbm a;
    public final accf b;
    public final ackm c;
    public final wyw d;
    public FrameLayout e;
    private final asid f;
    
    public ixw(final acbm a, final accf b, final asid f, final wyw d) {
        final ackm c = new ackm();
        this.c = c;
        this.a = a;
        this.b = b;
        this.f = f;
        c.a(this.d = d);
    }
    
    public final void a() {
        final FrameLayout e = this.e;
        if (e != null) {
            e.removeAllViews();
            this.e.setVisibility(8);
        }
        this.a.c((acku)null);
    }
    
    public final asir[] lX(final abpu abpu) {
        return new asir[] { abpu.P().P(this.f).an(new ixr(this, 3), ixp.d), ((ashi)abpu.p().c).an(new ixr(this, 4), ixp.d) };
    }
}
