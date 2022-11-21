import java.security.SecureRandom;
import android.os.Handler;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class absf
{
    public final oco a;
    public final Executor b;
    public final Handler c;
    public final SecureRandom d;
    public final vsi e;
    public final String f;
    public final wza g;
    public absg h;
    public final aamy i;
    public final absv j;
    
    public absf(final oco a, final Executor b, final Handler c, final SecureRandom d, final vsi e, final String f, final aamy i, final absv j, final wza g, final byte[] array) {
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
        twd.n(f);
        this.f = f;
        i.getClass();
        this.i = i;
        this.j = j;
        this.g = g;
    }
    
    public static final boolean a(final akys akys) {
        return akys != null && !akys.c.isEmpty() && akys.d > 0L && akys.e != 0L;
    }
    
    public static final boolean b(final byte[] array) {
        return array != null && array.length > 0;
    }
}
