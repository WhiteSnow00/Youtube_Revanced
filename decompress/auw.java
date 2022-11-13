// 
// Decompiled by Procyon v0.6.0
// 

final class auw implements auz
{
    final auv a;
    final auz b;
    int c;
    
    public auw(final auv a, final auz b) {
        this.c = -1;
        this.a = a;
        this.b = b;
    }
    
    public final void a(final Object o) {
        final int c = this.c;
        final auv a = this.a;
        if (c != a.b()) {
            this.c = a.b();
            this.b.a(o);
        }
    }
    
    final void b() {
        this.a.h((auz)this);
    }
    
    final void c() {
        this.a.l((auz)this);
    }
}
