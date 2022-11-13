import android.content.Intent;
import java.util.List;
import com.google.protos.youtube.api.innertube.AppStoreEndpointOuterClass;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fce implements tcb, fxv
{
    private final aiqj a;
    private final vcy b;
    private final fxw c;
    private final geu d;
    private final fbb e;
    private boolean f;
    
    public fce(final aiqj a, final vcy b, final fxw c, final geu d, final fbb e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    private final void d() {
        this.b.e((List)((ahvd)((ahbc)this.a).rx((ahaq)AppStoreEndpointOuterClass.appStoreEndpoint)).g, (Object)null);
    }
    
    public final void a() {
    }
    
    public final void b(final int n, final int n2, final Intent intent) {
        if (n != 907) {
            return;
        }
        this.e.b(aili.c);
        this.d.k(4);
        if (n2 != 0) {
            return;
        }
        final fxw c = this.c;
        if (c.b) {
            this.d();
            return;
        }
        c.g((fxv)this);
        this.f = true;
    }
    
    public final void c() {
        if (this.f) {
            this.d();
            this.c.i((fxv)this);
        }
    }
}
