// 
// Decompiled by Procyon v0.6.0
// 

public final class arko implements arkn
{
    public static final qhp a;
    public static final qhp b;
    public static final qhp c;
    public static final qhp d;
    public static final qhp e;
    public static final qhp f;
    public static final qhp g;
    public static final qhp h;
    public static final qhp i;
    public static final qhp j;
    public static final qhp k;
    public static final qhp l;
    public static final qhp m;
    
    static {
        final qht f2 = new qht("com.google.android.libraries.consentverifier").f();
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
        return (double)arko.k.a();
    }
    
    @Override
    public final long b() {
        return (long)arko.j.a();
    }
    
    @Override
    public final long c() {
        return (long)arko.l.a();
    }
    
    @Override
    public final long d() {
        return (long)arko.m.a();
    }
    
    @Override
    public final boolean e() {
        return (boolean)arko.a.a();
    }
    
    @Override
    public final boolean f() {
        return (boolean)arko.b.a();
    }
    
    @Override
    public final boolean g() {
        return (boolean)arko.c.a();
    }
    
    @Override
    public final boolean h() {
        return (boolean)arko.d.a();
    }
    
    @Override
    public final boolean i() {
        return (boolean)arko.e.a();
    }
    
    @Override
    public final boolean j() {
        return (boolean)arko.f.a();
    }
    
    @Override
    public final boolean k() {
        return (boolean)arko.g.a();
    }
    
    @Override
    public final boolean l() {
        return (boolean)arko.h.a();
    }
    
    @Override
    public final boolean m() {
        return (boolean)arko.i.a();
    }
}
