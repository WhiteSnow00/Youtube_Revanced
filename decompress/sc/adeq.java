import j$.time.zone.ZoneRules;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.LocalTime;
import j$.time.LocalDate;
import android.text.format.DateUtils;
import android.content.Context;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adeq implements asjg
{
    public final Object a;
    public final ahbh b;
    private final int c;
    
    public adeq(final ftg a, final aipm b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = (ahbh)b;
    }
    
    public adeq(final ftg a, final aiws b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = (ahbh)b;
    }
    
    public adeq(final wiw a, final ahvl b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = (ahbh)b;
    }
    
    @Override
    public final void a() {
        final int c = this.c;
        if (c == 0) {
            final Object a = this.a;
            final aiws aiws = (aiws)this.b;
            if ((aiws.c & 0x4) != 0x0) {
                final String f = aiws.f;
                final int d = aiws.d;
                String e;
                if (aeuz.ad(d) == 2) {
                    final TimeUnit seconds = TimeUnit.SECONDS;
                    long longValue;
                    if (aiws.d == 1) {
                        longValue = (long)aiws.e;
                    }
                    else {
                        longValue = 0L;
                    }
                    e = DateUtils.formatDateTime((Context)((ftg)a).b, seconds.toMillis(longValue), ftg.e(aiws));
                }
                else {
                    if (aeuz.ad(d) != 6) {
                        return;
                    }
                    final Object b = ((ftg)a).b;
                    ajck a2;
                    if (d == 5) {
                        a2 = (ajck)aiws.e;
                    }
                    else {
                        a2 = ajck.a;
                    }
                    final LocalDate of = LocalDate.of(a2.b, a2.c, a2.d);
                    final LocalTime noon = LocalTime.NOON;
                    final ZoneRules rules = ZoneId.systemDefault().getRules();
                    final afsr a3 = afsr.a;
                    e = DateUtils.formatDateTime((Context)b, of.toEpochSecond(noon, rules.getOffset(Instant.now())) * 1000L, ftg.e(aiws));
                }
                final Object a4 = ((ftg)a).a;
                final ahaz builder = ((ahbh)aouu.a).createBuilder();
                builder.copyOnWrite();
                final aouu aouu = (aouu)builder.instance;
                f.getClass();
                aouu.b |= 0x1;
                aouu.c = f;
                builder.copyOnWrite();
                final aouu aouu2 = (aouu)builder.instance;
                e.getClass();
                aouu2.b |= 0x4;
                aouu2.e = e;
                ((otk)a4).b(f, ((agzk)builder.build()).toByteArray());
            }
            return;
        }
        if (c != 1) {
            final Object a5 = this.a;
            final ahbh b2 = this.b;
            final Object a6 = ((wiw)a5).a;
            final ahvl ahvl = (ahvl)b2;
            final String d2 = ahvl.d;
            aicn aicn;
            if ((aicn = ahvl.c) == null) {
                aicn = aicn.a;
            }
            ((atjs)((adet)a6).a).tu((Object)new adfn(d2, aicn));
            return;
        }
        final Object a7 = this.a;
        final aipm aipm = (aipm)this.b;
        if ((0x1 & aipm.c) != 0x0) {
            final Object a8 = ((ftg)a7).a;
            anmz anmz;
            if ((anmz = anmz.b(aipm.d)) == null) {
                anmz = anmz.a;
            }
            ((adeu)a8).c(anmz);
            return;
        }
        ((adeu)((ftg)a7).a).b();
    }
}
