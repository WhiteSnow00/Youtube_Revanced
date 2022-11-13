import com.google.android.youtube.api.jar.client.a;
import java.util.concurrent.Executor;
import com.google.protos.youtube.api.innertube.SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adbr implements acaw
{
    final Object a;
    final Object b;
    private final int c;
    
    public adbr(final irh b, final abnk a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public adbr(final spv b, final aiqj a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final void m() {
        if (this.c != 0) {
            ((abnk)this.a).b();
            irh.c((irh)this.b);
            ((irh)this.b).b.f();
        }
    }
    
    public final void o(final boolean b) {
        if (this.c != 0) {
            irh.c((irh)this.b);
        }
    }
    
    public final void oN() {
        if (this.c != 0) {
            ((abnk)this.a).a();
            irh.c((irh)this.b);
            return;
        }
        final Object b = this.b;
        final Object a = this.a;
        final spv spv = (spv)b;
        tpe.x((Context)spv.c, 2132019305, 0);
        final SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint sharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint = (SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint)((ahbc)a).rx((ahaq)SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.sharePrivateVideoEndpoint);
        final ahaz builder = akui.a.createBuilder();
        final String b2 = sharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.b;
        builder.copyOnWrite();
        final akui akui = (akui)builder.instance;
        b2.getClass();
        akui.b |= 0x2;
        akui.f = b2;
        final ahaz builder2 = aktx.a.createBuilder();
        builder2.copyOnWrite();
        final aktx aktx = (aktx)builder2.instance;
        aktx.c = 2;
        aktx.b |= 0x1;
        builder.copyOnWrite();
        final akui akui2 = (akui)builder.instance;
        final aktx j = (aktx)builder2.build();
        j.getClass();
        akui2.j = j;
        akui2.b |= 0x200;
        final ahaz builder3 = aktq.a.createBuilder();
        builder3.copyOnWrite();
        final aktq aktq = (aktq)builder3.instance;
        aktq.c = 1;
        aktq.b |= 0x1;
        builder.copyOnWrite();
        final akui akui3 = (akui)builder.instance;
        final aktq k = (aktq)builder3.build();
        k.getClass();
        akui3.k = k;
        akui3.b |= 0x400;
        teu.n((aun)spv.d, ((adfs)spv.e).f(builder, (Executor)spv.g, ((aiqj)a).c.I()), (ttg)new a(spv, 1, null), (ttg)new ugi(spv, sharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint, 9, (byte[])null));
    }
}
