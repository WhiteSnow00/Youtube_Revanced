// 
// Decompiled by Procyon v0.6.0
// 

public final class jzi
{
    public final anmq a;
    public ahkq b;
    public annj c;
    public anmp d;
    public anng[] e;
    private byte[] f;
    
    public jzi(final anmq a) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.a = a;
    }
    
    public final anmp a() {
        if (this.d == null) {
            anmp d;
            if ((d = this.a.d) == null) {
                d = anmp.a;
            }
            this.d = d;
        }
        return this.d;
    }
    
    public final byte[] b() {
        if (this.f == null) {
            this.f = this.a.g.I();
        }
        return this.f;
    }
}
