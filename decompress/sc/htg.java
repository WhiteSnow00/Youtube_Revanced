import android.text.TextUtils;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class htg implements acjb
{
    public static final Uri a;
    public final Uri b;
    public final String c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final Boolean h;
    public final aomw i;
    public final aona j;
    public final aidi k;
    
    static {
        a = acjd.g(4, "subscribe_button", "channelId");
    }
    
    public htg() {
    }
    
    public htg(final Uri b, final String c, final long d, final long e, final boolean f, final boolean g, final Boolean h, final aomw i, final aona j, final aidi k) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public static Uri a(final String s) {
        adkp.H(TextUtils.isEmpty((CharSequence)s) ^ true);
        return htg.a.buildUpon().appendPath(s).build();
    }
    
    public static htf b(final aome aome) {
        final htf c = c(aome.f);
        c.d = aome.l;
        aomc aomc;
        if ((aomc = aome.p) == null) {
            aomc = aomc.a;
        }
        final int b = aomc.b;
        final aidi aidi = null;
        aona a;
        if (b == 119226798) {
            aomc aomc2;
            if ((aomc2 = aome.p) == null) {
                aomc2 = aomc.a;
            }
            if (aomc2.b == 119226798) {
                a = (aona)aomc2.c;
            }
            else {
                a = aona.a;
            }
        }
        else {
            a = null;
        }
        c.f = a;
        final aomc p = aome.p;
        aomc a2;
        if (p == null) {
            a2 = aomc.a;
        }
        else {
            a2 = p;
        }
        aomw a4;
        if (a2.b == 136076983) {
            aomc a3;
            if ((a3 = p) == null) {
                a3 = aomc.a;
            }
            if (a3.b == 136076983) {
                a4 = (aomw)a3.c;
            }
            else {
                a4 = aomw.a;
            }
        }
        else {
            a4 = null;
        }
        c.e = a4;
        aida aida;
        if ((aida = aome.o) == null) {
            aida = aida.a;
        }
        aidi g = aidi;
        if ((aida.b & 0x2) != 0x0) {
            aida aida2;
            if ((aida2 = aome.o) == null) {
                aida2 = aida.a;
            }
            if ((g = aida2.d) == null) {
                g = aidi.a;
            }
        }
        c.g = g;
        c.b(aome.F);
        c.d(aome.G);
        return c;
    }
    
    public static htf c(final String c) {
        adkp.H(TextUtils.isEmpty((CharSequence)c) ^ true);
        final htf htf = new htf();
        if (c == null) {
            throw new NullPointerException("Null channelId");
        }
        htf.c = c;
        htf.a = (oby)new tvc(0);
        final Uri a = a(c);
        if (a != null) {
            htf.b = a;
            htf.c(false);
            htf.e(false);
            htf.b(0L);
            htf.d(0L);
            return htf;
        }
        throw new NullPointerException("Null uri");
    }
    
    public static htg d(final acjd acjd, final String s) {
        final acjb b = acjd.b(a(s));
        if (b instanceof htg) {
            return (htg)b;
        }
        return null;
    }
    
    @Override
    public final acjb e(final acjb acjb) {
        if (!(acjb instanceof htg)) {
            return this;
        }
        final htg htg = (htg)acjb;
        final long d = this.d;
        long e;
        long n;
        if (d <= 0L && htg.d <= 0L) {
            e = this.e;
            n = htg.e;
        }
        else {
            n = htg.d;
            e = d;
        }
        htg htg2 = null;
        htg htg3 = null;
        Label_0103: {
            if (e != 0L) {
                if (n == 0L || n > e) {
                    htg2 = this;
                    htg3 = htg;
                    break Label_0103;
                }
            }
            htg3 = this;
            htg2 = htg;
        }
        final htf f = htg3.f();
        Boolean d2;
        if ((d2 = htg3.h) == null) {
            d2 = htg2.h;
        }
        f.d = d2;
        f.d(Math.max(d, htg.d));
        f.b(Math.max(this.e, htg.e));
        if (htg3.i == null && htg3.j == null && htg3.k == null) {
            f.e = htg2.i;
            f.f = htg2.j;
            f.g = htg2.k;
        }
        return f.a();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof htg) {
            final htg htg = (htg)o;
            if (this.b.equals((Object)htg.b) && this.c.equals(htg.c) && this.d == htg.d && this.e == htg.e && this.f == htg.f && this.g == htg.g) {
                final Boolean h = this.h;
                if (h == null) {
                    if (htg.h != null) {
                        return false;
                    }
                }
                else if (!h.equals(htg.h)) {
                    return false;
                }
                final aomw i = this.i;
                if (i == null) {
                    if (htg.i != null) {
                        return false;
                    }
                }
                else if (!i.equals((Object)htg.i)) {
                    return false;
                }
                final aona j = this.j;
                if (j == null) {
                    if (htg.j != null) {
                        return false;
                    }
                }
                else if (!j.equals((Object)htg.j)) {
                    return false;
                }
                final aidi k = this.k;
                final aidi l = htg.k;
                if (k == null) {
                    if (l != null) {
                        return false;
                    }
                }
                else if (!((ahbh)k).equals((Object)l)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
    
    public final htf f() {
        return new htf(this);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.b.hashCode();
        final int hashCode2 = this.c.hashCode();
        final long d = this.d;
        final long e = this.e;
        final boolean f = this.f;
        int n = 1237;
        int n2;
        if (!f) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        if (this.g) {
            n = 1231;
        }
        final Boolean h = this.h;
        int hashCode3 = 0;
        int hashCode4;
        if (h == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = h.hashCode();
        }
        final int n3 = (int)(d ^ d >>> 32);
        final int n4 = (int)(e ^ e >>> 32);
        final aomw i = this.i;
        int hashCode5;
        if (i == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = i.hashCode();
        }
        final aona j = this.j;
        int hashCode6;
        if (j == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = j.hashCode();
        }
        final aidi k = this.k;
        if (k != null) {
            hashCode3 = ((ahbh)k).hashCode();
        }
        return (((((((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ n3) * 1000003 ^ n4) * 1000003 ^ n2) * 1000003 ^ n) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ hashCode3;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final String c = this.c;
        final long d = this.d;
        final long e = this.e;
        final boolean f = this.f;
        final boolean g = this.g;
        final Boolean h = this.h;
        final String value2 = String.valueOf(this.i);
        final String value3 = String.valueOf(this.j);
        final String value4 = String.valueOf(this.k);
        final StringBuilder sb = new StringBuilder("SubscribeButtonStateModel{uri=");
        sb.append(value);
        sb.append(", channelId=");
        sb.append(c);
        sb.append(", serverTimestamp=");
        sb.append(d);
        sb.append(", clientTimestamp=");
        sb.append(e);
        sb.append(", subscriptionStateChanged=");
        sb.append(f);
        sb.append(", didRequireSignIn=");
        sb.append(g);
        sb.append(", subscribed=");
        sb.append(h);
        sb.append(", subscriptionNotificationToggleButtonRenderer=");
        sb.append(value2);
        sb.append(", subscriptionNotificationOptionsRenderer=");
        sb.append(value3);
        sb.append(", toggleButtonRenderer=");
        sb.append(value4);
        sb.append("}");
        return sb.toString();
    }
}
