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

public final class iwk
{
    public tmt A;
    public tmt B;
    public tmt C;
    public tmt D;
    public tmt E;
    public tmt F;
    public tmt G;
    public tmt H;
    public tmt I;
    public final uyi J;
    private final absi K;
    private final abno L;
    public final iwd a;
    public final abff b;
    public final uug c;
    public final ixz d;
    public final asib e;
    public final wwv f;
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
    public tmt z;
    
    public iwk(final iwd a, final abff b, final uug c, final absi k, final ixz d, final uyi j, final wwv f, final abns abns) {
        this.x = 0;
        this.a = a;
        this.b = b;
        this.c = c;
        this.K = k;
        this.e = new asib();
        this.d = d;
        this.J = j;
        this.f = f;
        this.L = abns.o();
    }
    
    public static tmt e(final View view) {
        return new tmt(view, (long)view.getResources().getInteger(2131492903), 8);
    }
    
    public static tmt f(final View view, final int n) {
        return e(view.findViewById(n));
    }
    
    public static void g(final tmt tmt, final int n) {
        if (tmt == null) {
            return;
        }
        tmt.c = n;
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
        final tmt b = this.B;
        b.getClass();
        final View a = b.a;
        final tmt e = this.E;
        e.getClass();
        i(a, e.a, this.m);
        final tmt c = this.C;
        c.getClass();
        final View a2 = c.a;
        final tmt f = this.F;
        f.getClass();
        i(a2, f.a, this.m);
        final tmt a3 = this.A;
        a3.getClass();
        final View a4 = a3.a;
        final tmt g = this.G;
        g.getClass();
        i(a4, g.a, this.m);
        final tmt z = this.z;
        z.getClass();
        final View a5 = z.a;
        final tmt h = this.H;
        h.getClass();
        i(a5, h.a, this.m);
        final tmt d = this.D;
        d.getClass();
        final View a6 = d.a;
        final tmt i = this.I;
        i.getClass();
        i(a6, i.a, this.n);
    }
    
    public final void b(final boolean b) {
        final abtt q = this.L.q();
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
        final long min = Math.min(this.L.j(), Math.max(0L, d + millis));
        final agza builder = ((agzi)alfq.a).createBuilder();
        final anwx b2 = anwx.B;
        builder.copyOnWrite();
        final alfq alfq = (alfq)builder.instance;
        alfq.c = b2.H;
        alfq.b |= 0x1;
        builder.copyOnWrite();
        final alfq alfq2 = (alfq)builder.instance;
        alfq2.b |= 0x2;
        alfq2.d = d;
        builder.copyOnWrite();
        final alfq alfq3 = (alfq)builder.instance;
        alfq3.b |= 0x4;
        alfq3.e = (int)min;
        final alfq i = (alfq)builder.build();
        final agza builder2 = ((agzi)alff.a).createBuilder();
        builder2.copyOnWrite();
        final alff alff = (alff)builder2.instance;
        i.getClass();
        alff.I = i;
        alff.c |= 0x4000000;
        final alff alff2 = (alff)builder2.build();
        if (b) {
            this.f.J(3, (wxz)new wws(wya.c(148567)), alff2);
            return;
        }
        this.f.J(3, (wxz)new wws(wya.c(148566)), alff2);
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
            final tmt b = this.B;
            b.getClass();
            h(b.a, n, 0);
            final tmt c = this.C;
            c.getClass();
            h(c.a, 0, n);
        }
        else if (this.k && !this.l) {
            n = this.p;
        }
        else {
            n = this.o;
        }
        final tmt d = this.D;
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
            final tmt e = this.E;
            e.getClass();
            h(e.a, n2, 0);
            final tmt f = this.F;
            f.getClass();
            h(f.a, 0, n2);
        }
        else {
            n = this.s;
        }
        final tmt i = this.I;
        i.getClass();
        h(i.a, n, n);
    }
}
