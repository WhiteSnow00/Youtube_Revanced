import android.view.View$OnAttachStateChangeListener;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kxx
{
    public boolean a;
    public CharSequence b;
    private final TextView c;
    private final Runnable d;
    
    public kxx(final TextView c) {
        this.a = false;
        (this.c = c).addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new ie(this, 8));
        this.d = new kpa(this, c, 10);
    }
    
    public final void a() {
        this.c.removeCallbacks(this.d);
        this.c.setText(this.b);
        this.a = false;
    }
    
    public final void b(final CharSequence charSequence) {
        this.b = charSequence;
        if (!this.a) {
            this.c.setText(charSequence);
        }
    }
    
    public final void c(final CharSequence text, final long n) {
        this.a = true;
        this.c.setText(text);
        this.c.postDelayed(this.d, n);
    }
}
