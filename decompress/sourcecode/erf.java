// 
// Decompiled by Procyon v0.6.0
// 

public final class erf implements ucu
{
    private final eqv a;
    private final /* synthetic */ int b;
    private final Object c;
    
    public erf(final eqv a, final esk c, final int b) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public erf(final eqv a, final esm c, final int b) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public final ucv a(final uff uff) {
        if (this.b != 0) {
            return (ucv)new ere(this.a, (esm)this.c, uff);
        }
        return (ucv)new erh(this.a, (esk)this.c, uff);
    }
}
