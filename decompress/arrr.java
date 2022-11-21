// 
// Decompiled by Procyon v0.6.0
// 

public final class arrr implements arrq
{
    public static final qis a;
    
    static {
        final qiq a2 = new qiq(qif.a("com.google.android.gms.measurement")).a();
        a2.d("measurement.id.lifecycle.app_in_background_parameter", 0L);
        a2.f("measurement.lifecycle.app_backgrounded_tracking", true);
        a = a2.f("measurement.lifecycle.app_in_background_parameter", false);
        a2.d("measurement.id.lifecycle.app_backgrounded_tracking", 0L);
    }
    
    @Override
    public final boolean a() {
        return (boolean)arrr.a.c();
    }
}
