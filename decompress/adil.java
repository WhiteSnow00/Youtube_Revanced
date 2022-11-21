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

public final class adil implements tjw
{
    private final atnb a;
    private final atnb b;
    private final atnb c;
    private final oco d;
    private final atnb e;
    
    public adil(final atnb a, final atnb b, final atnb c, final oco d, final atnb e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void a(final tjv tjv) {
        final tgi tgi = (tgi)this.b.a();
        aotl aotl;
        if ((aotl = tgi.f().e) == null) {
            aotl = aotl.a;
        }
        final boolean g = aotl.g;
        aotl aotl2;
        if ((aotl2 = tgi.f().e) == null) {
            aotl2 = aotl.a;
        }
        final boolean p = aotl2.p;
        final Integer k = tjv.k;
        int intValue = 0;
        final boolean b = k != null;
        if (b) {
            final ArrayList list = new ArrayList();
            final Collection m = tjv.m;
            if (m != null && !m.isEmpty()) {
                for (final Object next : m) {
                    if (next instanceof vmh) {
                        list.addAll(((vmh)next).d);
                    }
                }
            }
            ((tvc)this.e.a()).b(tjv.o, tjv.a, String.format(Locale.US, "Request failure captured by PRIMES. Failed reason: %d. Annotations: %s", tjv.k, TextUtils.join((CharSequence)",", (Iterable)list)), tjv.n);
        }
        if (!g && (!p || !b)) {
            return;
        }
        final Long e = tjv.e;
        final qbl a = qbl.a;
        final String a2 = tjv.a;
        long n;
        if (e == null) {
            n = this.d.c();
        }
        else {
            n = e;
        }
        final qfu d = qfu.d(a, a2, n);
        final String i = tjv.i;
        if (i != null) {
            d.i(i);
        }
        final String b2 = tjv.b;
        if (b2 != null) {
            d.f(b2);
        }
        final Long c = tjv.c;
        int intValue2;
        if (c != null) {
            intValue2 = c.intValue();
        }
        else {
            intValue2 = 0;
        }
        final Long d2 = tjv.d;
        if (d2 != null) {
            intValue = d2.intValue();
        }
        d.e(intValue2, intValue);
        final Integer h = tjv.h;
        if (h != null) {
            d.g((int)h);
        }
        final Long f = tjv.f;
        if (f != null) {
            d.o(qbl.a, (long)f);
        }
        final Long g2 = tjv.g;
        if (g2 != null) {
            d.n(qbl.a, (long)g2);
        }
        final auay b3 = auay.b(tjv.j);
        if (b3 != null) {
            d.l(b3);
        }
        final Integer j = tjv.k;
        if (j != null) {
            d.k((int)j);
        }
        final Integer l = tjv.l;
        if (l != null) {
            d.j((int)l);
        }
        final ahcr builder = ((ahcz)auaj.a).createBuilder();
        aotl aotl3;
        if ((aotl3 = tgi.f().e) == null) {
            aotl3 = aotl.a;
        }
        if (aotl3.k) {
            final InteractionLoggingScreen a3 = ((xax)this.a.a()).a();
            if (a3 != null) {
                final int a4 = a3.c().a;
                builder.copyOnWrite();
                final auaj auaj = (auaj)builder.instance;
                auaj.b |= 0x4;
                auaj.f = a4;
            }
        }
        aotl aotl4;
        if ((aotl4 = tgi.f().e) == null) {
            aotl4 = aotl.a;
        }
        if (aotl4.g) {
            builder.copyOnWrite();
            final auaj auaj2 = (auaj)builder.instance;
            auaj2.g = 1;
            auaj2.b |= 0x8;
        }
        else {
            builder.copyOnWrite();
            final auaj auaj3 = (auaj)builder.instance;
            auaj3.g = 2;
            auaj3.b |= 0x8;
        }
        final Collection m2 = tjv.m;
        if (m2 != null && !m2.isEmpty()) {
            for (final Object next2 : m2) {
                if (next2 instanceof vmh) {
                    final vmh vmh = (vmh)next2;
                    d.m(vmh.c);
                    final long longValue = vmh.a;
                    builder.copyOnWrite();
                    final auaj auaj4 = (auaj)builder.instance;
                    auaj4.b |= 0x1;
                    auaj4.c = longValue;
                    final int b4 = vmh.b;
                    builder.copyOnWrite();
                    final auaj auaj5 = (auaj)builder.instance;
                    auaj5.b |= 0x2;
                    auaj5.d = b4;
                    final afgh d3 = vmh.d;
                    builder.copyOnWrite();
                    final auaj auaj6 = (auaj)builder.instance;
                    final ahdp e2 = auaj6.e;
                    if (!e2.c()) {
                        auaj6.e = ahcz.mutableCopy(e2);
                    }
                    ahbc.addAll((Iterable)d3, (List)auaj6.e);
                    final vnd e3 = vmh.e;
                    if (e3 != null) {
                        final int a5 = e3.a;
                        builder.copyOnWrite();
                        final auaj auaj7 = (auaj)builder.instance;
                        auaj7.b |= 0x10;
                        auaj7.h = a5;
                        final afgh b5 = e3.b;
                        builder.copyOnWrite();
                        final auaj auaj8 = (auaj)builder.instance;
                        final ahdp i2 = auaj8.i;
                        if (!i2.c()) {
                            auaj8.i = ahcz.mutableCopy(i2);
                        }
                        ahbc.addAll((Iterable)b5, (List)auaj8.i);
                    }
                    final Optional f2 = vmh.f;
                    builder.getClass();
                    f2.ifPresent((Consumer)new achl(builder, 6));
                }
            }
        }
        final adfe adfe = (adfe)this.c.a();
        final auaj d4 = (auaj)builder.build();
        if (!aexq.c(d4, auaj.a)) {
            final ahct ahct = (ahct)((ahcz)auai.a).createBuilder();
            final ahcx b6 = auak.b;
            final ahcr builder2 = ((ahcz)auak.a).createBuilder();
            builder2.copyOnWrite();
            final auak auak = (auak)builder2.instance;
            d4.getClass();
            auak.d = d4;
            auak.c |= 0x1;
            ahct.e((ahci)b6, (Object)builder2.build());
            d.h((auai)((ahcr)ahct).build());
        }
        qbs.a().a.a(d);
    }
}
