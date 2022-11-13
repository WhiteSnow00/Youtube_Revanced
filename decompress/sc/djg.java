import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class djg implements ddr
{
    private final ddr a;
    private final Resources b;
    
    public djg(final Resources b, final ddr a) {
        clm.h((Object)b);
        this.b = b;
        clm.h((Object)a);
        this.a = a;
    }
    
    @Override
    public final dfy a(final Object o, final int n, final int n2, final ddp ddp) {
        return dkk.f(this.b, this.a.a(o, n, n2, ddp));
    }
    
    @Override
    public final boolean b(final Object o, final ddp ddp) {
        return this.a.b(o, ddp);
    }
}
