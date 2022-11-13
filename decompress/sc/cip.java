import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

final class cip extends cio
{
    final abh a;
    final ciq b;
    
    public cip(final ciq b, final abh a) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final cin cin) {
        ((ArrayList)this.a.get((Object)this.b.b)).remove(cin);
        cin.A((cim)this);
    }
}
