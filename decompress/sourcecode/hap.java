import java.util.ArrayList;
import java.util.Iterator;
import android.graphics.Bitmap;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import java.io.File;
import java.util.concurrent.Callable;
import android.net.Uri;
import android.view.View$OnTouchListener;
import com.google.android.libraries.youtube.edit.camera.CameraFocusOverlay;
import android.media.CamcorderProfile;
import android.widget.LinearLayout;
import android.widget.HorizontalScrollView;
import android.view.View$OnClickListener;
import j$.util.Optional;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects.EffectsFeatureDescriptionView;
import com.google.android.libraries.youtube.edit.camera.CameraView;
import java.util.HashMap;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import java.util.List;
import com.google.apps.tiktok.account.AccountId;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects.GreenScreenMediaPickerView;
import android.content.Context;
import com.google.android.libraries.youtube.creation.common.ui.CreationButtonView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects.LocalMediaGreenScreenControllerViewModel;
import java.util.concurrent.Executor;
import android.graphics.drawable.Drawable;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hap implements gzy
{
    public static final afcr a;
    public static final afcr b;
    private final View A;
    private final View B;
    private final Drawable C;
    private final Drawable D;
    private final int E;
    private final int F;
    private final Executor G;
    private final Executor H;
    private final LocalMediaGreenScreenControllerViewModel I;
    private final uje J;
    private gwq K;
    private final View L;
    private final avt M;
    private final qpt N;
    public final View[] c;
    public final CreationButtonView d;
    public final Context e;
    public final usa f;
    final View g;
    final View h;
    public boolean i;
    final View j;
    final GreenScreenMediaPickerView k;
    public final haa l;
    public tzw m;
    public final AccountId n;
    public List o;
    public int p;
    public DeviceLocalFile q;
    public hbf r;
    public final HashMap s;
    public final hak t;
    final qpt u;
    public qpt v;
    private final View w;
    private final bu x;
    private final usa y;
    private final gzx z;
    
    static {
        a = afcr.r((Object)128644);
        b = afcr.t((Object)128645, (Object)127900, (Object)127081);
    }
    
    public hap(final Executor g, final Executor h, final AccountId n, final bu x, final uje j, final View[] c, final CreationButtonView d, final CameraView cameraView, final View l, final EffectsFeatureDescriptionView effectsFeatureDescriptionView, final Context e, final avt m, final gzx z, final byte[] array, final byte[] array2, final byte[] array3) {
        this.p = 1;
        this.s = new HashMap();
        this.c = c;
        this.d = d;
        this.M = m;
        this.e = e;
        this.x = x;
        this.n = n;
        final View inflate = LayoutInflater.from(e).inflate(2131624492, (ViewGroup)null);
        this.g = inflate;
        final View viewById = inflate.findViewById(2131429150);
        this.w = viewById;
        final View inflate2 = LayoutInflater.from(e).inflate(2131624495, (ViewGroup)null);
        this.h = inflate2;
        this.j = inflate2.findViewById(2131429157);
        this.A = inflate2.findViewById(2131429151);
        final GreenScreenMediaPickerView k = (GreenScreenMediaPickerView)inflate2.findViewById(2131429155);
        this.k = k;
        final View inflate3 = LayoutInflater.from(e).inflate(2131624494, (ViewGroup)null);
        this.B = inflate3;
        final HorizontalScrollView a = k.a;
        final LinearLayout b = k.b;
        final qpt n2 = new qpt(this);
        this.N = n2;
        this.l = new haa(e, a, (ViewGroup)b, g, h, m, n2, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        final Drawable b2 = fc.b(e, 2131231956);
        b2.getClass();
        this.C = b2;
        final Drawable b3 = fc.b(e, 2131231955);
        b3.getClass();
        this.D = b3;
        this.z = z;
        this.G = g;
        this.H = h;
        this.J = j;
        this.t = new hak(e, z, effectsFeatureDescriptionView, m, (byte[])null, (byte[])null, (byte[])null);
        final CamcorderProfile f = cameraView.f(true);
        int min;
        int max;
        if (f != null) {
            min = Math.min(f.videoFrameWidth, f.videoFrameHeight);
            max = Math.max(f.videoFrameWidth, f.videoFrameHeight);
        }
        else {
            max = 1;
            min = 1;
        }
        this.E = min;
        this.F = max;
        final han y = new han(this, e, x.getSupportFragmentManager(), (wwv)m.a, m, (byte[])null, (byte[])null, (byte[])null);
        ((usa)y).J(e.getString(2132017586));
        this.y = (usa)y;
        this.f = (usa)new ham(e, x.getSupportFragmentManager(), (wwv)m.a, Optional.empty(), inflate3, m, (byte[])null, (byte[])null, (byte[])null);
        d.setOnClickListener((View$OnClickListener)new gbw(m, (usa)y, 12, null, null, null));
        viewById.setOnClickListener((View$OnClickListener)new gbp(this, (usa)y, m, 5, null, null, null));
        final qpt qpt = new qpt(this);
        this.u = qpt;
        szc.f();
        z.n = qpt;
        z.n();
        final LocalMediaGreenScreenControllerViewModel i = (LocalMediaGreenScreenControllerViewModel)new alm((avu)x).h((Class)LocalMediaGreenScreenControllerViewModel.class);
        this.I = i;
        if (i.a) {
            if (!((usa)y).M()) {
                ((usa)y).K();
            }
            i.a = false;
        }
        this.L = l;
    }
    
    public final void b(final boolean b) {
        this.z.a(b);
        final CreationButtonView d = this.d;
        Drawable drawable;
        if (b) {
            drawable = this.C;
        }
        else {
            drawable = this.D;
        }
        d.d(drawable);
        final qpt v = this.v;
        if (v != null) {
            v.I(b);
        }
        final tuw s = this.M.S(wya.c(132383));
        s.k(b);
        s.c();
    }
    
    public final void c(final int n, final int n2, final boolean b) {
        this.t.b(n, n2);
        final tzw m = this.m;
        final boolean b2 = m != null && m.i;
        String l = null;
        Uri k;
        if (m == null) {
            k = null;
        }
        else {
            k = m.k;
        }
        if (m != null) {
            l = m.l;
        }
        this.q(b2, false, k, l);
    }
    
    public final void d() {
        this.t.c();
    }
    
    public final void e(final int n, final aqyw aqyw) {
    }
    
    public final void f(final tzw tzw) {
        final gvu gvu = new gvu(this, tzw, 9);
        if (szc.h()) {
            ((Runnable)gvu).run();
            return;
        }
        this.H.execute((Runnable)gvu);
    }
    
    public final void g() {
        this.L.setVisibility(8);
    }
    
    public final boolean h() {
        return false;
    }
    
    public final boolean i() {
        if (this.z.a) {
            final DeviceLocalFile q = this.q;
            if (q != null && q.a() == 0) {
                return true;
            }
        }
        return false;
    }
    
    public final void j(final float n) {
        this.t.e(n);
    }
    
    public final void k(final float n) {
        this.t.f(n);
    }
    
    public final void l(final qpt qpt) {
        this.v = qpt;
        this.t.i = qpt;
    }
    
    public final void m(final List o) {
        final afif d = ((afcr)o).D();
        while (((Iterator)d).hasNext()) {
            this.M.S(wya.c((int)((Iterator)d).next())).c();
        }
        this.o = o;
    }
    
    public final void n(final boolean b) {
        final List o = this.o;
        if (o == null) {
            return;
        }
        final afif d = ((afcr)o).D();
        while (((Iterator)d).hasNext()) {
            final tuw s = this.M.S(wya.c((int)((Iterator)d).next()));
            s.k(b);
            s.j();
        }
    }
    
    public final void o(final Throwable t) {
        this.r(null, false);
        tmy.bS(this.e, 2132019729);
        zjp.c(zjo.a, zjn.f, "[ShortsCreation][Android][Camera]Failed to save green screen media", t);
    }
    
    public final void p(final DeviceLocalFile deviceLocalFile) {
        this.y.E();
        final qpt v = this.v;
        if (v != null) {
            final gwd g = ((gwg)v.a).g;
            if (g != null && ((hbl)g).bb(deviceLocalFile, 7)) {
                this.I.a = true;
            }
        }
    }
    
    public final void q(final boolean b, final boolean b2, final Uri uri, final String s) {
        if (!this.t()) {
            return;
        }
        this.A.setVisibility(0);
        tcp.k(afva.q((Callable)new haf(this.J, this.p), this.G), this.H, (tcn)new fcb(this, 16), (tco)new hal(this, b, b2, uri, s));
    }
    
    public final void r(final DeviceLocalFile q, final boolean b) {
        szc.f();
        if (this.m == null) {
            return;
        }
        if (q == null) {
            this.q = null;
            this.b(false);
            this.l.e((DeviceLocalFile)null);
            this.m.D();
            return;
        }
        this.q = q;
        final File file = this.s.get(q.f());
        if (file != null && file.exists()) {
            this.l.e(q);
            if (q.a() == 0) {
                this.z.g(Uri.parse(file.getPath()), false, false);
            }
            else if (q.a() == 1 || q.a() == 2) {
                final gzx z = this.z;
                String path;
                if (file.exists()) {
                    path = file.getPath();
                }
                else {
                    path = null;
                }
                szc.f();
                z.k = 2;
                if (path == null) {
                    z.d = "";
                }
                else {
                    z.d = path;
                    z.i();
                }
                final had i = z.i;
                if (i != null) {
                    i.n((Uri)null, false);
                }
                z.o();
            }
            this.b(file.exists());
            if (file.exists()) {
                this.m.E(q.f(), file.getPath());
                return;
            }
            this.m.D();
        }
        else {
            if (b && (q.a() == 1 || q.a() == 2)) {
                final hdv hdv = this.l.e.get(q);
                if (hdv != null) {
                    final Object c = hdv.c;
                    if (c != null) {
                        ((gxm)c).b();
                    }
                }
                tcp.k(afva.q((Callable)new hag(this.m, q, this.e.getContentResolver(), this.F, this.E), this.G), this.H, (tcn)new fcb(this, 15), (tco)new exa(this, q, 15));
                return;
            }
            this.r(null, false);
        }
    }
    
    public final void s(List g, final boolean b, final boolean b2) {
        this.A.setVisibility(8);
        if (g != null && !g.isEmpty()) {
            this.j.setVisibility(4);
            this.k.setVisibility(0);
            this.b(b);
            final haa l = this.l;
            for (int i = 0; i < l.c.getChildCount(); ++i) {
                final ImageView imageView = (ImageView)l.c.getChildAt(i).findViewById(2131429152);
                if (imageView != null) {
                    final BitmapDrawable bitmapDrawable = (BitmapDrawable)imageView.getDrawable();
                    if (bitmapDrawable != null) {
                        final Bitmap bitmap = bitmapDrawable.getBitmap();
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                    }
                }
            }
            l.c.removeAllViews();
            l.e.clear();
            l.i.clear();
            l.f.clear();
            l.g = g;
            if (l.j == null) {
                final View b3 = l.b(2131624493);
                if (b3 != null) {
                    b3.setOnClickListener((View$OnClickListener)new gxu(l, 6));
                }
                if (b3 != null) {
                    l.j = haa.h(b3);
                }
            }
            final hdv j = l.j;
            if (j != null) {
                l.c.addView((View)j.a);
            }
            g = l.g;
            if (g != null) {
                final Iterator iterator = g.iterator();
                int n = 0;
                while (iterator.hasNext()) {
                    final DeviceLocalFile deviceLocalFile = (DeviceLocalFile)iterator.next();
                    l.f.put(deviceLocalFile.f(), deviceLocalFile);
                    if (n < 30) {
                        final View a = l.a(deviceLocalFile);
                        if (a == null) {
                            continue;
                        }
                        l.c.addView(a);
                        ++n;
                    }
                }
            }
            g = l.g;
            if (g != null && g.size() > 30) {
                if (l.h == null) {
                    final View b4 = l.b(2131624497);
                    if (b4 != null) {
                        b4.setOnClickListener((View$OnClickListener)new gxu(l, 5));
                    }
                    l.h = b4;
                }
                final View h = l.h;
                if (h != null) {
                    l.i.add(h);
                }
            }
            final ArrayList k = l.i;
            for (int size = k.size(), n2 = 0; n2 < size; ++n2) {
                l.c.addView((View)k.get(n2));
            }
            if (l.c.getChildCount() > 0) {
                final int dimensionPixelSize = l.a.getResources().getDimensionPixelSize(2131166814);
                final View child = l.c.getChildAt(0);
                final ViewGroup$LayoutParams layoutParams = child.getLayoutParams();
                layoutParams.getClass();
                final LinearLayout$LayoutParams layoutParams2 = (LinearLayout$LayoutParams)layoutParams;
                layoutParams2.setMarginStart(dimensionPixelSize);
                child.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
                final ViewGroup c = l.c;
                final View child2 = c.getChildAt(c.getChildCount() - 1);
                final ViewGroup$LayoutParams layoutParams3 = child2.getLayoutParams();
                layoutParams3.getClass();
                final LinearLayout$LayoutParams layoutParams4 = (LinearLayout$LayoutParams)layoutParams3;
                layoutParams4.setMarginEnd(dimensionPixelSize);
                child2.setLayoutParams((ViewGroup$LayoutParams)layoutParams4);
            }
            if (b) {
                final DeviceLocalFile q = this.q;
                if (q == null) {
                    this.l.d();
                    this.l.c();
                }
                else {
                    this.l.e(q);
                }
            }
            if (b2) {
                this.M.P(wya.b(127083)).b();
                this.m((List)hap.b);
                this.n(true);
            }
            return;
        }
        this.j.setVisibility(0);
        this.k.setVisibility(4);
        this.b(false);
    }
    
    public final boolean t() {
        return uqs.e((Context)this.x, 0);
    }
}
