import com.google.android.libraries.youtube.mdx.model.ScreenId;
import java.util.Collection;
import java.util.List;
import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arfi
{
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    
    public arfi() {
    }
    
    public arfi(final String s, final String s2, final String s3, final String s4, final float n, final float n2) {
        this(s, s2, s3, s4, n, n2, null);
    }
    
    public arfi(final String a, final String b, final String c, final String d, final Float e, final Float f, final Float g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public arfi(final xki xki) {
        this.f = xki.b;
        this.a = xki.f;
        this.c = xki.c;
        this.b = xki.d;
        this.g = xki.e;
        this.d = xki.g;
    }
    
    final boolean a(final String s, final String s2, final String s3, final String s4) {
        final Object a = this.a;
        final boolean b = false;
        if (a != null) {
            final boolean b2 = b;
            if (!((String)a).equals(s)) {
                return b2;
            }
        }
        final Object b3 = this.b;
        if (b3 != null) {
            final boolean b2 = b;
            if (!((String)b3).equals(s2)) {
                return b2;
            }
        }
        final Object c = this.c;
        if (c != null) {
            final boolean b2 = b;
            if (!((String)c).equals(s3)) {
                return b2;
            }
        }
        final Object d = this.d;
        boolean b2;
        if (d != null) {
            if (((String)d).equals(s4)) {
                return true;
            }
            b2 = b;
        }
        else {
            b2 = true;
        }
        return b2;
    }
    
    public final aesf b() {
        final Object b = this.b;
        if (b != null) {
            this.f = ((afgc)b).g();
        }
        else if (this.f == null) {
            this.f = afgh.q();
        }
        final Object d = this.d;
        if (d != null) {
            final Object a = this.a;
            if (a != null) {
                final Object c = this.c;
                if (c != null) {
                    final Object g = this.g;
                    if (g != null) {
                        return new aesf((String)d, (MessageLite)a, (aese)c, (afgh)this.f, (qqj)g, (afxj)this.e);
                    }
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" name");
        }
        if (this.a == null) {
            sb.append(" schema");
        }
        if (this.c == null) {
            sb.append(" storage");
        }
        if (this.g == null) {
            sb.append(" handler");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void c(final MessageLite a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null schema");
    }
    
    public final acac d() {
        final Object d = this.d;
        if (d != null) {
            final Object a = this.a;
            if (a != null) {
                final Object g = this.g;
                if (g != null) {
                    return new acac((atnb)d, (String)a, (akyz)this.f, (aisc)this.c, (afgh)g, (akyr)this.b, (ange)this.e);
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" isDeadProvider");
        }
        if (this.a == null) {
            sb.append(" videoId");
        }
        if (this.g == null) {
            sb.append(" cueRanges");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void e(final List list) {
        this.g = afgh.o(list);
    }
    
    public final xki f() {
        final Object f = this.f;
        if (f != null) {
            final Object c = this.c;
            if (c != null) {
                final Object b = this.b;
                if (b != null) {
                    final Object g = this.g;
                    if (g != null) {
                        final xki xki = new xki((xkw)f, (xlc)this.a, (String)c, (ScreenId)b, (xkk)g, (xlc)this.d);
                        xki.a = (xkl)this.e;
                        return xki;
                    }
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.f == null) {
            sb.append(" pairingInfo");
        }
        if (this.c == null) {
            sb.append(" name");
        }
        if (this.b == null) {
            sb.append(" screenId");
        }
        if (this.g == null) {
            sb.append(" loungeDeviceId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void g(final xkk g) {
        if (g != null) {
            this.g = g;
            return;
        }
        throw new NullPointerException("Null loungeDeviceId");
    }
    
    public final void h(final String c) {
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null name");
    }
    
    public final void i(final xkw f) {
        if (f != null) {
            this.f = f;
            return;
        }
        throw new NullPointerException("Null pairingInfo");
    }
    
    public final void j(final ScreenId b) {
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null screenId");
    }
}
