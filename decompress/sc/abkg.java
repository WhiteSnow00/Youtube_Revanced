import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.WatchPlaylistEndpointOuterClass;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abkg extends abjm
{
    public static final String g(final apst apst) {
        String c;
        if ((apst.b & 0x1) != 0x0) {
            c = apst.c;
        }
        else {
            c = "";
        }
        return c;
    }
    
    public final ahaq a() {
        return (ahaq)WatchPlaylistEndpointOuterClass.watchPlaylistEndpoint;
    }
    
    @Override
    public final /* bridge */ String c(final Object o) {
        return g((apst)o);
    }
    
    @Override
    public final String d(final Object o) {
        final apst apst = (apst)o;
        return "";
    }
    
    @Override
    public final /* bridge */ boolean e(final Object o, final Object o2) {
        final apst apst = (apst)o;
        final apst apst2 = (apst)o2;
        final boolean ae = adkp.ae((Object)apst, (Object)apst2);
        boolean b = true;
        if (!ae) {
            if (TextUtils.equals((CharSequence)g(apst), (CharSequence)g(apst2)) && Math.abs(apst.d - apst2.d) <= 1) {
                return true;
            }
            b = false;
        }
        return b;
    }
    
    @Override
    public final /* bridge */ lrf q(final Object o) {
        final apst apst = (apst)o;
        final ahaz builder = ((ahbh)lrf.a).createBuilder();
        builder.copyOnWrite();
        final lrf lrf = (lrf)builder.instance;
        lrf.b |= 0x1;
        lrf.d = "";
        final String g = g(apst);
        builder.copyOnWrite();
        final lrf lrf2 = (lrf)builder.instance;
        g.getClass();
        lrf2.b |= 0x2;
        lrf2.f = g;
        final int d = apst.d;
        builder.copyOnWrite();
        final lrf lrf3 = (lrf)builder.instance;
        lrf3.b |= 0x4;
        lrf3.g = d;
        final String e = apst.e;
        builder.copyOnWrite();
        final lrf lrf4 = (lrf)builder.instance;
        e.getClass();
        lrf4.b |= 0x10;
        lrf4.i = e;
        builder.copyOnWrite();
        final lrf lrf5 = (lrf)builder.instance;
        lrf5.b |= 0x400;
        lrf5.o = "";
        builder.copyOnWrite();
        final lrf lrf6 = (lrf)builder.instance;
        lrf6.b |= 0x80;
        lrf6.l = false;
        builder.copyOnWrite();
        final lrf lrf7 = (lrf)builder.instance;
        lrf7.b |= 0x40;
        lrf7.k = false;
        builder.copyOnWrite();
        final lrf lrf8 = (lrf)builder.instance;
        lrf8.b |= 0x200;
        lrf8.n = 0L;
        return (lrf)builder.build();
    }
}
