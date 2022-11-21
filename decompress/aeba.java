import android.widget.Button;
import android.text.TextUtils;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.os.Build$VERSION;
import android.content.res.TypedArray;
import android.view.ViewParent;
import com.google.android.material.snackbar.SnackbarContentLayout;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeba extends aeax
{
    private static final int[] a;
    private final AccessibilityManager w;
    private boolean x;
    
    static {
        a = new int[] { 2130970288, 2130970290 };
    }
    
    private aeba(final Context context, final ViewGroup viewGroup, final View view, final aeay aeay) {
        super(context, viewGroup, view, aeay);
        this.w = (AccessibilityManager)viewGroup.getContext().getSystemService("accessibility");
    }
    
    public static aeba n(final View view, final int n, final int n2) {
        return o(view, view.getResources().getText(n), n2);
    }
    
    public static aeba o(final View view, final CharSequence charSequence, final int m) {
        ViewGroup viewGroup = null;
        View view2 = view;
    Label_0108:
        while (true) {
            while (!(view2 instanceof CoordinatorLayout)) {
                ViewGroup viewGroup2 = viewGroup;
                if (view2 instanceof FrameLayout) {
                    if (view2.getId() == 16908290) {
                        viewGroup2 = (ViewGroup)view2;
                        break Label_0108;
                    }
                    viewGroup2 = (ViewGroup)view2;
                }
                View view3;
                if ((view3 = view2) != null) {
                    final ViewParent parent = view2.getParent();
                    if (parent instanceof View) {
                        view3 = (View)parent;
                    }
                    else {
                        view3 = null;
                    }
                }
                viewGroup = viewGroup2;
                if ((view2 = view3) != null) {
                    continue;
                }
                if (viewGroup2 != null) {
                    final Context context = viewGroup2.getContext();
                    final LayoutInflater from = LayoutInflater.from(context);
                    final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(aeba.a);
                    final int resourceId = obtainStyledAttributes.getResourceId(0, -1);
                    final int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
                    obtainStyledAttributes.recycle();
                    int n = 2131624336;
                    if (resourceId != -1) {
                        n = n;
                        if (resourceId2 != -1) {
                            n = 2131624875;
                        }
                    }
                    final SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout)from.inflate(n, viewGroup2, false);
                    final aeba aeba = new aeba(context, viewGroup2, (View)snackbarContentLayout, (aeay)snackbarContentLayout);
                    aeba.q(charSequence);
                    aeba.m = m;
                    return aeba;
                }
                throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
            }
            ViewGroup viewGroup2 = (ViewGroup)view2;
            continue Label_0108;
        }
    }
    
    private final SnackbarContentLayout s() {
        return (SnackbarContentLayout)this.k.getChildAt(0);
    }
    
    public final int a() {
        final int m = super.m;
        if (m == -2) {
            return -2;
        }
        if (Build$VERSION.SDK_INT >= 29) {
            int n;
            if (!this.x) {
                n = 0;
            }
            else {
                n = 4;
            }
            return this.w.getRecommendedTimeoutMillis(m, n | 0x3);
        }
        if (this.x && this.w.isTouchExplorationEnabled()) {
            return -2;
        }
        return m;
    }
    
    public final TextView m() {
        return this.s().a;
    }
    
    public final void p(final CharSequence text, final View$OnClickListener view$OnClickListener) {
        final Button b = this.s().b;
        if (!TextUtils.isEmpty(text) && view$OnClickListener != null) {
            this.x = true;
            ((TextView)b).setVisibility(0);
            ((TextView)b).setText(text);
            ((TextView)b).setOnClickListener((View$OnClickListener)new zig(this, view$OnClickListener, 15));
            return;
        }
        ((TextView)b).setVisibility(8);
        ((TextView)b).setOnClickListener((View$OnClickListener)null);
        this.x = false;
    }
    
    public final void q(final CharSequence text) {
        this.m().setText(text);
    }
    
    public final void r(final int n, final View$OnClickListener view$OnClickListener) {
        this.p(super.j.getText(n), view$OnClickListener);
    }
}
