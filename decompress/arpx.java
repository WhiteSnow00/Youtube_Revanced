// 
// Decompiled by Procyon v0.6.0
// 

public final class arpx implements arpw
{
    public static final qjt a;
    public static final qjt b;
    public static final qjt c;
    public static final qjt d;
    public static final qjt e;
    public static final qjt f;
    public static final qjt g;
    public static final qjt h;
    public static final qjt i;
    public static final qjt j;
    public static final qjt k;
    public static final qjt l;
    public static final qjt m;
    
    static {
        final qjx f2 = new qjx("com.google.android.libraries.consentverifier").f();
        a = f2.d("CollectionBasisVerifierFeatures__enable_all_features", false);
        b = f2.d("CollectionBasisVerifierFeatures__enable_google_signature_check", false);
        c = f2.d("CollectionBasisVerifierFeatures__enable_load_failure_stack_trace", false);
        d = f2.d("CollectionBasisVerifierFeatures__enable_log_sampling", false);
        e = f2.d("CollectionBasisVerifierFeatures__enable_logging", false);
        f = f2.d("CollectionBasisVerifierFeatures__enable_logging_field_not_annotated", false);
        g = f2.d("CollectionBasisVerifierFeatures__enable_logging_uc_never_collect", false);
        h = f2.d("CollectionBasisVerifierFeatures__enable_use_proto_data_store", false);
        i = f2.d("CollectionBasisVerifierFeatures__enable_using_log_verifier_result", false);
        j = f2.b("CollectionBasisVerifierFeatures__failure_log_cooldown_period_ms", 86400000L);
        k = f2.a("CollectionBasisVerifierFeatures__log_sampling_rate", 1.0);
        l = f2.b("CollectionBasisVerifierFeatures__max_stack_trace_size", 1000L);
        m = f2.b("CollectionBasisVerifierFeatures__min_app_version_code_to_log", -1L);
    }
    
    @Override
    public final double a() {
        return (double)arpx.k.a();
    }
    
    @Override
    public final long b() {
        return (long)arpx.j.a();
    }
    
    @Override
    public final long c() {
        return (long)arpx.l.a();
    }
    
    @Override
    public final long d() {
        return (long)arpx.m.a();
    }
    
    @Override
    public final boolean e() {
        return (boolean)arpx.a.a();
    }
    
    @Override
    public final boolean f() {
        return (boolean)arpx.b.a();
    }
    
    @Override
    public final boolean g() {
        return (boolean)arpx.c.a();
    }
    
    @Override
    public final boolean h() {
        return (boolean)arpx.d.a();
    }
    
    @Override
    public final boolean i() {
        return (boolean)arpx.e.a();
    }
    
    @Override
    public final boolean j() {
        return (boolean)arpx.f.a();
    }
    
    @Override
    public final boolean k() {
        return (boolean)arpx.g.a();
    }
    
    @Override
    public final boolean l() {
        return (boolean)arpx.h.a();
    }
    
    @Override
    public final boolean m() {
        return (boolean)arpx.i.a();
    }
}
