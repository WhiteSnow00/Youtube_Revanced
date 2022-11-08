import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adbf implements acil
{
    public aioe a;
    private final acng b;
    private final View c;
    private final ImageView d;
    private final TextView e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    
    public adbf(final Context context, final adbe adbe, final acng b, final vax vax) {
        this.b = b;
        final View inflate = View.inflate(context, 2131625374, (ViewGroup)null);
        this.c = inflate;
        this.d = (ImageView)inflate.findViewById(2131429270);
        this.e = (TextView)inflate.findViewById(2131431950);
        inflate.setOnClickListener((View$OnClickListener)new wau(this, vax, adbe, 9));
        this.f = context.getResources().getDimensionPixelSize(2131169530);
        this.g = context.getResources().getDimensionPixelSize(2131169525);
        this.h = context.getResources().getDimensionPixelSize(2131169529);
        this.i = context.getResources().getDimensionPixelSize(2131169528);
        this.j = context.getResources().getDimensionPixelSize(2131169526);
        this.k = context.getResources().getDimensionPixelSize(2131169527);
    }
    
    public final View a() {
        return this.c;
    }
    
    public final void c(final acir acir) {
    }
}
