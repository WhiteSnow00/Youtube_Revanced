import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hac extends acjg
{
    private final hyx a;
    
    public hac(final hyx a, final msr msr, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        ((asht)a.a).q(tpe.cl(msr.K())).af(asil.a()).aH(new gyi(this, 11));
    }
    
    public final int a() {
        return this.a.c();
    }
    
    public final long b(final int n) {
        return this.d(n).a();
    }
    
    public final /* bridge */ Object c(final int n) {
        return this.d(n);
    }
    
    public final boolean contains(final Object o) {
        throw null;
    }
    
    public final hab d(final int n) {
        return ((List<hab>)this.a.d).get(n);
    }
    
    public final boolean isEmpty() {
        return this.a.c() == 0;
    }
}
