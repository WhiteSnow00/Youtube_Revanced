import android.util.Log;
import com.google.android.material.behavior.SwipeDismissBehavior;
import android.os.Build$VERSION;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.res.TypedArray;
import com.google.android.material.snackbar.SnackbarContentLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.os.Handler$Callback;
import android.os.Looper;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.util.List;
import android.content.Context;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.os.Handler;
import android.animation.TimeInterpolator;

// 
// Decompiled by Procyon v0.6.0
// 

public class adxd
{
    private static final TimeInterpolator a;
    static final Handler b;
    public static final String c;
    private static final TimeInterpolator w;
    private static final TimeInterpolator x;
    private static final int[] y;
    private final Runnable A;
    private final AccessibilityManager B;
    public final int d;
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public final TimeInterpolator h;
    public final ViewGroup i;
    public final Context j;
    public final adxc k;
    public final adxe l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public List t;
    public BaseTransientBottomBar$Behavior u;
    public final aepj v;
    private final TimeInterpolator z;
    
    static {
        a = adqd.b;
        w = adqd.a;
        x = adqd.d;
        y = new int[] { 2130970291 };
        c = "adxd";
        b = new Handler(Looper.getMainLooper(), (Handler$Callback)new adwz());
    }
    
    protected adxd(final Context j, final ViewGroup i, final View view, final adxe l) {
        this.A = (Runnable)new admc(this, 13);
        this.v = new aepj(this);
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (l != null) {
            this.i = i;
            this.l = l;
            aduf.b(this.j = j);
            final LayoutInflater from = LayoutInflater.from(j);
            final TypedArray obtainStyledAttributes = j.obtainStyledAttributes(adxd.y);
            final int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            int n;
            if (resourceId != -1) {
                n = 2131624871;
            }
            else {
                n = 2131624335;
            }
            final adxc k = (adxc)from.inflate(n, i, false);
            this.k = k;
            k.a = this;
            if (view instanceof SnackbarContentLayout) {
                final SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout)view;
                final float d = k.d;
                if (d != 1.0f) {
                    snackbarContentLayout.b.setTextColor(adwd.C(adwd.A((View)snackbarContentLayout, 2130969109), snackbarContentLayout.b.getCurrentTextColor(), d));
                }
                snackbarContentLayout.c = k.e;
            }
            k.addView(view);
            ana.aw((View)k);
            ana.X((View)k, 1);
            ana.V((View)k, true);
            ana.Z((View)k, (alv)new adua(this, 2));
            ana.N((View)k, (akv)new adxa(this));
            this.B = (AccessibilityManager)j.getSystemService("accessibility");
            this.f = adwd.j(j, 2130969940, 250);
            this.d = adwd.j(j, 2130969940, 150);
            this.e = adwd.j(j, 2130969943, 75);
            this.z = adwd.o(j, 2130969956, adxd.w);
            this.h = adwd.o(j, 2130969956, adxd.x);
            this.g = adwd.o(j, 2130969956, adxd.a);
            return;
        }
        throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
    }
    
    public int a() {
        return this.m;
    }
    
    public final int b() {
        final int height = this.k.getHeight();
        final ViewGroup$LayoutParams layoutParams = this.k.getLayoutParams();
        int n = height;
        if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
            n = height + ((ViewGroup$MarginLayoutParams)layoutParams).bottomMargin;
        }
        return n;
    }
    
    public final ValueAnimator c(final float... array) {
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(array);
        ofFloat.setInterpolator(this.z);
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new adrg(this, 2));
        return ofFloat;
    }
    
    public final void d() {
        this.e(3);
    }
    
    public final void e(final int n) {
        final adxj a = adxj.a();
        final aepj v = this.v;
        final Object a2 = a.a;
        monitorenter(a2);
        try {
            Label_0057: {
                adxi adxi;
                if (a.g(v)) {
                    adxi = a.c;
                }
                else {
                    if (!a.h(v)) {
                        break Label_0057;
                    }
                    adxi = a.d;
                }
                a.d(adxi, n);
            }
            monitorexit(a2);
        }
        finally {
            monitorexit(a2);
            while (true) {}
        }
    }
    
    public final void f(final int n) {
        final adxj a = adxj.a();
        final aepj v = this.v;
        Object o = a.a;
        monitorenter(o);
        try {
            if (a.g(v)) {
                a.c = null;
                if (a.d != null) {
                    a.c();
                }
            }
            monitorexit(o);
            o = this.t;
            if (o != null) {
                int size = ((List)o).size();
                while (--size >= 0) {
                    ((adwd)this.t.get(size)).a(this, n);
                }
            }
            o = this.k.getParent();
            if (o instanceof ViewGroup) {
                ((ViewGroup)o).removeView((View)this.k);
            }
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
    
    final void g() {
        final adxj a = adxj.a();
        final aepj v = this.v;
        Object o = a.a;
        monitorenter(o);
        try {
            if (a.g(v)) {
                a.b(a.c);
            }
            monitorexit(o);
            o = this.t;
            if (o != null) {
                int size = ((List)o).size();
                while (--size >= 0) {
                    ((adwd)this.t.get(size)).b(this);
                }
            }
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
    
    public final void h() {
        final adxj a = adxj.a();
        final int a2 = this.a();
        final aepj v = this.v;
        synchronized (a.a) {
            if (a.g(v)) {
                final adxi c = a.c;
                c.a = a2;
                a.b.removeCallbacksAndMessages((Object)c);
                a.b(a.c);
                return;
            }
            if (a.h(v)) {
                a.d.a = a2;
            }
            else {
                a.d = new adxi(a2, v, null, null);
            }
            final adxi c2 = a.c;
            if (c2 != null && a.d(c2, 4)) {
                return;
            }
            a.c = null;
            a.c();
        }
    }
    
    public final void i() {
        if (this.k()) {
            this.k.post((Runnable)new admc(this, 15));
            return;
        }
        if (this.k.getParent() != null) {
            this.k.setVisibility(0);
        }
        this.g();
    }
    
    public final void j() {
        final ViewGroup$LayoutParams layoutParams = this.k.getLayoutParams();
        if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
            final adxc k = this.k;
            if (k.f != null) {
                if (k.getParent() == null) {
                    return;
                }
                final int n = this.n;
                final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
                viewGroup$MarginLayoutParams.bottomMargin = this.k.f.bottom + n;
                viewGroup$MarginLayoutParams.leftMargin = this.k.f.left + this.o;
                viewGroup$MarginLayoutParams.rightMargin = this.k.f.right + this.p;
                viewGroup$MarginLayoutParams.topMargin = this.k.f.top;
                this.k.requestLayout();
                if (Build$VERSION.SDK_INT >= 29 && this.q > 0) {
                    final ViewGroup$LayoutParams layoutParams2 = this.k.getLayoutParams();
                    if (layoutParams2 instanceof aej && ((aej)layoutParams2).a instanceof SwipeDismissBehavior) {
                        this.k.removeCallbacks(this.A);
                        this.k.post(this.A);
                    }
                }
                return;
            }
        }
        Log.w(adxd.c, "Unable to update margins because layout params are not MarginLayoutParams");
    }
    
    final boolean k() {
        final AccessibilityManager b = this.B;
        if (b == null) {
            return true;
        }
        final List enabledAccessibilityServiceList = b.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }
    
    public final void l() {
        this.k.c = 1;
    }
}
