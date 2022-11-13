import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.paidcontentoverlay.remoteloaded.a;
import android.app.ActivityManager;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.RelativeLayout;
import android.widget.ImageButton;
import android.view.View;
import android.widget.FrameLayout;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arcx
{
    public final Context a;
    public final FrameLayout b;
    public View c;
    public ImageButton d;
    public View e;
    public ImageButton f;
    public RelativeLayout g;
    public arct h;
    public volatile boolean i;
    public volatile boolean j;
    public volatile Runnable k;
    public volatile Runnable l;
    public volatile Runnable m;
    public volatile Runnable n;
    public volatile String o;
    public int p;
    private RelativeLayout q;
    private volatile boolean r;
    private volatile boolean s;
    private volatile float t;
    
    public arcx(final Context a) {
        this.i = true;
        this.j = true;
        this.r = true;
        this.k = null;
        this.l = null;
        this.n = null;
        this.s = false;
        this.t = 1.0f;
        this.a = a;
        this.b = new arcw(this, a);
        this.c(2131625657);
    }
    
    public static int a(final boolean b) {
        if (b) {
            return 0;
        }
        return 8;
    }
    
    public final arct b() {
        if (this.h == null) {
            (this.h = new arct(this.a)).setLayoutParams((ViewGroup$LayoutParams)new RelativeLayout$LayoutParams(-1, -1));
            this.h.setVisibility(a(this.s));
            if (this.o != null) {
                this.h.c(this.o);
            }
            if (this.n != null) {
                this.h.c = this.n;
            }
            this.h.b(this.l);
            this.q.addView((View)this.h);
        }
        return this.h;
    }
    
    public final void c(final int p) {
        this.p = p;
        final arct h = this.h;
        final boolean b = h != null && h.getParent() != null;
        this.h = null;
        final RelativeLayout q = this.q;
        if (q != null) {
            this.b.removeView((View)q);
        }
        final RelativeLayout q2 = (RelativeLayout)LayoutInflater.from(this.a).inflate(p, (ViewGroup)null, false);
        this.q = q2;
        this.b.addView((View)q2);
        if (b) {
            this.e(this.s);
        }
        this.m = new arcu(this, 0);
        final View viewById = this.q.findViewById(2131432217);
        if ((this.c = viewById) != null) {
            viewById.setVisibility(a(this.j));
            this.c.setOnClickListener((View$OnClickListener)new acun(this, 20));
        }
        (this.d = (ImageButton)this.q.findViewById(2131432216)).setVisibility(a(this.j));
        this.d.setContentDescription((CharSequence)"Settings");
        this.d.setOnClickListener((View$OnClickListener)new arcv(this, 1));
        final View viewById2 = this.q.findViewById(2131432215);
        if ((this.e = viewById2) != null) {
            viewById2.setVisibility(a(this.f()));
            this.e.setOnClickListener((View$OnClickListener)new arcv(this, 0));
        }
        (this.f = (ImageButton)this.q.findViewById(2131432214)).setVisibility(a(this.f()));
        this.f.setOnClickListener((View$OnClickListener)new arcv(this, 2));
        if (ActivityManager.isRunningInTestHarness()) {
            final View c = this.c;
            if (c != null) {
                final ViewGroup$LayoutParams layoutParams = c.getLayoutParams();
                layoutParams.height = -2;
                layoutParams.width = -2;
                this.c.setLayoutParams(layoutParams);
            }
            final View e = this.e;
            if (e != null) {
                final ViewGroup$LayoutParams layoutParams2 = e.getLayoutParams();
                layoutParams2.height = -2;
                layoutParams2.width = -2;
                this.e.setLayoutParams(layoutParams2);
            }
        }
        (this.g = (RelativeLayout)this.q.findViewById(2131432213)).setVisibility(a(this.r));
        this.d(this.t);
    }
    
    public final void d(final float t) {
        if (this.t == t && t == 1.0f) {
            return;
        }
        this.t = t;
        arcq.a(new hrc(this, t, 10));
    }
    
    public final void e(final boolean s) {
        this.s = s;
        arcq.a(new a(this, s, 19));
    }
    
    public final boolean f() {
        return this.l != null;
    }
}
