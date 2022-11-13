import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acie implements dij
{
    private final atke a;
    private final dij b;
    
    public acie(final atke a, final dij b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final /* bridge */ boolean a(final Object o) {
        return ((acif)this.a.a()).a(((dhz)o).b()) != null;
    }
    
    @Override
    public final /* bridge */ aln b(final Object o, final int n, final int n2, final ddp ddp) {
        return this.b.b(new File(tvb.i(((acif)this.a.a()).a(((dhz)o).b()))), n, n2, ddp);
    }
}
