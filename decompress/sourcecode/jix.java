import android.graphics.drawable.Drawable;
import android.view.View;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import android.app.Activity;
import androidx.cardview.widget.CardView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jix extends acja
{
    public final CardView a;
    private final Activity b;
    private final TextView c;
    private final acih d;
    private final acng e;
    private final float f;
    
    public jix(final Activity b, final vax vax, final acng e, final ViewGroup viewGroup) {
        this.b = b;
        final float f = (float)b.getResources().getDimensionPixelSize(2131169344);
        this.f = f;
        this.e = e;
        final CardView a = (CardView)LayoutInflater.from((Context)b).inflate(2131625284, viewGroup, false);
        (this.a = a).e(f);
        final TextView c = (TextView)a.findViewById(2131431950);
        c.getClass();
        this.c = c;
        this.d = new acih(vax, (View)a);
    }
    
    public final View a() {
        return (View)this.a;
    }
    
    public final void c(final acir acir) {
        this.d.c();
    }
}
