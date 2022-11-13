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
import android.os.Looper;
import java.util.concurrent.Executor;
import android.graphics.PathEffect;
import android.os.Handler;
import android.view.ViewStub;
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

public final class cdo
{
    static Integer d;
    public final Object a;
    public final Object b;
    public Object c;
    
    public cdo() {
        this.b = new aara((byte[])null, (byte[])null, (byte[])null);
        this.a = new aara((byte[])null, (byte[])null, (byte[])null);
        this.c = new acn[32];
    }
    
    public cdo(final ajb ajb, final byte[] array, final byte[] array2) {
        final Intent b = new Intent("android.intent.action.VIEW");
        this.b = b;
        this.a = new elx();
        final String packageName = ((ComponentName)ajb.b).getPackageName();
        final Intent intent = b;
        b.setPackage(packageName);
        this.J((IBinder)ajb.a);
    }
    
    private cdo(final Context b, final TypedArray a) {
        this.b = b;
        this.a = a;
    }
    
    public cdo(final View b) {
        this.a = new ArrayList();
        this.b = b;
    }
    
    public cdo(final ViewStub a, final Context b) {
        this.b = b;
        this.a = a;
    }
    
    public cdo(final aun aun) {
        this.a = new auo(aun);
        this.b = new Handler();
    }
    
    public cdo(final dsx dsx) {
        this.a = new PathEffect[2];
        this.c = dsx.j;
        this.b = new dsk();
    }
    
    public cdo(final dzu a, final eac b) {
        this.a = a;
        this.b = b;
    }
    
    public cdo(final eos a) {
        this.c = eph.a;
        this.b = epm.a.createBuilder();
        this.a = a;
    }
    
    public cdo(final eqy a, final esp b) {
        this.a = a;
        this.b = b;
    }
    
    public cdo(final eqy a, final esq b) {
        this.a = a;
        this.b = b;
    }
    
    public cdo(final Object a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public cdo(final Executor a, final tv b) {
        this.c = null;
        this.a = a;
        this.b = b;
    }
    
    public cdo(final vaf b) {
        this.b = b;
        this.a = new gdp(this, Looper.getMainLooper(), (byte[])null);
    }
    
    public cdo(final byte[] array) {
        this.b = new Intent("android.intent.action.VIEW");
        this.a = new elx();
    }
    
    public cdo(final byte[] array, final byte[] array2) {
        this.b = new arfe((char[])null, (byte[])null, (byte[])null);
        this.a = new arfe((char[])null, (byte[])null, (byte[])null);
        this.c = new ai[32];
    }
    
    public static final boolean H(final int n, final int n2) {
        return L(n) && L(n2);
    }
    
    private final void J(final IBinder binder) {
        final Bundle bundle = new Bundle();
        afb.b(bundle, "android.support.customtabs.extra.SESSION", binder);
        ((Intent)this.b).putExtras(bundle);
    }
    
    private final int K(int n, final int n2, final int n3) {
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
            if (cdo.d == null) {
                final WindowManager windowManager = (WindowManager)context.getSystemService("window");
                clm.h((Object)windowManager);
                final Display defaultDisplay = windowManager.getDefaultDisplay();
                final Point point = new Point();
                defaultDisplay.getSize(point);
                cdo.d = Math.max(point.x, point.y);
            }
            return cdo.d;
        }
        return 0;
    }
    
    private static final boolean L(final int n) {
        return n > 0 || n == Integer.MIN_VALUE;
    }
    
    public static cdo u(final Context context, final int n, final int[] array) {
        return new cdo(context, context.obtainStyledAttributes(n, array));
    }
    
    public static cdo v(final Context context, final AttributeSet set, final int[] array) {
        return new cdo(context, context.obtainStyledAttributes(set, array));
    }
    
    public static cdo w(final Context context, final AttributeSet set, final int[] array, final int n, final int n2) {
        return new cdo(context, context.obtainStyledAttributes(set, array, n, n2));
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
        ((dsk)this.b).a[n] = (float)e;
    }
    
    public final void D(final int n, final int n2) {
        this.B();
        dsk.c(((dsk)this.b).c, 9, n2);
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
        return this.K(((View)this.b).getHeight(), height, paddingTop + paddingBottom);
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
        return this.K(((View)this.b).getWidth(), width, paddingLeft + paddingRight);
    }
    
    public final void G() {
        final ViewTreeObserver viewTreeObserver = ((View)this.b).getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this.c);
        }
        this.c = null;
        ((List)this.a).clear();
    }
    
    public final cdo I(final eph c) {
        this.c = c;
        return this;
    }
    
    public final void a(final aug aug) {
        final Object c = this.c;
        if (c != null) {
            ((kml)c).run();
        }
        final kml c2 = new kml((auo)this.a, aug, 1);
        this.c = c2;
        ((Handler)this.b).postAtFrontOfQueue((Runnable)c2);
    }
    
    public final yq b(final yq c) {
        final Object c2 = this.c;
        this.c = c;
        return (yq)c2;
    }
    
    public final void c() {
        try {
            final Object a = this.a;
            final Object b = this.b;
            b.getClass();
            ((Executor)a).execute((Runnable)new uy((tv)b, 3));
        }
        catch (final RejectedExecutionException ex) {
            yi.b("CameraStateRegistry", "Unable to notify camera.", (Throwable)ex);
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
                final ColorStateList d = td.d((Context)this.b, resourceId);
                if (d != null) {
                    return d;
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
                return kf.d().g((Context)this.b, resourceId);
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
    
    public final kg t() {
        if (!((Intent)this.b).hasExtra("android.support.customtabs.extra.SESSION")) {
            this.J(null);
        }
        ((Intent)this.b).putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        final Object b = this.b;
        final Object a = ((elx)this.a).a;
        final Bundle bundle = new Bundle();
        if (a != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", (int)a);
        }
        ((Intent)b).putExtras(bundle);
        ((Intent)this.b).putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        final String a2 = th.a();
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
        return new kg((Intent)this.b, (Bundle)this.c);
    }
    
    public final void x() {
        ((Handler)this.a).removeMessages(153535);
    }
    
    public final void y(final eoq eoq) {
        ((eos)this.a).b(eoq);
    }
    
    public final kwf z() {
        arbu.y(this.c, (Class)Boolean.class);
        return (kwf)new eqa((eqy)this.a, (esp)this.b, (Boolean)this.c);
    }
}
