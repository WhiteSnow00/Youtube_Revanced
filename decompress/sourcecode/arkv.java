// 
// Decompiled by Procyon v0.6.0
// 

public final class arkv implements arku
{
    public static final qgp a;
    
    static {
        final qgn a2 = new qgn(qgc.a("com.google.android.gms.droidguard")).a();
        a2.d("DroidguardCore__backend_reachability_check_timeout_millis", 30000L);
        a2.d("droidguard_client_timeout_millis", 60000L);
        a = a2.d("DroidguardCore__default_client_library_request_timeout_millis", 60000L);
        a2.f("DroidguardCore__disable_posix_signals_handling", false);
        a2.f("DroidguardCore__enable_backend_reachability_check", false);
        a2.d("DroidguardCore__fetch_creation_response_max_attempts", 2L);
        a2.d("droidguard_connection_timeout_millis", 30000L);
        a2.d("droidguard_read_timeout_millis", 30000L);
        a2.d("gms:droidguard:retry_backoff_seconds_base", 900L);
        a2.d("gms:droidguard:retry_backoff_seconds_limit", 28800L);
        a2.f("DroidguardCore__use_migrated_network_stack", false);
        a2.d("DroidguardCore__wait_on_init_timeout_millis", 0L);
    }
    
    @Override
    public final long a() {
        return (long)arkv.a.c();
    }
}
