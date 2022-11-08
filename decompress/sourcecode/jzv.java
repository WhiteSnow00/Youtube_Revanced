import android.widget.ImageView$ScaleType;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.os.Handler;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jzv extends gec
{
    public String d;
    private final HashSet e;
    private final Handler f;
    private final aucj g;
    
    public jzv(final Handler f, final aucj g, final byte[] array, final byte[] array2) {
        this.e = new HashSet();
        this.g = g;
        this.f = f;
    }
    
    public final void a(final String s) {
        this.e.add(s);
        if (TextUtils.equals((CharSequence)s, (CharSequence)this.d)) {
            this.k();
        }
    }
    
    public final void b(final String s, final Bitmap bitmap) {
        this.c(s, bitmap, ImageView$ScaleType.CENTER_CROP);
    }
    
    public final void c(final String s, final Bitmap bitmap, final ImageView$ScaleType imageView$ScaleType) {
        if (this.g.k(s) == null) {
            final foi l = this.g.l(s);
            long a;
            if (l == null) {
                a = 0L;
            }
            else {
                a = l.a;
            }
            this.g.m(s, a, bitmap, imageView$ScaleType);
        }
        if (TextUtils.equals((CharSequence)s, (CharSequence)this.d)) {
            this.k();
        }
    }
    
    public final boolean l(final ged ged, final int n) {
        final gle b = ged.b;
        if (!b.q()) {
            return true;
        }
        if (n == 1) {
            final String i = b.i();
            this.d = i;
            this.e.remove(i);
            this.f.postDelayed((Runnable)new jku(this, b, 13), 5000L);
            return true;
        }
        if (n == 2) {
            final String d = this.d;
            return (d != null && (this.e.contains(d) || this.g.k(this.d) != null)) || this.g.a;
        }
        return true;
    }
}
