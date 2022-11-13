import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fkf implements fke
{
    private final atke b;
    
    public fkf(final atke b) {
        this.b = b;
    }
    
    private final void l(final Consumer consumer) {
        final Iterator iterator = ((Set)this.b.a()).iterator();
        while (iterator.hasNext()) {
            consumer.accept(iterator.next());
        }
    }
    
    public final void a() {
        this.l((Consumer)fgu.d);
    }
    
    public final void b() {
        this.l((Consumer)fgu.m);
    }
    
    public final void c() {
        this.l((Consumer)fgu.j);
    }
    
    public final void d() {
        this.l((Consumer)fgu.l);
    }
    
    public final void e() {
        this.l((Consumer)fgu.i);
    }
    
    public final void f() {
        this.l((Consumer)fgu.f);
    }
    
    public final void g() {
        this.l((Consumer)fgu.g);
    }
    
    public final void h() {
        this.l((Consumer)fgu.k);
    }
    
    public final void i() {
        this.l((Consumer)fgu.e);
    }
    
    public final void j() {
        this.l((Consumer)fgu.h);
    }
    
    public final void k() {
        this.l((Consumer)fgu.n);
    }
}
