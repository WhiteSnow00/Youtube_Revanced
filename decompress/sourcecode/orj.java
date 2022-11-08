import com.google.android.libraries.elements.interfaces.ContentMode;
import java.util.ArrayList;
import android.view.View;
import com.google.android.libraries.elements.interfaces.ImageSourceProxy;
import j$.util.Objects;
import com.google.android.libraries.elements.interfaces.ImageProxy;
import android.widget.ImageView;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class orj
{
    private static final aeyr b;
    
    static {
        b = agnj.E((aeyr)fkp.h);
    }
    
    protected static ImageView a(final Context context) {
        return new ImageView(context);
    }
    
    public static argv b(final ImageProxy imageProxy) {
        final aglt a = ((ogs)imageProxy).a();
        if (a != null && a.K() == 154604025) {
            return argv.au(a.M());
        }
        return null;
    }
    
    static void c(final dsw dsw, @dyi final float n) {
        if (n > 0.0f) {
            final ouq ouq = new ouq(n);
            final int f = orc.F;
            orc.F(ouq, dsw.e, dsw.h());
        }
    }
    
    static boolean d(@dyi final dua dua, @dyi final dua dua2, @dyi final dua dua3) {
        return !Objects.equals(dua.b, dua.a) || !Objects.equals(dua2.b, dua2.a) || !Objects.equals(dua3.b, dua3.a);
    }
    
    static void e(final dci dci, final dwp dwp, @dyi final ImageProxy imageProxy) {
        if (dci != null) {
            final ogs ogs = (ogs)imageProxy;
            if (!ogs.a.isEmpty()) {
                final String url = ogs.a.get(0).url();
                if (url != null) {
                    final String scheme = oaw.i(url).getScheme();
                    if (("http".equals(scheme) || "https".equals(scheme)) && dwp.a > 0) {
                        if (dwp.b > 0) {
                            ((dci)((dng)dci.c()).v(dfh.b)).q(dwp.a, dwp.b);
                        }
                    }
                }
            }
        }
    }
    
    static void f(final dsw dsw, final ImageView imageView, @dyi final Boolean b, @dyi final oun oun) {
        final Context b2 = dsw.b;
        if (!oaw.l(b2)) {
            dbo.c(b2).i((View)imageView);
        }
        if (b != null && b) {
            imageView.setTag(2131428821, (Object)null);
        }
        if (oun != null) {
            oun.d();
            oun.a();
        }
    }
    
    protected static void g(final dsw dsw, final ImageView imageView, @dyi final ImageProxy imageProxy, @dyi final ImageProxy imageProxy2, @dyi final ImageProxy imageProxy3, @dyi final adcr adcr, @dyi final Boolean b, @dyi final orz orz, @dyi final oun oun, @dyi int size, final dci dci, final dwp dwp, @dyi final otd otd, @dyi final otl otl, @dyi final boolean b2) {
        if (dci == null) {
            if (b2 && !oaw.l(dsw.b)) {
                size = ((ogs)imageProxy).a.size();
                final StringBuilder sb = new StringBuilder("Failed to find a valid source for the image. Sources: ");
                sb.append(size);
                sb.append(". Please make sure image source array is not empty and each image source has proper remote url / client resource name / serialized image data.");
                otd.c(23, sb.toString(), orz);
            }
            return;
        }
        dci.a((dno)new ori());
        if (b != null && b) {
            final agza builder = ((agzi)aqdw.a).createBuilder();
            final ArrayList a = ((ogs)imageProxy).a;
            for (int size2 = a.size(), i = 0; i < size2; ++i) {
                final ImageSourceProxy imageSourceProxy = (ImageSourceProxy)a.get(i);
                final agza builder2 = ((agzi)aqdy.a).createBuilder();
                final long width = imageSourceProxy.width();
                builder2.copyOnWrite();
                final aqdy aqdy = (aqdy)builder2.instance;
                aqdy.b |= 0x8;
                aqdy.e = (int)width;
                final long height = imageSourceProxy.height();
                builder2.copyOnWrite();
                final aqdy aqdy2 = (aqdy)builder2.instance;
                aqdy2.b |= 0x10;
                aqdy2.f = (int)height;
                if (imageSourceProxy.url() != null) {
                    final String url = imageSourceProxy.url();
                    builder2.copyOnWrite();
                    final aqdy aqdy3 = (aqdy)builder2.instance;
                    url.getClass();
                    aqdy3.c = 1;
                    aqdy3.d = url;
                }
                builder.copyOnWrite();
                final aqdw aqdw = (aqdw)builder.instance;
                final aqdy aqdy4 = (aqdy)builder2.build();
                aqdy4.getClass();
                aqdw.a();
                aqdw.c.add(aqdy4);
            }
            imageView.setTag(2131428821, (Object)builder.build());
        }
        dci.r((doc)new orh(dwp, imageView, imageProxy, adcr, imageProxy2, imageProxy3, oun, otd, otl, size, null, null));
    }
    
    protected static void h(final dsw dsw, final dta dta, @dyi final ImageProxy imageProxy, @dyi int n, @dyi final otd otd, @dyi final ImageProxy imageProxy2, @dyi final ImageProxy imageProxy3, @dyi final orz orz, @dyi final boolean b, final elw elw, final elw elw2) {
        final Context b2 = dsw.b;
        elw2.a = new dwp(dta.H(), dta.a());
        final dci k = oaw.k(b2, imageProxy, imageProxy2, imageProxy3, dta.H(), dta.a(), b);
        if (k == null) {
            return;
        }
        if (n == 1) {
            k.l((dcm)orj.b.a());
        }
        final argv b3 = b(imageProxy);
        dci a = k;
        if (b3 != null) {
            a = k;
            if (b3.av() != null) {
                final aglt av = b3.av();
                n = av.b(4);
                float float1;
                if (n != 0) {
                    float1 = av.b.getFloat(n + av.a);
                }
                else {
                    float1 = 0.0f;
                }
                a = k;
                if (float1 > 0.01f) {
                    final Context b4 = dsw.b;
                    final dci dci = (dci)((dng)k).M((dds)new oqx(b4, orz, otd, imageProxy.contentMode(), oga.p(float1, b4.getResources().getDisplayMetrics())));
                    final ContentMode contentMode = imageProxy.contentMode();
                    final ContentMode content_MODE_UNKNOWN = ContentMode.CONTENT_MODE_UNKNOWN;
                    n = contentMode.ordinal();
                    djx djx;
                    if (n != 2) {
                        if (n != 4) {
                            djx = djx.c;
                        }
                        else {
                            djx = djx.d;
                        }
                    }
                    else {
                        djx = djx.a;
                    }
                    a = (dci)((dng)dci).x(djx);
                }
            }
        }
        elw.a = a;
    }
}
