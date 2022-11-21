import android.os.Bundle;
import android.view.Window;
import android.os.Build$VERSION;
import android.graphics.Color;
import android.view.View$OnTouchListener;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.util.TypedValue;
import android.content.Context;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public class advj extends fz
{
    private FrameLayout a;
    public BottomSheetBehavior b;
    public FrameLayout c;
    public boolean d;
    public boolean e;
    public boolean f;
    public advi g;
    private CoordinatorLayout h;
    private final boolean i;
    private final advd j;
    
    public advj(final Context context, final int n) {
        int resourceId = n;
        if (n == 0) {
            final TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(2130968828, typedValue, true)) {
                resourceId = typedValue.resourceId;
            }
            else {
                resourceId = 2132084124;
            }
        }
        super(context, resourceId);
        this.d = true;
        this.e = true;
        this.j = new advh(this);
        this.e();
        this.i = this.getContext().getTheme().obtainStyledAttributes(new int[] { 2130969317 }).getBoolean(0, false);
    }
    
    private final View b(final int n, final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.g();
        final CoordinatorLayout coordinatorLayout = (CoordinatorLayout)this.a.findViewById(2131428487);
        View inflate = view;
        if (n != 0 && (inflate = view) == null) {
            inflate = this.getLayoutInflater().inflate(n, (ViewGroup)coordinatorLayout, false);
        }
        if (this.i) {
            anc.Z((View)this.c, (alx)new tqv(this, 3));
        }
        this.c.removeAllViews();
        if (viewGroup$LayoutParams == null) {
            this.c.addView(inflate);
        }
        else {
            this.c.addView(inflate, viewGroup$LayoutParams);
        }
        coordinatorLayout.findViewById(2131432170).setOnClickListener((View$OnClickListener)new acvy(this, 11));
        anc.N((View)this.c, new advg(this));
        this.c.setOnTouchListener((View$OnTouchListener)new gmt(9));
        return (View)this.a;
    }
    
    private final void g() {
        if (this.a == null) {
            final FrameLayout a = (FrameLayout)View.inflate(this.getContext(), 2131624334, (ViewGroup)null);
            this.a = a;
            this.h = (CoordinatorLayout)a.findViewById(2131428487);
            final FrameLayout c = (FrameLayout)this.a.findViewById(2131428635);
            this.c = c;
            (this.b = BottomSheetBehavior.z((View)c)).A(this.j);
            this.b.G(this.d);
        }
    }
    
    public final BottomSheetBehavior a() {
        if (this.b == null) {
            this.g();
        }
        return this.b;
    }
    
    public final void cancel() {
        this.a();
        super.cancel();
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        final Window window = this.getWindow();
        if (window != null) {
            final boolean i = this.i;
            int n2;
            final int n = n2 = 0;
            if (i) {
                n2 = n;
                if (Color.alpha(window.getNavigationBarColor()) < 255) {
                    n2 = 1;
                }
            }
            final FrameLayout a = this.a;
            if (a != null) {
                a.setFitsSystemWindows((boolean)((n2 ^ 0x1) != 0x0));
            }
            final CoordinatorLayout h = this.h;
            if (h != null) {
                h.setFitsSystemWindows((boolean)((n2 ^ 0x1) != 0x0));
            }
            final int n3 = n2 ^ 0x1;
            if (Build$VERSION.SDK_INT >= 30) {
                anp.a(window, (boolean)(n3 != 0));
            }
            else {
                ano.a(window, (boolean)(n3 != 0));
            }
            final advi g = this.g;
            if (g != null) {
                g.c(window);
            }
        }
    }
    
    protected final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Window window = this.getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }
    
    public final void onDetachedFromWindow() {
        final advi g = this.g;
        if (g != null) {
            g.c(null);
        }
    }
    
    protected final void onStart() {
        super.onStart();
        final BottomSheetBehavior b = this.b;
        if (b != null && b.z == 5) {
            b.I(4);
        }
    }
    
    public final void setCancelable(final boolean b) {
        super.setCancelable(b);
        if (this.d != b) {
            this.d = b;
            final BottomSheetBehavior b2 = this.b;
            if (b2 != null) {
                b2.G(b);
            }
        }
    }
    
    public final void setCanceledOnTouchOutside(final boolean b) {
        super.setCanceledOnTouchOutside(b);
        if (b && !this.d) {
            this.d = true;
        }
        this.e = b;
        this.f = true;
    }
    
    public final void setContentView(final int n) {
        super.setContentView(this.b(n, null, null));
    }
    
    public final void setContentView(final View view) {
        super.setContentView(this.b(0, view, null));
    }
    
    public final void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super.setContentView(this.b(0, view, viewGroup$LayoutParams));
    }
}
