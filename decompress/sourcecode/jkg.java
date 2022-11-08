import android.view.ViewGroup;
import android.view.View;
import android.widget.FrameLayout;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jkg extends acja
{
    private final Context a;
    private final FrameLayout b;
    private jkd c;
    private jkd d;
    private final lfy e;
    
    public jkg(final Context a, final vax vax, final aceo aceo, final acte acte, final zhb zhb, final acng acng, final fvf fvf, final hyc hyc, final adcr adcr, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.e = new lfy(a, vax, aceo, acte, zhb, acng, fvf, hyc, adcr, (byte[])null, (byte[])null, (byte[])null);
        this.b = new FrameLayout(a);
    }
    
    public final View a() {
        return (View)this.b;
    }
    
    public final void c(final acir acir) {
        final jkd c = this.c;
        if (c != null) {
            c.c(acir);
        }
        final jkd d = this.d;
        if (d != null) {
            d.c(acir);
        }
    }
}
