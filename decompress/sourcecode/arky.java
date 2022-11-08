// 
// Decompiled by Procyon v0.6.0
// 

public final class arky implements arkx
{
    public static final qgp a;
    public static final qgp b;
    public static final qgp c;
    
    static {
        final qgn a2 = new qgn(qgc.a("com.google.android.gms.droidguard")).a();
        a2.f("FallbackResponseFeature__catch_all_signal_exceptions", false);
        a2.f("FallbackResponseFeature__enable_signal_selector", true);
        a = a2.f("FallbackResponseFeature__include_build_fingerprint_in_plaintext", true);
        a2.f("FallbackResponseFeature__include_copied_extra_keys", true);
        a2.f("FallbackResponseFeature__include_exception_and_versions_in_plaintext", true);
        b = a2.f("FallbackResponseFeature__include_exception_and_versions_in_plaintext_generalized", true);
        a2.f("FallbackResponseFeature__include_gms_core_version", true);
        a2.f("FallbackResponseFeature__include_gsid", true);
        a2.f("FallbackResponseFeature__include_key_attestation", false);
        c = a2.f("FallbackResponseFeature__include_versions_in_client_plaintext", true);
        a2.e("FallbackResponseFeature__main_signals", "5,7,8,9,0,1,2,3,4,6,10,11,12,13,14,19,20,21,27,24,25,26,28,22,29");
        a2.e("FallbackResponseFeature__per_flow_signal_overrides", "");
        a2.e("FallbackResponseFeature__safe_flows", "");
        a2.e("FallbackResponseFeature__safe_signals", "5,0,2,3,6,10,11,12,13,14,19,20,21,23,24,25,26");
    }
    
    @Override
    public final boolean a() {
        return (boolean)arky.a.c();
    }
    
    @Override
    public final boolean b() {
        return (boolean)arky.b.c();
    }
    
    @Override
    public final boolean c() {
        return (boolean)arky.c.c();
    }
}
