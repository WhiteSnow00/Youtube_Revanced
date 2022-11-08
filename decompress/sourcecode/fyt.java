import com.google.protos.youtube.api.innertube.UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint;
import java.util.List;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fyt implements fjo
{
    public static final String a;
    private final Handler b;
    private final vax c;
    private final Executor d;
    private final oas e;
    private final fjp f;
    private final fxo g;
    private final atjj h;
    private aexq i;
    private final long j;
    
    static {
        a = trn.a("MA.UMC");
    }
    
    public fyt(final fjp f, final vax c, final Handler b, final Executor d, final oas e, final fxo g, final uyi uyi, final atjj h) {
        this.i = (aexq)aewp.a;
        this.f = f;
        this.c = c;
        this.b = b;
        this.d = d;
        this.e = e;
        this.g = g;
        this.h = h;
        long az;
        if (uyi.aZ() > 0L) {
            az = uyi.aZ();
        }
        else {
            az = 15000L;
        }
        this.j = az;
    }
    
    private final void f() {
        if (this.i.h()) {
            ((fyo)this.i.c()).b();
            this.i = (aexq)aewp.a;
            this.f.n(this);
        }
    }
    
    public final fyo a(final String s) {
        if (this.i.h()) {
            if (((fyo)this.i.c()).b.equals(s)) {
                return (fyo)this.i.c();
            }
            ((fyo)this.i.c()).b();
        }
        this.i = aexq.k(new fyo(this.b, this.c, this.e, this.g, this.h, s, this.d, this.j));
        this.f.l(this);
        return (fyo)this.i.c();
    }
    
    public final void b(final String s, final fys fys) {
        final fyo a = this.a(s);
        final WeakReference weakReference = new WeakReference((T)fys);
        a.c.add(weakReference);
        final List h = a.h;
        if (h != null) {
            a.d(h, (List)afcr.r((Object)weakReference), (List)afcr.q(), (List)afcr.q(), (List)afcr.q(), a.b);
        }
    }
    
    public final void c(final String s, final fyr fyr) {
        final fyo a = this.a(s);
        final WeakReference weakReference = new WeakReference((T)fyr);
        a.d.add(weakReference);
        final List h = a.h;
        if (h != null) {
            a.d(h, (List)afcr.q(), (List)afcr.r((Object)weakReference), (List)afcr.q(), (List)afcr.q(), a.b);
        }
    }
    
    public final void d(final String s) {
        if (this.i.h() && ((fyo)this.i.c()).b.equals(s)) {
            this.f();
        }
    }
    
    public final void e(final UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint updatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint) {
        final fyo a = this.a(updatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint.c);
        final long j = this.j;
        if (a.i) {
            return;
        }
        a.a.postDelayed((Runnable)a, j);
        a.i = true;
    }
    
    @Override
    public final void oK(final fkk fkk) {
        if (fkk == fkk.a && this.i.h()) {
            this.f();
        }
    }
}
