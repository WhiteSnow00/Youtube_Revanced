import java.util.concurrent.Executor;
import java.io.Closeable;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afvs implements Callable
{
    final Object a;
    final Object b;
    private final int c;
    
    public afvs(final aevk b, final Callable a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public afvs(final afvx a, final suu b, final int c, final byte[] array, final byte[] array2) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Object call() {
        if (this.c != 0) {
            final Object b = this.b;
            final Object a = this.a;
            final aewo g = aewp.g();
            final aevk e = aewp.e(g, (aevk)b);
            try {
                final Object call = ((Callable<Object>)a).call();
                aewp.e(g, e);
                return call;
            }
            finally {
                try {
                    final Throwable t;
                    aeua.a(t);
                }
                finally {
                    aewp.e(g, e);
                }
            }
        }
        final Object b2 = this.b;
        final adgg a2 = ((afvx)this.a).b.a;
        final Object a3 = ((suu)b2).a;
        for (int i = 0; i <= 0; ++i) {
            a2.I((Object)((Closeable[])a3)[i], (Executor)afwd.a);
        }
        return null;
    }
    
    @Override
    public final String toString() {
        if (this.c != 0) {
            final Object a = this.a;
            final StringBuilder sb = new StringBuilder("propagating=[");
            sb.append(a);
            sb.append("]");
            return sb.toString();
        }
        return ((suu)this.b).toString();
    }
}
