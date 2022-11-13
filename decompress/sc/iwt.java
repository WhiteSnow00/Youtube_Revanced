import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iwt
{
    public View a;
    public ImageView b;
    public TextView c;
    public TextView d;
    public boolean e;
    public toz f;
    private final acgs g;
    private boolean h;
    
    public iwt(final acgs g) {
        this.g = g;
        this.e = false;
        this.h = true;
    }
    
    public final void a(final boolean h) {
        if (this.h == h) {
            return;
        }
        this.h = h;
        tpe.v(this.a, h);
        tpe.v((View)this.c, this.h);
        tpe.v((View)this.d, this.h);
    }
    
    public final void b(final CharSequence text, final CharSequence text2, final aotp aotp) {
        tbi.f();
        final TextView c = this.c;
        if (c != null && this.d != null) {
            if (this.b != null) {
                c.setText(text);
                this.d.setText(text2);
                if (aotp == null) {
                    this.g.d(this.b);
                    return;
                }
                this.g.j(this.b, aotp, acgo.b);
            }
        }
    }
}
