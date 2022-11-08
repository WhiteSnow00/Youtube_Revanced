import java.util.Iterator;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adge
{
    public int a;
    public long b;
    public final Object c;
    public final Object d;
    public Object e;
    
    public adge(final adgw c, final atjj d) {
        this.c = c;
        this.d = d;
        this.a = Math.min(10, ((tmm)c.e).d());
    }
    
    public adge(final dmk d, final bkt c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.d = d;
        this.c = c;
        this.e = ccj.a;
    }
    
    public static void b(final adgw adgw, final atjj atjj) {
        final int a = adgb.a;
        for (final File file : adio.w(adgw)) {
            final ahsm s = adio.s(file);
            if (s != null) {
                s.toString();
                final aklo d = aklq.d();
                ((agza)d).copyOnWrite();
                aklq.bj((aklq)d.instance, s);
                ((wvu)atjj.a()).d((aklq)((agza)d).build());
            }
            adio.m(file);
        }
    }
    
    static String c(final Thread thread) {
        final StringBuilder sb = new StringBuilder();
        for (final StackTraceElement stackTraceElement : thread.getStackTrace()) {
            if (sb.length() + stackTraceElement.toString().length() > 2000) {
                break;
            }
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        return sb.toString();
    }
    
    final void a() {
        this.e = null;
        adio.m(adio.u((adgw)this.c));
    }
}
