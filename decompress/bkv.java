import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import android.media.MediaDrm$MediaDrmStateException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bkv
{
    public bkv() {
        final boolean a = dyp.a;
    }
    
    public static int a(final Throwable t) {
        return bax.i(bax.j(((MediaDrm$MediaDrmStateException)t).getDiagnosticInfo()));
    }
    
    public static boolean b(final Throwable t) {
        return t instanceof MediaDrm$MediaDrmStateException;
    }
    
    public static void c(final AtomicReference atomicReference, final Object o) {
        while (!atomicReference.compareAndSet(null, o)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
    }
    
    public static dva d(final dsx dsx) {
        final dwf b = dwh.b;
        return (dva)new dty(dsx);
    }
    
    public static dwk e(final dsx dsx, final msr msr, final dwk dwk) {
        return f(msr, dsx.i(), dwk, dsx.k);
    }
    
    public static dwk f(final msr msr, final String s, final dwk dwk, final cya cya) {
        if (dwk == null) {
            return null;
        }
        if (s == null) {
            msr.s(dwk);
            return null;
        }
        dwk.a("log_tag", s);
        if (cya == null) {
            return dwk;
        }
        final Map w = msr.w(cya);
        if (w == null) {
            return dwk;
        }
        for (final Map.Entry<String, V> entry : w.entrySet()) {
            dwk.a(entry.getKey(), (String)entry.getValue());
        }
        return dwk;
    }
}
