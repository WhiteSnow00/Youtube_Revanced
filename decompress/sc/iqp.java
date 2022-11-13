import com.google.protobuf.MessageLite;
import java.util.concurrent.ExecutionException;
import java.util.Map;
import android.content.Context;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iqp implements iqx
{
    public final vef a;
    public final fln b;
    public final zmf c;
    public final iqk d;
    public final Executor e;
    public final iho f;
    public final Context g;
    public final vai h;
    public final aln i;
    public final blu j;
    private final Map k;
    private final iqk l;
    
    public iqp(final Map k, final vef a, final fln b, final zmf c, final aln i, final iqk d, final iqk l, final Executor e, final iho f, final Context g, final blu j, final vai h, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.k = k;
        this.a = a;
        this.b = b;
        this.c = c;
        this.i = i;
        this.d = d;
        this.l = l;
        this.e = e;
        this.f = f;
        this.g = g;
        this.j = j;
        this.h = h;
    }
    
    @Override
    public final afeq a(imt ex) {
        tbi.e();
        try {
            ex = (InterruptedException)afnd.r(this.l.g(), (aftz)new ier(this, (imt)ex, 8), this.e).get();
            return (afeq)ex;
        }
        catch (final InterruptedException ex) {}
        catch (final ExecutionException ex2) {}
        if (this.h.ai()) {
            zlm.c(zll.b, zlk.B, "Unable to get smart downloads section response.", (Throwable)ex);
        }
        return afeq.q();
    }
    
    public final aezp b(final iqh iqh, final Class clazz, final aezp aezp, final imt imt) {
        final iqw iqw = this.k.get(iqh);
        iqw.getClass();
        final afeq a = iqw.a(aezp).a(imt);
        if (a.isEmpty()) {
            return (aezp)aeyo.a;
        }
        return aezp.k((Object)clazz.cast(((iqv)a.get(0)).a));
    }
}
