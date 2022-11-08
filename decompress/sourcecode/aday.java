import android.graphics.drawable.Drawable;
import android.graphics.Color;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aday implements acil
{
    public aioe a;
    public aioe b;
    public aioe c;
    public ajsq d;
    private final vax e;
    private final acng f;
    private final View g;
    private final acex h;
    private final TextView i;
    private final TextView j;
    private final ImageView k;
    
    public aday(final Context context, final aceo aceo, final vax e, final acng f, final adax adax) {
        this.e = e;
        this.f = f;
        final View inflate = View.inflate(context, 2131625365, (ViewGroup)null);
        this.g = inflate;
        this.h = new acex((tni)aceo, (ImageView)inflate.findViewById(2131430673), true);
        this.i = (TextView)inflate.findViewById(2131430675);
        (this.j = (TextView)inflate.findViewById(2131427541)).setOnClickListener((View$OnClickListener)new aafm(this, e, 12));
        (this.k = (ImageView)inflate.findViewById(2131428234)).setOnClickListener((View$OnClickListener)new wau(this, e, adax, 8));
        adbk.e(inflate);
    }
    
    public final View a() {
        return this.g;
    }
    
    public final void c(final acir acir) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
