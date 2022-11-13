import android.content.Context;
import java.util.ArrayDeque;
import java.util.HashMap;
import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aax
{
    public static final aax a;
    public final Object b;
    public yf c;
    public final ListenableFuture d;
    private ListenableFuture e;
    
    static {
        a = new aax();
    }
    
    private aax() {
        this.b = new Object();
        this.c = null;
        this.d = sg.d((Object)null);
        new HashMap();
        new HashMap();
        new ArrayDeque();
    }
    
    public static ListenableFuture a(final Context context) {
        afg.k(context);
        final aax a = aax.a;
        Object b = a.b;
        synchronized (b) {
            ListenableFuture e = a.e;
            if (e != null) {
                monitorexit(b);
            }
            else {
                e = sl.c((ace)new aaw(a, new ye(context, a.c), 0));
                a.e = e;
                monitorexit(b);
            }
            b = new aav(context);
            return sg.g(e, (aab)new aat((sc)b, 1), zu.a());
        }
    }
}
