import java.util.concurrent.Executor;
import com.google.protos.youtube.api.innertube.SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aczo implements abyu
{
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;
    
    public aczo(final iqh b, final ablk a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public aczo(final snr b, final aioe a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final void m() {
        if (this.c != 0) {
            ((ablk)this.a).b();
            iqh.c((iqh)this.b);
            ((iqh)this.b).b.f();
        }
    }
    
    public final void n() {
        if (this.c != 0) {
            ((ablk)this.a).a();
            iqh.c((iqh)this.b);
            return;
        }
        final Object b = this.b;
        final Object a = this.a;
        final snr snr = (snr)b;
        tmy.x((Context)snr.c, 2132019304, 0);
        final SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint sharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint = (SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint)((agzd)a).rr((agyr)SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.sharePrivateVideoEndpoint);
        final agza builder = ((agzi)aksf.a).createBuilder();
        final String b2 = sharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.b;
        builder.copyOnWrite();
        final aksf aksf = (aksf)builder.instance;
        b2.getClass();
        aksf.b |= 0x2;
        aksf.f = b2;
        final agza builder2 = ((agzi)akru.a).createBuilder();
        builder2.copyOnWrite();
        final akru akru = (akru)builder2.instance;
        akru.c = 2;
        akru.b |= 0x1;
        builder.copyOnWrite();
        final aksf aksf2 = (aksf)builder.instance;
        final akru j = (akru)builder2.build();
        j.getClass();
        aksf2.j = j;
        aksf2.b |= 0x200;
        final agza builder3 = ((agzi)akrn.a).createBuilder();
        builder3.copyOnWrite();
        final akrn akrn = (akrn)builder3.instance;
        akrn.c = 1;
        akrn.b |= 0x1;
        builder.copyOnWrite();
        final aksf aksf3 = (aksf)builder.instance;
        final akrn k = (akrn)builder3.build();
        k.getClass();
        aksf3.k = k;
        aksf3.b |= 0x400;
        tcp.n((aum)snr.d, ((addr)snr.e).f(builder, (Executor)snr.g, ((aioe)a).c.I()), (trb)new zfo(snr, 20, (byte[])null), (trb)new uef(snr, sharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint, 8, (byte[])null));
    }
    
    public final void o(final boolean b) {
        if (this.c != 0) {
            iqh.c((iqh)this.b);
        }
    }
}
