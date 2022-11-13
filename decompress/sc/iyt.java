import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import android.widget.LinearLayout;
import android.view.View;
import com.google.android.libraries.youtube.mdx.mediaroute.MdxMediaRouteButton;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.player.overlay.MusicAppDeeplinkButtonController;
import com.google.android.apps.youtube.app.player.autonav.AutonavToggleController;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iyt implements iuu
{
    private static final Rect o;
    private boolean A;
    private boolean B;
    private boolean C;
    private int D;
    private final fzw E;
    public final isd a;
    public final AutonavToggleController b;
    public final MusicAppDeeplinkButtonController c;
    public final uwb d;
    public final Rect e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public boolean l;
    public boolean m;
    public ktn n;
    private final xnt p;
    private final boolean q;
    private final arkg r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;
    
    static {
        o = new Rect();
    }
    
    public iyt(final xnt p10, final isd a, final AutonavToggleController b, final MusicAppDeeplinkButtonController c, final vai vai, final uwb d, final fzw e, final arkg r, final byte[] array, final byte[] array2) {
        this.p = p10;
        this.a = a;
        this.b = b;
        this.c = c;
        this.E = e;
        this.q = vai.f(45361335L);
        this.d = d;
        this.r = r;
        this.e = new Rect();
    }
    
    private static final void A(final fyj fyj) {
        if (fyj.r()) {
            fyj.o(false, false);
            fyj.o(true, true);
        }
    }
    
    private static final void B(final toz toz) {
        if (toz.e()) {
            toz.a.animate().cancel();
        }
    }
    
    private static final void C(final toz toz) {
        if (toz.e()) {
            toz.l(false, true);
        }
    }
    
    private static final void D(final toz toz) {
        if (toz.e()) {
            toz.l(false, false);
            toz.l(true, true);
        }
    }
    
    public static void c(final fyj fyj, final int n) {
        if (fyj == null) {
            return;
        }
        fyj.p(n);
    }
    
    public static void d(final toz toz, final int n) {
        toz.c = n;
    }
    
    private final void f() {
        final ktn n = this.n;
        n.getClass();
        ((toz)n.b).l(this.s, false);
        ((toz)this.n.c).a(false);
        ((toz)this.n.e).a(false);
        ((toz)this.n.h).a(false);
        ((toz)this.n.f).a(false);
        ((toz)this.n.d).a(false);
        ((toz)this.n.i).a(false);
        this.a.o(false, false);
        ((fxx)this.b).o(false, false);
        ((fxx)this.c).o(false, false);
    }
    
    private final void g() {
        final ktn n = this.n;
        n.getClass();
        B((toz)n.d);
        B((toz)this.n.c);
        B((toz)this.n.f);
        B((toz)this.n.b);
        B((toz)this.n.h);
        B((toz)this.n.e);
    }
    
    private final boolean h() {
        return this.p.f() == 0 || this.p.f() == 1;
    }
    
    private static final void z(final fyj fyj) {
        if (fyj.r()) {
            fyj.o(false, true);
        }
    }
    
    public final void a() {
        this.n.getClass();
        if (!this.y) {
            if (!this.z && !this.A && !this.B) {
                if (!this.C) {
                    final boolean g = this.g;
                    final boolean b = true;
                    final boolean b2 = g && this.w && !this.x && this.u;
                    this.a.o(b2, false);
                    ((fxx)this.b).o(this.h && !this.x && !this.h(), false);
                    ((toz)this.n.e).l(this.w && !this.x && !this.l && (!b2 || this.f), false);
                    final boolean b3 = (!this.q || !this.w) && !b2;
                    ((toz)this.n.h).l(b3, false);
                    ((toz)this.n.a).l(b3, false);
                    ((toz)this.n.f).l(!this.s && !b2 && !this.u, false);
                    final ktn n = this.n;
                    n.getClass();
                    if (!this.x && this.v) {
                        final toz toz = (toz)n.f;
                        if (toz.e()) {
                            final ViewGroup viewGroup = (ViewGroup)toz.a;
                            for (int i = 0; i < viewGroup.getChildCount(); ++i) {
                                final View child = viewGroup.getChildAt(i);
                                if (child instanceof MdxMediaRouteButton) {
                                    ((acwn)this.r.a()).d("watch-smart-device-cast", child);
                                    break;
                                }
                            }
                        }
                    }
                    ((toz)this.n.b).l(!this.x && this.t, false);
                    final ktn n2 = this.n;
                    n2.getClass();
                    if (!this.x && this.v && ((toz)n2.b).e()) {
                        ((acwn)this.r.a()).d("ytp-settings-button", ((toz)this.n.b).a);
                    }
                    ((toz)this.n.i).l(this.j, false);
                    ((toz)this.n.d).l(!this.x && this.t && !this.u && this.w && !this.h() && this.i && !b2, false);
                    ((fxx)this.c).o(!this.x && this.t && !this.h() && this.m && !((toz)this.n.d).e(), false);
                    final Object c = this.n.c;
                    boolean b4 = false;
                    Label_0723: {
                        if (!this.x) {
                            final int d = this.D;
                            if ((d == 5 || d == 4) && this.t) {
                                b4 = b;
                                break Label_0723;
                            }
                        }
                        b4 = false;
                    }
                    ((toz)c).l(b4, false);
                    return;
                }
            }
        }
        else if (this.u) {
            this.u = false;
        }
        this.g();
        ((toz)this.n.h).a(false);
        ((toz)this.n.b).a(false);
        ((toz)this.n.i).a(false);
        ((toz)this.n.d).a(false);
        ((toz)this.n.c).a(false);
        ((toz)this.n.f).a(false);
        ((toz)this.n.e).a(false);
        this.a.o(false, false);
        ((fxx)this.b).o(false, false);
        ((fxx)this.c).o(false, false);
    }
    
    public final void b() {
        if (this.n == null) {
            return;
        }
        if (this.v) {
            this.a();
        }
        else {
            this.f();
        }
        final ktn n = this.n;
        n.getClass();
        if (((LinearLayout)((toz)n.g).a).getChildCount() > 0) {
            ((toz)this.n.g).l(this.x && this.t, false);
        }
    }
    
    @Override
    public final void i(final boolean b) {
    }
    
    @Override
    public final void j(final ControlsOverlayStyle controlsOverlayStyle) {
        this.x = ControlsOverlayStyle.a(controlsOverlayStyle);
        this.b();
    }
    
    @Override
    public final void l(final boolean c) {
        if (this.C == c) {
            return;
        }
        this.C = c;
        this.b();
    }
    
    @Override
    public final void m(final boolean b) {
    }
    
    @Override
    public final void n(final trs trs) {
    }
    
    @Override
    public final void oY(final boolean b) {
        final ktn n = this.n;
        n.getClass();
        if (b) {
            C((toz)n.f);
            C((toz)this.n.b);
            C((toz)this.n.h);
            C((toz)this.n.e);
            C((toz)this.n.d);
            C((toz)this.n.c);
            C((toz)this.n.i);
            z(this.a);
            z((fyj)this.b);
            z((fyj)this.c);
        }
        else {
            this.g();
            this.v = false;
            this.f();
        }
        final ktn n2 = this.n;
        n2.getClass();
        if ((!this.v || !((toz)n2.f).e()) && (this.u || !this.t)) {
            ((acwn)this.r.a()).g("watch-smart-device-cast");
        }
        if ((!this.v || !((toz)this.n.b).e()) && (this.u || !this.t)) {
            ((acwn)this.r.a()).g("ytp-settings-button");
        }
        this.E.h(iyt.o);
    }
    
    @Override
    public final void oZ(final ControlsState controlsState) {
        final boolean s = this.s;
        final boolean i = controlsState.i();
        final boolean b = true;
        if (s == i && this.t == controlsState.j() && this.u == (controlsState.a == abbx.f)) {
            return;
        }
        this.s = controlsState.i();
        this.t = controlsState.j();
        this.u = (controlsState.a == abbx.f && b);
        this.b();
    }
    
    @Override
    public final void pa(final boolean z) {
        if (this.z != z) {
            this.z = z;
            this.b();
        }
    }
    
    @Override
    public final void pb(final boolean b) {
    }
    
    @Override
    public final void pc(final boolean b) {
    }
    
    @Override
    public final void r(final fkr fkr) {
        this.w = fkr.c();
        this.b();
    }
    
    @Override
    public final void s(final boolean b) {
    }
    
    @Override
    public final void t(final boolean b) {
        if (this.B == b) {
            return;
        }
        this.B = b;
        this.b();
    }
    
    @Override
    public final void u(final boolean a) {
        if (this.A == a) {
            return;
        }
        this.A = a;
        this.b();
    }
    
    @Override
    public final void v(final boolean b) {
    }
    
    @Override
    public final void w(final boolean y) {
        if (this.y != y) {
            this.y = y;
            this.b();
        }
    }
    
    @Override
    public final void x(final int d) {
        if (this.D == d) {
            return;
        }
        this.D = d;
        this.b();
    }
    
    @Override
    public final void y(final boolean b) {
        this.n.getClass();
        this.v = true;
        this.a();
        if (b) {
            D((toz)this.n.f);
            D((toz)this.n.b);
            D((toz)this.n.h);
            D((toz)this.n.d);
            D((toz)this.n.e);
            D((toz)this.n.c);
            D((toz)this.n.i);
            A(this.a);
            A((fyj)this.b);
            A((fyj)this.c);
        }
        this.E.h(this.e);
    }
}
