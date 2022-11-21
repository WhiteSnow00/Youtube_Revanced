import android.text.TextUtils;
import android.util.Pair;
import java.util.function.Consumer;
import j$.util.Optional;
import com.google.protos.youtube.api.innertube.DynamicFlowCommandOuterClass$DynamicFlowCommand;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class achd implements asmi
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public achd(final acha b, final acgz a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public achd(final adnc a, final Collection b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public achd(final adqh a, final afbh b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public achd(final fcd a, final DynamicFlowCommandOuterClass$DynamicFlowCommand b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public achd(final String a, final String b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final Object o) {
        final int c = this.c;
        if (c == 0) {
            final Object a = this.a;
            final Object b = this.b;
            final ajvq ajvq = (ajvq)o;
            int an;
            if ((an = aexq.an(((DynamicFlowCommandOuterClass$DynamicFlowCommand)b).d)) == 0) {
                an = 1;
            }
            if (ajvq != null && (ajvq.b.b & 0x4) != 0x0) {
                if (--an != 1) {
                    if (an == 2) {
                        if ((0x2 & ajvq.getDynamicCommands().b) != 0x0) {
                            final Object a2 = ((fcd)a).a;
                            aisc aisc;
                            if ((aisc = ajvq.getDynamicCommands().d) == null) {
                                aisc = aisc.a;
                            }
                            ((veh)a2).a(aisc);
                        }
                    }
                }
                else if ((ajvq.getDynamicCommands().b & 0x1) != 0x0) {
                    final Object a3 = ((fcd)a).a;
                    aisc aisc2;
                    if ((aisc2 = ajvq.getDynamicCommands().c) == null) {
                        aisc2 = aisc.a;
                    }
                    ((veh)a3).a(aisc2);
                }
            }
            return;
        }
        if (c == 1) {
            final Object b2 = this.b;
            final Object a4 = this.a;
            final Long n = (Long)o;
            final acha acha = (acha)b2;
            final xab a5 = acha.a;
            final xbe b3 = acha.b;
            final acgz acgz = (acgz)a4;
            a5.u(b3, acgz.a, acha.c);
            acgz.b.compareAndSet(1, 2);
            return;
        }
        if (c == 2) {
            final Object a6 = this.a;
            final Object b4 = this.b;
            final int intValue = (int)o;
            Optional optional = Optional.empty();
            if (intValue != 1 && intValue != 2 && intValue != 3) {
                if (intValue == 7) {
                    optional = Optional.of((Object)apkf.aF);
                }
            }
            else {
                optional = Optional.of((Object)apkf.aE);
            }
            optional.ifPresent((Consumer)new xbq((adnc)a6, (Collection)b4, 9));
            return;
        }
        if (c != 3) {
            final Object a7 = this.a;
            final Object b5 = this.b;
            final ahcr ahcr = (ahcr)o;
            final Pair pair = (Pair)((afbh)b5).c();
            final String ac = (String)pair.first;
            ahcr.copyOnWrite();
            final adoj adoj = (adoj)ahcr.instance;
            final adoj a8 = adoj.a;
            ac.getClass();
            adoj.c |= 0x200000;
            adoj.ac = ac;
            final String d = ((aowm)pair.second).d;
            ahcr.copyOnWrite();
            final adoj adoj2 = (adoj)ahcr.instance;
            d.getClass();
            adoj2.c |= 0x100000;
            adoj2.ab = d;
            final adog l = ((adqh)a7).e.l((long)((aowm)pair.second).c);
            ahcr.copyOnWrite();
            final adoj adoj3 = (adoj)ahcr.instance;
            l.getClass();
            adoj3.ae = l;
            adoj3.c |= 0x800000;
            return;
        }
        final Object a9 = this.a;
        final Object b6 = this.b;
        final ahcr ahcr2 = (ahcr)o;
        if (!TextUtils.isEmpty((CharSequence)a9)) {
            ahcr2.copyOnWrite();
            final adoj adoj4 = (adoj)ahcr2.instance;
            final adoj a10 = adoj.a;
            a9.getClass();
            adoj4.c |= 0x80;
            adoj4.L = (String)a9;
        }
        if (!TextUtils.isEmpty((CharSequence)b6)) {
            ahcr2.copyOnWrite();
            final adoj adoj5 = (adoj)ahcr2.instance;
            final adoj a11 = adoj.a;
            b6.getClass();
            adoj5.c |= 0x40;
            adoj5.K = (String)b6;
        }
    }
}
