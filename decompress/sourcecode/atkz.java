// 
// Decompiled by Procyon v0.6.0
// 

public final class atkz implements atlg
{
    private final atml a;
    private final atlg b;
    
    public atkz() {
        throw null;
    }
    
    public atkz(final atlg atlg, final atml a) {
        this.a = a;
        atlg b = atlg;
        if (atlg instanceof atkz) {
            b = ((atkz)atlg).b;
        }
        this.b = b;
    }
    
    public final atlf a(final atlf atlf) {
        return (atlf)this.a.invoke(atlf);
    }
    
    public final boolean b(final atlg atlg) {
        atlg.getClass();
        return atlg == this || this.b == atlg;
    }
}
