import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class achx implements dij
{
    private final dij a;
    
    public achx(final dij a) {
        this.a = a;
    }
    
    @Override
    public final boolean a(final Object o) {
        return aald.S((aotp)o);
    }
    
    @Override
    public final /* bridge */ aln b(final Object o, final int n, final int n2, final ddp ddp) {
        final Uri k = aald.K((aotp)o, n, n2);
        if (k == null) {
            return null;
        }
        return this.a.b(k, n, n2, ddp);
    }
}
