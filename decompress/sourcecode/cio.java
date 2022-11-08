import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

final class cio extends cin
{
    final /* synthetic */ abg a;
    final /* synthetic */ cip b;
    
    public cio(final cip b, final abg a) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final cim cim) {
        ((ArrayList)this.a.get((Object)this.b.b)).remove(cim);
        cim.A((cil)this);
    }
}
