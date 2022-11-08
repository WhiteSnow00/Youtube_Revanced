import java.util.logging.Level;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asfy
{
    static final arrj a;
    private static final Logger b;
    
    static {
        b = Logger.getLogger(asfy.class.getName());
        if (!aexs.f(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"))) {
            Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        }
        a = arrj.a("internal-stub-type");
    }
    
    private asfy() {
    }
    
    public static ListenableFuture a(final arrn arrn, final Object o) {
        final asft asft = new asft(arrn);
        e(arrn, o, (asfu)new asfx(asft));
        return (ListenableFuture)asft;
    }
    
    public static asgb b(final arrn arrn, final asgb asgb) {
        final asfs asfs = new asfs(arrn, true);
        f(arrn, (asfu)new asfv(asgb, asfs));
        return (asgb)asfs;
    }
    
    public static void c(final arrn arrn, final Object o, final asgb asgb) {
        e(arrn, o, (asfu)new asfv(asgb, new asfs(arrn, false)));
    }
    
    private static RuntimeException d(final arrn arrn, final Throwable t) {
        try {
            arrn.b(null, t);
        }
        finally {
            final Throwable t2;
            asfy.b.logp(Level.SEVERE, "io.grpc.stub.ClientCalls", "cancelThrow", "RuntimeException encountered while closing call", t2);
        }
        if (t instanceof RuntimeException) {
            throw (RuntimeException)t;
        }
        if (t instanceof Error) {
            throw (Error)t;
        }
        throw new AssertionError((Object)t);
    }
    
    private static void e(final arrn arrn, final Object o, final asfu asfu) {
        f(arrn, asfu);
        try {
            arrn.g(o);
            arrn.c();
        }
        catch (final Error error) {
            throw d(arrn, error);
        }
        catch (final RuntimeException ex) {
            throw d(arrn, ex);
        }
    }
    
    private static void f(final arrn arrn, final asfu asfu) {
        arrn.l((aqzg)asfu, new arug());
        asfu.R();
    }
}
