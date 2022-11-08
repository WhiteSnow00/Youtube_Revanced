// 
// Decompiled by Procyon v0.6.0
// 

public final class jzo implements fjo
{
    public final fjp a;
    private final arhr b;
    
    public jzo(final fjp a, final arhr b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a() {
        if (this.a.j().c()) {
            ((fyx)this.b.a()).i();
            return;
        }
        ((fyx)this.b.a()).o();
    }
    
    @Override
    public final void oK(final fkk fkk) {
        this.a();
    }
}
