// 
// Decompiled by Procyon v0.6.0
// 

public final class arqq implements arqp
{
    public static final qis a;
    
    static {
        final qiq a2 = new qiq(qif.a("com.google.android.gms.measurement")).a();
        a2.f("measurement.client.consent_state_v1", true);
        a2.f("measurement.client.3p_consent_state_v1", true);
        a2.f("measurement.service.consent_state_v1_W36", true);
        a = a2.d("measurement.service.storage_consent_support_version", 203600L);
    }
    
    @Override
    public final long a() {
        return (long)arqq.a.c();
    }
}
