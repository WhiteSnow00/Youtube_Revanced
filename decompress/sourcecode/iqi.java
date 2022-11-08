// 
// Decompiled by Procyon v0.6.0
// 

public final class iqi implements atjj
{
    private final cl a;
    private iqw b;
    
    public iqi(final cl a) {
        this.a = a;
    }
    
    public final fnw b() {
        final iqw b = this.b;
        if (b != null) {
            return (fnw)b;
        }
        final iqt iqt = (iqt)this.a.f("PlayerFragment");
        if (iqt == null) {
            final iqt iqt2 = new iqt();
            arin.g((br)iqt2);
            final ct i = this.a.i();
            i.r(2131430447, (br)iqt2, "PlayerFragment");
            i.d();
            this.b = iqt2.o();
        }
        else {
            this.b = iqt.o();
        }
        return (fnw)this.b;
    }
}
