import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ize implements aazk
{
    public final asgt a;
    private final atjj b;
    private final atid c;
    private final Executor d;
    private final aazh e;
    
    public ize(final bx bx, final atjj b, final Executor d, final aazh e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.b = b;
        final atid ad = atid.aD();
        this.c = ad;
        this.d = d;
        this.e = e;
        this.a = ((asgt)ad).p().L((asjc)new iir(bx, 19, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
    }
    
    public final asgt a() {
        return this.e.a().C((asjc)new iir(this, 18)).p();
    }
    
    public final void b() {
        this.e.b();
    }
    
    public final void c() {
        this.e.c();
    }
    
    public final void d() {
        tcp.k(((aagm)this.b.a()).b(), this.d, (tcn)jbz.b, (tco)new hfi(this.c, 14));
        this.e.d();
    }
}
