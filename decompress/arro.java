// 
// Decompiled by Procyon v0.6.0
// 

public final class arro implements arrn
{
    public static final qis a;
    
    static {
        final qiq a2 = new qiq(qif.a("com.google.android.gms.measurement")).a();
        a2.f("measurement.sdk.collection.enable_extend_user_property_size", true);
        a2.f("measurement.sdk.collection.last_deep_link_referrer2", true);
        a = a2.f("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        a2.d("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }
    
    @Override
    public final boolean a() {
        return (boolean)arro.a.c();
    }
}
