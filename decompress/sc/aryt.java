import io.grpc.StatusException;
import io.grpc.Status;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class aryt implements asac
{
    private final aryd a;
    private final aryo b;
    private InputStream c;
    private arup d;
    
    public aryt(final aryd a, final aryo b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final artu a() {
        throw null;
    }
    
    @Override
    public final void b(final ascd ascd) {
    }
    
    @Override
    public final void c(final Status status) {
        synchronized (this.a) {
            this.a.h(status);
        }
    }
    
    @Override
    public final void d() {
    }
    
    @Override
    public final void e() {
        try {
            synchronized (this.b) {
                final arup d = this.d;
                if (d != null) {
                    this.b.b(d);
                }
                ((aryp)this.b).d();
                final aryo b = this.b;
                final InputStream c = this.c;
                if (c != null) {
                    ((aryp)b).c(c);
                }
                ((aryp)b).e();
                ((aryp)b).f();
            }
        }
        catch (final StatusException ex) {
            synchronized (this.a) {
                this.a.g(ex.a);
            }
        }
    }
    
    @Override
    public final void f() {
    }
    
    @Override
    public final void g(final int n) {
        synchronized (this.a) {
            this.a.m(n);
        }
    }
    
    @Override
    public final void h(final arui arui) {
    }
    
    @Override
    public final void i(final arup d) {
        this.d = d;
    }
    
    @Override
    public final void j(final arur arur) {
    }
    
    @Override
    public final void k(final int n) {
    }
    
    @Override
    public final void l(final int n) {
    }
    
    @Override
    public final void m(final asae asae) {
        synchronized (this.a) {
            this.a.k((aryp)this.b, (asfu)asae);
            monitorexit(this.a);
            if (((aryp)this.b).g()) {
                asae.e();
            }
        }
    }
    
    @Override
    public final void n(final InputStream c) {
        if (this.c != null) {
            synchronized (this.a) {
                this.a.g(Status.k.withDescription("too many messages"));
                return;
            }
        }
        this.c = c;
    }
    
    @Override
    public final boolean o() {
        return ((aryp)this.b).g();
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final String string2 = this.b.toString();
        final StringBuilder sb = new StringBuilder("SingleMessageClientStream[");
        sb.append(string);
        sb.append("/");
        sb.append(string2);
        sb.append("]");
        return sb.toString();
    }
}
