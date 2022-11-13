import java.util.Iterator;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iie implements aacc
{
    private final vef a;
    private final zmf b;
    private final atke c;
    private final Executor d;
    private final vai e;
    
    public iie(final vef a, final zmf b, final atke c, final Executor d, final vai e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final aacb a(final amul amul) {
        return aacb.b;
    }
    
    public final ListenableFuture b(final zme zme, final amul amul) {
        final int c = amul.c;
        int cu;
        if ((cu = aqsx.cU(c)) == 0) {
            cu = 1;
        }
        if (--cu == 2) {
            final vee b = this.a.b();
            final amac amac = (amac)b.f(glb.u()).j(amac.class).af();
            aabz aabz;
            if (amac != null && amac.getItems() != null) {
                final ves n = ((vew)b).n();
                final afel d = afeq.d();
                for (final amad amad : amac.getItems()) {
                    if (amad.b == 1) {
                        final String s = (String)amad.c;
                        final ahaz builder = ((ahbh)amul.a).createBuilder();
                        builder.copyOnWrite();
                        final amul amul2 = (amul)builder.instance;
                        amul2.c = 2;
                        amul2.b |= 0x1;
                        final String f = vgl.f(197, vgl.i(s));
                        builder.copyOnWrite();
                        final amul amul3 = (amul)builder.instance;
                        f.getClass();
                        amul3.b |= 0x2;
                        amul3.d = f;
                        d.h(builder.build());
                    }
                }
                ((vfw)n).a(glb.u());
                fex.u((vfw)n, "Error deleting list entity and associated sub entities");
                final aaby a = aabz.a();
                a.a = 2;
                a.b(d.g());
                aabz = a.a();
            }
            else {
                aabz = aabz.a;
            }
            return afwm.m((Object)aabz);
        }
        if (cu != 3) {
            int cu2;
            if ((cu2 = aqsx.cU(c)) == 0) {
                cu2 = 1;
            }
            ttr.e("Could not handle action: %s for type %s", new Object[] { cu2 - 1, 136 });
            final aaby b2 = aabz.c.b();
            b2.b = 23;
            return afwm.m((Object)b2.a());
        }
        Object o;
        if (this.e.ak()) {
            o = aevf.f(vdh.aY(this.a.a(this.b.c()).f(glb.T()).C((asjr)ign.h).Y(asie.I(false)))).h((aftz)new igl(this, 19), this.d);
        }
        else {
            o = this.d();
        }
        return (ListenableFuture)o;
    }
    
    public final ListenableFuture c(final zme zme, final afeq afeq) {
        return afwm.m((Object)afeq.q());
    }
    
    public final ListenableFuture d() {
        return aftq.f((ListenableFuture)afvk.m(((lkx)this.c.a()).j()), (aftz)grs.c, (Executor)afum.a);
    }
}
