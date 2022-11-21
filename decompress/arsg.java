// 
// Decompiled by Procyon v0.6.0
// 

public final class arsg implements arsf
{
    public static final qis a;
    public static final qis b;
    public static final qis c;
    public static final qis d;
    
    static {
        final qiq a2 = new qiq(qif.a("com.google.android.gms.measurement")).b().a();
        a = a2.f("measurement.collection.enable_session_stitching_token.client.dev", true);
        b = a2.f("measurement.session_stitching_token_enabled", false);
        c = a2.f("measurement.collection.enable_session_stitching_token.service", false);
        d = a2.f("measurement.collection.enable_session_stitching_token.service_new", true);
        a2.d("measurement.id.collection.enable_session_stitching_token.client.dev", 0L);
    }
    
    @Override
    public final boolean a() {
        return (boolean)arsg.a.c();
    }
    
    @Override
    public final boolean b() {
        return (boolean)arsg.b.c();
    }
    
    @Override
    public final boolean c() {
        return (boolean)arsg.c.c();
    }
    
    @Override
    public final boolean d() {
        return (boolean)arsg.d.c();
    }
    
    @Override
    public final void e() {
    }
}
