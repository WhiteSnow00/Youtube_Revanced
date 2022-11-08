import java.util.Map;
import java.util.HashMap;
import com.google.android.libraries.youtube.ads.model.PlayerAd;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hgm
{
    public Object a;
    public Object b;
    
    public hgm() {
    }
    
    public hgm(final byte[] array) {
        this.b = aewp.a;
    }
    
    public hgm(final byte[] array, final byte[] array2) {
    }
    
    public hgm(final char[] array) {
        this.a = null;
        this.b = null;
    }
    
    public static boolean e(final PlayerAd playerAd, final sau sau) {
        boolean b = false;
        if (playerAd == null) {
            return false;
        }
        if (playerAd.D()) {
            if (sau != sau.d && sau != sau.e) {
                return false;
            }
            b = true;
        }
        else if (sau != sau.b) {
            return true;
        }
        return b;
    }
    
    public static dac i() {
        return new dac();
    }
    
    public final hgn a() {
        final Object a = this.a;
        if (a != null) {
            return new hgn((afcr)a, (aexq)this.b);
        }
        throw new IllegalStateException("Missing required properties: thumbnailList");
    }
    
    public final void b(final afcr a) {
        if (a != null) {
            this.a = a;
            return;
        }
        throw new NullPointerException("Null thumbnailList");
    }
    
    public final void c(final aioh b) {
        Label_0046: {
            if (b != null) {
                apqo apqo;
                if ((apqo = b.e) == null) {
                    apqo = apqo.a;
                }
                final int ab = aqql.ab(apqo.b);
                if (ab != 0) {
                    if (ab == 3) {
                        break Label_0046;
                    }
                }
                return;
            }
        }
        this.b = b;
    }
    
    public final void d(final amdk a) {
        Label_0028: {
            if (a != null) {
                final int dq = aqql.dq(a.i);
                if (dq != 0) {
                    if (dq == 3) {
                        break Label_0028;
                    }
                }
                return;
            }
        }
        this.a = a;
    }
    
    public final boolean f(final aioh b) {
        if (!aeda.v(this.b, b)) {
            this.b = b;
            return true;
        }
        return false;
    }
    
    public final boolean g(final amdk a) {
        if (!aeda.v(this.a, a)) {
            this.a = a;
            return true;
        }
        return false;
    }
    
    public final void h() {
        synchronized (this) {
            final Object b = this.b;
            if (b != null) {
                ((Map)b).clear();
            }
            final Object a = this.a;
            if (a != null) {
                ((Map)a).clear();
            }
        }
    }
    
    public final void j(final bhu bhu) {
        synchronized (this) {
            if (this.b == null) {
                this.b = new HashMap();
            }
            if (this.a == null) {
                this.a = new HashMap();
            }
            ((Map<Object, bhu>)this.b).put(bhu.a, bhu);
        }
    }
}
