import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fvm implements fvp
{
    private final atjj a;
    private String b;
    private String c;
    private int d;
    private long e;
    
    public fvm(final atjj a) {
        this.b = "";
        this.c = "";
        this.a = a;
    }
    
    private final void e() {
        this.b = "";
        this.c = "";
        this.d = 0;
        this.e = 0L;
    }
    
    public final void b(final aalz aalz) {
        this.e = aalz.e();
    }
    
    public final void c() {
        if (!TextUtils.isEmpty((CharSequence)this.b)) {
            final fzo fzo = (fzo)this.a.a();
            tcp.m(((tku)((atjj)fzo.a).a()).b((aexg)new fvr(fzo, this.b, this.c, this.d, this.e, null, null)), (tcn)etg.o);
        }
    }
    
    public final boolean d() {
        return !TextUtils.isEmpty((CharSequence)this.b);
    }
    
    public final void f() {
        this.e();
    }
    
    public final void g(final aioe aioe, final fnu fnu) {
        final abin abin = new abin();
        if (!((agzd)aioe).rs((agyr)WatchEndpointOuterClass.watchEndpoint)) {
            this.e();
            return;
        }
        final lqb h = ((abhu)abin).h(aioe);
        if (h == null) {
            return;
        }
        this.b = h.d;
        this.c = h.f;
        this.d = h.g;
        this.e = h.n;
    }
}
