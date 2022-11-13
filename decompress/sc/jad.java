import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jad implements abbf
{
    public final ashi a;
    private final atke b;
    private final ativ c;
    private final Executor d;
    private final abbd e;
    
    public jad(final bx bx, final atke b, final Executor d, final abbd e, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.b = b;
        final ativ ae = ativ.aE();
        this.c = ae;
        this.d = d;
        this.e = e;
        this.a = ((ashi)ae).p().L((asjr)new ijl(bx, 20, null, null, null, null, null));
    }
    
    public static void e() {
        ttr.b("Error refreshing accessibility settings");
    }
    
    @Override
    public final ashi a() {
        return this.e.a().C((asjr)new ijl(this, 19)).p();
    }
    
    @Override
    public final void b() {
        this.e.b();
    }
    
    @Override
    public final void c() {
        this.e.c();
    }
    
    @Override
    public final void d() {
        teu.k(((qqr)this.b.a()).a(), this.d, (tes)jdb.b, (tet)new hgd(this.c, 14));
        this.e.d();
    }
}
