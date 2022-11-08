import android.view.View;
import android.support.v7.widget.RecyclerView;
import android.graphics.Rect;
import com.google.android.material.appbar.AppBarLayout;

// 
// Decompiled by Procyon v0.6.0
// 

final class jxb implements adqq
{
    int a;
    final /* synthetic */ jxc b;
    
    public jxb(final jxc b) {
        this.b = b;
    }
    
    public final void a(final AppBarLayout appBarLayout, final int a) {
        final RecyclerView l = this.b.l;
        if (l != null && a != this.a) {
            bkv.e();
            final int width = l.getWidth();
            final int height = l.getHeight();
            for (int i = 0; i < l.getChildCount(); ++i) {
                final View child = l.getChildAt(i);
                View a2;
                if (child instanceof ebe) {
                    a2 = ((ebe)child).a();
                }
                else {
                    a2 = child;
                }
                if (a2 instanceof dvt) {
                    final dvt dvt = (dvt)a2;
                    if (dvt.F()) {
                        if (child != a2 && child.getHeight() != a2.getHeight()) {
                            throw new IllegalStateException("ViewDiagnosticsWrapper must be the same height as the underlying view");
                        }
                        final int n = (int)child.getTranslationX();
                        final int n2 = (int)child.getTranslationY();
                        final int n3 = child.getTop() + n2;
                        final int n4 = child.getBottom() + n2;
                        final int n5 = child.getLeft() + n;
                        final int n6 = child.getRight() + n;
                        if (n5 < 0 || n3 < 0 || n6 > width || n4 > height || dvt.m.width() != dvt.getWidth() || dvt.m.height() != dvt.getHeight()) {
                            final Rect rect = new Rect(Math.max(0, -n5), Math.max(0, -n3), Math.min(n6, width) - n5, Math.min(n4, height) - n3);
                            if (!rect.isEmpty()) {
                                dvt.u(rect, true);
                            }
                        }
                    }
                }
            }
            this.a = a;
        }
    }
}
