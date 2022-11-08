import android.util.Pair;
import android.os.Handler;
import java.util.HashMap;
import java.util.UUID;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.DrmInitData$SchemeData;
import android.os.HandlerThread;
import android.os.ConditionVariable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lxj
{
    private static final ayf b;
    private static final Long c;
    public final ConditionVariable a;
    private final lxs d;
    private final HandlerThread e;
    private final bkz f;
    private final trg g;
    
    static {
        final aye aye = new aye();
        aye.n = new DrmInitData(new DrmInitData$SchemeData[0]);
        b = aye.a();
        c = 2592000L;
    }
    
    public lxj(final UUID uuid, final bkz f, final ynh ynh, final HashMap hashMap, final xyl xyl, final byte[] array, final byte[] array2) {
        final HandlerThread e = new HandlerThread("OfflineDrmLicenseHelper");
        (this.e = e).start();
        this.a = new ConditionVariable();
        final trg g = new trg();
        this.g = g;
        this.f = f;
        g.o(new Handler(e.getLooper()), (bkm)new lxh(this));
        this.d = new lxs(uuid, ynh, hashMap, (lxq)new lxi(), lxp.a, false);
    }
    
    private final lxn g(final int n, final byte[] array, final ayf ayf) {
        this.d.j(this.f, false);
        this.d.k(n, array);
        this.a.close();
        if (this.d.a(ayf) != 1) {
            final bkl f = this.d.f(this.g, ayf);
            this.a.block();
            return (lxn)f;
        }
        throw new bkk((Throwable)new Exception("Could not acquire session"), 6001);
    }
    
    private final byte[] h(final int n, final byte[] array, final ayf ayf) {
        this.d.e(this.e.getLooper(), bgz.a);
        this.d.c();
        final lxn g = this.g(n, array, ayf);
        final bkk c = g.c();
        final byte[] l = g.l;
        g.p(this.g);
        this.d.d();
        if (c == null) {
            return (byte[])dk.d((Object)l);
        }
        throw c;
    }
    
    public final Pair a(final byte[] array) {
        synchronized (this) {
            this.d.e(this.e.getLooper(), bgz.a);
            this.d.c();
            final lxn g = this.g(1, array, lxj.b);
            final bkk c = g.c();
            final Pair c2 = bkt.c((bkl)g);
            g.p(this.g);
            this.d.d();
            if (c == null) {
                dk.d((Object)c2);
                final long longValue = (long)c2.first;
                final Long c3 = lxj.c;
                return Pair.create((Object)Math.min(longValue, c3), (Object)Math.min((long)c2.second, c3));
            }
            if (c.getCause() instanceof blh) {
                final Long value = 0L;
                return Pair.create((Object)value, (Object)value);
            }
            throw c;
        }
    }
    
    public final String b() {
        monitorenter(this);
        try {
            return this.f.n();
        }
        finally {
            monitorexit(this);
            return "";
        }
    }
    
    public final void c() {
        this.e.quit();
    }
    
    public final void d(final byte[] array) {
        synchronized (this) {
            dk.d((Object)array);
            this.h(3, array, lxj.b);
        }
    }
    
    public final byte[] e(final ayf ayf) {
        synchronized (this) {
            dk.f(ayf.q != null);
            return this.h(2, null, ayf);
        }
    }
    
    public final byte[] f(byte[] h) {
        synchronized (this) {
            dk.d((Object)h);
            h = this.h(2, h, lxj.b);
            return h;
        }
    }
}
