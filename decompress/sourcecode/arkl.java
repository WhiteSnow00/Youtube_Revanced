import android.util.Base64;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arkl implements arkk
{
    public static final qgp a;
    public static final qgp b;
    public static final qgp c;
    
    static {
        final qgn a2 = new qgn(qgc.a("com.google.android.gms.auth_account")).b().a();
        a2.c("getTokenRefactor__account_data_service_sample_percentage", 0.0);
        a2.f("getTokenRefactor__account_data_service_tokenAPI_usable", true);
        a2.d("getTokenRefactor__account_manager_timeout_seconds", 20L);
        a2.d("getTokenRefactor__android_id_shift", 0L);
        a2.f("getTokenRefactor__authenticator_logic_improved", false);
        try {
            a = a2.g("getTokenRefactor__blocked_packages", (Object)agzi.parseFrom(ahdy.a, Base64.decode("ChNjb20uYW5kcm9pZC52ZW5kaW5nCiBjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tZWV0aW5ncwohY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubWVzc2FnaW5n", 3)), (qgm)arkh.c);
            a2.f("getTokenRefactor__chimera_get_token_evolved", true);
            a2.d("getTokenRefactor__clear_token_timeout_seconds", 20L);
            a2.d("getTokenRefactor__default_task_timeout_seconds", 20L);
            b = a2.f("getTokenRefactor__gaul_accounts_api_evolved", false);
            c = a2.f("getTokenRefactor__gaul_token_api_evolved", false);
            a2.d("getTokenRefactor__get_token_timeout_seconds", 120L);
            a2.f("getTokenRefactor__gms_account_authenticator_evolved", true);
            a2.c("getTokenRefactor__gms_account_authenticator_sample_percentage", 0.0);
        }
        catch (final Exception ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    @Override
    public final ahdy a() {
        return (ahdy)arkl.a.c();
    }
    
    @Override
    public final boolean b() {
        return (boolean)arkl.b.c();
    }
    
    @Override
    public final boolean c() {
        return (boolean)arkl.c.c();
    }
}
