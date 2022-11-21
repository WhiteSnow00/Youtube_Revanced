import java.util.HashMap;
import java.util.Map;
import android.graphics.Point;
import java.util.Locale;
import android.view.accessibility.CaptioningManager;
import android.content.Context;
import android.util.SparseBooleanArray;
import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bqn extends azp
{
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public final SparseArray x;
    public final SparseBooleanArray y;
    
    @Deprecated
    public bqn() {
        this.x = new SparseArray();
        this.y = new SparseBooleanArray();
        this.i();
    }
    
    public bqn(final Context context) {
        final int a = baz.a;
        final CaptioningManager captioningManager = (CaptioningManager)context.getSystemService("captioning");
        if (captioningManager != null) {
            if (captioningManager.isEnabled()) {
                super.n = 1088;
                final Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    super.m = afgh.r(locale.toLanguageTag());
                }
            }
        }
        final Point c = baz.C(context);
        this.e(c.x, c.y);
        this.x = new SparseArray();
        this.y = new SparseBooleanArray();
        this.i();
    }
    
    public bqn(final bqo bqo) {
        super((azq)bqo);
        this.r = bqo.C;
        final boolean d = bqo.D;
        this.s = bqo.E;
        final boolean f = bqo.F;
        this.t = bqo.G;
        final boolean h = bqo.H;
        final boolean i = bqo.I;
        final boolean j = bqo.J;
        final boolean k = bqo.K;
        this.u = bqo.L;
        this.v = bqo.M;
        final boolean n = bqo.N;
        this.w = bqo.O;
        final SparseArray p = bqo.P;
        final SparseArray x = new SparseArray();
        for (int l = 0; l < p.size(); ++l) {
            x.put(p.keyAt(l), (Object)new HashMap((Map<?, ?>)p.valueAt(l)));
        }
        this.x = x;
        this.y = bqo.Q.clone();
    }
    
    private final void i() {
        this.r = true;
        this.s = true;
        this.t = true;
        this.u = true;
        this.v = true;
        this.w = true;
    }
    
    @Override
    public final /* bridge */ azq a() {
        return (azq)this.f();
    }
    
    public final bqo f() {
        return new bqo(this);
    }
    
    protected final void g(final azq azq) {
        super.b(azq);
    }
    
    public final void h() {
        super.d();
    }
}
