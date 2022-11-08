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

public class aecp extends TemplateLayout
{
    private static final aeby h;
    public Activity a;
    final ViewTreeObserver$OnWindowFocusChangeListener b;
    private boolean e;
    private boolean f;
    private boolean g;
    
    static {
        h = new aeby("PartnerCustomizationLayout");
    }
    
    public aecp(final Context context) {
        this(context, 0, 0);
    }
    
    public aecp(final Context context, final int n) {
        this(context, n, 0);
    }
    
    public aecp(final Context context, final int n, final int n2) {
        super(context, n, n2);
        this.b = (ViewTreeObserver$OnWindowFocusChangeListener)new aeco(this);
        this.m(null, 2130970402);
    }
    
    public aecp(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = (ViewTreeObserver$OnWindowFocusChangeListener)new aeco(this);
        this.m(set, 2130970402);
    }
    
    public aecp(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.b = (ViewTreeObserver$OnWindowFocusChangeListener)new aeco(this);
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
        final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, aecq.c, n, 0);
        final boolean boolean1 = obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
        if (boolean1) {
            this.setSystemUiVisibility(1024);
        }
        this.l(aedj.class, (aedi)new aedj(this, this.a.getWindow(), set, n));
        this.l(aedk.class, (aedi)new aedk((TemplateLayout)this, this.a.getWindow()));
        this.l(aedf.class, (aedi)new aedf((TemplateLayout)this, set, n));
        final aedk aedk = (aedk)this.j(aedk.class);
        if (Build$VERSION.SDK_INT >= 27) {
            final TypedArray obtainStyledAttributes2 = aedk.a.getContext().obtainStyledAttributes(set, aecq.e, n, 0);
            final int color = obtainStyledAttributes2.getColor(1, 0);
            aedk.e = color;
            if (aedk.b != null) {
                n = color;
                if (aedk.c) {
                    n = color;
                    if (!aedk.d) {
                        final Context context = aedk.a.getContext();
                        n = aedd.f(context).c(context, aedb.c);
                    }
                }
                aedk.b.setNavigationBarColor(n);
            }
            final Window b = aedk.b;
            boolean b2 = obtainStyledAttributes2.getBoolean(0, b == null || (b.getDecorView().getSystemUiVisibility() & 0x10) == 0x10);
            if (aedk.b != null) {
                if (aedk.c) {
                    final Context context2 = aedk.a.getContext();
                    b2 = aedd.f(context2).j(context2, aedb.i, false);
                }
                if (b2) {
                    aedk.b.getDecorView().setSystemUiVisibility(0x10 | aedk.b.getDecorView().getSystemUiVisibility());
                }
                else {
                    aedk.b.getDecorView().setSystemUiVisibility(aedk.b.getDecorView().getSystemUiVisibility() & 0xFFFFFFEF);
                }
            }
            if (Build$VERSION.SDK_INT >= 28) {
                final TypedArray obtainStyledAttributes3 = aedk.a.getContext().obtainStyledAttributes(new int[] { 16844141 });
                final int color2 = obtainStyledAttributes2.getColor(2, obtainStyledAttributes3.getColor(0, 0));
                if (Build$VERSION.SDK_INT >= 28 && aedk.b != null) {
                    n = color2;
                    if (aedk.c) {
                        final Context context3 = aedk.a.getContext();
                        n = color2;
                        if (aedd.f(context3).l(aedb.d)) {
                            n = aedd.f(context3).c(context3, aedb.d);
                        }
                    }
                    aedk.b.setNavigationBarDividerColor(n);
                }
                obtainStyledAttributes3.recycle();
            }
            obtainStyledAttributes2.recycle();
        }
        this.a.getWindow().addFlags(Integer.MIN_VALUE);
        this.a.getWindow().clearFlags(67108864);
        this.a.getWindow().clearFlags(134217728);
    }
    
    @Override
    protected View b(final LayoutInflater layoutInflater, final int n) {
        int n2 = n;
        if (n == 0) {
            n2 = 2131624972;
        }
        return this.i(layoutInflater, 0, n2);
    }
    
    @Override
    protected ViewGroup c(final int n) {
        int n2 = n;
        if (n == 0) {
            n2 = 2131431828;
        }
        return super.c(n2);
    }
    
    @Override
    protected final void d(final AttributeSet set, final int n) {
        final boolean b = true;
        this.e = true;
        final Activity a = a(this.getContext());
        this.a = a;
        final boolean r = aeda.r(a.getIntent());
        final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, aecq.c, n, 0);
        if (!obtainStyledAttributes.hasValue(2)) {
            aecp.h.c("Attribute sucUsePartnerResource not found in ".concat(String.valueOf(String.valueOf(this.a.getComponentName()))));
        }
        boolean e = b;
        if (!r) {
            e = (obtainStyledAttributes.getBoolean(2, true) && b);
        }
        this.e = e;
        this.g = obtainStyledAttributes.hasValue(0);
        this.f = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        this.a.getClass().getSimpleName();
    }
    
    public final boolean e() {
        return this.g && aeda.t() && aedd.f(this.getContext()).k();
    }
    
    public final boolean f() {
        return this.e && Build$VERSION.SDK_INT >= 29 && aedd.f(this.getContext()).k();
    }
    
    public final boolean g() {
        return this.e() && this.f;
    }
    
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        aecu.a(this.a);
        if (aeda.r(this.a.getIntent())) {
            this.getViewTreeObserver().addOnWindowFocusChangeListener(this.b);
        }
        final aedf aedf = (aedf)this.j(aedf.class);
        aedf.j.d(aedf.f(), false);
        aedf.j.e(aedf.g(), false);
    }
    
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build$VERSION.SDK_INT >= 29 && aeda.r(this.a.getIntent())) {
            final aedf aedf = (aedf)this.j(aedf.class);
            final agjc j = aedf.j;
            final boolean f = aedf.f();
            final boolean g = aedf.g();
            j.b = agjc.c((String)j.b, f);
            j.a = agjc.c((String)j.a, g);
            final aedg e = aedf.e;
            final aedg f2 = aedf.f;
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
            final agjc i = aedf.j;
            final PersistableBundle persistableBundle3 = new PersistableBundle();
            persistableBundle3.putString("PrimaryButtonVisibility", (String)i.b);
            persistableBundle3.putString("SecondaryButtonVisibility", (String)i.a);
            aeda.c(this.getContext(), CustomEvent.e(MetricKey.b("SetupCompatMetrics", this.a), aecv.b(persistableBundle3, persistableBundle, persistableBundle2)));
        }
        this.getViewTreeObserver().removeOnWindowFocusChangeListener(this.b);
    }
}
