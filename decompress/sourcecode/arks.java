// 
// Decompiled by Procyon v0.6.0
// 

public final class arks implements arkr
{
    public static final qgp a;
    public static final qgp b;
    
    static {
        final qgn a2 = new qgn(qgc.a("com.google.android.gms.droidguard")).a();
        a = a2.f("droidguard_enable_client_library_telemetry", false);
        b = a2.e("droidguard_flows_with_fine_client_library_telemetry", "");
    }
    
    @Override
    public final String a() {
        return (String)arks.b.c();
    }
    
    @Override
    public final boolean b() {
        return (boolean)arks.a.c();
    }
}
