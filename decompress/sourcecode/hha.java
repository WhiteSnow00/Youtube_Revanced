import android.content.res.Resources;
import android.view.View;
import android.content.Context;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hha extends uip
{
    private final uin e;
    private final ImageView f;
    private final Context g;
    
    public hha(final Context g, final uin e, final ImageView f, final wwv wwv) {
        super(g, e, (View)f, wwv);
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final void h(final boolean b, final boolean b2) {
        if (this.e.O(b)) {
            final ImageView f = this.f;
            final Resources resources = this.g.getResources();
            int n;
            if (!b) {
                n = 2131233114;
            }
            else {
                n = 2131233115;
            }
            f.setImageDrawable(resources.getDrawable(n));
            if (b2) {
                super.b.getClass();
                if (tqt.e(super.d)) {
                    final Context d = super.d;
                    int n2;
                    if (!b) {
                        n2 = 2132017273;
                    }
                    else {
                        n2 = 2132017274;
                    }
                    tqt.c(super.d, super.b, (CharSequence)d.getString(n2));
                }
            }
            final ImageView f2 = this.f;
            final Context g = this.g;
            int n3;
            if (!b) {
                n3 = 2132017416;
            }
            else {
                n3 = 2132017415;
            }
            f2.setContentDescription((CharSequence)g.getString(n3));
        }
    }
}
