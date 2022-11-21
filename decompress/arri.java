// 
// Decompiled by Procyon v0.6.0
// 

public final class arri implements arrh
{
    public static final qis a;
    
    static {
        final qiq a2 = new qiq(qif.a("com.google.android.gms.measurement")).b().a();
        a2.f("measurement.client.global_params", true);
        a2.f("measurement.service.global_params_in_payload", true);
        a = a2.f("measurement.service.clear_global_params_on_uninstall", true);
        a2.f("measurement.service.global_params", true);
        a2.d("measurement.id.service.global_params", 0L);
    }
    
    @Override
    public final boolean a() {
        return (boolean)arri.a.c();
    }
    
    @Override
    public final void b() {
    }
}
