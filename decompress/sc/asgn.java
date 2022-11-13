import java.util.logging.Level;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asgn
{
    static final artw a;
    private static final Logger b;
    
    static {
        b = Logger.getLogger(asgn.class.getName());
        if (!aezr.f(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"))) {
            Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        }
        a = artw.a("internal-stub-type");
    }
    
    private asgn() {
    }
    
    public static ListenableFuture a(final arua arua, final Object o) {
        final asgi asgi = new asgi(arua);
        e(arua, o, new asgm(asgi));
        return (ListenableFuture)asgi;
    }
    
    public static asgq b(final arua arua, final asgq asgq) {
        final asgh asgh = new asgh(arua, true);
        f(arua, new asgk(asgq, asgh));
        return asgh;
    }
    
    public static void c(final arua arua, final Object o, final asgq asgq) {
        e(arua, o, new asgk(asgq, new asgh(arua, false)));
    }
    
    private static RuntimeException d(final arua arua, final Throwable t) {
        try {
            arua.b((String)null, t);
        }
        finally {
            final Throwable t2;
            asgn.b.logp(Level.SEVERE, "io.grpc.stub.ClientCalls", "cancelThrow", "RuntimeException encountered while closing call", t2);
        }
        if (t instanceof RuntimeException) {
            throw (RuntimeException)t;
        }
        if (t instanceof Error) {
            throw (Error)t;
        }
        throw new AssertionError((Object)t);
    }
    
    private static void e(final arua arua, final Object o, final asgj asgj) {
        f(arua, asgj);
        try {
            arua.g(o);
            arua.c();
        }
        catch (final Error error) {
            throw d(arua, error);
        }
        catch (final RuntimeException ex) {
            throw d(arua, ex);
        }
    }
    
    private static void f(final arua arua, final asgj asgj) {
        arua.l((arbu)asgj, new arwk());
        asgj.H();
    }
}
