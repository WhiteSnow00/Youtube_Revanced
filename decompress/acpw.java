// 
// Decompiled by Procyon v0.6.0
// 

final class acpw implements acqm
{
    final acqm a;
    final acqh b;
    
    public acpw(final acqh b, final acqm a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Object o, final acbk acbk) {
        this.b.my(o, acbk);
        this.a.a(o, acbk);
    }
    
    @Override
    public final void b(final dbm dbm, final acbk acbk) {
        this.b.lJ(dbm, acbk);
        this.a.b(dbm, acbk);
    }
}
