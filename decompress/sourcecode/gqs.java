import com.google.protos.youtube.api.innertube.GetLocationCommandOuterClass$GetLocationCommand;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gqs implements adap
{
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    
    public gqs(final fcu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public gqs(final nyg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a() {
        if (this.b != 0) {
            ((fcu)this.a).f();
            return;
        }
        final Object a = this.a;
        final agfc b = agfc.b;
        final nww nww = (nww)a;
        nww.a = b;
        final nyg b2 = nww.b;
        if (b2 != null) {
            final nws nws = (nws)b2;
            nws.g = false;
            nws.f = false;
            nws.e.e.f().a();
        }
    }
    
    public final void b() {
        if (this.b != 0) {
            ((fcu)this.a).f();
            return;
        }
        final Object a = this.a;
        final agfc e = agfc.e;
        final nww nww = (nww)a;
        nww.a = e;
        final nyg b = nww.b;
        if (b != null) {
            final nws nws = (nws)b;
            nws.g = false;
            nws.f = false;
            nws.e.e.f().a();
        }
    }
    
    public final void c() {
        if (this.b != 0) {
            final fcu fcu = (fcu)this.a;
            final GetLocationCommandOuterClass$GetLocationCommand d = fcu.d;
            if (d != null && (d.b & 0x10) != 0x0) {
                fcu.e();
            }
            return;
        }
        ((nyg)this.a).d();
    }
}
