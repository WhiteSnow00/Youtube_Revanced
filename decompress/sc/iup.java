import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.ViewGroup;
import java.util.HashSet;
import android.content.Context;
import java.util.Set;
import com.google.android.apps.youtube.app.player.overlay.suggestedactions.SuggestedActionsMainController;
import android.view.View;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iup implements ivu, abhp, iuu
{
    private static final Rect r;
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private final fzw F;
    public View a;
    public View b;
    public final ivw c;
    public final SuggestedActionsMainController d;
    public final abho e;
    public final ativ f;
    public final atjm g;
    public final atjm h;
    public final Set i;
    public final boolean j;
    public final asiq k;
    public int l;
    public boolean m;
    public View n;
    public toz o;
    public toz p;
    public final qv q;
    private final Context s;
    private final int t;
    private final Rect u;
    private final Rect v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;
    
    static {
        r = new Rect(0, 0, 0, 0);
    }
    
    public iup(final Context s, final SuggestedActionsMainController d, final abho e, final vai vai, final fzw f, final qv q, final ivw c, final byte[] array, final byte[] array2) {
        this.s = s;
        this.c = c;
        this.d = d;
        this.e = e;
        this.q = q;
        this.F = f;
        this.f = ativ.aE();
        this.g = atjm.e();
        this.h = atjm.e();
        this.i = new HashSet();
        this.j = (vai.f(45360099L) ^ true);
        this.l = s.getResources().getInteger(2131492903);
        this.k = new asiq();
        this.t = s.getResources().getDimensionPixelSize(2131166179);
        this.u = new Rect();
        this.v = new Rect();
    }
    
    private final void A() {
        final boolean c = this.c.c();
        int dimensionPixelOffset;
        final int n = dimensionPixelOffset = 0;
        if (!c) {
            dimensionPixelOffset = n;
            if (!this.C) {
                dimensionPixelOffset = n;
                if (!this.E) {
                    dimensionPixelOffset = n;
                    if (!this.B) {
                        if (this.m) {
                            dimensionPixelOffset = n;
                        }
                        else {
                            dimensionPixelOffset = this.s.getResources().getDimensionPixelOffset(2131166171);
                        }
                    }
                }
            }
        }
        this.g.tu((Object)dimensionPixelOffset);
    }
    
    private final void z(final boolean b) {
        final boolean w = this.w;
        boolean b3;
        final boolean b2 = b3 = false;
        if (w) {
            b3 = b2;
            if (this.c.c()) {
                b3 = b2;
                if (!this.B) {
                    b3 = b2;
                    if (!this.C) {
                        b3 = b2;
                        if (!this.E) {
                            b3 = true;
                        }
                    }
                }
            }
        }
        if (b3) {
            this.q.b();
        }
        final toz o = this.o;
        if (o == null) {
            return;
        }
        o.l(b3, b);
    }
    
    public final void a(final View view) {
        final toz o = this.o;
        if (o == null) {
            this.i.add(view);
            return;
        }
        final ViewGroup viewGroup = (ViewGroup)o.a;
        viewGroup.addView(view, Math.max(0, viewGroup.getChildCount() - 1));
    }
    
    public final void b(final int n, final int n2, final int n3) {
        if (n != n2) {
            this.z(false);
            this.c();
        }
    }
    
    public final void c() {
        final boolean x = this.x;
        int n = 0;
        int n2;
        if (!x) {
            n2 = this.s.getResources().getDimensionPixelSize(2131170135);
        }
        else if (!this.e.b.g() && this.e.b.a != 3) {
            n2 = 0;
        }
        else {
            n2 = this.e.c;
        }
        if (this.x || this.z) {
            if (this.y && !this.m) {
                n = this.s.getResources().getDimensionPixelSize(2131166835) + n2;
            }
            else {
                n = n2;
            }
        }
        this.f.tu((Object)n);
    }
    
    public final void d(float u, final boolean b) {
        u = aei.u(u, 1.0f);
        this.h.tu((Object)(1.0f - u));
    }
    
    public final void f() {
        if (!this.w) {
            this.F.g(iup.r);
            return;
        }
        if (this.a != null) {
            final View n = this.n;
            if (n != null) {
                n.getGlobalVisibleRect(this.u);
                this.a.getGlobalVisibleRect(this.v);
                final int bottom = this.v.bottom;
                int intValue = 0;
                Label_0107: {
                    if (this.f.aJ()) {
                        final Integer n2 = (Integer)this.f.aG();
                        if (n2 != null) {
                            intValue = n2;
                            break Label_0107;
                        }
                    }
                    intValue = 0;
                }
                this.F.g(new Rect(0, 0, 0, bottom + intValue - this.u.top - this.t));
            }
        }
    }
    
    public final void g() {
        final View a = this.a;
        if (a == null) {
            return;
        }
        a.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new je(this, 8));
    }
    
    @Override
    public final void h(final boolean a) {
        if (this.A == a) {
            return;
        }
        this.A = a;
        this.A();
        this.z(false);
    }
    
    public final void i(final boolean b) {
    }
    
    public final void j(final ControlsOverlayStyle controlsOverlayStyle) {
        final SuggestedActionsMainController d = this.d;
        d.p((d.g = ControlsOverlayStyle.a(controlsOverlayStyle)) ^ true, false);
        final boolean y = this.y;
        final boolean s = controlsOverlayStyle.s;
        if (y != s) {
            this.y = s;
            this.c();
        }
    }
    
    public final void l(final boolean e) {
        if (this.E == e) {
            return;
        }
        this.E = e;
        this.A();
        this.z(true);
    }
    
    public final void m(final boolean b) {
    }
    
    public final void n(final trs trs) {
        final boolean z = this.z;
        final boolean z2 = trs instanceof trv;
        this.z = z2;
        if (z == z2) {
            return;
        }
        this.c();
    }
    
    public final void oY(final boolean b) {
        if (this.w) {
            this.w = false;
            this.z(b);
            this.f();
        }
    }
    
    public final void oZ(final ControlsState controlsState) {
    }
    
    public final void pa(final boolean b) {
    }
    
    public final void pb(final boolean b) {
    }
    
    public final void pc(final boolean b) {
    }
    
    public final void r(final fkr fkr) {
        if (this.x != fkr.c()) {
            this.x = fkr.c();
            this.c();
        }
    }
    
    public final void s(final boolean b) {
    }
    
    public final void t(final boolean d) {
        if (this.D != d) {
            final View a = this.a;
            if (a != null) {
                int visibility;
                if (!(this.D = d)) {
                    visibility = 0;
                }
                else {
                    visibility = 8;
                }
                a.setVisibility(visibility);
            }
        }
    }
    
    public final void u(final boolean c) {
        if (this.C == c) {
            return;
        }
        this.C = c;
        this.A();
        this.z(true);
    }
    
    public final void v(final boolean b) {
    }
    
    public final void w(final boolean b) {
        if (this.B == b) {
            return;
        }
        this.B = b;
        this.z(true);
        this.A();
    }
    
    public final void x(final int n) {
    }
    
    public final void y(final boolean b) {
        if (!this.w) {
            this.w = true;
            this.z(b);
            this.g();
        }
    }
}
