import android.content.res.Resources;
import android.text.TextUtils;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.View;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class keo implements acil
{
    public aioe a;
    private final Context b;
    private final TextView c;
    private final TextView d;
    private final ImageView e;
    private final acio f;
    private final View$OnClickListener g;
    private final fyl h;
    private final adcr i;
    
    public keo(final Context b, final giz f, final vax vax, final adcr i, final uyi uyi, final byte[] array) {
        b.getClass();
        this.b = b;
        this.f = (acio)f;
        this.i = i;
        vax.getClass();
        final View inflate = View.inflate(b, 2131624419, (ViewGroup)null);
        final TextView c = (TextView)inflate.findViewById(2131429568);
        this.c = c;
        final TextView d = (TextView)inflate.findViewById(2131429567);
        this.d = d;
        if (uyi.aO()) {
            c.setAllCaps(false);
            d.setAllCaps(false);
        }
        this.e = (ImageView)inflate.findViewById(2131429554);
        this.g = (View$OnClickListener)new kdw(this, vax, 2);
        inflate.setBackground((Drawable)(this.h = new fyl(inflate.getBackground(), tmy.cn(b, 2130970897), b.getResources().getDimensionPixelSize(2131167246))));
        f.c(inflate);
    }
    
    public final View a() {
        return ((giz)this.f).a;
    }
    
    public final void c(final acir acir) {
    }
}
