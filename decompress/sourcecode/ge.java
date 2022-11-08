import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.content.Context;
import android.support.v7.widget.ActionMenuView;
import android.view.Menu;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import java.util.ArrayList;
import android.view.Window$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ge extends ep
{
    public final lq a;
    public final Window$Callback b;
    boolean c;
    final qpt d;
    private boolean e;
    private boolean f;
    private final ArrayList g;
    private final Runnable h;
    private final pu i;
    
    public ge(final Toolbar toolbar, final CharSequence charSequence, final Window$Callback window$Callback) {
        this.g = new ArrayList();
        this.h = new be(this, 7);
        final qwf qwf = new qwf(this, 1);
        this.i = (pu)qwf;
        final px a = new px(toolbar, false);
        this.a = (lq)a;
        aff.k((Object)window$Callback);
        this.b = window$Callback;
        final px px = a;
        a.e = window$Callback;
        toolbar.t = (pu)qwf;
        ((lq)a).r(charSequence);
        this.d = new qpt(this);
    }
    
    public final void A() {
        this.a.m(2132017170);
    }
    
    public final void B() {
        this.a.j((Drawable)null);
    }
    
    public final void C() {
    }
    
    public final Menu D() {
        if (!this.e) {
            final lq a = this.a;
            final gd w = new gd(this);
            final jx x = new jx(this, 1);
            final Toolbar a2 = ((px)a).a;
            a2.w = (iy)w;
            a2.x = (ik)x;
            final ActionMenuView a3 = a2.a;
            if (a3 != null) {
                a3.f((iy)w, (ik)x);
            }
            this.e = true;
        }
        return ((px)this.a).a.g();
    }
    
    public final int a() {
        return ((px)this.a).b;
    }
    
    public final Context b() {
        return this.a.b();
    }
    
    public final View d() {
        return ((px)this.a).c;
    }
    
    public final void e(final boolean f) {
        if (f == this.f) {
            return;
        }
        this.f = f;
        for (int size = this.g.size(), i = 0; i < size; ++i) {
            ((eo)this.g.get(i)).a();
        }
    }
    
    public final void f() {
        this.a.p(8);
    }
    
    public final void g() {
        ((px)this.a).a.removeCallbacks(this.h);
    }
    
    public final void h(final View view, final en layoutParams) {
        view.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        this.a.h(view);
    }
    
    public final void i(final boolean b) {
    }
    
    public final void j(final boolean b) {
        this.k(4, 4);
    }
    
    public final void k(final int n, final int n2) {
        final lq a = this.a;
        a.i((n & n2) | (~n2 & ((px)a).b));
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
        this.a.n(drawable);
    }
    
    public final void n(final boolean b) {
    }
    
    public final void o(final int n) {
        final lq a = this.a;
        a.o(a.b().getText(n));
    }
    
    public final void p(final CharSequence charSequence) {
        this.a.o(charSequence);
    }
    
    public final void q(final CharSequence charSequence) {
        this.a.r(charSequence);
    }
    
    public final void r() {
        this.a.p(0);
    }
    
    public final boolean s() {
        return this.a.u();
    }
    
    public final boolean t() {
        if (this.a.t()) {
            this.a.d();
            return true;
        }
        return false;
    }
    
    public final boolean u() {
        ((px)this.a).a.removeCallbacks(this.h);
        ana.I((View)((px)this.a).a, this.h);
        return true;
    }
    
    public final boolean v(final int n, final KeyEvent keyEvent) {
        final Menu d = this.D();
        if (d != null) {
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
            d.setQwertyMode(qwertyMode);
            return d.performShortcut(n, keyEvent, 0);
        }
        return false;
    }
    
    public final boolean w(final KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            this.x();
        }
        return true;
    }
    
    public final boolean x() {
        return this.a.x();
    }
    
    public final void y() {
    }
    
    public final void z() {
        this.k(0, 8);
    }
}
