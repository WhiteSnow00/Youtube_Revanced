import android.app.Dialog;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.FrameLayout$LayoutParams;
import android.widget.FrameLayout;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector$SimpleOnScaleGestureListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class fsb extends ScaleGestureDetector$SimpleOnScaleGestureListener
{
    final fsd a;
    
    public fsb(final fsd a) {
        this.a = a;
    }
    
    public final boolean onScale(final ScaleGestureDetector scaleGestureDetector) {
        final float scaleFactor = scaleGestureDetector.getScaleFactor();
        final fsd a = this.a;
        final float c = (int)(a.c * scaleFactor * 100.0f) / 100.0f;
        a.c = c;
        a.c = Math.max(1.0f, Math.min(c, 10.0f));
        return true;
    }
    
    public final boolean onScaleBegin(final ScaleGestureDetector scaleGestureDetector) {
        final fsd a = this.a;
        if (!a.d) {
            a.n = false;
            if (a.o) {
                a.d = true;
                final FrameLayout frameLayout = new FrameLayout(a.getContext());
                if (a.p) {
                    (a.g = a.a()).setBackground(a.getBackground());
                    frameLayout.addView((View)a.g, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(a.getWidth(), a.getHeight()));
                    if (a.u == 2) {
                        (a.h = a.a()).setBackgroundColor(a.getResources().getColor(2131102435));
                        frameLayout.addView((View)a.h, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(a.getWidth(), a.getHeight()));
                    }
                }
                (a.i = a.a()).setImageDrawable(a.getDrawable());
                frameLayout.addView((View)a.i, (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(a.getWidth(), a.getHeight()));
                a.f = new Dialog(a.getContext(), 16973841);
                final int u = a.u;
                if (u == 0) {
                    throw null;
                }
                if (u - 1 == 1) {
                    if (a.f.getWindow() != null) {
                        a.f.getWindow().setBackgroundDrawableResource(2131102435);
                    }
                }
                a.f.addContentView((View)frameLayout, new ViewGroup$LayoutParams(-1, -1));
                a.f.show();
                final fsd a2 = this.a;
                if (a2.k != null) {
                    if (a2.l != null) {
                        final vgs a3 = ota.a();
                        final oti j = a2.j;
                        if (j != null) {
                            a3.h = j.q;
                        }
                        a2.k.a(a2.l, a3.f()).U();
                    }
                }
            }
        }
        return true;
    }
    
    public final void onScaleEnd(final ScaleGestureDetector scaleGestureDetector) {
    }
}
