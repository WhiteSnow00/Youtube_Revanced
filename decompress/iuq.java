import android.content.res.Resources;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iuq implements fju
{
    public final fjv a;
    public final ashy b;
    public final wyw c;
    public final ImageView d;
    
    public iuq(final fjv a, final ashy b, final wyw c, final ImageView d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final boolean b) {
        final Resources resources = this.d.getResources();
        final int dimensionPixelSize = resources.getDimensionPixelSize(2131166174);
        int n;
        if (b) {
            n = resources.getDimensionPixelSize(2131166176);
        }
        else {
            n = resources.getDimensionPixelSize(2131166175);
        }
        int n2;
        if (b) {
            n2 = resources.getDimensionPixelSize(2131166173);
        }
        else {
            n2 = resources.getDimensionPixelSize(2131166172);
        }
        this.d.setPaddingRelative(dimensionPixelSize, n, dimensionPixelSize, n2);
    }
    
    @Override
    public final void n(final fkr fkr) {
    }
    
    @Override
    public final void oK(final fkr fkr, final fkr fkr2) {
        final boolean c = fkr.c();
        final boolean c2 = fkr2.c();
        if (c != c2) {
            this.a(c2);
        }
    }
}
