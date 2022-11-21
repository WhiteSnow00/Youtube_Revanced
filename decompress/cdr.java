import java.util.List;
import android.text.TextUtils;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import java.util.concurrent.RejectedExecutionException;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.ViewGroup$LayoutParams;
import android.util.AttributeSet;
import android.view.Display;
import android.graphics.Point;
import android.view.WindowManager;
import android.os.Bundle;
import java.util.concurrent.Callable;
import java.util.function.Function;
import j$.util.Optional;
import java.util.concurrent.Executor;
import android.graphics.PathEffect;
import android.os.Handler;
import java.util.ArrayList;
import android.view.View;
import android.content.res.TypedArray;
import android.content.Context;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cdr
{
    static Integer d;
    public final Object a;
    public final Object b;
    public Object c;
    
    public cdr() {
        this.b = new aasq(null, null, null);
        this.a = new aasq(null, null, null);
        this.c = new aco[32];
    }
    
    public cdr(final ajc ajc, final byte[] array, final byte[] array2) {
        final Intent b = new Intent("android.intent.action.VIEW");
        this.b = b;
        this.a = new ema();
        final String packageName = ((ComponentName)ajc.b).getPackageName();
        final Intent intent = b;
        b.setPackage(packageName);
        this.I((IBinder)ajc.a);
    }
    
    private cdr(final Context b, final TypedArray a) {
        this.b = b;
        this.a = a;
    }
    
    public cdr(final View b) {
        this.a = new ArrayList();
        this.b = b;
    }
    
    public cdr(final aup aup) {
        this.a = new auq(aup);
        this.b = new Handler();
    }
    
    public cdr(final dta dta) {
        this.a = new PathEffect[2];
        this.c = dta.j;
        this.b = new dsn();
    }
    
    public cdr(final dzx a, final eaf b) {
        this.a = a;
        this.b = b;
    }
    
    public cdr(final era b, final esr a) {
        this.b = b;
        this.a = a;
    }
    
    public cdr(final era a, final esr b, final byte[] array) {
        this.a = a;
        this.b = b;
    }
    
    public cdr(final era a, final ess b) {
        this.a = a;
        this.b = b;
    }
    
    public cdr(final Object a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public cdr(final Executor a, final tw b) {
        this.c = null;
        this.a = a;
        this.b = b;
    }
    
    public cdr(final mtf mtf, final arna arna, final arna arna2, Optional map, final byte[] array, final byte[] array2, final byte[] array3) {
        final aslm a = new aslm();
        this.a = a;
        map = map.map((Function)fau.h);
        final Boolean value = false;
        final asma ay = ((askp)map.orElse((Object)askp.X(value))).ao(value).Z((asmn)new fdr(arna2, arna, 10)).i(asjx.e).V().ay();
        final aslm aslm = a;
        this.b = ay.c(0, (asmi)new fmq(a, 6));
        mtf.w((Callable)new csl(this, 12, (byte[])null));
        this.c = arna.a();
        mtf.w((Callable)new csl(this, 13, (byte[])null));
    }
    
    public cdr(final byte[] array) {
        this.b = new Intent("android.intent.action.VIEW");
        this.a = new ema();
    }
    
    public cdr(final byte[] array, final byte[] array2) {
        this.b = new arhz((char[])null, null, null);
        this.a = new arhz((char[])null, null, null);
        this.c = new ai[32];
    }
    
    public static final boolean H(final int n, final int n2) {
        return K(n) && K(n2);
    }
    
    private final void I(final IBinder binder) {
        final Bundle bundle = new Bundle();
        afc.b(bundle, "android.support.customtabs.extra.SESSION", binder);
        ((Intent)this.b).putExtras(bundle);
    }
    
    private final int J(int n, final int n2, final int n3) {
        final int n4 = n2 - n3;
        if (n4 > 0) {
            return n4;
        }
        n -= n3;
        if (n > 0) {
            return n;
        }
        if (!((View)this.b).isLayoutRequested() && n2 == -2) {
            final Context context = ((View)this.b).getContext();
            if (cdr.d == null) {
                final WindowManager windowManager = (WindowManager)context.getSystemService("window");
                coh.o(windowManager);
                final Display defaultDisplay = windowManager.getDefaultDisplay();
                final Point point = new Point();
                defaultDisplay.getSize(point);
                cdr.d = Math.max(point.x, point.y);
            }
            return cdr.d;
        }
        return 0;
    }
    
    private static final boolean K(final int n) {
        return n > 0 || n == Integer.MIN_VALUE;
    }
    
    public static cdr u(final Context context, final int n, final int[] array) {
        return new cdr(context, context.obtainStyledAttributes(n, array));
    }
    
    public static cdr v(final Context context, final AttributeSet set, final int[] array) {
        return new cdr(context, context.obtainStyledAttributes(set, array));
    }
    
    public static cdr w(final Context context, final AttributeSet set, final int[] array, final int n, final int n2) {
        return new cdr(context, context.obtainStyledAttributes(set, array, n, n2));
    }
    
    public final void A(final boolean b) {
        this.c = b;
    }
    
    public final void B() {
        if (this.c != null) {
            return;
        }
        throw new IllegalStateException("This builder has already been disposed / built!");
    }
    
    public final void C(final int n, final float n2) {
        this.B();
        final int e = ((eg)this.c).E(n2);
        this.B();
        ((dsn)this.b).a[n] = (float)e;
    }
    
    public final void D(final int n, final int n2) {
        this.B();
        dsn.c(((dsn)this.b).c, 9, n2);
    }
    
    public final int E() {
        final int paddingTop = ((View)this.b).getPaddingTop();
        final int paddingBottom = ((View)this.b).getPaddingBottom();
        final ViewGroup$LayoutParams layoutParams = ((View)this.b).getLayoutParams();
        int height;
        if (layoutParams != null) {
            height = layoutParams.height;
        }
        else {
            height = 0;
        }
        return this.J(((View)this.b).getHeight(), height, paddingTop + paddingBottom);
    }
    
    public final int F() {
        final int paddingLeft = ((View)this.b).getPaddingLeft();
        final int paddingRight = ((View)this.b).getPaddingRight();
        final ViewGroup$LayoutParams layoutParams = ((View)this.b).getLayoutParams();
        int width;
        if (layoutParams != null) {
            width = layoutParams.width;
        }
        else {
            width = 0;
        }
        return this.J(((View)this.b).getWidth(), width, paddingLeft + paddingRight);
    }
    
    public final void G() {
        final ViewTreeObserver viewTreeObserver = ((View)this.b).getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this.c);
        }
        this.c = null;
        ((List)this.a).clear();
    }
    
    public final void a(final aui aui) {
        final Object c = this.c;
        if (c != null) {
            ((kmv)c).run();
        }
        final kmv c2 = new kmv((auq)this.a, aui, 1);
        this.c = c2;
        ((Handler)this.b).postAtFrontOfQueue((Runnable)c2);
    }
    
    public final yr b(final yr c) {
        final Object c2 = this.c;
        this.c = c;
        return (yr)c2;
    }
    
    public final void c() {
        try {
            final Object a = this.a;
            final Object b = this.b;
            b.getClass();
            ((Executor)a).execute((Runnable)new uw((tw)b, 4));
        }
        catch (final RejectedExecutionException ex) {
            yj.b("CameraStateRegistry", "Unable to notify camera.", (Throwable)ex);
        }
    }
    
    public final int d(final int n, final int n2) {
        return ((TypedArray)this.a).getDimensionPixelOffset(n, n2);
    }
    
    public final int e(final int n, final int n2) {
        return ((TypedArray)this.a).getDimensionPixelSize(n, n2);
    }
    
    public final int f(final int n, final int n2) {
        return ((TypedArray)this.a).getInt(n, n2);
    }
    
    public final int g(final int n, final int n2) {
        return ((TypedArray)this.a).getInteger(n, n2);
    }
    
    public final int h(final int n, final int n2) {
        return ((TypedArray)this.a).getLayoutDimension(n, n2);
    }
    
    public final int i(final int n, final int n2) {
        return ((TypedArray)this.a).getResourceId(n, n2);
    }
    
    public final ColorStateList j(final int n) {
        if (((TypedArray)this.a).hasValue(n)) {
            final int resourceId = ((TypedArray)this.a).getResourceId(n, 0);
            if (resourceId != 0) {
                final ColorStateList c = tc.c((Context)this.b, resourceId);
                if (c != null) {
                    return c;
                }
            }
        }
        return ((TypedArray)this.a).getColorStateList(n);
    }
    
    public final Drawable k(final int n) {
        if (((TypedArray)this.a).hasValue(n)) {
            final int resourceId = ((TypedArray)this.a).getResourceId(n, 0);
            if (resourceId != 0) {
                return fc.b((Context)this.b, resourceId);
            }
        }
        return ((TypedArray)this.a).getDrawable(n);
    }
    
    public final Drawable l(int resourceId) {
        if (((TypedArray)this.a).hasValue(resourceId)) {
            resourceId = ((TypedArray)this.a).getResourceId(resourceId, 0);
            if (resourceId != 0) {
                return kg.d().g((Context)this.b, resourceId);
            }
        }
        return null;
    }
    
    public final CharSequence m(final int n) {
        return ((TypedArray)this.a).getText(n);
    }
    
    public final String n(final int n) {
        return ((TypedArray)this.a).getString(n);
    }
    
    public final void o() {
        ((TypedArray)this.a).recycle();
    }
    
    public final boolean p(final int n, final boolean b) {
        return ((TypedArray)this.a).getBoolean(n, b);
    }
    
    public final boolean q(final int n) {
        return ((TypedArray)this.a).hasValue(n);
    }
    
    public final float r(final int n) {
        return ((TypedArray)this.a).getDimension(n, -1.0f);
    }
    
    public final int s(final int n) {
        return ((TypedArray)this.a).getColor(n, 0);
    }
    
    public final kh t() {
        if (!((Intent)this.b).hasExtra("android.support.customtabs.extra.SESSION")) {
            this.I(null);
        }
        ((Intent)this.b).putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        final Object b = this.b;
        final Object a = ((ema)this.a).a;
        final Bundle bundle = new Bundle();
        if (a != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", (int)a);
        }
        ((Intent)b).putExtras(bundle);
        ((Intent)this.b).putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        final String a2 = ti.a();
        if (!TextUtils.isEmpty((CharSequence)a2)) {
            Bundle bundleExtra;
            if (((Intent)this.b).hasExtra("com.android.browser.headers")) {
                bundleExtra = ((Intent)this.b).getBundleExtra("com.android.browser.headers");
            }
            else {
                bundleExtra = new Bundle();
            }
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", a2);
                ((Intent)this.b).putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        return new kh((Intent)this.b, (Bundle)this.c);
    }
    
    public final abqv x() {
        return ((abqz)this.c).n();
    }
    
    public final etc y() {
        arxu.o(this.c, View.class);
        return new etc((era)this.b, (esr)this.a);
    }
    
    public final kwo z() {
        arxu.o(this.c, Boolean.class);
        return (kwo)new eqc((era)this.a, (esr)this.b, (Boolean)this.c);
    }
}
