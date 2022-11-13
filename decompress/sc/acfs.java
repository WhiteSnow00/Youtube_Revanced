import android.text.TextUtils;
import android.util.Pair;
import java.util.function.Consumer;
import j$.util.Optional;
import com.google.protos.youtube.api.innertube.DynamicFlowCommandOuterClass$DynamicFlowCommand;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acfs implements asjm
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public acfs(final acfp b, final acfo a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public acfs(final adln a, final Collection b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public acfs(final ados a, final aezp b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public acfs(final fca a, final DynamicFlowCommandOuterClass$DynamicFlowCommand b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public acfs(final String a, final String b, final int c) {
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
            final ajtr ajtr = (ajtr)o;
            int aa;
            if ((aa = aevy.aA(((DynamicFlowCommandOuterClass$DynamicFlowCommand)b).d)) == 0) {
                aa = 1;
            }
            if (ajtr != null && (ajtr.b.b & 0x4) != 0x0) {
                if (--aa != 1) {
                    if (aa == 2) {
                        if ((0x2 & ajtr.getDynamicCommands().b) != 0x0) {
                            final Object a2 = ((fca)a).a;
                            aiqj aiqj;
                            if ((aiqj = ajtr.getDynamicCommands().d) == null) {
                                aiqj = aiqj.a;
                            }
                            ((vcy)a2).a(aiqj);
                        }
                    }
                }
                else if ((ajtr.getDynamicCommands().b & 0x1) != 0x0) {
                    final Object a3 = ((fca)a).a;
                    aiqj aiqj2;
                    if ((aiqj2 = ajtr.getDynamicCommands().c) == null) {
                        aiqj2 = aiqj.a;
                    }
                    ((vcy)a3).a(aiqj2);
                }
            }
            return;
        }
        if (c == 1) {
            final Object b2 = this.b;
            final Object a4 = this.a;
            final Long n = (Long)o;
            final acfp acfp = (acfp)b2;
            final wyw a5 = acfp.a;
            final wzz b3 = acfp.b;
            final acfo acfo = (acfo)a4;
            a5.u(b3, acfo.a, acfp.c);
            acfo.b.compareAndSet(1, 2);
            return;
        }
        if (c == 2) {
            final Object a6 = this.a;
            final Object b4 = this.b;
            final int intValue = (int)o;
            Optional optional = Optional.empty();
            if (intValue != 1 && intValue != 2 && intValue != 3) {
                if (intValue == 7) {
                    optional = Optional.of((Object)apht.aF);
                }
            }
            else {
                optional = Optional.of((Object)apht.aE);
            }
            optional.ifPresent((Consumer)new xak((adln)a6, (Collection)b4, 6));
            return;
        }
        if (c != 3) {
            final Object a7 = this.a;
            final Object b5 = this.b;
            final ahaz ahaz = (ahaz)o;
            final Pair pair = (Pair)((aezp)b5).c();
            final String ac = (String)pair.first;
            ahaz.copyOnWrite();
            final admv admv = (admv)ahaz.instance;
            final admv a8 = admv.a;
            ac.getClass();
            admv.c |= 0x200000;
            admv.ac = ac;
            final String d = ((aoua)pair.second).d;
            ahaz.copyOnWrite();
            final admv admv2 = (admv)ahaz.instance;
            d.getClass();
            admv2.c |= 0x100000;
            admv2.ab = d;
            final adms q = ((ados)a7).e.q(((aoua)pair.second).c);
            ahaz.copyOnWrite();
            final admv admv3 = (admv)ahaz.instance;
            q.getClass();
            admv3.ae = q;
            admv3.c |= 0x800000;
            return;
        }
        final Object a9 = this.a;
        final Object b6 = this.b;
        final ahaz ahaz2 = (ahaz)o;
        if (!TextUtils.isEmpty((CharSequence)a9)) {
            ahaz2.copyOnWrite();
            final admv admv4 = (admv)ahaz2.instance;
            final admv a10 = admv.a;
            a9.getClass();
            admv4.c |= 0x80;
            admv4.L = (String)a9;
        }
        if (!TextUtils.isEmpty((CharSequence)b6)) {
            ahaz2.copyOnWrite();
            final admv admv5 = (admv)ahaz2.instance;
            final admv a11 = admv.a;
            b6.getClass();
            admv5.c |= 0x40;
            admv5.K = (String)b6;
        }
    }
}
