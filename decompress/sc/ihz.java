import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ihz implements aacc
{
    private static amul d(final String d) {
        final ahaz builder = ((ahbh)amul.a).createBuilder();
        builder.copyOnWrite();
        final amul amul = (amul)builder.instance;
        amul.c = 3;
        amul.b |= 0x1;
        builder.copyOnWrite();
        final amul amul2 = (amul)builder.instance;
        d.getClass();
        amul2.b |= 0x2;
        amul2.d = d;
        final ahbb ahbb = (ahbb)((ahbh)amuj.b).createBuilder();
        final ahbf b = apyu.b;
        final ahaz builder2 = ((ahbh)apyu.a).createBuilder();
        builder2.copyOnWrite();
        final apyu apyu = (apyu)builder2.instance;
        apyu.c |= 0x2;
        apyu.e = true;
        builder2.copyOnWrite();
        final apyu apyu2 = (apyu)builder2.instance;
        apyu2.c |= 0x4;
        apyu2.f = true;
        ahbb.e((ahaq)b, (Object)builder2.build());
        final amuj e = (amuj)((ahaz)ahbb).build();
        builder.copyOnWrite();
        final amul amul3 = (amul)builder.instance;
        e.getClass();
        amul3.e = e;
        amul3.b |= 0x4;
        return (amul)builder.build();
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
        if (cu - 1 != 3) {
            int cu2;
            if ((cu2 = aqsx.cU(c)) == 0) {
                cu2 = 1;
            }
            ttr.e("Could not handle action: %s for type %s", new Object[] { cu2 - 1, 158 });
            return afwm.m((Object)aabz.c);
        }
        final aaby a = aabz.a();
        a.a = 2;
        a.b(afeq.s((Object)d(glb.V()), (Object)d(glb.A())));
        return afwm.m((Object)a.a());
    }
    
    public final ListenableFuture c(final zme zme, final afeq afeq) {
        return afwm.m((Object)afeq.q());
    }
}
