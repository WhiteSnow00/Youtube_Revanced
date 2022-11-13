import java.io.InputStream;
import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class asbp implements asac
{
    public asbp() {
    }
    
    @Override
    public final artu a() {
        throw null;
    }
    
    @Override
    public final void b(final ascd ascd) {
        this.p().b(ascd);
    }
    
    @Override
    public final void c(final Status status) {
        this.p().c(status);
    }
    
    @Override
    public final void d() {
        this.p().d();
    }
    
    @Override
    public final void e() {
        this.p().e();
    }
    
    @Override
    public final void f() {
        this.p().f();
    }
    
    @Override
    public final void g(final int n) {
        this.p().g(n);
    }
    
    @Override
    public final void h(final arui arui) {
        this.p().h(arui);
    }
    
    @Override
    public final void i(final arup arup) {
        this.p().i(arup);
    }
    
    @Override
    public final void j(final arur arur) {
        this.p().j(arur);
    }
    
    @Override
    public final void k(final int n) {
        this.p().k(n);
    }
    
    @Override
    public final void l(final int n) {
        this.p().l(n);
    }
    
    @Override
    public void m(final asae asae) {
        throw null;
    }
    
    @Override
    public final void n(final InputStream inputStream) {
        this.p().n(inputStream);
    }
    
    @Override
    public final boolean o() {
        return this.p().o();
    }
    
    protected abstract asac p();
    
    @Override
    public final String toString() {
        final aezo ab = adkp.ab((Object)this);
        ab.b("delegate", (Object)this.p());
        return ab.toString();
    }
}
