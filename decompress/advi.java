import android.os.Build$VERSION;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.view.View;
import android.view.Window;

// 
// Decompiled by Procyon v0.6.0
// 

public final class advi extends advd
{
    private final Boolean a;
    private final aoc b;
    private Window c;
    private boolean d;
    
    public advi(final View view, final aoc b) {
        this.b = b;
        final adzz d = BottomSheetBehavior.z(view).d;
        ColorStateList list;
        if (d != null) {
            list = d.h();
        }
        else {
            list = anc.l(view);
        }
        if (list != null) {
            this.a = adfe.O(list.getDefaultColor());
            return;
        }
        if (view.getBackground() instanceof ColorDrawable) {
            this.a = adfe.O(((ColorDrawable)view.getBackground()).getColor());
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
                adfe.F(c, b);
            }
            view.setPadding(view.getPaddingLeft(), this.b.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            final Window c2 = this.c;
            if (c2 != null) {
                adfe.F(c2, this.d);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }
    
    @Override
    public final void a(final View view, final float n) {
        this.d(view);
    }
    
    @Override
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
                o = new aof(c);
            }
            else {
                o = new aoe(c);
            }
            this.d = ((afs)o).c();
        }
    }
    
    @Override
    public final void p(final View view) {
        this.d(view);
    }
}
