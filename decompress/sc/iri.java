// 
// Decompiled by Procyon v0.6.0
// 

public final class iri implements atke
{
    private final cl a;
    private iru b;
    
    public iri(final cl a) {
        this.a = a;
    }
    
    public final /* bridge */ Object a() {
        return this.b();
    }
    
    public final fob b() {
        final iru b = this.b;
        if (b != null) {
            return (fob)b;
        }
        final irt irt = (irt)this.a.f("PlayerFragment");
        if (irt == null) {
            final irt irt2 = new irt();
            arlc.g((br)irt2);
            final ct i = this.a.i();
            i.r(2131430448, (br)irt2, "PlayerFragment");
            i.d();
            this.b = irt2.o();
        }
        else {
            this.b = irt.o();
        }
        return (fob)this.b;
    }
}
