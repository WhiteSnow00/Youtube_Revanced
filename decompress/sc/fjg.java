import android.os.Parcelable;
import com.google.protobuf.MessageLite;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import android.os.Bundle;
import android.content.Context;
import android.net.Uri;
import android.content.Intent;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import com.google.android.apps.youtube.app.common.endpoint.LoggingUrlsPingController;
import java.util.concurrent.Executor;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fjg implements vcv
{
    public final wyv a;
    private final fbb b;
    private final Activity c;
    private final acar d;
    private final Executor e;
    private final tov f;
    private final arwh g;
    private final vgy h;
    private final pvh i;
    
    public fjg(final Activity c, final vgy h, final fbb b, final LoggingUrlsPingController loggingUrlsPingController, final acar d, final wyv a, final Executor e, final tov f, final arwh g, final byte[] array, final byte[] array2, final byte[] array3) {
        loggingUrlsPingController.getClass();
        final pvh i = new pvh(loggingUrlsPingController);
        c.getClass();
        this.c = c;
        this.h = h;
        this.b = b;
        this.i = i;
        this.d = d;
        this.a = a;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    private final void d(final aiqj aiqj, final boolean c, final boolean d, final String s) {
        if ((aiqj.b & 0x1) != 0x0) {
            if (((ahbc)aiqj).ry((ahaq)UrlEndpointOuterClass.urlEndpoint)) {
                apir apir;
                if ((apir = ((apis)((ahbc)aiqj).rx((ahaq)UrlEndpointOuterClass.urlEndpoint)).f) == null) {
                    apir = apir.a;
                }
                if (apir.b) {
                    final ahaz builder = ((ahbh)alhi.a).createBuilder();
                    final ahaz builder2 = ((ahbh)algn.a).createBuilder();
                    final ahaz builder3 = ((ahbh)algh.a).createBuilder();
                    builder3.copyOnWrite();
                    final algh algh = (algh)builder3.instance;
                    algh.b |= 0x1;
                    algh.c = c;
                    builder3.copyOnWrite();
                    final algh algh2 = (algh)builder3.instance;
                    algh2.b |= 0x2;
                    algh2.d = d;
                    String e;
                    if ((e = s) == null) {
                        e = "EXTERNAL";
                    }
                    builder3.copyOnWrite();
                    final algh algh3 = (algh)builder3.instance;
                    algh3.b |= 0x4;
                    algh3.e = e;
                    builder2.copyOnWrite();
                    final algn algn = (algn)builder2.instance;
                    final algh d2 = (algh)builder3.build();
                    d2.getClass();
                    algn.d = d2;
                    algn.c = 9;
                    builder.copyOnWrite();
                    final alhi alhi = (alhi)builder.instance;
                    final algn v = (algn)builder2.build();
                    v.getClass();
                    alhi.v = v;
                    alhi.c |= 0x400;
                    final alhi alhi2 = (alhi)builder.build();
                    final wyv a = this.a;
                    a.getClass();
                    a.pF().w((wzz)new wyt(aiqj.c), alhi2);
                }
            }
        }
    }
    
    private final void e(final aiqj aiqj, final Map map) {
        if (this.b != null) {
            final HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", tpe.M(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag"));
            this.b.a(aili.b, (List)((apis)((ahbc)aiqj).rx((ahaq)UrlEndpointOuterClass.urlEndpoint)).e, (Map)hashMap);
        }
    }
    
    private final void f(final Intent intent, final Uri uri, final aiqj aiqj, final Map map) {
        tcg.c((Context)this.c, intent, uri);
        this.d(aiqj, false, false, null);
        this.e(aiqj, map);
        this.c.startActivity(intent.setFlags(268435456));
    }
    
    private final boolean g(final Uri uri, final aiqj aiqj, final Map map) {
        final acar d = this.d;
        if (d != null && d.h(this.c, uri)) {
            this.d(aiqj, true, false, this.d.g());
            this.e(aiqj, map);
            return true;
        }
        return false;
    }
    
    public final void b(final Intent intent, final Uri uri, final aiqj aiqj, final Map map, final boolean b) {
        if (b) {
            this.e(aiqj, map);
            return;
        }
        if (this.g(uri, aiqj, map)) {
            return;
        }
        this.f(intent, uri, aiqj, map);
    }
    
    public final void c(final Intent intent, final Uri uri, final aiqj aiqj, final Map map, final boolean b) {
        if (b) {
            final acar d = this.d;
            d.getClass();
            this.d(aiqj, true, true, d.g());
            this.e(aiqj, map);
            return;
        }
        if (this.g(uri, aiqj, map)) {
            return;
        }
        this.f(intent, uri, aiqj, map);
    }
    
    public final void mE(final aiqj aiqj, final Map map) {
        final vgy h = this.h;
        if (h != null) {
            h.o(tpe.M(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag"), ahrs.d);
        }
        Uri uri = ((LoggingUrlsPingController)this.i.a).j(((apis)((ahbc)aiqj).rx((ahaq)UrlEndpointOuterClass.urlEndpoint)).c, map);
        uri.getClass();
        String s = uri.toString();
        if (s.contains("ep://")) {
            s = s.replace("ep://", "");
            uri = Uri.parse(s);
            final boolean b = true;
        }
        else {
            final boolean b = false;
        }
        final Intent intent = new Intent("android.intent.action.VIEW", uri);
        if (!((Context)this.c).getPackageManager().queryIntentActivities(intent, 128).isEmpty()) {
            acak.q((Context)this.c, intent);
            if (!intent.toUri(0).isEmpty()) {
                final Activity c = this.c;
                final boolean b;
                if (c instanceof fa && b) {
                    final cl supportFragmentManager = ((bu)c).getSupportFragmentManager();
                    final gmr gmr = new gmr();
                    final Bundle bundle = new Bundle();
                    bundle.putString("URL_KEY", s);
                    bundle.putParcelable("navigation_endpoint", (Parcelable)new ParcelableMessageLite((MessageLite)aiqj));
                    gmr.ag(bundle);
                    gmr.rJ(supportFragmentManager, "WEB_VIEW_BOTTOM_SHEET_TAG");
                    final tov f = this.f;
                    if (f != null) {
                        f.d(false);
                    }
                    return;
                }
            }
            if (intent.getPackage() == null) {
                if (this.d != null && ((apis)((ahbc)aiqj).rx((ahaq)UrlEndpointOuterClass.urlEndpoint)).g) {
                    final acar d = this.d;
                    if (d != null) {
                        if (d.k()) {
                            teu.k(this.d.b(this.c, uri), this.e, (tes)new fjd(this, intent, uri, aiqj, map, 1), (tet)new fje(this, intent, uri, aiqj, map, 1));
                            return;
                        }
                    }
                }
                final fjf fjf = new fjf(this, aiqj);
                final ahqv y = qdw.y(this.g);
                if (y != null && y.I) {
                    final acar d2 = this.d;
                    if (d2 != null) {
                        teu.k(d2.a(this.c, uri, (acap)fjf), this.e, (tes)new fjd(this, intent, uri, aiqj, map, 0), (tet)new fje(this, intent, uri, aiqj, map, 0));
                        return;
                    }
                }
                if (this.g(uri, aiqj, map)) {
                    return;
                }
            }
            this.f(intent, uri, aiqj, map);
            return;
        }
        tpe.x((Context)this.c, 2132017998, 0);
        this.e(aiqj, map);
    }
}
