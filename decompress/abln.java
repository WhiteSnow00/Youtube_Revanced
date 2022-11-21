import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.WatchPlaylistEndpointOuterClass;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abln extends abkt
{
    public static final String g(final apvf apvf) {
        String c;
        if ((apvf.b & 0x1) != 0x0) {
            c = apvf.c;
        }
        else {
            c = "";
        }
        return c;
    }
    
    public final ahci a() {
        return WatchPlaylistEndpointOuterClass.watchPlaylistEndpoint;
    }
    
    public final /* bridge */ String c(final Object o) {
        return g((apvf)o);
    }
    
    public final String d(final Object o) {
        final apvf apvf = (apvf)o;
        return "";
    }
    
    public final /* bridge */ boolean e(final Object o, final Object o2) {
        final apvf apvf = (apvf)o;
        final apvf apvf2 = (apvf)o2;
        final boolean c = aexq.c(apvf, apvf2);
        boolean b = true;
        if (!c) {
            if (TextUtils.equals((CharSequence)g(apvf), (CharSequence)g(apvf2)) && Math.abs(apvf.d - apvf2.d) <= 1) {
                return true;
            }
            b = false;
        }
        return b;
    }
    
    public final /* bridge */ lrt q(final Object o) {
        final apvf apvf = (apvf)o;
        final ahcr builder = ((ahcz)lrt.a).createBuilder();
        builder.copyOnWrite();
        final lrt lrt = (lrt)builder.instance;
        lrt.b |= 0x1;
        lrt.d = "";
        final String g = g(apvf);
        builder.copyOnWrite();
        final lrt lrt2 = (lrt)builder.instance;
        g.getClass();
        lrt2.b |= 0x2;
        lrt2.f = g;
        final int d = apvf.d;
        builder.copyOnWrite();
        final lrt lrt3 = (lrt)builder.instance;
        lrt3.b |= 0x4;
        lrt3.g = d;
        final String e = apvf.e;
        builder.copyOnWrite();
        final lrt lrt4 = (lrt)builder.instance;
        e.getClass();
        lrt4.b |= 0x10;
        lrt4.i = e;
        builder.copyOnWrite();
        final lrt lrt5 = (lrt)builder.instance;
        lrt5.b |= 0x400;
        lrt5.o = "";
        builder.copyOnWrite();
        final lrt lrt6 = (lrt)builder.instance;
        lrt6.b |= 0x80;
        lrt6.l = false;
        builder.copyOnWrite();
        final lrt lrt7 = (lrt)builder.instance;
        lrt7.b |= 0x40;
        lrt7.k = false;
        builder.copyOnWrite();
        final lrt lrt8 = (lrt)builder.instance;
        lrt8.b |= 0x200;
        lrt8.n = 0L;
        return (lrt)builder.build();
    }
}
