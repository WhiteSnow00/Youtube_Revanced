// 
// Decompiled by Procyon v0.6.0
// 

public final class arrc implements arrb
{
    public static final qis a;
    public static final qis b;
    public static final qis c;
    
    static {
        final qiq a2 = new qiq(qif.a("com.google.android.gms.measurement")).a();
        a2.f("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        a = a2.f("measurement.audience.refresh_event_count_filters_timestamp", false);
        b = a2.f("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        c = a2.f("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }
    
    @Override
    public final boolean a() {
        return (boolean)arrc.a.c();
    }
    
    @Override
    public final boolean b() {
        return (boolean)arrc.b.c();
    }
    
    @Override
    public final boolean c() {
        return (boolean)arrc.c.c();
    }
    
    @Override
    public final void d() {
    }
}
