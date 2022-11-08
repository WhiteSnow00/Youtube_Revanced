import java.util.Iterator;
import j$.time.temporal.TemporalAmount;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class imh extends aacd
{
    public final thh a;
    private final SharedPreferences i;
    private final oas j;
    private final alm k;
    private final bhu l;
    
    public imh(final SharedPreferences i, final alm k, final arud arud, final int n, final thh a, final aamd aamd, final oas j, final bhu l, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        super(i, arud, n, aamd, (byte[])null, (byte[])null, (byte[])null);
        this.i = i;
        this.k = k;
        this.a = a;
        this.j = j;
        this.l = l;
    }
    
    public final long a() {
        return ((fmw)((tku)this.k.a).c()).l;
    }
    
    public final aext b() {
        return (aext)ihq.e;
    }
    
    public final aext c() {
        return (aext)new eto(this, 11);
    }
    
    public final afcr d() {
        final ArrayList list = new ArrayList((Collection<? extends E>)super.e);
        Collections.sort((List<Object>)list, aahf.b);
        return afcr.o((Collection)list);
    }
    
    public final Comparator e() {
        return aahf.f;
    }
    
    public final Comparator f() {
        return aahf.d;
    }
    
    public final void k(final amqx amqx) {
        if (amqx != null && (amqx.b & 0x1) != 0x0) {
            amqw amqw;
            if ((amqw = amqw.b(amqx.d)) == null) {
                amqw = amqw.a;
            }
            if (amqw == amqw.b) {
                amuv amuv;
                if ((amuv = amuv.b(amqx.c)) == null) {
                    amuv = amuv.a;
                }
                super.F(amuv);
                tcp.m(this.k.z(true), (tcn)idu.g);
                return;
            }
            if (amqw == amqw.d) {
                tcp.m(this.k.z(false), (tcn)idu.h);
                return;
            }
            if (amqw == amqw.c) {
                amuv amuv2;
                if ((amuv2 = amuv.b(amqx.c)) == null) {
                    amuv2 = amuv.a;
                }
                super.F(amuv2);
                tcp.m(((tku)this.k.a).b((aexg)new fmp(this.j.c(), 2)), (tcn)idu.j);
                tcp.m(this.k.z(true), (tcn)idu.i);
            }
        }
    }
    
    public final boolean l() {
        return this.i.getBoolean("offline_policy", true);
    }
    
    public final boolean m(final amva amva, final amqx amqx) {
        if (amqx == null) {
            final amuv v = this.v(amuv.a);
            Optional optional = null;
            Label_0092: {
                if (v != amuv.a) {
                    for (final amuu amuu : amva.e) {
                        amuv amuv;
                        if ((amuv = amuv.b(amuu.e)) == null) {
                            amuv = amuv.a;
                        }
                        if (amuv == v) {
                            optional = Optional.of((Object)amuu);
                            break Label_0092;
                        }
                    }
                }
                optional = Optional.empty();
            }
            if (optional.isPresent()) {
                final amuu amuu2 = (amuu)optional.get();
                if ((amuu2.b & 0x8) != 0x0) {
                    amum amum;
                    if ((amum = amum.b(amuu2.f)) == null) {
                        amum = amum.a;
                    }
                    if (amum == amum.c) {
                        return true;
                    }
                }
                if ((amuu2.b & 0x10) != 0x0 && amuu2.g) {
                    if (this.a() != 0L) {
                        if (this.l.F() <= 0) {
                            return !((List)amva.f).isEmpty() || this.P(amva);
                        }
                        if (!Instant.ofEpochMilli(this.j.c()).isAfter(Instant.ofEpochMilli(this.a()).plus((TemporalAmount)Duration.ofDays((long)this.l.F())))) {
                            return !((List)amva.f).isEmpty() || this.P(amva);
                        }
                    }
                    return true;
                }
            }
            return !((List)amva.f).isEmpty() || this.P(amva);
        }
        return false;
    }
    
    public final boolean n() {
        return true;
    }
}
