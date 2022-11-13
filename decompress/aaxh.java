// 
// Decompiled by Procyon v0.6.0
// 

final class aaxh implements aaxf
{
    public final aiqj a;
    private final xag b;
    
    public aaxh(final xag b, final aiqj a) {
        this.b = b;
        this.a = a;
    }
    
    public final /* bridge */ aaxg a(final aawy aawy) {
        xag xag;
        if (aawy.w(this.a)) {
            xag = aawy.b(this.a);
        }
        else {
            xag = this.b;
        }
        return (aaxg)new aaxi(this, xag, 0);
    }
    
    public final aaxu b() {
        return aaxu.b;
    }
}
