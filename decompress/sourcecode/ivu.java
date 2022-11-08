import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ivu
{
    public View a;
    public ImageView b;
    public TextView c;
    public TextView d;
    public boolean e;
    public tmt f;
    private final aceo g;
    private boolean h;
    
    public ivu(final aceo g) {
        this.g = g;
        this.e = false;
        this.h = true;
    }
    
    public final void a(final boolean h) {
        if (this.h == h) {
            return;
        }
        this.h = h;
        tmy.v(this.a, h);
        tmy.v((View)this.c, this.h);
        tmy.v((View)this.d, this.h);
    }
    
    public final void b(final CharSequence text, final CharSequence text2, final aorm aorm) {
        szc.f();
        final TextView c = this.c;
        if (c != null && this.d != null) {
            if (this.b != null) {
                c.setText(text);
                this.d.setText(text2);
                if (aorm == null) {
                    this.g.d(this.b);
                    return;
                }
                this.g.j(this.b, aorm, acek.b);
            }
        }
    }
}
