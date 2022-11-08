import android.content.Context;
import android.view.View;
import android.widget.GridLayout$LayoutParams;
import android.util.Log;
import android.os.Build;
import android.graphics.drawable.VectorDrawable;
import com.google.android.setupcompat.internal.TemplateLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.widget.ImageView;
import android.view.ViewTreeObserver$OnPreDrawListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class edi implements ViewTreeObserver$OnPreDrawListener
{
    final /* synthetic */ Object a = a;
    private final /* synthetic */ int b;
    
    public edi(final ImageView a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public edi(final CoordinatorLayout a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public edi(final TemplateLayout a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public edi(final eea a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public edi(final kea a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public edi(final sqr a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public edi(final vwx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final boolean onPreDraw() {
        switch (this.b) {
            default: {
                ((ImageView)this.a).getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
                if (aeda.t() && ((ImageView)this.a).getDrawable() != null && !(((ImageView)this.a).getDrawable() instanceof VectorDrawable) && !(((ImageView)this.a).getDrawable() instanceof ckj) && (Build.TYPE.equals("userdebug") || Build.TYPE.equals("eng"))) {
                    Log.w("HeaderAreaStyler", "To achieve scaling icon in SetupDesign lib, should use vector drawable icon from ".concat(String.valueOf(((ImageView)this.a).getContext().getPackageName())));
                }
                return true;
            }
            case 6: {
                ((TemplateLayout)this.a).getViewTreeObserver().removeOnPreDrawListener(((TemplateLayout)this.a).d);
                final TemplateLayout templateLayout = (TemplateLayout)this.a;
                templateLayout.setXFraction(templateLayout.c);
                return true;
            }
            case 5: {
                ((vwx)this.a).k().getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
                if (((vwx)this.a).k().getChildCount() > 0) {
                    final vwx vwx = (vwx)this.a;
                    vwx.b.setIntValues(new int[] { 0, vwx.k().getChildAt(0).getHeight() });
                }
                else {
                    ((vwx)this.a).b.setIntValues(new int[] { 0 });
                }
                return false;
            }
            case 4: {
                ((tpc)this.a).b();
                return true;
            }
            case 3: {
                ((sqr)this.a).q.getViewTreeObserver().removeOnPreDrawListener(((sqr)this.a).m);
                final sqr sqr = (sqr)this.a;
                sqr.m = null;
                final int lineCount = sqr.q.getLineCount();
                final sqr sqr2 = (sqr)this.a;
                if (lineCount > sqr2.k) {
                    sqr2.r.setVisibility(0);
                    ((sqr)this.a).i(true);
                }
                return true;
            }
            case 2: {
                ((kea)this.a).a.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
                final kea kea = (kea)this.a;
                final Context b = kea.b;
                alvn alvn;
                if ((alvn = kea.d.k) == null) {
                    alvn = alvn.a;
                }
                final aexq h = kgk.h(b, alvn, ((kea)this.a).c.getDimensionPixelSize(2131166102), ((kea)this.a).c.getDimensionPixelSize(2131166103));
                final kea kea2 = (kea)this.a;
                tmy.aF((View)kea2.a, tmy.aD((int)h.e((Object)kea2.c.getDimensionPixelSize(2131167260))), (Class)GridLayout$LayoutParams.class);
                return false;
            }
            case 1: {
                ((CoordinatorLayout)this.a).j(0);
                return true;
            }
            case 0: {
                ((eea)this.a).B();
                return true;
            }
        }
    }
}
