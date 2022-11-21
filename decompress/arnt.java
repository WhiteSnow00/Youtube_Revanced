import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arnt implements arog
{
    private final Object a;
    private volatile ess b;
    private final alo c;
    
    public arnt(final qu qu) {
        this.a = new Object();
        this.c = new alo((avw)qu, (avs)new arnp((Context)qu));
    }
    
    @Override
    public final /* bridge */ Object aR() {
        if (this.b == null) {
            synchronized (this.a) {
                if (this.b == null) {
                    this.b = ((arnr)this.c.h((Class)arnr.class)).a;
                }
            }
        }
        return this.b;
    }
}
