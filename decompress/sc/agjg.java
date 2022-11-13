import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agjg implements aglh
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public agjg(final agia a, final Context b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public agjg(final agji a, final agjb b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public agjg(final Context b, final String a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final Object a() {
        final int c = this.c;
        if (c == 0) {
            final Object a = this.a;
            final agjb agjb = (agjb)this.b;
            return agjb.d.a((agjc)new agjv(agjb, (agjc)a));
        }
        if (c != 1) {
            return new agnj((Context)this.b, (String)this.a);
        }
        final Object a2 = this.a;
        final Object b = this.b;
        final agia agia = (agia)a2;
        final String h = agia.h();
        final agko agko = (agko)agia.c.a(agko.class);
        return new agmc((Context)b, h);
    }
}
