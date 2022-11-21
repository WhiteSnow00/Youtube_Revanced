// 
// Decompiled by Procyon v0.6.0
// 

public final class arrf implements arre
{
    public static final qis a;
    
    static {
        final qiq a2 = new qiq(qif.a("com.google.android.gms.measurement")).a();
        a = a2.f("measurement.client.sessions.check_on_reset_and_enable2", true);
        a2.f("measurement.client.sessions.check_on_startup", true);
        a2.f("measurement.client.sessions.start_session_before_view_screen", true);
    }
    
    @Override
    public final boolean a() {
        return (boolean)arrf.a.c();
    }
    
    @Override
    public final void b() {
    }
}
