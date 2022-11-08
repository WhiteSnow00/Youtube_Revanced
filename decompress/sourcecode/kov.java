import android.net.Uri;
import android.view.View$OnLayoutChangeListener;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kov
{
    public final Context a;
    public final ImageView b;
    public final acek c;
    private final aceo d;
    private final double e;
    
    public kov(final Context a, final ImageView b, final aceo d, final acek c, final double e) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
        this.e = e;
    }
    
    public final void a(final aorm aorm, final boolean b) {
        this.b.setImageDrawable((Drawable)null);
        if (this.b.getWidth() == 0) {
            this.b.addOnLayoutChangeListener((View$OnLayoutChangeListener)new kou(this, aorm, b));
            return;
        }
        Uri uri;
        if (b) {
            final double n = this.b.getWidth();
            final double e = this.e;
            Double.isNaN(n);
            final int n2 = (int)(n / e);
            final double n3 = n2;
            Double.isNaN(n3);
            uri = actc.E(aorm, (int)(n3 * 1.7777777777777777), n2);
        }
        else {
            uri = actc.E(aorm, this.b.getWidth(), this.b.getHeight());
        }
        final kot kot = new kot(this, b, 0);
        if (uri != null) {
            this.d.k(uri, (szx)kot);
            return;
        }
        ((szx)kot).rX((Object)null, (Exception)null);
    }
}
