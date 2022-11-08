import android.view.View$OnLayoutChangeListener;
import android.view.LayoutInflater;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.view.ViewGroup;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class irk extends irn
{
    public final Rect a;
    public final asib b;
    public int c;
    public int d;
    public final bhu e;
    private final aceo k;
    private final ird l;
    private final int m;
    private ViewGroup n;
    private ProgressBar o;
    private ImageView p;
    private View q;
    private View r;
    private View s;
    private View t;
    private boolean u;
    private anec v;
    private boolean w;
    private final arud x;
    
    public irk(final Context context, final aceo k, final arud x, final bhu e, final qv qv, final ird l, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        super(context);
        k.getClass();
        this.k = k;
        this.x = x;
        e.getClass();
        this.e = e;
        l.getClass();
        this.l = l;
        this.a = new Rect();
        this.b = new asib();
        qv.c((foa)new irj(this));
        this.m = context.getResources().getDimensionPixelSize(2131165434);
    }
    
    private final void o() {
        if (!this.u) {
            final ImageView p = this.p;
            if (p != null && p.getVisibility() == 0) {
                final anec v = this.v;
                if (v != null) {
                    final aceo k = this.k;
                    final ImageView p2 = this.p;
                    aorm aorm;
                    if ((aorm = v.j) == null) {
                        aorm = aorm.a;
                    }
                    k.g(p2, aorm);
                    this.u = true;
                }
            }
        }
    }
    
    private final void p() {
        final View t = this.t;
        if (t != null) {
            tmy.aF(t, tmy.at(this.l.a() + this.a.bottom), (Class)ViewGroup$LayoutParams.class);
        }
    }
    
    public final ViewGroup$LayoutParams a() {
        return new absc(-1, -1, false);
    }
    
    public final View c(final Context context) {
        final LayoutInflater from = LayoutInflater.from(context);
        boolean b = false;
        final ViewGroup viewGroup = (ViewGroup)from.inflate(2131625430, (ViewGroup)null, false);
        this.n = (ViewGroup)viewGroup.findViewById(2131428492);
        this.o = (ProgressBar)viewGroup.findViewById(2131430378);
        this.p = (ImageView)viewGroup.findViewById(2131429879);
        this.q = viewGroup.findViewById(2131430377);
        this.r = viewGroup.findViewById(2131427743);
        this.s = viewGroup.findViewById(2131432139);
        this.t = viewGroup.findViewById(2131427829);
        this.l.b(this, this.n);
        this.l.f(this.w);
        final View t = this.t;
        if (this.l.a() > 0) {
            b = true;
        }
        tmy.v(t, b);
        this.p();
        this.n.addOnLayoutChangeListener((View$OnLayoutChangeListener)new fta(this, 15));
        return (View)viewGroup;
    }
    
    public final void e(final Context context, final View view) {
        final boolean b = true;
        if (((aazp)this).ab(1)) {
            final anec g = super.g;
            final boolean h = super.h;
            if (this.w != h) {
                this.w = h;
                this.l.f(h);
            }
            if (!aeda.v(this.v, g)) {
                this.v = g;
                this.l.g(g);
                this.u = false;
                this.o();
            }
        }
        if (((aazp)this).ab(2)) {
            final long i = super.i;
            final long j = super.j;
            final ProgressBar o = this.o;
            if (o != null) {
                if (o.getVisibility() == 0) {
                    this.o.setMax((int)j);
                    this.o.setProgress((int)i);
                }
                this.l.e(i, j);
            }
        }
        if (((aazp)this).ab(4)) {
            final fkk f = super.f;
            if (f != null) {
                if (this.q != null && this.o != null && this.p != null && this.r != null && this.n != null && this.s != null && this.t != null) {
                    this.l.d(f);
                    this.p();
                    final boolean n = f.n();
                    final boolean f2 = f.f();
                    final boolean b2 = n || f2;
                    tmy.v(this.q, f2);
                    tmy.v((View)this.o, f2);
                    tmy.v((View)this.p, b2);
                    this.o();
                    final boolean b3 = b2 ^ true;
                    tmy.v(this.r, b3);
                    tmy.v((View)this.n, b3);
                    tmy.v(this.s, b3);
                    tmy.v(this.t, this.l.a() > 0 && !b2 && b);
                }
            }
        }
        if (((aazp)this).ab(8)) {
            final ViewGroup n2 = this.n;
            if (n2 != null && this.s != null) {
                n2.setPadding(this.a.left, this.a.top, this.a.right, this.a.bottom);
                tmy.aF(this.s, tmy.at(this.m + this.a.top), (Class)ViewGroup$LayoutParams.class);
                this.p();
            }
        }
        if (((aazp)this).ab(22)) {
            this.l.c(this.d, this.c);
        }
    }
    
    protected final aazs mj(final Context context) {
        final aazs mj = super.mj(context);
        mj.e = true;
        mj.b = 0;
        return mj;
    }
    
    public final boolean ow(final fkk fkk) {
        final boolean i = fkk.i();
        boolean b = true;
        if (!i || fkk.f() || fkk == fkk.h || fkk == fkk.i) {
            if (fkk.f()) {
                if (gkt.ai(this.x) <= 0) {
                    return false;
                }
            }
            else {
                b = false;
            }
        }
        return b;
    }
}
