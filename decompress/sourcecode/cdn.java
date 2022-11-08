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
import java.util.concurrent.Executor;
import android.graphics.PathEffect;
import android.view.ViewStub;
import java.util.ArrayList;
import android.os.Handler;
import android.view.View;
import android.view.View$OnClickListener;
import android.view.View$OnFocusChangeListener;
import android.text.TextWatcher;
import android.widget.TextView$OnEditorActionListener;
import android.widget.EditText;
import android.view.ViewGroup;
import android.content.res.TypedArray;
import android.content.Context;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cdn
{
    static Integer d;
    public final Object a = a;
    public final Object b = b;
    public Object c;
    
    public cdn() {
        this.b = new aapg((byte[])null, (byte[])null, (byte[])null);
        this.a = new aapg((byte[])null, (byte[])null, (byte[])null);
        this.c = new acm[32];
    }
    
    public cdn(final aja aja, final byte[] array, final byte[] array2) {
        final Intent b = new Intent("android.intent.action.VIEW");
        this.b = b;
        this.a = new elw();
        final String packageName = ((ComponentName)aja.b).getPackageName();
        final Intent intent = b;
        b.setPackage(packageName);
        this.J((IBinder)aja.a);
    }
    
    private cdn(final Context b, final TypedArray a) {
        this.b = b;
        this.a = a;
    }
    
    public cdn(final Context b, final ViewGroup viewGroup) {
        this.b = b;
        final EditText a = (EditText)viewGroup.findViewById(2131431293);
        this.a = a;
        final hdd onEditorActionListener = new hdd(this, 0, (byte[])null);
        final EditText editText = a;
        a.setOnEditorActionListener((TextView$OnEditorActionListener)onEditorActionListener);
        final View viewById = viewGroup.findViewById(2131428000);
        final hde hde = new hde(this, viewById, 0, (byte[])null);
        final EditText editText2 = a;
        a.addTextChangedListener((TextWatcher)hde);
        final gbv onFocusChangeListener = new gbv(this, 2, null);
        final EditText editText3 = a;
        a.setOnFocusChangeListener((View$OnFocusChangeListener)onFocusChangeListener);
        viewGroup.findViewById(2131431284).setOnClickListener((View$OnClickListener)new gxu(this, 19, (byte[])null));
        viewById.setOnClickListener((View$OnClickListener)new gxu(this, 20, (byte[])null));
    }
    
    public cdn(final Handler b) {
        b.getClass();
        this.b = b;
        this.a = new ghh(this, 16, (byte[])null, (byte[])null);
    }
    
    public cdn(final View b) {
        this.a = new ArrayList();
        this.b = b;
    }
    
    public cdn(final ViewStub a, final Context b) {
        this.b = b;
        this.a = a;
    }
    
    public cdn(final aum aum) {
        this.a = new aun(aum);
        this.b = new Handler();
    }
    
    public cdn(final dsw dsw) {
        this.a = new PathEffect[2];
        this.c = dsw.j;
        this.b = new dsj();
    }
    
    public cdn(final dzt a, final eab b) {
        this.a = a;
        this.b = b;
    }
    
    public cdn(final eqv a, final esn b) {
        this.a = a;
        this.b = b;
    }
    
    public cdn(final Object a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public cdn(final Executor a, final tv b) {
        this.c = null;
        this.a = a;
        this.b = b;
    }
    
    public cdn(final byte[] array) {
        this.b = new Intent("android.intent.action.VIEW");
        this.a = new elw();
    }
    
    public cdn(final byte[] array, final byte[] array2) {
        this.b = new arcq((char[])null, (byte[])null, (byte[])null);
        this.a = new arcq((char[])null, (byte[])null, (byte[])null);
        this.c = new ai[32];
    }
    
    public static final boolean I(final int n, final int n2) {
        return L(n) && L(n2);
    }
    
    private final void J(final IBinder binder) {
        final Bundle bundle = new Bundle();
        afa.b(bundle, "android.support.customtabs.extra.SESSION", binder);
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
            if (cdn.d == null) {
                final WindowManager windowManager = (WindowManager)context.getSystemService("window");
                cll.h((Object)windowManager);
                final Display defaultDisplay = windowManager.getDefaultDisplay();
                final Point point = new Point();
                defaultDisplay.getSize(point);
                cdn.d = Math.max(point.x, point.y);
            }
            return cdn.d;
        }
        return 0;
    }
    
    private static final boolean L(final int n) {
        return n > 0 || n == Integer.MIN_VALUE;
    }
    
    public static cdn u(final Context context, final int n, final int[] array) {
        return new cdn(context, context.obtainStyledAttributes(n, array));
    }
    
    public static cdn v(final Context context, final AttributeSet set, final int[] array) {
        return new cdn(context, context.obtainStyledAttributes(set, array));
    }
    
    public static cdn w(final Context context, final AttributeSet set, final int[] array, final int n, final int n2) {
        return new cdn(context, context.obtainStyledAttributes(set, array, n, n2));
    }
    
    public final kvc A() {
        aqzg.z(this.c, (Class)Boolean.class);
        return (kvc)new epx((eqv)this.a, (esm)this.b, (Boolean)this.c);
    }
    
    public final void B(final boolean b) {
        this.c = b;
    }
    
    public final void C() {
        if (this.c != null) {
            return;
        }
        throw new IllegalStateException("This builder has already been disposed / built!");
    }
    
    public final void D(final int n, final float n2) {
        this.C();
        final int e = ((eg)this.c).E(n2);
        this.C();
        ((dsj)this.b).a[n] = (float)e;
    }
    
    public final void E(final int n, final int n2) {
        this.C();
        dsj.c(((dsj)this.b).c, 9, n2);
    }
    
    public final int F() {
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
    
    public final int G() {
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
    
    public final void H() {
        final ViewTreeObserver viewTreeObserver = ((View)this.b).getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this.c);
        }
        this.c = null;
        ((List)this.a).clear();
    }
    
    public final void a(final auf auf) {
        final Object c = this.c;
        if (c != null) {
            ((klk)c).run();
        }
        final klk c2 = new klk((aun)this.a, auf, 1);
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
        final Object a = ((elw)this.a).a;
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
        synchronized (this) {
            ((Handler)this.b).removeCallbacks((Runnable)this.a);
            this.c = null;
        }
    }
    
    public final void y() {
        synchronized (this) {
            ((Handler)this.b).removeCallbacks((Runnable)this.a);
            ((Runnable)this.a).run();
        }
    }
    
    public final void z(final Runnable c, final long n) {
        synchronized (this) {
            c.getClass();
            ((Handler)this.b).removeCallbacks((Runnable)this.a);
            this.c = c;
            ((Handler)this.b).postDelayed((Runnable)this.a, n);
        }
    }
}
