import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.ViewGroup$LayoutParams;
import android.view.Menu;
import android.view.ContextThemeWrapper;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.support.v7.widget.Toolbar;
import android.app.Dialog;
import android.app.Activity;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import java.util.ArrayList;
import android.view.View;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.content.Context;
import android.view.animation.Interpolator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gk extends ep implements jn
{
    private static final Interpolator s;
    private static final Interpolator t;
    private boolean A;
    Context a;
    ActionBarOverlayLayout b;
    public ActionBarContainer c;
    lq d;
    ActionBarContextView e;
    View f;
    gj g;
    hm h;
    hl i;
    public int j;
    public boolean k;
    boolean l;
    public boolean m;
    public hv n;
    boolean o;
    final ank p;
    final ank q;
    final qpt r;
    private Context u;
    private boolean v;
    private boolean w;
    private final ArrayList x;
    private boolean y;
    private boolean z;
    
    static {
        s = (Interpolator)new AccelerateInterpolator();
        t = (Interpolator)new DecelerateInterpolator();
    }
    
    public gk(final Activity activity, final boolean b) {
        new ArrayList();
        this.x = new ArrayList();
        this.j = 0;
        this.k = true;
        this.z = true;
        this.p = (ank)new gh(this);
        this.q = (ank)new gi(this);
        this.r = new qpt(this);
        final View decorView = activity.getWindow().getDecorView();
        this.G(decorView);
        if (!b) {
            this.f = decorView.findViewById(16908290);
        }
    }
    
    public gk(final Dialog dialog) {
        new ArrayList();
        this.x = new ArrayList();
        this.j = 0;
        this.k = true;
        this.z = true;
        this.p = (ank)new gh(this);
        this.q = (ank)new gi(this);
        this.r = new qpt(this);
        this.G(dialog.getWindow().getDecorView());
    }
    
    static boolean F(final boolean b, final boolean b2, final boolean b3) {
        return b3 || (!b && !b2);
    }
    
    private final void G(final View view) {
        final ActionBarOverlayLayout b = (ActionBarOverlayLayout)view.findViewById(2131428608);
        this.b = b;
        if (b != null) {
            b.h = this;
            if (b.getWindowToken() != null) {
                ((gk)b.h).j = b.b;
                final int g = b.g;
                if (g != 0) {
                    b.onWindowSystemUiVisibilityChanged(g);
                    ana.L((View)b);
                }
            }
        }
        final View viewById = view.findViewById(2131427444);
        lq f;
        if (viewById instanceof lq) {
            f = (lq)viewById;
        }
        else {
            if (!(viewById instanceof Toolbar)) {
                final StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
                String simpleName;
                if (viewById != null) {
                    simpleName = ((Toolbar)viewById).getClass().getSimpleName();
                }
                else {
                    simpleName = "null";
                }
                sb.append(simpleName);
                throw new IllegalStateException(sb.toString());
            }
            f = ((Toolbar)viewById).f();
        }
        this.d = f;
        this.e = (ActionBarContextView)view.findViewById(2131427466);
        final ActionBarContainer c = (ActionBarContainer)view.findViewById(2131427447);
        this.c = c;
        final lq d = this.d;
        if (d != null && this.e != null && c != null) {
            this.a = d.b();
            if ((this.d.a() & 0x4) != 0x0) {
                this.v = true;
            }
            final Context a = this.a;
            final int targetSdkVersion = a.getApplicationInfo().targetSdkVersion;
            this.C();
            this.H(fm.f(a));
            final TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes((AttributeSet)null, gl.a, 2130968586, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                final ActionBarOverlayLayout b2 = this.b;
                if (!b2.d) {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
                b2.k(this.o = true);
            }
            final int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ana.U((View)this.c, (float)dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(String.valueOf(this.getClass().getSimpleName()).concat(" can only be used with a compatible window decor layout"));
    }
    
    private final void H(final boolean b) {
        if (!b) {
            this.d.z();
        }
        else {
            this.d.z();
        }
        this.d.y();
        this.d.B();
        this.b.e = false;
    }
    
    public final void A() {
        this.d.m(2132017170);
    }
    
    public final void B() {
        this.d.j((Drawable)null);
    }
    
    public final void C() {
        this.d.A();
    }
    
    public final void D(final boolean b) {
        if (b) {
            if (!this.y) {
                this.y = true;
                this.E(false);
            }
        }
        else if (this.y) {
            this.E(this.y = false);
        }
        if (ana.ao((View)this.c)) {
            bx bx;
            bx bx2;
            if (b) {
                bx = this.d.C(4, 100L);
                bx2 = this.e.g(0, 200L);
            }
            else {
                bx2 = this.d.C(0, 200L);
                bx = this.e.g(8, 100L);
            }
            final hv hv = new hv();
            hv.a.add(bx);
            final View view = (View)((WeakReference)bx.a).get();
            long duration;
            if (view != null) {
                duration = view.animate().getDuration();
            }
            else {
                duration = 0L;
            }
            bx2.t(duration);
            hv.a.add(bx2);
            hv.b();
            return;
        }
        if (b) {
            this.d.p(4);
            this.e.setVisibility(0);
            return;
        }
        this.d.p(0);
        this.e.setVisibility(8);
    }
    
    public final void E(final boolean b) {
        if (F(this.l, this.m, this.y)) {
            if (!this.z) {
                this.z = true;
                final hv n = this.n;
                if (n != null) {
                    n.a();
                }
                this.c.setVisibility(0);
                Label_0302: {
                    Label_0255: {
                        if (this.j == 0) {
                            boolean b2 = b;
                            if (!this.A) {
                                if (!b) {
                                    break Label_0255;
                                }
                                b2 = true;
                            }
                            this.c.setTranslationY(0.0f);
                            float n3;
                            final float n2 = n3 = (float)(-this.c.getHeight());
                            if (b2) {
                                final int[] array2;
                                final int[] array = array2 = new int[2];
                                array2[1] = (array2[0] = 0);
                                this.c.getLocationInWindow(array);
                                n3 = n2 - array[1];
                            }
                            this.c.setTranslationY(n3);
                            final hv n4 = new hv();
                            final bx ab = ana.aB((View)this.c);
                            ab.v(0.0f);
                            ab.aa(this.r);
                            n4.f(ab);
                            if (this.k) {
                                final View f = this.f;
                                if (f != null) {
                                    f.setTranslationY(n3);
                                    final bx ab2 = ana.aB(this.f);
                                    ab2.v(0.0f);
                                    n4.f(ab2);
                                }
                            }
                            n4.d(gk.t);
                            n4.c();
                            n4.e(this.q);
                            (this.n = n4).b();
                            break Label_0302;
                        }
                    }
                    this.c.setAlpha(1.0f);
                    this.c.setTranslationY(0.0f);
                    if (this.k) {
                        final View f2 = this.f;
                        if (f2 != null) {
                            f2.setTranslationY(0.0f);
                        }
                    }
                    this.q.a((View)null);
                }
                final ActionBarOverlayLayout b3 = this.b;
                if (b3 != null) {
                    ana.L((View)b3);
                }
            }
        }
        else if (this.z) {
            this.z = false;
            final hv n5 = this.n;
            if (n5 != null) {
                n5.a();
            }
            Label_0539: {
                if (this.j == 0) {
                    boolean b4 = b;
                    if (!this.A) {
                        if (!b) {
                            break Label_0539;
                        }
                        b4 = true;
                    }
                    this.c.setAlpha(1.0f);
                    this.c.a(true);
                    final hv n6 = new hv();
                    float n8;
                    final float n7 = n8 = (float)(-this.c.getHeight());
                    if (b4) {
                        final int[] array4;
                        final int[] array3 = array4 = new int[2];
                        array4[1] = (array4[0] = 0);
                        this.c.getLocationInWindow(array3);
                        n8 = n7 - array3[1];
                    }
                    final bx ab3 = ana.aB((View)this.c);
                    ab3.v(n8);
                    ab3.aa(this.r);
                    n6.f(ab3);
                    if (this.k) {
                        final View f3 = this.f;
                        if (f3 != null) {
                            final bx ab4 = ana.aB(f3);
                            ab4.v(n8);
                            n6.f(ab4);
                        }
                    }
                    n6.d(gk.s);
                    n6.c();
                    n6.e(this.p);
                    (this.n = n6).b();
                    return;
                }
            }
            this.p.a((View)null);
        }
    }
    
    public final int a() {
        return this.d.a();
    }
    
    public final Context b() {
        if (this.u == null) {
            final TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(2130968591, typedValue, true);
            final int resourceId = typedValue.resourceId;
            if (resourceId != 0) {
                this.u = (Context)new ContextThemeWrapper(this.a, resourceId);
            }
            else {
                this.u = this.a;
            }
        }
        return this.u;
    }
    
    public final hm c(hl g) {
        final gj g2 = this.g;
        if (g2 != null) {
            g2.f();
        }
        this.b.k(false);
        this.e.i();
        g = (hl)new gj(this, this.e.getContext(), g);
        ((gj)g).a.s();
        try {
            final boolean c = ((gj)g).b.c((hm)g, (Menu)((gj)g).a);
            ((gj)g).a.r();
            if (c) {
                (this.g = (gj)g).g();
                this.e.h((hm)g);
                this.D(true);
                return (hm)g;
            }
            return null;
        }
        finally {
            ((gj)g).a.r();
        }
    }
    
    public final View d() {
        return this.d.c();
    }
    
    public final void e(final boolean w) {
        if (w == this.w) {
            return;
        }
        this.w = w;
        for (int size = this.x.size(), i = 0; i < size; ++i) {
            ((eo)this.x.get(i)).a();
        }
    }
    
    public final void f() {
        if (!this.l) {
            this.l = true;
            this.E(false);
        }
    }
    
    public final void h(final View view, final en layoutParams) {
        view.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        this.d.h(view);
    }
    
    public final void i(final boolean b) {
        if (!this.v) {
            this.j(b);
        }
    }
    
    public final void j(final boolean b) {
        int n;
        if (!b) {
            n = 0;
        }
        else {
            n = 4;
        }
        this.k(n, 4);
    }
    
    public final void k(final int n, final int n2) {
        final int a = this.d.a();
        if ((n2 & 0x4) != 0x0) {
            this.v = true;
        }
        this.d.i((n & n2) | (~n2 & a));
    }
    
    public final void l(final boolean b) {
        int n;
        if (!b) {
            n = 0;
        }
        else {
            n = 2;
        }
        this.k(n, 2);
    }
    
    public final void m(final Drawable drawable) {
        this.d.n(drawable);
    }
    
    public final void n(final boolean a) {
        if (!(this.A = a)) {
            final hv n = this.n;
            if (n != null) {
                n.a();
            }
        }
    }
    
    public final void o(final int n) {
        this.p(this.a.getString(n));
    }
    
    public final void p(final CharSequence charSequence) {
        this.d.o(charSequence);
    }
    
    public final void q(final CharSequence charSequence) {
        this.d.r(charSequence);
    }
    
    public final void r() {
        if (this.l) {
            this.E(this.l = false);
        }
    }
    
    public final boolean t() {
        final lq d = this.d;
        if (d != null && d.t()) {
            d.d();
            return true;
        }
        return false;
    }
    
    public final boolean v(final int n, final KeyEvent keyEvent) {
        final gj g = this.g;
        if (g == null) {
            return false;
        }
        final im a = g.a;
        int deviceId;
        if (keyEvent != null) {
            deviceId = keyEvent.getDeviceId();
        }
        else {
            deviceId = -1;
        }
        final int keyboardType = KeyCharacterMap.load(deviceId).getKeyboardType();
        boolean qwertyMode = true;
        if (keyboardType == 1) {
            qwertyMode = false;
        }
        ((Menu)a).setQwertyMode(qwertyMode);
        return ((Menu)a).performShortcut(n, keyEvent, 0);
    }
    
    public final void y() {
        this.H(fm.f(this.a));
    }
    
    public final void z() {
        this.k(0, 8);
    }
}
