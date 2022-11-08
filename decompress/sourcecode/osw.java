import java.util.Map;
import java.io.File;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicBoolean;
import android.content.Context;
import java.util.WeakHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class osw
{
    public final Object a;
    public final Object b;
    public Object c;
    
    public osw(final acha a) {
        this.a = a;
        this.b = new WeakHashMap();
    }
    
    public osw(final Context context) {
        this.b = new Object();
        this.a = context.getApplicationContext();
    }
    
    public osw(final Context context, final byte[] array) {
        this.b = new qan((char[])null);
        qcv.j(context != null, "Context cannot be null", new Object[0]);
        this.a = context.getApplicationContext();
    }
    
    public osw(final String a) {
        this.b = new AtomicBoolean(true);
        this.a = a;
    }
    
    static final Uri m(final String s) {
        return acha.g(1, "comment", s, "creator_heart_button");
    }
    
    static final Uri n(final String s) {
        return acha.g(1, "comment", s, "like_button");
    }
    
    public static final Uri o(final String s) {
        return acha.g(1, "comment", s, "poll_renderer");
    }
    
    public static final Uri p(final String s) {
        return acha.g(1, "comment", s, "poll_status");
    }
    
    private static final Uri r(final String s) {
        return acha.g(1, "comment", s, "dislike_button");
    }
    
    public final File a() {
        synchronized (this.b) {
            if (this.c == null) {
                this.c = ((Context)this.a).getDataDir();
            }
            final Object c = this.c;
            monitorexit(this.b);
            return (File)c;
        }
    }
    
    public final aibk b(final String s, final aioi aioi, final boolean b) {
        aibc aibc;
        if ((aibc = aioi.d) == null) {
            aibc = aibc.a;
        }
        aibk aibk;
        if ((aibc.b & 0x2) != 0x0) {
            aibc aibc2;
            if ((aibc2 = aioi.d) == null) {
                aibc2 = aibc.a;
            }
            if ((aibk = aibc2.d) == null) {
                aibk = aibk.a;
            }
        }
        else {
            aibk = null;
        }
        return (aibk)this.f(r(s), aibk, aibk.class, aioi.h, b);
    }
    
    public final aibk c(final String s, final aioi aioi, final boolean b) {
        aibc aibc;
        if ((aibc = aioi.c) == null) {
            aibc = aibc.a;
        }
        aibk aibk;
        if ((aibc.b & 0x2) != 0x0) {
            aibc aibc2;
            if ((aibc2 = aioi.c) == null) {
                aibc2 = aibc.a;
            }
            if ((aibk = aibc2.d) == null) {
                aibk = aibk.a;
            }
        }
        else {
            aibk = null;
        }
        return (aibk)this.f(n(s), aibk, aibk.class, aioi.h, b);
    }
    
    public final aipj d(final aipu aipu, final boolean b) {
        ahya ahya;
        if ((ahya = aipu.B) == null) {
            ahya = ahya.a;
        }
        aniz a;
        if (ahya.b == 99391126) {
            ahya ahya2;
            if ((ahya2 = aipu.B) == null) {
                ahya2 = ahya.a;
            }
            if (ahya2.b == 99391126) {
                a = (aniz)ahya2.c;
            }
            else {
                a = aniz.a;
            }
        }
        else {
            a = null;
        }
        if (a != null) {
            aipj aipj;
            if ((aipj = aipj.b(aipu.H)) == null) {
                aipj = aipj.a;
            }
            if (aipj != aipj.a) {
                final Uri p2 = p(aipu.i);
                aipj aipj2;
                if ((aipj2 = aipj.b(aipu.H)) == null) {
                    aipj2 = aipj.a;
                }
                return (aipj)this.f(p2, aipj2, aipj.class, a.k, b);
            }
        }
        aipj aipj3;
        if ((aipj3 = aipj.b(aipu.H)) == null) {
            aipj3 = aipj.a;
        }
        return aipj3;
    }
    
    public final aiyv e(final String s, final aioi aioi, final boolean b) {
        aiyw aiyw;
        if ((aiyw = aioi.f) == null) {
            aiyw = aiyw.a;
        }
        aiyv aiyv;
        if ((aiyw.b & 0x1) != 0x0) {
            aiyw aiyw2;
            if ((aiyw2 = aioi.f) == null) {
                aiyw2 = aiyw.a;
            }
            if ((aiyv = aiyw2.c) == null) {
                aiyv = aiyv.a;
            }
        }
        else {
            aiyv = null;
        }
        return (aiyv)this.f(m(s), aiyv, aiyv.class, aioi.h, b);
    }
    
    public final Object f(final Uri uri, final Object o, final Class clazz, final long n, final boolean b) {
        if (o != null) {
            if (n != 0L) {
                final sub sub = (sub)((acha)this.a).b(uri);
                if (sub != null && sub.b >= n) {
                    return clazz.cast(sub.a);
                }
                if ((sub == null && b) || (sub != null && sub.b < n)) {
                    ((acha)this.a).d(uri, (acgy)new sub(o, n));
                }
            }
        }
        return o;
    }
    
    public final void g(final Uri uri, final suc suc) {
        final sua sua = new sua(this, suc, (byte[])null);
        ((acha)this.a).h(uri, (acgz)sua);
        ((Map<suc, acgz>)this.b).put(suc, (acgz)sua);
    }
    
    public final void h(final suc suc) {
        final acgz acgz = ((Map<K, acgz>)this.b).remove(suc);
        if (acgz != null) {
            ((acha)this.a).f(acgz);
        }
    }
    
    public final void i(final String s, final long n, final aibk aibk, final aibk aibk2) {
        if (n == 0L) {
            return;
        }
        if (aibk != null) {
            ((acha)this.a).c(n(s), (acgy)new sub((Object)aibk, n));
        }
        if (aibk2 != null) {
            ((acha)this.a).c(r(s), (acgy)new sub((Object)aibk2, n));
        }
    }
    
    public final void j(final String s, final long n, final aiyv aiyv) {
        if (n == 0L) {
            return;
        }
        if (aiyv != null) {
            ((acha)this.a).c(m(s), (acgy)new sub((Object)aiyv, n));
        }
    }
    
    public final void k(final String s, final aniz aniz) {
        if (aniz != null) {
            if (aniz.k != 0L) {
                ((acha)this.a).c(o(s), (acgy)new sub((Object)aniz, aniz.k));
            }
        }
    }
    
    public final void l(final String s, final long n, final aipj aipj) {
        if (n != 0L) {
            if (aipj != aipj.a) {
                ((acha)this.a).c(p(s), (acgy)new sub((Object)aipj, n));
            }
        }
    }
    
    public final qmq q() {
        return new qmq(this, (byte[])null, (byte[])null);
    }
}
