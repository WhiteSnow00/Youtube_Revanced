// 
// Decompiled by Procyon v0.6.0
// 

public final class jzk
{
    public final annw a;
    public ahkq b;
    public amns c;
    public annf[] d;
    public byte[] e;
    private annj f;
    
    public jzk(final annw a) {
        this.b = null;
        this.c = null;
        this.f = null;
        this.d = null;
        this.e = null;
        this.a = a;
    }
    
    public final annj a() {
        if (this.f == null) {
            annj f;
            if ((f = this.a.c) == null) {
                f = annj.a;
            }
            this.f = f;
        }
        return this.f;
    }
}
