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

public final class adgz implements tis
{
    private final atke a;
    private final atke b;
    private final atke c;
    private final oby d;
    private final atke e;
    
    public adgz(final atke a, final atke b, final atke c, final oby d, final atke e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void a(final tir tir) {
        final tff tff = (tff)this.b.a();
        aoqz aoqz;
        if ((aoqz = tff.f().e) == null) {
            aoqz = aoqz.a;
        }
        final boolean g = aoqz.g;
        aoqz aoqz2;
        if ((aoqz2 = tff.f().e) == null) {
            aoqz2 = aoqz.a;
        }
        final boolean p = aoqz2.p;
        final Integer k = tir.k;
        int intValue = 0;
        final boolean b = k != null;
        if (b) {
            final ArrayList list = new ArrayList();
            final Collection m = tir.m;
            if (m != null && !m.isEmpty()) {
                for (final Object next : m) {
                    if (next instanceof vla) {
                        list.addAll((Collection)((vla)next).d);
                    }
                }
            }
            ((tua)this.e.a()).b(tir.o, tir.a, String.format(Locale.US, "Request failure captured by PRIMES. Failed reason: %d. Annotations: %s", tir.k, TextUtils.join((CharSequence)",", (Iterable)list)), tir.n);
        }
        if (!g && (!p || !b)) {
            return;
        }
        final Long e = tir.e;
        final qau a = qau.a;
        final String a2 = tir.a;
        long n;
        if (e == null) {
            n = this.d.c();
        }
        else {
            n = e;
        }
        final qfb d = qfb.d(a, a2, n);
        final String i = tir.i;
        if (i != null) {
            d.i(i);
        }
        final String b2 = tir.b;
        if (b2 != null) {
            d.f(b2);
        }
        final Long c = tir.c;
        int intValue2;
        if (c != null) {
            intValue2 = c.intValue();
        }
        else {
            intValue2 = 0;
        }
        final Long d2 = tir.d;
        if (d2 != null) {
            intValue = d2.intValue();
        }
        d.e(intValue2, intValue);
        final Integer h = tir.h;
        if (h != null) {
            d.g((int)h);
        }
        final Long f = tir.f;
        if (f != null) {
            d.o(qau.a, (long)f);
        }
        final Long g2 = tir.g;
        if (g2 != null) {
            d.n(qau.a, (long)g2);
        }
        final atyb b3 = atyb.b(tir.j);
        if (b3 != null) {
            d.l(b3);
        }
        final Integer j = tir.k;
        if (j != null) {
            d.k((int)j);
        }
        final Integer l = tir.l;
        if (l != null) {
            d.j((int)l);
        }
        final ahaz builder = atxn.a.createBuilder();
        aoqz aoqz3;
        if ((aoqz3 = tff.f().e) == null) {
            aoqz3 = aoqz.a;
        }
        if (aoqz3.k) {
            final InteractionLoggingScreen a3 = ((wzs)this.a.a()).a();
            if (a3 != null) {
                final int a4 = a3.c().a;
                builder.copyOnWrite();
                final atxn atxn = (atxn)builder.instance;
                atxn.b |= 0x4;
                atxn.f = a4;
            }
        }
        aoqz aoqz4;
        if ((aoqz4 = tff.f().e) == null) {
            aoqz4 = aoqz.a;
        }
        if (aoqz4.g) {
            builder.copyOnWrite();
            final atxn atxn2 = (atxn)builder.instance;
            atxn2.g = 1;
            atxn2.b |= 0x8;
        }
        else {
            builder.copyOnWrite();
            final atxn atxn3 = (atxn)builder.instance;
            atxn3.g = 2;
            atxn3.b |= 0x8;
        }
        final Collection m2 = tir.m;
        if (m2 != null && !m2.isEmpty()) {
            for (final Object next2 : m2) {
                if (next2 instanceof vla) {
                    final vla vla = (vla)next2;
                    d.m(vla.c);
                    final long longValue = vla.a;
                    builder.copyOnWrite();
                    final atxn atxn4 = (atxn)builder.instance;
                    atxn4.b |= 0x1;
                    atxn4.c = longValue;
                    final int b4 = vla.b;
                    builder.copyOnWrite();
                    final atxn atxn5 = (atxn)builder.instance;
                    atxn5.b |= 0x2;
                    atxn5.d = b4;
                    final afeq d3 = vla.d;
                    builder.copyOnWrite();
                    final atxn atxn6 = (atxn)builder.instance;
                    final ahbx e2 = atxn6.e;
                    if (!e2.c()) {
                        atxn6.e = ahbh.mutableCopy(e2);
                    }
                    agzk.addAll((Iterable)d3, (List)atxn6.e);
                    final vlw e3 = vla.e;
                    if (e3 != null) {
                        final int a5 = e3.a;
                        builder.copyOnWrite();
                        final atxn atxn7 = (atxn)builder.instance;
                        atxn7.b |= 0x10;
                        atxn7.h = a5;
                        final afeq b5 = e3.b;
                        builder.copyOnWrite();
                        final atxn atxn8 = (atxn)builder.instance;
                        final ahbx i2 = atxn8.i;
                        if (!i2.c()) {
                            atxn8.i = ahbh.mutableCopy(i2);
                        }
                        agzk.addAll((Iterable)b5, (List)atxn8.i);
                    }
                    final Optional f2 = vla.f;
                    builder.getClass();
                    f2.ifPresent((Consumer)new aaxy(builder, 20));
                }
            }
        }
        final adds adds = (adds)this.c.a();
        final atxn d4 = (atxn)builder.build();
        if (!adkp.ae((Object)d4, (Object)atxn.a)) {
            final ahbb ahbb = (ahbb)((ahbh)atxm.a).createBuilder();
            final ahbf b6 = atxo.b;
            final ahaz builder2 = atxo.a.createBuilder();
            builder2.copyOnWrite();
            final atxo atxo = (atxo)builder2.instance;
            d4.getClass();
            atxo.d = d4;
            atxo.c |= 0x1;
            ahbb.e((ahaq)b6, (Object)builder2.build());
            d.h((atxm)((ahaz)ahbb).build());
        }
        qaz.a().a.a(d);
    }
}
