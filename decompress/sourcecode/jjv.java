import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jjv implements acil
{
    private final Context a;
    private final acir b;
    private final LinearLayout c;
    private acil d;
    private acil e;
    private acil f;
    
    public jjv(final Context a, final acir b) {
        this.a = a;
        this.b = b;
        this.c = (LinearLayout)LayoutInflater.from(a).inflate(2131625777, (ViewGroup)null, false);
    }
    
    public final View a() {
        return (View)this.c;
    }
    
    public final void c(final acir acir) {
        this.c.removeAllViews();
        final acil d = this.d;
        if (d != null) {
            d.c(acir);
            acir.b(this.d.a());
            this.d = null;
        }
        final acil e = this.e;
        if (e != null) {
            e.c(acir);
            acir.b(this.e.a());
            this.e = null;
        }
        final acil f = this.f;
        if (f != null) {
            f.c(acir);
            acir.b(this.f.a());
            this.f = null;
        }
    }
}
