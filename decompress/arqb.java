// 
// Decompiled by Procyon v0.6.0
// 

public final class arqb implements arqa
{
    public static final qis a;
    public static final qis b;
    
    static {
        final qiq a2 = new qiq(qif.a("com.google.android.gms.droidguard")).a();
        a = a2.f("droidguard_enable_client_library_telemetry", false);
        b = a2.e("droidguard_flows_with_fine_client_library_telemetry", "");
    }
    
    @Override
    public final String a() {
        return (String)arqb.b.c();
    }
    
    @Override
    public final boolean b() {
        return (boolean)arqb.a.c();
    }
}
