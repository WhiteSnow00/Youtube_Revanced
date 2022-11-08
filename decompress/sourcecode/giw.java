import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

class giw
{
    public final FrameLayout c;
    public final RelativeLayout d;
    public final ImageView e;
    public final TextView f;
    public glp g;
    final /* synthetic */ gix h;
    
    public giw(final gix h, final View view) {
        this.h = h;
        this.c = (FrameLayout)view.findViewById(2131429469);
        this.d = (RelativeLayout)view.findViewById(2131429412);
        this.e = (ImageView)view.findViewById(2131429270);
        this.f = (TextView)view.findViewById(2131429479);
    }
    
    public void a(int ordinal) {
        final glp g = this.h.a.get(ordinal);
        g.getClass();
        this.g = g;
        if (this.e != null) {
            ordinal = g.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        this.e.setImageResource(2131233788);
                    }
                }
                else {
                    this.e.setImageResource(2131233775);
                }
            }
            else {
                this.e.setImageResource(2131233722);
            }
        }
        final TextView f = this.f;
        if (f != null) {
            f.setText(this.h.b.getContext().getResources().getText(g.d));
        }
    }
}
