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

public final class fja implements vau
{
    public final wwu a;
    private final fax b;
    private final Activity c;
    private final abyo d;
    private final Executor e;
    private final tmp f;
    private final arud g;
    private final vwb h;
    private final qpt i;
    
    public fja(final Activity c, final vwb h, final fax b, final LoggingUrlsPingController loggingUrlsPingController, final abyo d, final wwu a, final Executor e, final tmp f, final arud g, final byte[] array, final byte[] array2, final byte[] array3) {
        loggingUrlsPingController.getClass();
        final qpt i = new qpt(loggingUrlsPingController);
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
    
    private final void d(final aioe aioe, final boolean c, final boolean d, String e) {
        if ((aioe.b & 0x1) != 0x0) {
            if (((agzd)aioe).rs((agyr)UrlEndpointOuterClass.urlEndpoint)) {
                apgn apgn;
                if ((apgn = ((apgo)((agzd)aioe).rr((agyr)UrlEndpointOuterClass.urlEndpoint)).f) == null) {
                    apgn = apgn.a;
                }
                if (apgn.b) {
                    final agza builder = ((agzi)alff.a).createBuilder();
                    final agza builder2 = ((agzi)alek.a).createBuilder();
                    final agza builder3 = ((agzi)alee.a).createBuilder();
                    builder3.copyOnWrite();
                    final alee alee = (alee)builder3.instance;
                    alee.b |= 0x1;
                    alee.c = c;
                    builder3.copyOnWrite();
                    final alee alee2 = (alee)builder3.instance;
                    alee2.b |= 0x2;
                    alee2.d = d;
                    if (e == null) {
                        e = "EXTERNAL";
                    }
                    builder3.copyOnWrite();
                    final alee alee3 = (alee)builder3.instance;
                    alee3.b |= 0x4;
                    alee3.e = e;
                    builder2.copyOnWrite();
                    final alek alek = (alek)builder2.instance;
                    final alee d2 = (alee)builder3.build();
                    d2.getClass();
                    alek.d = d2;
                    alek.c = 9;
                    builder.copyOnWrite();
                    final alff alff = (alff)builder.instance;
                    final alek v = (alek)builder2.build();
                    v.getClass();
                    alff.v = v;
                    alff.c |= 0x400;
                    final alff alff2 = (alff)builder.build();
                    final wwu a = this.a;
                    a.getClass();
                    a.n().w((wxz)new wws(aioe.c), alff2);
                }
            }
        }
    }
    
    private final void e(final aioe aioe, final Map map) {
        if (this.b != null) {
            final HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", tmy.M(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag"));
            this.b.a(aijk.b, (List)((apgo)((agzd)aioe).rr((agyr)UrlEndpointOuterClass.urlEndpoint)).e, (Map)hashMap);
        }
    }
    
    private final void f(final Intent intent, final Uri uri, final aioe aioe, final Map map) {
        tab.c((Context)this.c, intent, uri);
        this.d(aioe, false, false, null);
        this.e(aioe, map);
        this.c.startActivity(intent.setFlags(268435456));
    }
    
    private final boolean g(final Uri uri, final aioe aioe, final Map map) {
        final abyo d = this.d;
        if (d != null && d.h(this.c, uri)) {
            this.d(aioe, true, false, this.d.g());
            this.e(aioe, map);
            return true;
        }
        return false;
    }
    
    public final void b(final Intent intent, final Uri uri, final aioe aioe, final Map map, final boolean b) {
        if (b) {
            this.e(aioe, map);
            return;
        }
        if (this.g(uri, aioe, map)) {
            return;
        }
        this.f(intent, uri, aioe, map);
    }
    
    public final void c(final Intent intent, final Uri uri, final aioe aioe, final Map map, final boolean b) {
        if (b) {
            final abyo d = this.d;
            d.getClass();
            this.d(aioe, true, true, d.g());
            this.e(aioe, map);
            return;
        }
        if (this.g(uri, aioe, map)) {
            return;
        }
        this.f(intent, uri, aioe, map);
    }
    
    public final void mE(final aioe aioe, final Map map) {
        final vwb h = this.h;
        if (h != null) {
            h.p(tmy.M(map, (Object)"com.google.android.libraries.youtube.innertube.endpoint.tag"), ahpu.d);
        }
        Uri uri = ((LoggingUrlsPingController)this.i.a).j(((apgo)((agzd)aioe).rr((agyr)UrlEndpointOuterClass.urlEndpoint)).c, map);
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
            abyh.q((Context)this.c, intent);
            if (!intent.toUri(0).isEmpty()) {
                final Activity c = this.c;
                final boolean b;
                if (c instanceof fa && b) {
                    final cl supportFragmentManager = ((bu)c).getSupportFragmentManager();
                    final gmk gmk = new gmk();
                    final Bundle bundle = new Bundle();
                    bundle.putString("URL_KEY", s);
                    bundle.putParcelable("navigation_endpoint", (Parcelable)new ParcelableMessageLite((MessageLite)aioe));
                    gmk.ag(bundle);
                    gmk.rD(supportFragmentManager, "WEB_VIEW_BOTTOM_SHEET_TAG");
                    final tmp f = this.f;
                    if (f != null) {
                        f.b(false);
                    }
                    return;
                }
            }
            if (intent.getPackage() == null) {
                if (this.d != null && ((apgo)((agzd)aioe).rr((agyr)UrlEndpointOuterClass.urlEndpoint)).g) {
                    final abyo d = this.d;
                    if (d != null) {
                        if (d.k()) {
                            tcp.k(this.d.b(this.c, uri), this.e, (tcn)new fix(this, intent, uri, aioe, map, 1), (tco)new fiy(this, intent, uri, aioe, map, 1));
                            return;
                        }
                    }
                }
                final fiz fiz = new fiz(this, aioe);
                final ahox c2 = qcv.C(this.g);
                if (c2 != null && c2.J) {
                    final abyo d2 = this.d;
                    if (d2 != null) {
                        tcp.k(d2.a(this.c, uri, (abym)fiz), this.e, (tcn)new fix(this, intent, uri, aioe, map, 0), (tco)new fiy(this, intent, uri, aioe, map, 0));
                        return;
                    }
                }
                if (this.g(uri, aioe, map)) {
                    return;
                }
            }
            this.f(intent, uri, aioe, map);
            return;
        }
        tmy.x((Context)this.c, 2132017997, 0);
        this.e(aioe, map);
    }
}
