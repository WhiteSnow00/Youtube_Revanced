import java.util.Iterator;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adig
{
    public int a;
    public long b;
    public final Object c;
    public final Object d;
    public Object e;
    
    public adig(final adiz c, final atke d) {
        this.c = c;
        this.d = d;
        this.a = Math.min(10, ((tos)c.e).d());
    }
    
    public adig(final dml d, final bku c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.d = d;
        this.c = c;
        this.e = cck.a;
    }
    
    public static void b(final adiz adiz, final atke atke) {
        final int a = adid.a;
        for (final File file : adkp.B(adiz)) {
            final ahuk x = adkp.x(file);
            if (x != null) {
                x.toString();
                final aknr d = aknt.d();
                ((ahaz)d).copyOnWrite();
                aknt.bk((aknt)d.instance, x);
                ((wxx)atke.a()).d((aknt)((ahaz)d).build());
            }
            adkp.r(file);
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
        adkp.r(adkp.z((adiz)this.c));
    }
}
