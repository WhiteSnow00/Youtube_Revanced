import android.os.Build$VERSION;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.view.View;
import android.view.Window;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adtr extends adtm
{
    private final Boolean a;
    private final aob b;
    private Window c;
    private boolean d;
    
    public adtr(final View view, final aob b) {
        this.b = b;
        final adyh d = BottomSheetBehavior.y(view).d;
        ColorStateList list;
        if (d != null) {
            list = d.h();
        }
        else {
            list = anb.l(view);
        }
        if (list != null) {
            this.a = adds.X(list.getDefaultColor());
            return;
        }
        if (view.getBackground() instanceof ColorDrawable) {
            this.a = adds.X(((ColorDrawable)view.getBackground()).getColor());
            return;
        }
        this.a = null;
    }
    
    private final void d(final View view) {
        if (view.getTop() < this.b.d()) {
            final Window c = this.c;
            if (c != null) {
                final Boolean a = this.a;
                boolean b;
                if (a == null) {
                    b = this.d;
                }
                else {
                    b = a;
                }
                adds.O(c, b);
            }
            view.setPadding(view.getPaddingLeft(), this.b.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            final Window c2 = this.c;
            if (c2 != null) {
                adds.O(c2, this.d);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }
    
    public final void a(final View view, final float n) {
        this.d(view);
    }
    
    public final void b(final View view, final int n) {
        this.d(view);
    }
    
    public final void c(final Window c) {
        if (this.c == c) {
            return;
        }
        if ((this.c = c) != null) {
            c.getDecorView();
            Object o;
            if (Build$VERSION.SDK_INT >= 30) {
                o = new aoe(c);
            }
            else {
                o = new aod(c);
            }
            this.d = ((afs)o).c();
        }
    }
    
    public final void p(final View view) {
        this.d(view);
    }
}
