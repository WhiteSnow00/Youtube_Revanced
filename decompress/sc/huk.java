import java.util.concurrent.Executor;
import com.google.android.apps.youtube.app.extensions.upload.UploadActivity;
import java.util.Iterator;
import com.google.android.apps.youtube.app.extensions.upload.UploadFrontendIdMapHelper;
import android.content.Context;
import java.util.Collection;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class huk implements ttg
{
    public final hun a;
    
    public huk(final hun a) {
        this.a = a;
    }
    
    public final void a(Object o) {
        final hun a = this.a;
        final heo heo = (heo)o;
        final Object c = heo.c;
        if (c != null) {
            a.A.a.putAll((Map)c);
        }
        final Object b = heo.b;
        if (b != null) {
            final UploadFrontendIdMapHelper a2 = a.A;
            final adkb c2 = a.C;
            for (final String s : b) {
                if (!a2.d(s)) {
                    if (a2.e(s)) {
                        a2.b(s, c2);
                    }
                    else {
                        c2.F(s, apho.f);
                        a2.c(s);
                    }
                }
            }
        }
        o = heo.a;
        a.B.addAll((Collection)o);
        if (a.B.isEmpty()) {
            ttr.l("nothing to upload");
            a.d();
            tpe.x((Context)a.a, 2132017993, 1);
            return;
        }
        for (final adop adop : a.B) {
            final String scheme = adop.a().getScheme();
            String concat = "";
            if (scheme != null) {
                concat = "".concat(String.valueOf(adop.a().getScheme()));
            }
            String string = concat;
            if (adop.a().getAuthority() != null) {
                final String authority = adop.a().getAuthority();
                final StringBuilder sb = new StringBuilder();
                sb.append(concat);
                sb.append("://");
                sb.append(authority);
                string = sb.toString();
            }
            o = adop.j;
            long e = 0L;
            if (o != null) {
                final admo admo = (admo)o;
                e = e;
                if ((0x4 & admo.b) != 0x0) {
                    e = admo.e;
                }
            }
            final adlp d = a.D;
            final String c3 = adop.c();
            final aphs b2 = adop.b();
            final aphn a3 = aphn.a;
            final aphc a4 = aphd.a();
            final apht g = apht.G;
            ((ahaz)a4).copyOnWrite();
            aphd.d((aphd)a4.instance, g);
            final ahaz builder = ((ahbh)aphe.a).createBuilder();
            builder.copyOnWrite();
            final aphe aphe = (aphe)builder.instance;
            aphe.b |= 0x1;
            aphe.c = c3;
            ((ahaz)a4).copyOnWrite();
            aphd.c((aphd)a4.instance, (aphe)builder.build());
            ((ahaz)a4).copyOnWrite();
            aphd.i((aphd)a4.instance, b2);
            ((ahaz)a4).copyOnWrite();
            aphd.j((aphd)a4.instance, string);
            ((ahaz)a4).copyOnWrite();
            aphd.k((aphd)a4.instance, e);
            ((ahaz)a4).copyOnWrite();
            aphd.l((aphd)a4.instance, a3);
            final aphd aphd = (aphd)((ahaz)a4).build();
            final aknr d2 = aknt.d();
            ((ahaz)d2).copyOnWrite();
            aknt.ar((aknt)d2.instance, aphd);
            ((Executor)d.b).execute(aeun.h((Runnable)new adfy(d, (aknt)((ahaz)d2).build(), 11)));
        }
        apin apin;
        if ((apin = a.Z.f().h) == null) {
            apin = apin.a;
        }
        final int q = apin.q;
        if (a.U == aphs.f && q > 0 && a.B.size() > q) {
            for (final adop adop2 : a.B) {
                final UploadFrontendIdMapHelper a5 = a.A;
                final String c4 = adop2.c();
                final adkb c5 = a.C;
                final aphu h = aphu.h;
                if (!a5.d(c4)) {
                    c5.f(c4, h);
                    a5.b.add(c4);
                }
            }
            a.B.clear();
            final UploadActivity a6 = a.a;
            a.m((faq)a6, (Context)a6, a6.getResources().getQuantityString(2131886156, q, new Object[] { q }));
        }
        a.O = 0;
        final Iterator iterator4 = a.B.iterator();
        while (iterator4.hasNext()) {
            if (a.A.d(((adop)iterator4.next()).c())) {
                iterator4.remove();
                ++a.O;
            }
        }
        if (a.O > 0) {
            a.o();
        }
        a.w(4);
    }
}
