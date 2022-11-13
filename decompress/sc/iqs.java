import java.util.List;
import java.util.concurrent.TimeUnit;
import com.google.protobuf.MessageLite;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iqs implements iqx
{
    public final Object a;
    private final Context b;
    private final aezp c;
    private final int d;
    private final Object e;
    private final Object f;
    
    public iqs(final Context b, final heo e, final oby a, final tjm f, final aezp c, final int d, final byte[] array, final byte[] array2) {
        this.d = d;
        this.b = b;
        this.e = e;
        this.a = a;
        this.f = f;
        this.c = c;
    }
    
    public iqs(final Context b, final heo a, final vai f, final fzw e, final aezp c, final int d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.f = f;
        this.e = e;
        this.c = c;
    }
    
    @Override
    public final afeq a(final imt imt) {
        if (this.d != 0) {
            final aezp c = this.c;
            afeq afeq;
            if (!c.h()) {
                afeq = afeq.q();
            }
            else {
                final amar amar = (amar)c.c();
                final Object a = this.a;
                final ahbf b = ajil.b;
                final ahaz builder = ajil.a.createBuilder();
                final aqfl ao = ((fzw)this.e).ao();
                builder.copyOnWrite();
                final ajil ajil = (ajil)builder.instance;
                ao.getClass();
                ajil.f = ao;
                ajil.c |= 0x20;
                final String e = amar.e();
                builder.copyOnWrite();
                final ajil ajil2 = (ajil)builder.instance;
                e.getClass();
                ajil2.c |= 0x1;
                ajil2.d = e;
                final ahbb ahbb = (ahbb)((ahbh)appk.a).createBuilder();
                final String videoId = amar.getVideoId();
                ((ahaz)ahbb).copyOnWrite();
                final appk appk = (appk)ahbb.instance;
                videoId.getClass();
                appk.b |= 0x1;
                appk.c = videoId;
                int d;
                if (!((vai)this.f).ax()) {
                    d = 155;
                }
                else {
                    d = 261;
                }
                ((ahaz)ahbb).copyOnWrite();
                final appk appk2 = (appk)ahbb.instance;
                appk2.b |= 0x2;
                appk2.d = d;
                final String v = glb.v((appk)((ahaz)ahbb).build());
                builder.copyOnWrite();
                final ajil ajil3 = (ajil)builder.instance;
                v.getClass();
                ajil3.c |= 0x100;
                ajil3.g = v;
                final String c2 = amar.getLocalizedStrings().c;
                builder.copyOnWrite();
                final ajil ajil4 = (ajil)builder.instance;
                c2.getClass();
                ajil4.c |= 0x2000;
                ajil4.k = c2;
                final String string = this.b.getString(2132017316);
                builder.copyOnWrite();
                final ajil ajil5 = (ajil)builder.instance;
                string.getClass();
                ajil5.c |= 0x400;
                ajil5.h = string;
                final String string2 = this.b.getString(2132018839);
                builder.copyOnWrite();
                final ajil ajil6 = (ajil)builder.instance;
                string2.getClass();
                ajil6.c |= 0x800;
                ajil6.i = string2;
                final String string3 = this.b.getString(2132017313);
                builder.copyOnWrite();
                final ajil ajil7 = (ajil)builder.instance;
                string3.getClass();
                ajil7.c |= 0x1000;
                ajil7.j = string3;
                final ahaz builder2 = ajij.a.createBuilder();
                final boolean ay = ((vai)this.f).ay();
                builder2.copyOnWrite();
                final ajij ajij = (ajij)builder2.instance;
                ajij.b |= 0x1;
                ajij.c = ay;
                final ajij e2 = (ajij)builder2.build();
                builder.copyOnWrite();
                final ajil ajil8 = (ajil)builder.instance;
                e2.getClass();
                ajil8.e = e2;
                ajil8.c |= 0x10;
                final aezp q = ((heo)a).q(2131951651, (ahaq)b, (Object)builder.build());
                if (!q.h()) {
                    afeq = afeq.q();
                }
                else {
                    final ahaz builder3 = ((ahbh)alkh.a).createBuilder();
                    final ajmo al = (ajmo)q.c();
                    builder3.copyOnWrite();
                    final alkh alkh = (alkh)builder3.instance;
                    alkh.al = al;
                    alkh.h |= 0x2000000;
                    afeq = afeq.r((Object)new iqv((MessageLite)builder3.build()));
                }
            }
            return afeq;
        }
        final int n = (int)TimeUnit.SECONDS.toDays((long)this.c.e((Object)0L) - TimeUnit.MILLISECONDS.toSeconds(((oby)this.a).c()));
        final ahaz builder4 = ajix.a.createBuilder();
        final String c3 = aevy.c(this.b.getString(2132019851));
        builder4.copyOnWrite();
        final ajix ajix = (ajix)builder4.instance;
        c3.getClass();
        ajix.c |= 0x40;
        ajix.e = c3;
        final String c4 = aevy.c(this.b.getString(2132019848));
        builder4.copyOnWrite();
        final ajix ajix2 = (ajix)builder4.instance;
        c4.getClass();
        ajix2.c |= 0x80;
        ajix2.f = c4;
        final String v2 = glb.V();
        builder4.copyOnWrite();
        final ajix ajix3 = (ajix)builder4.instance;
        v2.getClass();
        ajix3.c |= 0x100;
        ajix3.g = v2;
        final afeq a2 = zvg.a;
        builder4.copyOnWrite();
        final ajix ajix4 = (ajix)builder4.instance;
        final ahbp i = ajix4.i;
        if (!i.c()) {
            ajix4.i = ahbh.mutableCopy(i);
        }
        agzk.addAll((Iterable)a2, (List)ajix4.i);
        final String string4 = this.b.getString(2132019846);
        builder4.copyOnWrite();
        final ajix ajix5 = (ajix)builder4.instance;
        string4.getClass();
        ajix5.c |= 0x200;
        ajix5.h = string4;
        if (n < 0 && !((tjm)this.f).r()) {
            final String string5 = this.b.getString(2132019840);
            builder4.copyOnWrite();
            final ajix ajix6 = (ajix)builder4.instance;
            string5.getClass();
            ajix6.c |= 0x8;
            ajix6.d = string5;
        }
        else if (n <= 0) {
            final String string6 = this.b.getString(2132019839);
            builder4.copyOnWrite();
            final ajix ajix7 = (ajix)builder4.instance;
            string6.getClass();
            ajix7.c |= 0x8;
            ajix7.d = string6;
        }
        else {
            final String quantityString = this.b.getResources().getQuantityString(2131886152, n, new Object[] { n });
            builder4.copyOnWrite();
            final ajix ajix8 = (ajix)builder4.instance;
            quantityString.getClass();
            ajix8.c |= 0x8;
            ajix8.d = quantityString;
        }
        final aezp q2 = ((heo)this.e).q(2131951654, (ahaq)ajix.b, (Object)builder4.build());
        afeq afeq2;
        if (q2.h()) {
            final ahaz builder5 = ((ahbh)alkh.a).createBuilder();
            final ajmo al2 = (ajmo)q2.c();
            builder5.copyOnWrite();
            final alkh alkh2 = (alkh)builder5.instance;
            alkh2.al = al2;
            alkh2.h |= 0x2000000;
            afeq2 = afeq.r((Object)new iqv((MessageLite)builder5.build()));
        }
        else {
            afeq2 = afeq.q();
        }
        return afeq2;
    }
}
