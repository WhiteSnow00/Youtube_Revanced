import android.widget.FrameLayout;
import android.view.TouchDelegate;
import android.graphics.Rect;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View;
import android.view.View$OnAttachStateChangeListener;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ixj
{
    public toz A;
    public toz B;
    public toz C;
    public toz D;
    public toz E;
    public toz F;
    public toz G;
    public toz H;
    public toz I;
    public final vai J;
    private final abuj K;
    private final abpq L;
    public final ixc a;
    public final abgz b;
    public final uwb c;
    public final iyy d;
    public final asiq e;
    public final wyw f;
    public YouTubeControlsOverlay g;
    public View$OnAttachStateChangeListener h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public String y;
    public toz z;
    
    public ixj(final ixc a, final abgz b, final uwb c, final abuj k, final iyy d, final vai j, final wyw f, final abpu abpu) {
        this.x = 0;
        this.a = a;
        this.b = b;
        this.c = c;
        this.K = k;
        this.e = new asiq();
        this.d = d;
        this.J = j;
        this.f = f;
        this.L = abpu.n();
    }
    
    public static toz e(final View view) {
        return new toz(view, (long)view.getResources().getInteger(2131492903), 8);
    }
    
    public static toz f(final View view, final int n) {
        return e(view.findViewById(n));
    }
    
    public static void g(final toz toz, final int n) {
        if (toz == null) {
            return;
        }
        toz.c = n;
    }
    
    private static void h(final View view, final int leftMargin, final int rightMargin) {
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup$MarginLayoutParams)) {
            return;
        }
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
        viewGroup$MarginLayoutParams.leftMargin = leftMargin;
        viewGroup$MarginLayoutParams.rightMargin = rightMargin;
    }
    
    private static final void i(final View view, final View view2, int n) {
        final Rect rect = new Rect();
        view.getHitRect(rect);
        n = -n;
        rect.inset(n, n);
        view2.setTouchDelegate(new TouchDelegate(rect, view));
    }
    
    public final void a() {
        final toz b = this.B;
        b.getClass();
        final View a = b.a;
        final toz e = this.E;
        e.getClass();
        i(a, e.a, this.m);
        final toz c = this.C;
        c.getClass();
        final View a2 = c.a;
        final toz f = this.F;
        f.getClass();
        i(a2, f.a, this.m);
        final toz a3 = this.A;
        a3.getClass();
        final View a4 = a3.a;
        final toz g = this.G;
        g.getClass();
        i(a4, g.a, this.m);
        final toz z = this.z;
        z.getClass();
        final View a5 = z.a;
        final toz h = this.H;
        h.getClass();
        i(a5, h.a, this.m);
        final toz d = this.D;
        d.getClass();
        final View a6 = d.a;
        final toz i = this.I;
        i.getClass();
        i(a6, i.a, this.n);
    }
    
    public final void b(final boolean b) {
        final abvx q = this.L.q();
        int d;
        if (q != null) {
            d = (int)q.c();
        }
        else {
            d = 0;
        }
        long millis;
        if (b) {
            millis = this.b.a().toMillis();
        }
        else {
            millis = -this.b.a().toMillis();
        }
        this.K.g(millis);
        final YouTubeControlsOverlay g = this.g;
        g.getClass();
        final FrameLayout l = g.l;
        l.getClass();
        l.post(g.u);
        final int e = (int)Math.min(this.L.j(), Math.max(0L, d + millis));
        final ahaz builder = ((ahbh)alht.a).createBuilder();
        final anza b2 = anza.B;
        builder.copyOnWrite();
        final alht alht = (alht)builder.instance;
        alht.c = b2.I;
        alht.b |= 0x1;
        builder.copyOnWrite();
        final alht alht2 = (alht)builder.instance;
        alht2.b |= 0x2;
        alht2.d = d;
        builder.copyOnWrite();
        final alht alht3 = (alht)builder.instance;
        alht3.b |= 0x4;
        alht3.e = e;
        final alht i = (alht)builder.build();
        final ahaz builder2 = ((ahbh)alhi.a).createBuilder();
        builder2.copyOnWrite();
        final alhi alhi = (alhi)builder2.instance;
        i.getClass();
        alhi.I = i;
        alhi.c |= 0x4000000;
        final alhi alhi2 = (alhi)builder2.build();
        if (b) {
            this.f.J(3, (wzz)new wyt(xaa.c(148567)), alhi2);
            return;
        }
        this.f.J(3, (wzz)new wyt(xaa.c(148566)), alhi2);
    }
    
    public final void c() {
        int n;
        if (this.i && this.j) {
            if (this.k && !this.l) {
                n = this.r;
            }
            else {
                n = this.q;
            }
            final toz b = this.B;
            b.getClass();
            h(b.a, n, 0);
            final toz c = this.C;
            c.getClass();
            h(c.a, 0, n);
        }
        else if (this.k && !this.l) {
            n = this.p;
        }
        else {
            n = this.o;
        }
        final toz d = this.D;
        d.getClass();
        h(d.a, n, n);
    }
    
    public final void d() {
        int n;
        if (this.i && this.j) {
            final boolean k = this.k;
            if (k && !this.l) {
                n = this.u;
            }
            else {
                n = this.t;
            }
            int n2;
            if (k && !this.l) {
                n2 = this.w;
            }
            else {
                n2 = this.v;
            }
            final toz e = this.E;
            e.getClass();
            h(e.a, n2, 0);
            final toz f = this.F;
            f.getClass();
            h(f.a, 0, n2);
        }
        else {
            n = this.s;
        }
        final toz i = this.I;
        i.getClass();
        h(i.a, n, n);
    }
}
