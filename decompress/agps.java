import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agps extends arxu
{
    public boolean a;
    public final agpv b;
    public final arxu c;
    
    public agps(final agpv b, final arxu c, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = false;
        this.c = c;
    }
    
    @Override
    public final void a(final Status status, final arze arze) {
        this.b.a.execute(new aegq(this, status, arze, 13));
    }
    
    @Override
    public final void b(final arze arze) {
        this.b.a.execute(new afaa(this, arze, 10));
    }
    
    @Override
    public final void c(final Object o) {
        this.b.a.execute(new afaa(this, o, 11));
    }
    
    @Override
    public final void d() {
        this.b.a.execute(new aevy(this, 17));
    }
}
