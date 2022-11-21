import android.text.TextUtils;
import android.media.session.MediaSessionManager$RemoteUserInfo;

// 
// Decompiled by Procyon v0.6.0
// 

final class axg
{
    private String a;
    private int b;
    private int c;
    
    public axg(final String a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public axg(final String s, final int n, final int n2, final byte[] array) {
        this(s, n, n2);
        new MediaSessionManager$RemoteUserInfo(s, n, n2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof axg)) {
            return false;
        }
        final axg axg = (axg)o;
        if (this.b >= 0 && axg.b >= 0) {
            return TextUtils.equals((CharSequence)this.a, (CharSequence)axg.a) && this.b == axg.b && this.c == axg.c;
        }
        return TextUtils.equals((CharSequence)this.a, (CharSequence)axg.a) && this.c == axg.c;
    }
    
    @Override
    public final int hashCode() {
        return akq.a(new Object[] { this.a, this.c });
    }
}
