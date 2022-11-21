import java.util.concurrent.TimeUnit;
import com.google.protos.youtube.api.innertube.OfflineWatchEndpointOuterClass;
import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abkv extends abkt
{
    public static aisc g(final String c, final String d, final int e) {
        final ahcr builder = ((ahcz)amyt.a).createBuilder();
        if (!TextUtils.isEmpty((CharSequence)c)) {
            builder.copyOnWrite();
            final amyt amyt = (amyt)builder.instance;
            c.getClass();
            amyt.b |= 0x1;
            amyt.c = c;
        }
        if (!TextUtils.isEmpty((CharSequence)d)) {
            builder.copyOnWrite();
            final amyt amyt2 = (amyt)builder.instance;
            d.getClass();
            amyt2.b |= 0x2;
            amyt2.d = d;
        }
        builder.copyOnWrite();
        final amyt amyt3 = (amyt)builder.instance;
        amyt3.b |= 0x4;
        amyt3.e = e;
        final ahct ahct = (ahct)((ahcz)aisc.a).createBuilder();
        ahct.e((ahci)OfflineWatchEndpointOuterClass.offlineWatchEndpoint, (Object)builder.build());
        return (aisc)((ahcr)ahct).build();
    }
    
    public static aisc m(final String c, final String d, final int e, final float f) {
        final ahcr builder = ((ahcz)amyt.a).createBuilder();
        if (!TextUtils.isEmpty((CharSequence)c)) {
            builder.copyOnWrite();
            final amyt amyt = (amyt)builder.instance;
            c.getClass();
            amyt.b |= 0x1;
            amyt.c = c;
        }
        if (!TextUtils.isEmpty((CharSequence)d)) {
            builder.copyOnWrite();
            final amyt amyt2 = (amyt)builder.instance;
            amyt2.b |= 0x2;
            amyt2.d = d;
        }
        builder.copyOnWrite();
        final amyt amyt3 = (amyt)builder.instance;
        amyt3.b |= 0x4;
        amyt3.e = e;
        builder.copyOnWrite();
        final amyt amyt4 = (amyt)builder.instance;
        amyt4.b |= 0x10;
        amyt4.f = f;
        final ahct ahct = (ahct)((ahcz)aisc.a).createBuilder();
        ahct.e((ahci)OfflineWatchEndpointOuterClass.offlineWatchEndpoint, (Object)builder.build());
        return (aisc)((ahcr)ahct).build();
    }
    
    public static final String n(final amyt amyt) {
        String d;
        if ((amyt.b & 0x2) != 0x0) {
            d = amyt.d;
        }
        else {
            d = "";
        }
        return d;
    }
    
    public static final String o(final amyt amyt) {
        String c;
        if ((amyt.b & 0x1) != 0x0) {
            c = amyt.c;
        }
        else {
            c = "";
        }
        return c;
    }
    
    public static final int p(final amyt amyt) {
        return aamr.h(amyt.e, n(amyt));
    }
    
    public final ahci a() {
        return OfflineWatchEndpointOuterClass.offlineWatchEndpoint;
    }
    
    public final /* bridge */ String c(final Object o) {
        return n((amyt)o);
    }
    
    public final /* bridge */ String d(final Object o) {
        return o((amyt)o);
    }
    
    public final /* bridge */ boolean e(final Object o, final Object o2) {
        final amyt amyt = (amyt)o;
        final amyt amyt2 = (amyt)o2;
        boolean b;
        if (aexq.c(amyt, amyt2)) {
            b = true;
        }
        else {
            final String n = n(amyt);
            final int p2 = p(amyt);
            final String n2 = n(amyt2);
            final int p3 = p(amyt2);
            if (TextUtils.equals((CharSequence)n, (CharSequence)n2) && (TextUtils.equals((CharSequence)"", (CharSequence)n) || p2 == p3)) {
                return TextUtils.equals((CharSequence)o(amyt), (CharSequence)o(amyt2));
            }
            b = false;
        }
        return b;
    }
    
    public final /* bridge */ lrt q(final Object o) {
        final amyt amyt = (amyt)o;
        final ahcr builder = ((ahcz)lrt.a).createBuilder();
        final String o2 = o(amyt);
        builder.copyOnWrite();
        final lrt lrt = (lrt)builder.instance;
        o2.getClass();
        lrt.b |= 0x1;
        lrt.d = o2;
        final String n = n(amyt);
        builder.copyOnWrite();
        final lrt lrt2 = (lrt)builder.instance;
        n.getClass();
        lrt2.b |= 0x2;
        lrt2.f = n;
        final int p = p(amyt);
        builder.copyOnWrite();
        final lrt lrt3 = (lrt)builder.instance;
        lrt3.b |= 0x4;
        lrt3.g = p;
        builder.copyOnWrite();
        final lrt lrt4 = (lrt)builder.instance;
        lrt4.b |= 0x400;
        lrt4.o = "";
        builder.copyOnWrite();
        final lrt lrt5 = (lrt)builder.instance;
        lrt5.b |= 0x80;
        lrt5.l = false;
        final boolean g = amyt.g;
        builder.copyOnWrite();
        final lrt lrt6 = (lrt)builder.instance;
        lrt6.b |= 0x100;
        lrt6.m = g;
        builder.copyOnWrite();
        final lrt lrt7 = (lrt)builder.instance;
        lrt7.b |= 0x40;
        lrt7.k = true;
        final long millis = TimeUnit.SECONDS.toMillis((long)amyt.f);
        builder.copyOnWrite();
        final lrt lrt8 = (lrt)builder.instance;
        lrt8.b |= 0x200;
        lrt8.n = millis;
        return (lrt)builder.build();
    }
}
