// 
// Decompiled by Procyon v0.6.0
// 

public final class armx implements armv
{
    public static final qhz a;
    public static final qhz b;
    public static final qhz c;
    public static final qhz d;
    
    static {
        final qhx qhx = new qhx(qhm.a("com.google.android.gms.auth_account"));
        final qhx a2 = new qhx(qhx.b, qhx.c, qhx.d, qhx.e, true, qhx.g).a();
        try {
            a = a2.g("CapabilityFeatures__blocked_packages_for_connectionless", (Object)ahfw.a, (qhw)armw.a);
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
    
    public final ahfw a() {
        return (ahfw)armx.a.c();
    }
    
    public final boolean b() {
        return (boolean)armx.b.c();
    }
    
    public final boolean c() {
        return (boolean)armx.c.c();
    }
    
    public final boolean d() {
        return (boolean)armx.d.c();
    }
}
