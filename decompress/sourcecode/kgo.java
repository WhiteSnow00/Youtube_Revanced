import android.view.View;
import android.content.Context;
import android.view.LayoutInflater;
import android.app.Activity;
import android.widget.TextView;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kgo implements acil
{
    public final ViewGroup a;
    private final TextView b;
    private final TextView c;
    
    public kgo(final Activity activity, final ViewGroup viewGroup) {
        final ViewGroup a = (ViewGroup)LayoutInflater.from((Context)activity).inflate(2131625454, viewGroup, false);
        this.a = a;
        this.b = (TextView)a.findViewById(2131431585);
        this.c = (TextView)a.findViewById(2131431583);
    }
    
    public final View a() {
        return (View)this.a;
    }
    
    public final void b(final acij acij, final aogq aogq) {
        this.b.setText((CharSequence)aogq.c);
        this.c.setText((CharSequence)aogq.d);
        final wwv a = ((wwx)acij).a;
        if (a != null) {
            ahfw ahfw;
            if ((ahfw = aogq.e) == null) {
                ahfw = ahfw.a;
            }
            if ((ahfw.b & 0x1) != 0x0) {
                ahfw ahfw2;
                if ((ahfw2 = aogq.e) == null) {
                    ahfw2 = ahfw.a;
                }
                a.l((wxz)new wws(wya.c(ahfw2.c)));
            }
        }
    }
    
    public final void c(final acir acir) {
    }
}
