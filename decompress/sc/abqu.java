import java.security.SecureRandom;
import android.os.Handler;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abqu
{
    public final oby a;
    public final Executor b;
    public final Handler c;
    public final SecureRandom d;
    public final vqz e;
    public final String f;
    public final wxx g;
    public abqv h;
    public final aalc i;
    public final abrj j;
    
    public abqu(final oby a, final Executor b, final Handler c, final SecureRandom d, final vqz e, final String f, final aalc i, final abrj j, final wxx g, final byte[] array) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        e.getClass();
        this.e = e;
        tvb.n(f);
        this.f = f;
        i.getClass();
        this.i = i;
        this.j = j;
        this.g = g;
    }
    
    public static final boolean a(final akws akws) {
        return akws != null && !akws.c.isEmpty() && akws.d > 0L && akws.e != 0L;
    }
    
    public static final boolean b(final byte[] array) {
        return array != null && array.length > 0;
    }
}
