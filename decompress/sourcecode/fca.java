import android.content.Intent;
import java.util.List;
import com.google.protos.youtube.api.innertube.AppStoreEndpointOuterClass;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fca implements szw, fxn
{
    private final aioe a;
    private final vax b;
    private final fxo c;
    private final gem d;
    private final fax e;
    private boolean f;
    
    public fca(final aioe a, final vax b, final fxo c, final gem d, final fax e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    private final void d() {
        this.b.e((List)((ahtf)((agzd)this.a).rr((agyr)AppStoreEndpointOuterClass.appStoreEndpoint)).g, (Object)null);
    }
    
    public final void a() {
    }
    
    public final void b(final int n, final int n2, final Intent intent) {
        if (n != 907) {
            return;
        }
        this.e.b(aijk.c);
        this.d.k(4);
        if (n2 != 0) {
            return;
        }
        final fxo c = this.c;
        if (c.b) {
            this.d();
            return;
        }
        c.g(this);
        this.f = true;
    }
    
    public final void c() {
        if (this.f) {
            this.d();
            this.c.i(this);
        }
    }
}
