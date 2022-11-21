// 
// Decompiled by Procyon v0.6.0
// 

public final class arru implements arrt
{
    public static final qis a;
    public static final qis b;
    public static final qis c;
    public static final qis d;
    public static final qis e;
    
    static {
        final qiq a2 = new qiq(qif.a("com.google.android.gms.measurement")).a();
        a = a2.f("measurement.test.boolean_flag", false);
        b = a2.c("measurement.test.double_flag", -3.0);
        c = a2.d("measurement.test.int_flag", -2L);
        d = a2.d("measurement.test.long_flag", -1L);
        e = a2.e("measurement.test.string_flag", "---");
    }
    
    @Override
    public final double a() {
        return (double)arru.b.c();
    }
    
    @Override
    public final long b() {
        return (long)arru.c.c();
    }
    
    @Override
    public final long c() {
        return (long)arru.d.c();
    }
    
    @Override
    public final String d() {
        return (String)arru.e.c();
    }
    
    @Override
    public final boolean e() {
        return (boolean)arru.a.c();
    }
}
