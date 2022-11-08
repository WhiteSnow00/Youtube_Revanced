import android.text.Spanned;
import java.util.List;
import android.widget.ImageView;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.content.Context;
import android.view.ViewGroup;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jjw extends acja implements jkh
{
    private final LayoutInflater a;
    private final aceo b;
    private final acih c;
    private final ViewGroup d;
    private boolean e;
    private final adcr f;
    private lfy g;
    private lfy h;
    
    public jjw(final Context context, final aceo b, final vax vax, final adcr f, final byte[] array) {
        this.a = LayoutInflater.from(context);
        this.b = b;
        final FrameLayout d = new FrameLayout(context);
        (this.d = (ViewGroup)d).setClickable(true);
        ((ViewGroup)d).setLayoutParams(new ViewGroup$LayoutParams(-1, -2));
        this.c = new acih(vax, (View)d);
        this.f = f;
    }
    
    private final lfy m() {
        if (this.e) {
            if (this.g == null) {
                this.g = new lfy(this.a.inflate(2131625778, this.d, false));
            }
            if (this.f.d()) {
                final adcr f = this.f;
                final View view = (View)this.g.g;
                f.c(view, f.a(view, null));
            }
            else {
                tmy.e((View)this.g.g, tmy.j(this.d.getContext(), 0));
            }
            return this.g;
        }
        if (this.h == null) {
            this.h = new lfy(this.a.inflate(2131625779, this.d, false));
        }
        return this.h;
    }
    
    public final View a() {
        return (View)this.d;
    }
    
    public final void c(final acir acir) {
        this.c.c();
    }
    
    public final TextView f() {
        return (TextView)this.m().b;
    }
    
    public final TextView g() {
        return (TextView)this.m().d;
    }
    
    public final TextView h() {
        return (TextView)this.m().h;
    }
    
    public final TextView i() {
        return (TextView)this.m().f;
    }
    
    public final TextView j() {
        return (TextView)this.m().a;
    }
    
    public final TextView l() {
        return (TextView)this.m().c;
    }
}
