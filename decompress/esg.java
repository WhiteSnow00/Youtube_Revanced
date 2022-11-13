import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class esg implements agsb
{
    public final Object a;
    private final int b;
    
    public esg(final erx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public esg(final esm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final String s) {
        if (this.b != 0) {
            tpe.am((Context)this.a, s);
            return;
        }
        tpe.am((Context)((esm)this.a).h, s);
    }
}
