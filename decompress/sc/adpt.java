import android.util.Pair;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adpt implements aelt
{
    public final String a;
    public final Object b;
    public final Object c;
    public final Object d;
    private final int e;
    
    public adpt(final adpi b, final zme d, final String a, final admv c, final int e) {
        this.e = e;
        this.b = b;
        this.d = d;
        this.a = a;
        this.c = c;
    }
    
    public adpt(final adpx b, final String a, final adps c, final adpq d, final int e) {
        this.e = e;
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final Object a(final aeea aeea) {
        if (this.e != 0) {
            final Object b = this.b;
            final Object d = this.d;
            final String a = this.a;
            final admv admv = (admv)this.c;
            final String ac = admv.ac;
            final String ab = admv.ab;
            synchronized (((adpi)b).g) {
                aeea.e((Runnable)new adfy((adpi)b, ac, 16), (Executor)((adpi)b).a);
                if (((adpi)b).g.containsKey(ac)) {
                    final aeea aeea2 = (aeea)((adpi)b).g.get(ac).second;
                    final StringBuilder sb = new StringBuilder("Another polling request has been added for video id ");
                    sb.append(ac);
                    aeea2.g((Throwable)new IllegalStateException(sb.toString()));
                }
                ((adpi)b).g.put(ac, new Pair((Object)a, (Object)aeea));
                ((adpi)b).b.b((zme)d, (String)null, ac, ab);
                return "Polling for feedback on background thread";
            }
        }
        return ((adpx)this.b).d(this.a, (adps)this.c, (adpq)this.d, new adpw(aeea, (byte[])null, (byte[])null));
    }
}
