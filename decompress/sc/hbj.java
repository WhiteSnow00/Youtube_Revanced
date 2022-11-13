import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hbj extends utv
{
    final Context a;
    final View[] b;
    final hbk c;
    
    public hbj(final hbk c, final Context context, final cl cl, final wyw wyw, final Context a, final View[] b) {
        this.c = c;
        this.a = a;
        this.b = b;
        super(context, cl, wyw, true, true);
    }
    
    protected final View a() {
        return (View)this.c.c;
    }
    
    protected final xab c() {
        return null;
    }
    
    protected final String f() {
        return this.a.getString(2132019766);
    }
    
    public final void h() {
        super.h();
        final View[] b = this.b;
        for (int i = 0; i < 3; ++i) {
            final View view = b[i];
            if (view != null) {
                view.setVisibility(0);
            }
        }
        final ChooseFilterView c = this.c.c;
        if (c == null) {
            return;
        }
        if (c.f) {
            c.k();
        }
        this.c.c();
    }
    
    public final void l() {
        final hbk c = this.c;
        final aeea o = c.o;
        if (o != null) {
            final xab j = c.j;
            if (j != null) {
                final twx cg = o.cG(j);
                cg.k(true);
                cg.c();
            }
        }
        final View[] b = this.b;
        for (int i = 0; i < 3; ++i) {
            final View view = b[i];
            if (view != null) {
                view.setVisibility(4);
            }
        }
        final ChooseFilterView c2 = this.c.c;
        if (c2 == null) {
            return;
        }
        if (!c2.f) {
            c2.k();
            final ChooseFilterView c3 = this.c.c;
            if (c3 != null) {
                final ure c4 = c3.c();
                if ((c4 == null || !c4.r()) && this.c.d != null) {
                    zlm.b(zll.a, zlk.x, "[ShortsCreation][Android][Camera]Opened empty preset drawer");
                }
            }
        }
        this.c.c();
        super.l();
    }
    
    protected final View nd() {
        return (View)this.c.h;
    }
    
    protected final boolean o() {
        return false;
    }
}
