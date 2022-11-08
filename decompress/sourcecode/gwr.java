import android.view.ViewGroup$MarginLayoutParams;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera.ShortsZoomSlider;
import com.google.android.libraries.youtube.edit.camera.CameraView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects.EffectsFeatureDescriptionView;
import android.view.ViewConfiguration;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ShortsRecordButtonView;
import android.os.Handler;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gwr implements hit
{
    public final hiu a;
    public boolean b;
    public boolean c;
    public boolean d;
    private final View e;
    private final boolean f;
    private final int g;
    private final int h;
    private final Runnable i;
    private final Handler j;
    private boolean k;
    private float l;
    private final avt m;
    private final qpt n;
    
    public gwr(final qpt n, final avt m, final View e, final boolean f, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.j = new Handler();
        this.n = n;
        this.m = m;
        this.a = new hiu((hit)this, e, true, true);
        this.e = e;
        this.f = f;
        this.g = e.getResources().getDimensionPixelSize(2131169706);
        this.h = e.getResources().getDimensionPixelSize(2131169707);
        this.i = (Runnable)new gox(this, m, n, 3, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
    }
    
    private final void f() {
        this.j.removeCallbacks(this.i);
        this.b = false;
    }
    
    private final void g() {
        final gwg gwg = (gwg)this.n.a;
        if (gwg.bM == 1) {
            if (gwg.I != null) {
                final ShortsRecordButtonView o = gwg.O;
                if (o != null) {
                    o.h();
                }
                gwg.bM = 2;
                gwg.F(0);
                gwg.h();
            }
        }
        this.c = false;
    }
    
    public final void nD() {
        this.f();
        if (this.c) {
            this.g();
            return;
        }
        this.k = false;
        final qpt n = this.n;
        final gwg gwg = (gwg)n.a;
        if (gwg.bM == 0) {
            final EffectsFeatureDescriptionView ao = gwg.ao;
            if (ao != null) {
                ao.d();
            }
            final CameraView l = ((gwg)n.a).L;
            l.getClass();
            l.m();
            final gwg gwg2 = (gwg)n.a;
            gwg2.D(gwg2.t.a(), false);
        }
        this.c = true;
        this.j.postDelayed(this.i, (long)ViewConfiguration.getLongPressTimeout());
    }
    
    public final void nE() {
        this.f();
        if (this.c) {
            this.m.S(wya.c(96643)).i();
            this.g();
        }
    }
    
    public final void nF() {
        if (this.b) {
            this.g();
        }
        else {
            if (this.c) {
                final qpt n = this.n;
                final ShortsRecordButtonView o = ((gwg)n.a).O;
                if (o != null) {
                    o.f();
                }
                final ShortsZoomSlider ap = ((gwg)n.a).ap;
                if (ap != null) {
                    ap.h(false, 0);
                }
            }
            this.m.S(wya.c(96643)).d();
        }
        this.f();
    }
    
    public final void nJ(float l, final float i) {
        if (this.c) {
            final ShortsRecordButtonView o = ((gwg)this.n.a).O;
            if (o != null) {
                o.g.setTranslationX(l);
                o.g.setTranslationY(i);
                final float n = (float)Math.hypot(l, i);
                final float n2 = (float)o.e;
                if (n >= n2 && !o.m) {
                    ShortsRecordButtonView.a((View)o.f, 0.0f, 0.0f);
                    o.m = true;
                }
                else if (n < n2) {
                    if (o.m) {
                        ShortsRecordButtonView.a((View)o.f, l, i);
                        o.m = false;
                    }
                    else {
                        o.f.setTranslationX(l);
                        o.f.setTranslationY(i);
                    }
                }
            }
            if (this.f) {
                if (!this.k) {
                    l = (float)(-this.g);
                    if (i <= l) {
                        this.k = true;
                        this.l = l;
                    }
                    else {
                        if (i < this.h || !this.b) {
                            return;
                        }
                        this.k = true;
                        this.l = i;
                    }
                }
                l = this.l;
                if (i <= l) {
                    l = Math.min(1.0f, Math.max(0.0f, -(i - l) / (this.e.getTop() - this.e.getHeight())));
                }
                else {
                    final float n3 = (float)((ViewGroup$MarginLayoutParams)this.e.getLayoutParams()).bottomMargin;
                    l = Math.max(-1.0f, Math.min(0.0f, -(i - l) / Math.max(n3, this.e.getHeight() / 2.0f + n3 - this.l)));
                }
                this.m.S(wya.c(96640)).i();
                final gwe bj = ((gwg)this.n.a).bJ;
                if (bj != null) {
                    bj.a(l);
                }
            }
        }
    }
    
    public final void nK(final float n) {
        if (!this.f) {
            this.m.S(wya.c(96640)).i();
            final CameraView l = ((gwg)this.n.a).L;
            l.getClass();
            l.q(n);
        }
    }
}
