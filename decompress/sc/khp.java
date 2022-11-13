import android.view.View;
import android.content.Context;
import android.view.LayoutInflater;
import android.app.Activity;
import android.widget.TextView;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class khp implements acko
{
    public final ViewGroup a;
    private final TextView b;
    private final TextView c;
    
    public khp(final Activity activity, final ViewGroup viewGroup) {
        final ViewGroup a = (ViewGroup)LayoutInflater.from((Context)activity).inflate(2131625459, viewGroup, false);
        this.a = a;
        this.b = (TextView)a.findViewById(2131431588);
        this.c = (TextView)a.findViewById(2131431586);
    }
    
    @Override
    public final View a() {
        return (View)this.a;
    }
    
    public final void b(final ackm ackm, final aoit aoit) {
        this.b.setText((CharSequence)aoit.c);
        this.c.setText((CharSequence)aoit.d);
        final wyw a = ackm.a;
        if (a != null) {
            ahhu ahhu;
            if ((ahhu = aoit.e) == null) {
                ahhu = ahhu.a;
            }
            if ((ahhu.b & 0x1) != 0x0) {
                ahhu ahhu2;
                if ((ahhu2 = aoit.e) == null) {
                    ahhu2 = ahhu.a;
                }
                a.l((wzz)new wyt(xaa.c(ahhu2.c)));
            }
        }
    }
    
    @Override
    public final void c(final acku acku) {
    }
    
    @Override
    public final /* bridge */ void mN(final ackm ackm, final Object o) {
        this.b(ackm, (aoit)o);
    }
}
