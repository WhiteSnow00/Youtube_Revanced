import java.util.Iterator;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adjw
{
    public int a;
    public long b;
    public final Object c;
    public final Object d;
    public Object e;
    
    public adjw(final adkp c, final atnb d) {
        this.c = c;
        this.d = d;
        this.a = Math.min(10, ((tpt)c.e).d());
    }
    
    public adjw(final dmo d, final bkx c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.d = d;
        this.c = c;
        this.e = ccn.a;
    }
    
    public static void b(final adkp adkp, final atnb atnb) {
        final int a = adjt.a;
        for (final File file : adme.s(adkp)) {
            final ahwd o = adme.o(file);
            if (o != null) {
                o.toString();
                final akps d = akpu.d();
                ((ahcr)d).copyOnWrite();
                akpu.bk((akpu)d.instance, o);
                ((wza)atnb.a()).d((akpu)((ahcr)d).build());
            }
            adme.i(file);
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
        adme.i(adme.q((adkp)this.c));
    }
}
