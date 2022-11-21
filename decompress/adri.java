import android.util.Pair;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adri implements aenm
{
    public final String a;
    public final Object b;
    public final Object c;
    public final Object d;
    private final int e;
    
    public adri(final adqw b, final znz d, final String a, final adoj c, final int e) {
        this.e = e;
        this.b = b;
        this.d = d;
        this.a = a;
        this.c = c;
    }
    
    public adri(final adrm b, final String a, final adrh c, final adrf d, final int e) {
        this.e = e;
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
    }
    
    public final Object a(final adgg adgg) {
        if (this.e != 0) {
            final Object b = this.b;
            final Object d = this.d;
            final String a = this.a;
            final adoj adoj = (adoj)this.c;
            final String ac = adoj.ac;
            final String ab = adoj.ab;
            synchronized (((adqw)b).g) {
                adgg.P((Runnable)new adat((adqw)b, ac, 18), (Executor)((adqw)b).a);
                if (((adqw)b).g.containsKey(ac)) {
                    final adgg adgg2 = (adgg)((adqw)b).g.get(ac).second;
                    final StringBuilder sb = new StringBuilder("Another polling request has been added for video id ");
                    sb.append(ac);
                    adgg2.R((Throwable)new IllegalStateException(sb.toString()));
                }
                ((adqw)b).g.put(ac, new Pair((Object)a, (Object)adgg));
                ((adqw)b).b.b((znz)d, null, ac, ab);
                return "Polling for feedback on background thread";
            }
        }
        return ((adrm)this.b).d(this.a, (adrh)this.c, (adrf)this.d, new adrl(adgg, null, null, null, null));
    }
}
