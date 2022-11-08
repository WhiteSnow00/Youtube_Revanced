import com.google.protos.youtube.api.innertube.OfflineWatchEndpointOuterClass;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gdy implements gdr
{
    private final ajys a;
    
    public gdy(final String d, final String c, final String c2) {
        final agza builder = ((agzi)ajys.a).createBuilder();
        final agzc agzc = (agzc)((agzi)akbf.a).createBuilder();
        final akbe hd = akbe.hd;
        agzc.copyOnWrite();
        final akbf akbf = (akbf)agzc.instance;
        akbf.c = hd.sv;
        akbf.b |= 0x1;
        builder.copyOnWrite();
        final ajys ajys = (ajys)builder.instance;
        final akbf e = (akbf)agzc.build();
        e.getClass();
        ajys.e = e;
        ajys.b |= 0x1;
        final agza builder2 = ((agzi)ahgm.a).createBuilder();
        tsx.n(c2);
        builder2.copyOnWrite();
        final ahgm ahgm = (ahgm)builder2.instance;
        ahgm.b |= 0x2;
        ahgm.c = c2;
        builder.copyOnWrite();
        final ajys ajys2 = (ajys)builder.instance;
        final ahgm f = (ahgm)builder2.build();
        f.getClass();
        ajys2.f = f;
        ajys2.b |= 0x8;
        final agza builder3 = ((agzi)amuk.a).createBuilder();
        builder3.copyOnWrite();
        final amuk amuk = (amuk)builder3.instance;
        amuk.b |= 0x1;
        amuk.c = c;
        tsx.n(d);
        builder3.copyOnWrite();
        final amuk amuk2 = (amuk)builder3.instance;
        amuk2.b |= 0x2;
        amuk2.d = d;
        builder3.copyOnWrite();
        final amuk amuk3 = (amuk)builder3.instance;
        amuk3.b |= 0x4;
        amuk3.e = 0;
        final amuk amuk4 = (amuk)builder3.build();
        final agzc agzc2 = (agzc)((agzi)aioe.a).createBuilder();
        agzc2.e((agyr)OfflineWatchEndpointOuterClass.offlineWatchEndpoint, amuk4);
        builder.copyOnWrite();
        final ajys ajys3 = (ajys)builder.instance;
        final aioe d2 = (aioe)agzc2.build();
        d2.getClass();
        ajys3.d = d2;
        ajys3.c = 3;
        this.a = (ajys)builder.build();
    }
    
    @Override
    public final aioe a() {
        final ajys a = this.a;
        if (a.c == 3) {
            return (aioe)a.d;
        }
        return null;
    }
    
    @Override
    public final aioe b() {
        final ajys a = this.a;
        if (a.c == 2) {
            return (aioe)a.d;
        }
        return null;
    }
    
    @Override
    public final akbf c() {
        final ajys a = this.a;
        if ((a.b & 0x1) != 0x0) {
            akbf akbf;
            if ((akbf = a.e) == null) {
                akbf = akbf.a;
            }
            return akbf;
        }
        return null;
    }
    
    @Override
    public final Object d() {
        return this.a;
    }
    
    @Override
    public final String e() {
        final ajys a = this.a;
        if ((a.b & 0x8) != 0x0) {
            ahgm ahgm;
            if ((ahgm = a.f) == null) {
                ahgm = ahgm.a;
            }
            return ahgm.c;
        }
        return null;
    }
}
