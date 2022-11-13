import java.io.InputStream;
import io.grpc.StatusException;
import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

final class aryk implements asac
{
    private final aryd a;
    private final aryo b;
    
    public aryk(final aryd a, final aryo b) {
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
                final aryo b = this.b;
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
    public final void i(final arup arup) {
        synchronized (this.b) {
            this.b.b(arup);
        }
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
        final aryd a = this.a;
        synchronized (a) {
            this.a.k((aryp)this.b, (asfu)asae);
            monitorexit(a);
            if (((aryp)this.b).g()) {
                asae.e();
            }
            try {
                synchronized (this.b) {
                    ((aryp)this.b).d();
                    ((aryp)this.b).f();
                }
            }
            catch (final StatusException a) {
                synchronized (this.a) {
                    this.a.g(((StatusException)a).a);
                }
            }
        }
    }
    
    @Override
    public final void n(final InputStream inputStream) {
        try {
            synchronized (this.b) {
                ((aryp)this.b).c(inputStream);
                ((aryp)this.b).f();
            }
        }
        catch (final StatusException ex) {
            synchronized (this.a) {
                this.a.g(ex.a);
            }
        }
    }
    
    @Override
    public final boolean o() {
        return ((aryp)this.b).g();
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final String string2 = this.b.toString();
        final StringBuilder sb = new StringBuilder("MultiMessageClientStream[");
        sb.append(string);
        sb.append("/");
        sb.append(string2);
        sb.append("]");
        return sb.toString();
    }
}
