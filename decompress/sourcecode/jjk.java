import android.content.Context;
import android.content.res.Resources;
import android.view.ViewTreeObserver;
import android.view.View;
import android.widget.LinearLayout$LayoutParams;
import android.os.Build$VERSION;
import com.facebook.litho.widget.LithoScrollView;
import android.widget.TextView;
import android.view.ViewTreeObserver$OnPreDrawListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jjk implements ViewTreeObserver$OnPreDrawListener
{
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;
    
    public jjk(final aedx b, final TextView a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public jjk(final LithoScrollView a, final aukm b, final int c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public jjk(final jjm b, final TextView a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public jjk(final khl a, final aitu b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final boolean onPreDraw() {
        final int c = this.c;
        boolean b = true;
        if (c == 0) {
            ((TextView)this.a).getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
            final int lineCount = ((TextView)this.a).getLineCount();
            final jjm jjm = (jjm)this.b;
            if (lineCount == jjm.y && jjm.f) {
                jjm.e.b();
            }
            return true;
        }
        if (c == 1) {
            ((LithoScrollView)this.a).setScrollY(((aukm)this.b).a);
            final ViewTreeObserver viewTreeObserver = ((LithoScrollView)this.a).getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
            }
            return true;
        }
        if (c != 2) {
            ((TextView)this.a).getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
            final int lineCount2 = ((TextView)this.a).getLineCount();
            final aedx aedx = (aedx)this.b;
            if (lineCount2 > aedx.e) {
                ((TextView)this.a).setTextSize(0, aedx.c);
                if (Build$VERSION.SDK_INT >= 28) {
                    final Object a = this.a;
                    final aedx aedx2 = (aedx)this.b;
                    ((TextView)a).setLineHeight(Math.round(aedx2.d + aedx2.c));
                }
                ((TextView)this.a).invalidate();
                b = false;
            }
            return b;
        }
        ((khl)this.a).a.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        final Resources resources = ((khl)this.a).g.getResources();
        final int az = tmy.aZ(resources.getDisplayMetrics(), 16);
        final int az2 = tmy.aZ(resources.getDisplayMetrics(), 8);
        final Context g = ((khl)this.a).g;
        alvn alvn;
        if ((alvn = ((aitu)this.b).n) == null) {
            alvn = alvn.a;
        }
        tmy.aF((View)((khl)this.a).a, tmy.aD((int)kgk.h(g, alvn, az, az2).e((Object)resources.getDimensionPixelSize(2131167260))), (Class)LinearLayout$LayoutParams.class);
        return false;
    }
}
