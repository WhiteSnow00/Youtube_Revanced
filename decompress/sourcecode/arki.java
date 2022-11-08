// 
// Decompiled by Procyon v0.6.0
// 

public final class arki implements arkg
{
    public static final qgp a;
    public static final qgp b;
    public static final qgp c;
    public static final qgp d;
    
    static {
        final qgn qgn = new qgn(qgc.a("com.google.android.gms.auth_account"));
        final qgn a2 = new qgn(qgn.b, qgn.c, qgn.d, qgn.e, true, qgn.g).a();
        try {
            a = a2.g("CapabilityFeatures__blocked_packages_for_connectionless", (Object)ahdy.a, (qgm)arkh.a);
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
    public final ahdy a() {
        return (ahdy)arki.a.c();
    }
    
    @Override
    public final boolean b() {
        return (boolean)arki.b.c();
    }
    
    @Override
    public final boolean c() {
        return (boolean)arki.c.c();
    }
    
    @Override
    public final boolean d() {
        return (boolean)arki.d.c();
    }
}
