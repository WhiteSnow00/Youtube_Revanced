import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

class gje
{
    public final FrameLayout c;
    public final RelativeLayout d;
    public final ImageView e;
    public final TextView f;
    public glx g;
    final gjf h;
    
    public gje(final gjf h, final View view) {
        this.h = h;
        this.c = (FrameLayout)view.findViewById(2131429469);
        this.d = (RelativeLayout)view.findViewById(2131429412);
        this.e = (ImageView)view.findViewById(2131429270);
        this.f = (TextView)view.findViewById(2131429479);
    }
    
    public void a(int ordinal) {
        final glx g = this.h.a.get(ordinal);
        g.getClass();
        this.g = g;
        if (this.e != null) {
            ordinal = g.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        this.e.setImageResource(2131233790);
                    }
                }
                else {
                    this.e.setImageResource(2131233777);
                }
            }
            else {
                this.e.setImageResource(2131233724);
            }
        }
        final TextView f = this.f;
        if (f != null) {
            f.setText(this.h.b.getContext().getResources().getText(g.d));
        }
    }
}
