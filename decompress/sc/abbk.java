import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class abbk implements abbm, abbo
{
    private final Context a;
    private abbp b;
    
    public abbk(final Context a) {
        a.getClass();
        this.a = a;
    }
    
    public final void X() {
        final abbp ox = this.ox();
        if (ox.i()) {
            ox.b();
            return;
        }
        ox.g(4);
        ox.a(24);
        ox.d();
    }
    
    public final void Y() {
        this.ox().e(0);
    }
    
    public final void Z(final int n) {
        this.ox().e(n);
    }
    
    public final void aa() {
        final abbp ox = this.ox();
        if (ox.k()) {
            ox.b();
            return;
        }
        ox.g(12);
        ox.a(16);
        ox.d();
    }
    
    protected final boolean ab(final int n) {
        return this.ox().l(n);
    }
    
    @Override
    public View md() {
        final abbp ox = this.ox();
        if (!ox.j()) {
            final String value = String.valueOf(ox.b);
            final String string = ox.toString();
            final StringBuilder sb = new StringBuilder("Forcefully created overlay:");
            sb.append(value);
            sb.append(" helper:");
            sb.append(string);
            ttr.l(sb.toString());
            ox.c();
        }
        return ox.e;
    }
    
    protected abbn mj(final Context context) {
        final abbn abbn = new abbn(context, this);
        abbn.h = (trk)new ivs(this, 9);
        return abbn;
    }
    
    public void mk() {
        final abbp ox = this.ox();
        if (ox.i()) {
            ox.b();
            return;
        }
        ox.g(20);
        ox.a(8);
        ox.d();
    }
    
    @Override
    public final void ml(final abbl g) {
        final abbp ox = this.ox();
        adkp.Q(ox.g == null);
        ox.g = g;
    }
    
    public void mm() {
        final abbp ox = this.ox();
        if (ox.k()) {
            ox.b();
            return;
        }
        ox.g(28);
        ox.d();
    }
    
    @Override
    public boolean mn() {
        return this.ox().j();
    }
    
    @Override
    public String mr() {
        return null;
    }
    
    protected abbp ox() {
        synchronized (this) {
            if (this.b == null) {
                final abbn mj = this.mj(this.a);
                this.b = new abbp(mj.i, mj.j, mj.h, mj.b, mj.a, mj.d, mj.c, mj.e, mj.f, mj.g);
            }
            return this.b;
        }
    }
    
    public void oy(final int n) {
    }
}
