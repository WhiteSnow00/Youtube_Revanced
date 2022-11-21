import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpr implements arwv
{
    public final Object a;
    private final int b;
    
    public agpr(final Context a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public agpr(final arze a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public agpr(final atnb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final arwu a(final arzi arzi, final arwr arwr, final arws arws) {
        final int b = this.b;
        if (b == 0) {
            return (arwu)new agpy(new agpv(arws, arzi, arwr, (afgh)((atnb)this.a).a()));
        }
        if (b != 1) {
            return (arwu)new asjl(this, arws.a(arzi, arwr), (byte[])null);
        }
        return (arwu)new nrb(this, arws.a(arzi, arwr), (byte[])null);
    }
}
