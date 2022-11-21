// 
// Decompiled by Procyon v0.6.0
// 

public final class arqt implements arqs
{
    public static final qis a;
    public static final qis b;
    
    static {
        final qiq a2 = new qiq(qif.a("com.google.android.gms.measurement")).b().a();
        a2.f("measurement.collection.event_safelist", true);
        a = a2.f("measurement.service.store_null_safelist", true);
        b = a2.f("measurement.service.store_safelist", true);
    }
    
    @Override
    public final boolean a() {
        return (boolean)arqt.a.c();
    }
    
    @Override
    public final boolean b() {
        return (boolean)arqt.b.c();
    }
    
    @Override
    public final void c() {
    }
}
