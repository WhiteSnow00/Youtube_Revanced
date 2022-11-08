import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class grb implements gqw
{
    private final gqv a;
    private final gqx b;
    private final aeyr c;
    
    public grb(final gqv a, final gqx b, final atjj atjj) {
        this.a = a;
        this.b = b;
        this.c = agnj.E((aeyr)new beg(atjj, 19));
    }
    
    @Override
    public final ListenableFuture a(final grd grd) {
        if (((nyz)this.c.a()).a() != 3) {
            return afva.m((Object)this.a.a(grd));
        }
        return this.b.a(grd);
    }
}
