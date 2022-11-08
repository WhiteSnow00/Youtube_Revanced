import com.google.android.libraries.glide.fife.FifeUrl;
import java.security.MessageDigest;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

final class oxa implements ddj
{
    private final owu b;
    private final int c;
    private final int d;
    private final owz e;
    private String f;
    
    public oxa(final owu b, final int c, final int d, final owz e) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    private final String b() {
        synchronized (this) {
            if (this.f == null) {
                this.f = Uri.parse(this.e.a().b()).getPath();
            }
            return this.f;
        }
    }
    
    public final void a(final MessageDigest messageDigest) {
        final FifeUrl a = this.b.a;
        messageDigest.update(this.b().getBytes(oxa.a));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof oxa) {
            final oxa oxa = (oxa)o;
            if (this.b.equals(oxa.b) && this.c == oxa.c && this.d == oxa.d) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return dpg.g(this.b, dpg.f(this.c, dpg.e(this.d)));
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final int c = this.c;
        final int d = this.d;
        final StringBuilder sb = new StringBuilder("FifeUrlKey{fifeModel='");
        sb.append(value);
        sb.append("', width='");
        sb.append(c);
        sb.append("', height='");
        sb.append(d);
        sb.append("'}");
        return sb.toString();
    }
}
