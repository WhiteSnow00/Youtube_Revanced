import java.util.concurrent.TimeUnit;
import com.google.protos.youtube.api.innertube.OfflineWatchEndpointOuterClass;
import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abjo extends abjm
{
    public static aiqj g(final String c, final String d, final int e) {
        final ahaz builder = ((ahbh)amwo.a).createBuilder();
        if (!TextUtils.isEmpty((CharSequence)c)) {
            builder.copyOnWrite();
            final amwo amwo = (amwo)builder.instance;
            c.getClass();
            amwo.b |= 0x1;
            amwo.c = c;
        }
        if (!TextUtils.isEmpty((CharSequence)d)) {
            builder.copyOnWrite();
            final amwo amwo2 = (amwo)builder.instance;
            d.getClass();
            amwo2.b |= 0x2;
            amwo2.d = d;
        }
        builder.copyOnWrite();
        final amwo amwo3 = (amwo)builder.instance;
        amwo3.b |= 0x4;
        amwo3.e = e;
        final ahbb ahbb = (ahbb)((ahbh)aiqj.a).createBuilder();
        ahbb.e((ahaq)OfflineWatchEndpointOuterClass.offlineWatchEndpoint, (Object)builder.build());
        return (aiqj)((ahaz)ahbb).build();
    }
    
    public static aiqj m(final String c, final String d, final int e, final float f) {
        final ahaz builder = ((ahbh)amwo.a).createBuilder();
        if (!TextUtils.isEmpty((CharSequence)c)) {
            builder.copyOnWrite();
            final amwo amwo = (amwo)builder.instance;
            c.getClass();
            amwo.b |= 0x1;
            amwo.c = c;
        }
        if (!TextUtils.isEmpty((CharSequence)d)) {
            builder.copyOnWrite();
            final amwo amwo2 = (amwo)builder.instance;
            amwo2.b |= 0x2;
            amwo2.d = d;
        }
        builder.copyOnWrite();
        final amwo amwo3 = (amwo)builder.instance;
        amwo3.b |= 0x4;
        amwo3.e = e;
        builder.copyOnWrite();
        final amwo amwo4 = (amwo)builder.instance;
        amwo4.b |= 0x10;
        amwo4.f = f;
        final ahbb ahbb = (ahbb)((ahbh)aiqj.a).createBuilder();
        ahbb.e((ahaq)OfflineWatchEndpointOuterClass.offlineWatchEndpoint, (Object)builder.build());
        return (aiqj)((ahaz)ahbb).build();
    }
    
    public static final String n(final amwo amwo) {
        String d;
        if ((amwo.b & 0x2) != 0x0) {
            d = amwo.d;
        }
        else {
            d = "";
        }
        return d;
    }
    
    public static final String o(final amwo amwo) {
        String c;
        if ((amwo.b & 0x1) != 0x0) {
            c = amwo.c;
        }
        else {
            c = "";
        }
        return c;
    }
    
    public static final int p(final amwo amwo) {
        return aakv.h(amwo.e, n(amwo));
    }
    
    public final ahaq a() {
        return (ahaq)OfflineWatchEndpointOuterClass.offlineWatchEndpoint;
    }
    
    @Override
    public final /* bridge */ String c(final Object o) {
        return n((amwo)o);
    }
    
    @Override
    public final /* bridge */ String d(final Object o) {
        return o((amwo)o);
    }
    
    @Override
    public final /* bridge */ boolean e(final Object o, final Object o2) {
        final amwo amwo = (amwo)o;
        final amwo amwo2 = (amwo)o2;
        boolean b;
        if (adkp.ae((Object)amwo, (Object)amwo2)) {
            b = true;
        }
        else {
            final String n = n(amwo);
            final int p2 = p(amwo);
            final String n2 = n(amwo2);
            final int p3 = p(amwo2);
            if (TextUtils.equals((CharSequence)n, (CharSequence)n2) && (TextUtils.equals((CharSequence)"", (CharSequence)n) || p2 == p3)) {
                return TextUtils.equals((CharSequence)o(amwo), (CharSequence)o(amwo2));
            }
            b = false;
        }
        return b;
    }
    
    @Override
    public final /* bridge */ lrf q(final Object o) {
        final amwo amwo = (amwo)o;
        final ahaz builder = ((ahbh)lrf.a).createBuilder();
        final String o2 = o(amwo);
        builder.copyOnWrite();
        final lrf lrf = (lrf)builder.instance;
        o2.getClass();
        lrf.b |= 0x1;
        lrf.d = o2;
        final String n = n(amwo);
        builder.copyOnWrite();
        final lrf lrf2 = (lrf)builder.instance;
        n.getClass();
        lrf2.b |= 0x2;
        lrf2.f = n;
        final int p = p(amwo);
        builder.copyOnWrite();
        final lrf lrf3 = (lrf)builder.instance;
        lrf3.b |= 0x4;
        lrf3.g = p;
        builder.copyOnWrite();
        final lrf lrf4 = (lrf)builder.instance;
        lrf4.b |= 0x400;
        lrf4.o = "";
        builder.copyOnWrite();
        final lrf lrf5 = (lrf)builder.instance;
        lrf5.b |= 0x80;
        lrf5.l = false;
        final boolean g = amwo.g;
        builder.copyOnWrite();
        final lrf lrf6 = (lrf)builder.instance;
        lrf6.b |= 0x100;
        lrf6.m = g;
        builder.copyOnWrite();
        final lrf lrf7 = (lrf)builder.instance;
        lrf7.b |= 0x40;
        lrf7.k = true;
        final long millis = TimeUnit.SECONDS.toMillis((long)amwo.f);
        builder.copyOnWrite();
        final lrf lrf8 = (lrf)builder.instance;
        lrf8.b |= 0x200;
        lrf8.n = millis;
        return (lrf)builder.build();
    }
}
