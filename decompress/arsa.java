// 
// Decompiled by Procyon v0.6.0
// 

public final class arsa implements arrz
{
    public static final qis a;
    public static final qis b;
    public static final qis c;
    public static final qis d;
    
    static {
        final qiq a2 = new qiq(qif.a("com.google.android.gms.measurement")).b().a();
        a2.f("measurement.redaction.app_instance_id", true);
        a = a2.f("measurement.redaction.client_ephemeral_aiid_generation", true);
        a2.f("measurement.redaction.config_redacted_fields", true);
        a2.f("measurement.redaction.device_info", true);
        b = a2.f("measurement.redaction.e_tag", true);
        a2.f("measurement.redaction.enhanced_uid", true);
        a2.f("measurement.redaction.populate_ephemeral_app_instance_id", true);
        a2.f("measurement.redaction.google_signals", true);
        a2.f("measurement.redaction.no_aiid_in_config_request", true);
        c = a2.f("measurement.redaction.retain_major_os_version", true);
        d = a2.f("measurement.redaction.scion_payload_generator", true);
        a2.f("measurement.redaction.upload_redacted_fields", true);
        a2.f("measurement.redaction.upload_subdomain_override", true);
        a2.f("measurement.redaction.user_id", true);
    }
    
    @Override
    public final boolean a() {
        return (boolean)arsa.a.c();
    }
    
    @Override
    public final boolean b() {
        return (boolean)arsa.b.c();
    }
    
    @Override
    public final boolean c() {
        return (boolean)arsa.c.c();
    }
    
    @Override
    public final boolean d() {
        return (boolean)arsa.d.c();
    }
    
    @Override
    public final void e() {
    }
}
