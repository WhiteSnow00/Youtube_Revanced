// 
// Decompiled by Procyon v0.6.0
// 

public final class kto extends di implements fxn
{
    private final cl a;
    private qje b;
    
    public kto(final cl a) {
        this.a = a;
        this.b = null;
    }
    
    private final void l() {
        final qje b = this.b;
        if (b != null && ((br)b).aw()) {
            ((bi)this.b).pJ();
        }
    }
    
    public final void a() {
        this.l();
        this.b = null;
        this.a.an((di)this);
    }
    
    public final void c() {
        this.a.am((di)this, true);
    }
    
    public final void j(final br br) {
        if (br instanceof qje) {
            this.l();
            this.b = (qje)br;
        }
    }
}
