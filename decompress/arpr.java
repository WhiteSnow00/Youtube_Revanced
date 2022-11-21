// 
// Decompiled by Procyon v0.6.0
// 

public final class arpr implements arpp
{
    public static final qis a;
    public static final qis b;
    public static final qis c;
    public static final qis d;
    
    static {
        final qiq qiq = new qiq(qif.a("com.google.android.gms.auth_account"));
        final qiq a2 = new qiq(qiq.b, qiq.c, qiq.d, qiq.e, true, qiq.g).a();
        try {
            a = a2.g("CapabilityFeatures__blocked_packages_for_connectionless", (Object)ahho.a, (qip)arpq.a);
            a2.f("CapabilityFeatures__debug_capability", false);
            b = a2.f("CapabilityFeatures__debug_connectionless", false);
            a2.f("CapabilityFeatures__enable_capability", false);
            a2.f("CapabilityFeatures__enable_fetch_capabilities_in_get_accounts", false);
            a2.f("CapabilityFeatures__enable_force_sync", true);
            a2.f("CapabilityFeatures__enable_force_sync_for_unknown_capability", true);
            a2.f("CapabilityFeatures__enable_logging_capability_app_visibility", true);
            c = a2.f("CapabilityFeatures__enable_logging_capability_latency", false);
            a2.f("CapabilityFeatures__enforce_app_visibility_restrictions", true);
            a2.f("CapabilityFeatures__update_seed_capability_alias_in_account_sync", false);
            d = a2.f("CapabilityFeatures__use_connectionless", false);
            a2.f("CapabilityFeatures__use_gaia_service_flags", true);
            a2.c("CapabilityFeatures__visibility_not_restricted_logging_sample_fractions", 0.01);
            a2.c("CapabilityFeatures__visibility_restricted_logging_sample_fractions", 1.0);
        }
        catch (final Exception ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    @Override
    public final ahho a() {
        return (ahho)arpr.a.c();
    }
    
    @Override
    public final boolean b() {
        return (boolean)arpr.b.c();
    }
    
    @Override
    public final boolean c() {
        return (boolean)arpr.c.c();
    }
    
    @Override
    public final boolean d() {
        return (boolean)arpr.d.c();
    }
}
