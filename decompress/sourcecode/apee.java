// 
// Decompiled by Procyon v0.6.0
// 

public final class apee extends vdj
{
    private final agza a;
    
    private apee() {
        final apeh a = apeh.a;
        throw null;
    }
    
    public apee(final agza a) {
        this.a = a;
    }
    
    public final void b(final String d) {
        final agza a = this.a;
        a.copyOnWrite();
        final apeh apeh = (apeh)a.instance;
        final apeh a2 = apeh.a;
        d.getClass();
        apeh.b |= 0x2;
        apeh.d = d;
    }
    
    public final void c(final String g) {
        final agza a = this.a;
        a.copyOnWrite();
        final apeh apeh = (apeh)a.instance;
        final apeh a2 = apeh.a;
        g.getClass();
        apeh.b |= 0x10;
        apeh.g = g;
    }
    
    public final void d(final Boolean b) {
        final agza a = this.a;
        final boolean booleanValue = b;
        a.copyOnWrite();
        final apeh apeh = (apeh)a.instance;
        final apeh a2 = apeh.a;
        apeh.b |= 0x8;
        apeh.f = booleanValue;
    }
    
    public final void e(final String e) {
        final agza a = this.a;
        a.copyOnWrite();
        final apeh apeh = (apeh)a.instance;
        final apeh a2 = apeh.a;
        e.getClass();
        apeh.b |= 0x4;
        apeh.e = e;
    }
    
    public final apeg f() {
        return new apeg((apeh)this.a.build());
    }
}
