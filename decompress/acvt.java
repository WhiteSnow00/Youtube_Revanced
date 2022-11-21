import android.view.View;
import android.os.Parcelable;
import android.view.View$OnAttachStateChangeListener;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import com.google.android.libraries.youtube.rendering.ui.litho.LithoRecyclerViewSectionListControllerBinder$5;
import android.app.Activity;
import android.content.ContextWrapper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewTreeObserver$OnDrawListener;
import android.view.View$OnLayoutChangeListener;
import android.view.ViewTreeObserver$OnPreDrawListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acvt implements acsc
{
    public final acmm a;
    public int b;
    public boolean c;
    private final acvn d;
    private final eee e;
    private final acvq f;
    private final ViewTreeObserver$OnPreDrawListener g;
    private final View$OnLayoutChangeListener h;
    private int i;
    private int j;
    private boolean k;
    private ViewTreeObserver$OnDrawListener l;
    
    public acvt(final acvn d, final RecyclerView recyclerView, final acmm a, final onm onm, final xab xab, final ovc ovc, final ouy ouy, final atnb atnb, final Object o, final hzf hzf, final byte[] array, final byte[] array2, final byte[] array3) {
        this.i = 0;
        this.j = 0;
        recyclerView.getContext();
        ouy.d();
        this.d = d;
        this.a = a;
        final ViewGroup$LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams != null && layoutParams.height != -2 && layoutParams.width != -2) {
            recyclerView.s = true;
        }
        recyclerView.az();
        final dta dta = new dta(recyclerView.getContext(), "LithoRVSLCBinder", new med(ouy.b()), (cyd)null, (byte[])null, (byte[])null, (byte[])null);
        final dzx dzx = new dzx(dta);
        final eea eea = new eea();
        eea.h = d.a;
        eea.i = d.g;
        final LinearLayoutManager linearLayoutManager = (LinearLayoutManager)recyclerView.n;
        if (linearLayoutManager != null) {
            eea.b = (ecv)new acvg(linearLayoutManager, recyclerView.getLayoutParams());
        }
        eea.p = (eds)new acvs(a);
        eea.e = true;
        eea.f = 200000;
        eea.o = true;
        eea.a = d.c;
        eea.g = afgh.r(new afcb());
        final int b = d.b;
        if (b > 0) {
            eea.k = b;
        }
        eea.s = new acyy(this, hzf, null, null, null);
        this.e = eea.a(dta);
        final boolean i = d.i;
        final aup aup = null;
        Object o2;
        ema ema;
        if (i) {
            o2 = new oka(recyclerView);
            ema = null;
        }
        else if (d.j) {
            ema = new ema((byte[])null, (byte[])null, (char[])null);
            o2 = null;
        }
        else {
            ema = null;
            o2 = null;
        }
        final ovv ovv = (ovv)atnb.a();
        recyclerView.aE((hz)new acvk(ovv));
        this.l = (ViewTreeObserver$OnDrawListener)new acvl(ovv, recyclerView);
        if (!d.m) {
            recyclerView.getViewTreeObserver().addOnDrawListener(this.l);
        }
        Context context = ((View)recyclerView).getContext();
        Object o3;
        while (true) {
            o3 = aup;
            if (!(context instanceof ContextWrapper)) {
                break;
            }
            if (context instanceof Activity) {
                o3 = context;
                break;
            }
            context = ((ContextWrapper)context).getBaseContext();
        }
        if (o3 != null) {
            if (o3 instanceof bu) {
                final cl supportFragmentManager = ((bu)o3).getSupportFragmentManager();
                supportFragmentManager.am((di)new acvm(ovv, recyclerView, supportFragmentManager), false);
            }
            else if (o3 instanceof aup) {
                final auk lifecycle = ((aup)o3).getLifecycle();
                lifecycle.b((auo)new LithoRecyclerViewSectionListControllerBinder$5(ovv, recyclerView, lifecycle));
            }
        }
        this.f = new acvq(dzx, this.e, a, onm, xab, d.a, d.k, ovc, d.f, ouy, d.d, d.e, ema, (ob)o2, ovv, o, d.l, d.n, d.o, (byte[])null, (byte[])null, (byte[])null);
        this.g = (ViewTreeObserver$OnPreDrawListener)new acvr(this, recyclerView, 0);
        this.h = (View$OnLayoutChangeListener)new zgy(this, 5);
        if (d.h) {
            this.b = recyclerView.getResources().getConfiguration().orientation;
        }
    }
    
    public final void a(final RecyclerView recyclerView) {
        recyclerView.getContext();
        final acvq f = this.f;
        final aslm h = f.h;
        if (h != null) {
            h.dispose();
        }
        f.h = new aslm();
        ((nr)this.a).v((fo)this.f);
        ((fo)this.f).d();
        this.d(recyclerView);
        if (this.d.m) {
            this.c(recyclerView);
        }
        else {
            recyclerView.getViewTreeObserver().addOnPreDrawListener(this.g);
        }
        recyclerView.addOnLayoutChangeListener(this.h);
        if (this.d.m) {
            recyclerView.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new if(this, 13));
        }
    }
    
    public final void b(final RecyclerView recyclerView) {
        this.e(recyclerView);
        if (!this.d.m) {
            this.l = null;
        }
        recyclerView.removeOnLayoutChangeListener(this.h);
        ((nr)this.a).w((fo)this.f);
        this.f(recyclerView);
        final aslm h = this.f.h;
        if (h != null) {
            h.dispose();
        }
        this.j = 0;
        this.i = 0;
    }
    
    public final void c(final RecyclerView recyclerView) {
        if (this.k) {
            return;
        }
        recyclerView.getViewTreeObserver().addOnPreDrawListener(this.g);
        if (this.l != null) {
            recyclerView.getViewTreeObserver().addOnDrawListener(this.l);
        }
        this.k = true;
    }
    
    public final void d(final RecyclerView recyclerView) {
        final int width = recyclerView.getWidth();
        final int height = recyclerView.getHeight();
        if (this.i == width && this.j == height) {
            this.e.F(recyclerView);
            return;
        }
        this.i = width;
        this.j = height;
        if (this.c) {
            this.e.N(recyclerView);
        }
        this.e.g(width, height);
        this.e.F(recyclerView);
        if (this.c) {
            recyclerView.getClass();
            recyclerView.post((Runnable)new acan(recyclerView, 12));
        }
        this.c = false;
    }
    
    public final void e(final RecyclerView recyclerView) {
        if (this.l != null) {
            recyclerView.getViewTreeObserver().removeOnDrawListener(this.l);
        }
        recyclerView.getViewTreeObserver().removeOnPreDrawListener(this.g);
        this.k = false;
    }
    
    public final void f(final RecyclerView recyclerView) {
        final nx n = recyclerView.n;
        Parcelable q;
        final Parcelable parcelable = q = null;
        if (n != null) {
            q = parcelable;
            if (this.d.m) {
                q = n.Q();
            }
        }
        this.e.N(recyclerView);
        recyclerView.af(n);
        if (n != null && q != null) {
            n.Z(q);
        }
    }
}
