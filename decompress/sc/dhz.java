import java.util.Map;
import android.net.Uri;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.net.URL;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dhz implements ddk
{
    public URL b;
    private final dia c;
    private final URL d;
    private final String e;
    private String f;
    private volatile byte[] g;
    private int h;
    
    public dhz(final String s) {
        this(s, dia.a);
    }
    
    public dhz(final String e, final dia c) {
        this.d = null;
        clm.j(e);
        this.e = e;
        clm.h((Object)c);
        this.c = c;
    }
    
    public dhz(final URL d) {
        final dia a = dia.a;
        clm.h((Object)d);
        this.d = d;
        this.e = null;
        clm.h((Object)a);
        this.c = a;
    }
    
    @Override
    public final void a(final MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = this.b().getBytes(dhz.a);
        }
        messageDigest.update(this.g);
    }
    
    public final String b() {
        final String e = this.e;
        if (e != null) {
            return e;
        }
        final URL d = this.d;
        clm.h((Object)d);
        return d.toString();
    }
    
    public final String c() {
        if (TextUtils.isEmpty((CharSequence)this.f)) {
            String s;
            if (TextUtils.isEmpty((CharSequence)(s = this.e))) {
                final URL d = this.d;
                clm.h((Object)d);
                s = d.toString();
            }
            this.f = Uri.encode(s, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f;
    }
    
    public final Map d() {
        return this.c.a();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof dhz) {
            final dhz dhz = (dhz)o;
            if (this.b().equals(dhz.b()) && this.c.equals(dhz.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        int h;
        if ((h = this.h) == 0) {
            final int hashCode = this.b().hashCode();
            this.h = hashCode;
            h = hashCode * 31 + this.c.hashCode();
            this.h = h;
        }
        return h;
    }
    
    @Override
    public final String toString() {
        return this.b();
    }
}
