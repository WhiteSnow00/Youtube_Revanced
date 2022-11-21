import java.util.logging.Level;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asjj
{
    static final arwq a;
    private static final Logger b;
    
    static {
        b = Logger.getLogger(asjj.class.getName());
        if (!afbj.f(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"))) {
            Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        }
        a = arwq.a("internal-stub-type");
    }
    
    private asjj() {
    }
    
    public static ListenableFuture a(final arwu arwu, final Object o) {
        final asje asje = new asje(arwu);
        e(arwu, o, (asjf)new asji(asje));
        return (ListenableFuture)asje;
    }
    
    public static asjm b(final arwu arwu, final asjm asjm) {
        final asjd asjd = new asjd(arwu, true);
        f(arwu, (asjf)new asjg(asjm, asjd));
        return asjd;
    }
    
    public static void c(final arwu arwu, final Object o, final asjm asjm) {
        e(arwu, o, (asjf)new asjg(asjm, new asjd(arwu, false)));
    }
    
    private static RuntimeException d(final arwu arwu, final Throwable t) {
        try {
            arwu.b(null, t);
        }
        finally {
            final Throwable t2;
            asjj.b.logp(Level.SEVERE, "io.grpc.stub.ClientCalls", "cancelThrow", "RuntimeException encountered while closing call", t2);
        }
        if (t instanceof RuntimeException) {
            throw (RuntimeException)t;
        }
        if (t instanceof Error) {
            throw (Error)t;
        }
        throw new AssertionError((Object)t);
    }
    
    private static void e(final arwu arwu, final Object o, final asjf asjf) {
        f(arwu, asjf);
        try {
            arwu.g(o);
            arwu.c();
        }
        catch (final Error error) {
            throw d(arwu, error);
        }
        catch (final RuntimeException ex) {
            throw d(arwu, ex);
        }
    }
    
    private static void f(final arwu arwu, final asjf asjf) {
        arwu.l(asjf, new arze());
        asjf.w();
    }
}
