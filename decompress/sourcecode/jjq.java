import android.view.View;
import android.widget.FrameLayout;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jjq extends acja
{
    private final acng a;
    private final aceo b;
    private final vax c;
    private final acnj d;
    private final Context e;
    private final acio f;
    private final FrameLayout g;
    private acil h;
    private acil i;
    private final uyi j;
    
    public jjq(final Context e, final aceo b, final vax c, final giz f, final acnj d, final acng a, final uyi j) {
        this.e = e;
        f.getClass();
        this.f = (acio)f;
        this.b = b;
        this.c = c;
        this.d = d;
        this.a = a;
        this.j = j;
        ((acio)f).c((View)(this.g = new FrameLayout(e)));
    }
    
    public final View a() {
        return ((giz)this.f).a;
    }
    
    public final void c(final acir acir) {
        final acil h = this.h;
        if (h != null) {
            h.c(acir);
        }
        final acil i = this.i;
        if (i != null) {
            i.c(acir);
        }
    }
}
