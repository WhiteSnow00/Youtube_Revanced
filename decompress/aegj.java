import com.google.android.setupcompat.logging.CustomEvent;
import com.google.android.setupcompat.logging.MetricKey;
import android.os.PersistableBundle;
import android.view.ViewGroup;
import android.view.View;
import android.view.LayoutInflater;
import android.view.Window;
import android.content.res.TypedArray;
import android.os.Build$VERSION;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewTreeObserver$OnWindowFocusChangeListener;
import android.app.Activity;
import com.google.android.setupcompat.internal.TemplateLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public class aegj extends TemplateLayout
{
    private static final aefs h;
    public Activity a;
    final ViewTreeObserver$OnWindowFocusChangeListener b;
    private boolean e;
    private boolean f;
    private boolean g;
    
    static {
        h = new aefs("PartnerCustomizationLayout");
    }
    
    public aegj(final Context context) {
        this(context, 0, 0);
    }
    
    public aegj(final Context context, final int n) {
        this(context, n, 0);
    }
    
    public aegj(final Context context, final int n, final int n2) {
        super(context, n, n2);
        this.b = (ViewTreeObserver$OnWindowFocusChangeListener)new aegi(this);
        this.m(null, 2130970400);
    }
    
    public aegj(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = (ViewTreeObserver$OnWindowFocusChangeListener)new aegi(this);
        this.m(set, 2130970400);
    }
    
    public aegj(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.b = (ViewTreeObserver$OnWindowFocusChangeListener)new aegi(this);
        this.m(set, n);
    }
    
    public static Activity a(final Context context) {
        if (context instanceof Activity) {
            return (Activity)context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper)context).getBaseContext());
        }
        throw new IllegalArgumentException("Cannot find instance of Activity in parent tree");
    }
    
    private void m(final AttributeSet set, int n) {
        if (this.isInEditMode()) {
            return;
        }
        final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, aegk.c, n, 0);
        final boolean boolean1 = obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
        if (boolean1) {
            this.setSystemUiVisibility(1024);
        }
        this.l((Class)aehd.class, (aehc)new aehd(this, this.a.getWindow(), set, n));
        this.l((Class)aehe.class, (aehc)new aehe((TemplateLayout)this, this.a.getWindow()));
        this.l((Class)aegz.class, (aehc)new aegz((TemplateLayout)this, set, n));
        final aehe aehe = (aehe)this.j((Class)aehe.class);
        if (Build$VERSION.SDK_INT >= 27) {
            final TypedArray obtainStyledAttributes2 = aehe.a.getContext().obtainStyledAttributes(set, aegk.e, n, 0);
            final int color = obtainStyledAttributes2.getColor(1, 0);
            aehe.e = color;
            if (aehe.b != null) {
                n = color;
                if (aehe.c) {
                    n = color;
                    if (!aehe.d) {
                        final Context context = aehe.a.getContext();
                        n = aegx.f(context).c(context, aegv.c);
                    }
                }
                aehe.b.setNavigationBarColor(n);
            }
            final Window b = aehe.b;
            boolean b2 = obtainStyledAttributes2.getBoolean(0, b == null || (b.getDecorView().getSystemUiVisibility() & 0x10) == 0x10);
            if (aehe.b != null) {
                if (aehe.c) {
                    final Context context2 = aehe.a.getContext();
                    b2 = aegx.f(context2).j(context2, aegv.i, false);
                }
                if (b2) {
                    aehe.b.getDecorView().setSystemUiVisibility(0x10 | aehe.b.getDecorView().getSystemUiVisibility());
                }
                else {
                    aehe.b.getDecorView().setSystemUiVisibility(aehe.b.getDecorView().getSystemUiVisibility() & 0xFFFFFFEF);
                }
            }
            if (Build$VERSION.SDK_INT >= 28) {
                final TypedArray obtainStyledAttributes3 = aehe.a.getContext().obtainStyledAttributes(new int[] { 16844141 });
                final int color2 = obtainStyledAttributes2.getColor(2, obtainStyledAttributes3.getColor(0, 0));
                if (Build$VERSION.SDK_INT >= 28 && aehe.b != null) {
                    n = color2;
                    if (aehe.c) {
                        final Context context3 = aehe.a.getContext();
                        n = color2;
                        if (aegx.f(context3).l(aegv.d)) {
                            n = aegx.f(context3).c(context3, aegv.d);
                        }
                    }
                    aehe.b.setNavigationBarDividerColor(n);
                }
                obtainStyledAttributes3.recycle();
            }
            obtainStyledAttributes2.recycle();
        }
        this.a.getWindow().addFlags(Integer.MIN_VALUE);
        this.a.getWindow().clearFlags(67108864);
        this.a.getWindow().clearFlags(134217728);
    }
    
    protected View b(final LayoutInflater layoutInflater, final int n) {
        int n2 = n;
        if (n == 0) {
            n2 = 2131624975;
        }
        return this.i(layoutInflater, 0, n2);
    }
    
    protected ViewGroup c(final int n) {
        int n2 = n;
        if (n == 0) {
            n2 = 2131431832;
        }
        return super.c(n2);
    }
    
    protected final void d(final AttributeSet set, final int n) {
        final boolean b = true;
        this.e = true;
        final Activity a = a(this.getContext());
        this.a = a;
        final boolean e = aegu.e(a.getIntent());
        final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, aegk.c, n, 0);
        if (!obtainStyledAttributes.hasValue(2)) {
            aegj.h.d("Attribute sucUsePartnerResource not found in ".concat(String.valueOf(String.valueOf(this.a.getComponentName()))));
        }
        boolean e2 = b;
        if (!e) {
            e2 = (obtainStyledAttributes.getBoolean(2, true) && b);
        }
        this.e = e2;
        this.g = obtainStyledAttributes.hasValue(0);
        this.f = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        this.a.getClass().getSimpleName();
    }
    
    public final boolean e() {
        return this.g && aegu.g() && aegx.f(this.getContext()).k();
    }
    
    public final boolean f() {
        return this.e && Build$VERSION.SDK_INT >= 29 && aegx.f(this.getContext()).k();
    }
    
    public final boolean g() {
        return this.e() && this.f;
    }
    
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        aego.a(this.a);
        if (aegu.e(this.a.getIntent())) {
            this.getViewTreeObserver().addOnWindowFocusChangeListener(this.b);
        }
        final aegz aegz = (aegz)this.j((Class)aegz.class);
        aegz.j.d(aegz.f(), false);
        aegz.j.e(aegz.g(), false);
    }
    
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build$VERSION.SDK_INT >= 29 && aegu.e(this.a.getIntent())) {
            final aegz aegz = (aegz)this.j((Class)aegz.class);
            final agmu j = aegz.j;
            final boolean f = aegz.f();
            final boolean g = aegz.g();
            j.b = agmu.c((String)j.b, f);
            j.a = agmu.c((String)j.a, g);
            final aeha e = aegz.e;
            final aeha f2 = aegz.f;
            PersistableBundle persistableBundle;
            if (e != null) {
                persistableBundle = e.a("PrimaryFooterButton");
            }
            else {
                persistableBundle = PersistableBundle.EMPTY;
            }
            PersistableBundle persistableBundle2;
            if (f2 != null) {
                persistableBundle2 = f2.a("SecondaryFooterButton");
            }
            else {
                persistableBundle2 = PersistableBundle.EMPTY;
            }
            final agmu i = aegz.j;
            final PersistableBundle persistableBundle3 = new PersistableBundle();
            persistableBundle3.putString("PrimaryButtonVisibility", (String)i.b);
            persistableBundle3.putString("SecondaryButtonVisibility", (String)i.a);
            aegu.c(this.getContext(), CustomEvent.e(MetricKey.b("SetupCompatMetrics", this.a), aegp.b(persistableBundle3, persistableBundle, persistableBundle2)));
        }
        this.getViewTreeObserver().removeOnWindowFocusChangeListener(this.b);
    }
}
