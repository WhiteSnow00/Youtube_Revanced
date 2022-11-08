import j$.util.Optional;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.List;
import android.text.TextUtils;
import java.util.Locale;
import java.util.Collection;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adew implements tgn
{
    private final atjj a;
    private final atjj b;
    private final atjj c;
    private final oas d;
    private final atjj e;
    
    public adew(final atjj a, final atjj b, final atjj c, final oas d, final atjj e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void a(final tgm tgm) {
        final tda tda = (tda)this.b.a();
        aoow aoow;
        if ((aoow = tda.f().e) == null) {
            aoow = aoow.a;
        }
        final boolean g = aoow.g;
        aoow aoow2;
        if ((aoow2 = tda.f().e) == null) {
            aoow2 = aoow.a;
        }
        final boolean p = aoow2.p;
        final Integer k = tgm.k;
        int intValue = 0;
        final boolean b = k != null;
        if (b) {
            final ArrayList list = new ArrayList();
            final Collection m = tgm.m;
            if (m != null && !m.isEmpty()) {
                for (final Object next : m) {
                    if (next instanceof viw) {
                        list.addAll((Collection)((viw)next).d);
                    }
                }
            }
            ((trw)this.e.a()).b(tgm.o, tgm.a, String.format(Locale.US, "Request failure captured by PRIMES. Failed reason: %d. Annotations: %s", tgm.k, TextUtils.join((CharSequence)",", (Iterable)list)), tgm.n);
        }
        if (!g && (!p || !b)) {
            return;
        }
        final Long e = tgm.e;
        final pzj a = pzj.a;
        final String a2 = tgm.a;
        long n;
        if (e == null) {
            n = this.d.c();
        }
        else {
            n = e;
        }
        final qdr d = qdr.d(a, a2, n);
        final String i = tgm.i;
        if (i != null) {
            d.i(i);
        }
        final String b2 = tgm.b;
        if (b2 != null) {
            d.f(b2);
        }
        final Long c = tgm.c;
        int intValue2;
        if (c != null) {
            intValue2 = c.intValue();
        }
        else {
            intValue2 = 0;
        }
        final Long d2 = tgm.d;
        if (d2 != null) {
            intValue = d2.intValue();
        }
        d.e(intValue2, intValue);
        final Integer h = tgm.h;
        if (h != null) {
            d.g((int)h);
        }
        final Long f = tgm.f;
        if (f != null) {
            d.o(pzj.a, (long)f);
        }
        final Long g2 = tgm.g;
        if (g2 != null) {
            d.n(pzj.a, (long)g2);
        }
        final atxe b3 = atxe.b(tgm.j);
        if (b3 != null) {
            d.l(b3);
        }
        final Integer j = tgm.k;
        if (j != null) {
            d.k((int)j);
        }
        final Integer l = tgm.l;
        if (l != null) {
            d.j((int)l);
        }
        final agza builder = ((agzi)atwq.a).createBuilder();
        aoow aoow3;
        if ((aoow3 = tda.f().e) == null) {
            aoow3 = aoow.a;
        }
        if (aoow3.k) {
            final InteractionLoggingScreen a3 = ((wxs)this.a.a()).a();
            if (a3 != null) {
                final int a4 = a3.c().a;
                builder.copyOnWrite();
                final atwq atwq = (atwq)builder.instance;
                atwq.b |= 0x4;
                atwq.f = a4;
            }
        }
        aoow aoow4;
        if ((aoow4 = tda.f().e) == null) {
            aoow4 = aoow.a;
        }
        if (aoow4.g) {
            builder.copyOnWrite();
            final atwq atwq2 = (atwq)builder.instance;
            atwq2.g = 1;
            atwq2.b |= 0x8;
        }
        else {
            builder.copyOnWrite();
            final atwq atwq3 = (atwq)builder.instance;
            atwq3.g = 2;
            atwq3.b |= 0x8;
        }
        final Collection m2 = tgm.m;
        if (m2 != null && !m2.isEmpty()) {
            for (final Object next2 : m2) {
                if (next2 instanceof viw) {
                    final viw viw = (viw)next2;
                    d.m(viw.c);
                    final long longValue = viw.a;
                    builder.copyOnWrite();
                    final atwq atwq4 = (atwq)builder.instance;
                    atwq4.b |= 0x1;
                    atwq4.c = longValue;
                    final int b4 = viw.b;
                    builder.copyOnWrite();
                    final atwq atwq5 = (atwq)builder.instance;
                    atwq5.b |= 0x2;
                    atwq5.d = b4;
                    final afcr d3 = viw.d;
                    builder.copyOnWrite();
                    final atwq atwq6 = (atwq)builder.instance;
                    final agzy e2 = atwq6.e;
                    if (!e2.c()) {
                        atwq6.e = agzi.mutableCopy(e2);
                    }
                    agxl.addAll((Iterable)d3, (List)atwq6.e);
                    final vjr e3 = viw.e;
                    if (e3 != null) {
                        final int a5 = e3.a;
                        builder.copyOnWrite();
                        final atwq atwq7 = (atwq)builder.instance;
                        atwq7.b |= 0x10;
                        atwq7.h = a5;
                        final afcr b5 = e3.b;
                        builder.copyOnWrite();
                        final atwq atwq8 = (atwq)builder.instance;
                        final agzy i2 = atwq8.i;
                        if (!i2.c()) {
                            atwq8.i = agzi.mutableCopy(i2);
                        }
                        agxl.addAll((Iterable)b5, (List)atwq8.i);
                    }
                    final Optional f2 = viw.f;
                    builder.getClass();
                    f2.ifPresent((Consumer)new abtb(builder, 13));
                }
            }
        }
        final adio adio = (adio)this.c.a();
        final atwq d4 = (atwq)builder.build();
        if (!aeda.v((Object)d4, (Object)atwq.a)) {
            final agzc agzc = (agzc)((agzi)atwp.a).createBuilder();
            final agzg b6 = atwr.b;
            final agza builder2 = ((agzi)atwr.a).createBuilder();
            builder2.copyOnWrite();
            final atwr atwr = (atwr)builder2.instance;
            d4.getClass();
            atwr.d = d4;
            atwr.c |= 0x1;
            agzc.e((agyr)b6, builder2.build());
            d.h((atwp)agzc.build());
        }
        pzp.a().a.a(d);
    }
}
