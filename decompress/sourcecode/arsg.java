import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public class arsg
{
    public static final Logger c;
    public static final arsg d;
    final arrz e;
    public final aruz f;
    public final int g;
    
    static {
        c = Logger.getLogger(arsg.class.getName());
        d = new arsg();
    }
    
    private arsg() {
        this.e = null;
        this.f = null;
        e(this.g = 0);
    }
    
    public arsg(final arsg arsg, final aruz f) {
        arrz e;
        if (arsg instanceof arrz) {
            e = (arrz)arsg;
        }
        else {
            e = arsg.e;
        }
        this.e = e;
        this.f = f;
        e(this.g = arsg.g + 1);
    }
    
    public arsg(final aruz f, final int g) {
        this.e = null;
        this.f = f;
        e(this.g = g);
    }
    
    private static void e(final int n) {
        if (n == 1000) {
            arsg.c.logp(Level.SEVERE, "io.grpc.Context", "validateGeneration", "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", new Exception());
        }
    }
    
    public static arsg k() {
        arsg arsg;
        if ((arsg = arse.a.a()) == null) {
            arsg = arsg.d;
        }
        return arsg;
    }
    
    public static void l(final Object o, final Object o2) {
        if (o != null) {
            return;
        }
        throw new NullPointerException((String)o2);
    }
    
    public static arsd m() {
        return new arsd();
    }
    
    public arsg a() {
        arsg arsg;
        if ((arsg = arse.a.b(this)) == null) {
            arsg = arsg.d;
        }
        return arsg;
    }
    
    public arsh b() {
        final arrz e = this.e;
        if (e == null) {
            return null;
        }
        return e.a;
    }
    
    public Throwable c() {
        final arrz e = this.e;
        if (e == null) {
            return null;
        }
        return ((arsg)e).c();
    }
    
    public void d(final arsa arsa, final Executor executor) {
        l(arsa, "cancellationListener");
        l(executor, "executor");
        final arrz e = this.e;
        if (e == null) {
            return;
        }
        e.e(new arsc(executor, arsa, this));
    }
    
    public void f(final arsg arsg) {
        l(arsg, "toAttach");
        arse.a.c(this, arsg);
    }
    
    public void g(final arsa arsa) {
        final arrz e = this.e;
        if (e == null) {
            return;
        }
        e.h(arsa, this);
    }
    
    public boolean i() {
        final arrz e = this.e;
        return e != null && ((arsg)e).i();
    }
}
