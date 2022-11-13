import android.util.DisplayMetrics;
import java.util.Iterator;
import java.nio.charset.Charset;
import android.graphics.Rect;
import java.util.List;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acpc implements asjm
{
    public final Object a;
    private final int b;
    
    public acpc(final acpd a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public acpc(final addy a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public acpc(final adec a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public acpc(final adht a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public acpc(final adhw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public acpc(final adln a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public acpc(final admp a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public acpc(final adqc a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public acpc(final Long a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public acpc(final String a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public acpc(final String[] a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(Object o) {
        final int b = this.b;
        int a = 2;
        final int n = 1;
        switch (b) {
            default: {
                final Object a2 = this.a;
                final Throwable t = (Throwable)o;
                final int a3 = ((adlr)a2).a;
                final StringBuilder sb = new StringBuilder("AbstractUploadEntityRequirement Error while checking the requirement ");
                sb.append(a3);
                final String string = sb.toString();
                ttr.f("AbstractUploadEntityRequirement", string, t);
                ((adqc)a2).d.h(string, t);
                return;
            }
            case 18: {
                final Object a4 = this.a;
                final admv admv = (admv)o;
                final adqc adqc = (adqc)a4;
                if (adqc.c.a((Object)admv)) {
                    adqc.b.set(true);
                }
                return;
            }
            case 17: {
                final Object a5 = this.a;
                final Throwable t2 = (Throwable)o;
                final int a6 = ((adlr)a5).a;
                final StringBuilder sb2 = new StringBuilder("AbstractUploadEntityRequirement Error while observing the requirement ");
                sb2.append(a6);
                final String string2 = sb2.toString();
                ttr.f("AbstractUploadEntityRequirement", string2, t2);
                ((adqc)a5).d.h(string2, t2);
                return;
            }
            case 16: {
                final Object a7 = this.a;
                final admv admv2 = (admv)o;
                final adqc adqc2 = (adqc)a7;
                if (adqc2.c.a((Object)admv2)) {
                    adqc2.b.set(true);
                    ((adlr)a7).c();
                }
                return;
            }
            case 15: {
                final Object a8 = this.a;
                final ahaz ahaz = (ahaz)o;
                final Charset a9 = adoy.a;
                final long longValue = (long)a8;
                ahaz.copyOnWrite();
                final admv admv3 = (admv)ahaz.instance;
                final admv a10 = admv.a;
                admv3.c |= 0x100;
                admv3.M = longValue;
                return;
            }
            case 14: {
                final Object a11 = this.a;
                final ahaz ahaz2 = (ahaz)o;
                final Charset a12 = adoy.a;
                ahaz2.copyOnWrite();
                final admv admv4 = (admv)ahaz2.instance;
                final admv a13 = admv.a;
                a11.getClass();
                admv4.c |= 0x80;
                admv4.L = (String)a11;
                return;
            }
            case 13: {
                final Object a14 = this.a;
                final ahaz ahaz3 = (ahaz)o;
                ahaz3.copyOnWrite();
                final admv admv5 = (admv)ahaz3.instance;
                final admv a15 = admv.a;
                a14.getClass();
                admv5.B = (admp)a14;
                admv5.b |= 0x20000000;
                return;
            }
            case 12: {
                final Object a16 = this.a;
                final ahaz ahaz4 = (ahaz)o;
                ahaz4.copyOnWrite();
                final admv admv6 = (admv)ahaz4.instance;
                final admv a17 = admv.a;
                a16.getClass();
                admv6.B = (admp)a16;
                admv6.b |= 0x20000000;
                return;
            }
            case 11: {
                final Object a18 = this.a;
                final ahaz ahaz5 = (ahaz)o;
                ahaz5.copyOnWrite();
                final admv admv7 = (admv)ahaz5.instance;
                final admv a19 = admv.a;
                a18.getClass();
                admv7.B = (admp)a18;
                admv7.b |= 0x20000000;
                return;
            }
            case 10: {
                final Object a20 = this.a;
                final ahaz ahaz6 = (ahaz)o;
                ahaz6.copyOnWrite();
                final admv admv8 = (admv)ahaz6.instance;
                final admv a21 = admv.a;
                a20.getClass();
                admv8.B = (admp)a20;
                admv8.b |= 0x20000000;
                return;
            }
            case 9: {
                final Object a22 = this.a;
                final ahaz ahaz7 = (ahaz)o;
                ahaz7.copyOnWrite();
                final admv admv9 = (admv)ahaz7.instance;
                final admv a23 = admv.a;
                a22.getClass();
                admv9.B = (admp)a22;
                admv9.b |= 0x20000000;
                return;
            }
            case 8: {
                final Object a24 = this.a;
                final ahaz ahaz8 = (ahaz)o;
                ahaz8.copyOnWrite();
                final admv admv10 = (admv)ahaz8.instance;
                final admv a25 = admv.a;
                admv10.U = ahbh.emptyProtobufList();
                final List<Object> list = Arrays.asList((Object[])a24);
                ahaz8.copyOnWrite();
                final admv admv11 = (admv)ahaz8.instance;
                final ahbx u = admv11.U;
                if (!u.c()) {
                    admv11.U = ahbh.mutableCopy(u);
                }
                agzk.addAll((Iterable)list, (List)admv11.U);
                return;
            }
            case 7: {
                final Object a26 = this.a;
                final int cx = tpe.cX(tpe.cU((long)o), tnz.a);
                if (cx != 2) {
                    if (cx != 1) {
                        return;
                    }
                    o = apho.m;
                }
                else {
                    o = apho.l;
                }
                for (final String s : ((adln)a26).c) {
                    try {
                        final admv b2 = ((adln)a26).a.b(s);
                        if (b2 == null || b2.x) {
                            continue;
                        }
                        ((adln)a26).b.g(s, (apho)o);
                    }
                    catch (final adkv adkv) {}
                }
                return;
            }
            case 6: {
                final Object a27 = this.a;
                final Throwable t3 = (Throwable)o;
                ((adhw)a27).a();
                return;
            }
            case 5: {
                final Object a28 = this.a;
                if (!(boolean)o) {
                    ((adhw)a28).a();
                    return;
                }
                ((adhw)a28).b();
                return;
            }
            case 4: {
                ((adht)this.a).b((adhn)o);
                return;
            }
            case 3: {
                final Object a29 = this.a;
                final amqs c = (amqs)o;
                final adec adec = (adec)a29;
                adec.c = c;
                final ativ b3 = adec.b;
                final agnt agnt = new agnt();
                agnt.h(amqs.a);
                agnt.a = 1;
                agnt.h(c);
                if (!adec.a.m()) {
                    if (adec.a.r()) {
                        a = 3;
                    }
                    else {
                        a = 1;
                    }
                }
                agnt.a = a;
                final Object b4 = agnt.b;
                if (b4 == null) {
                    final StringBuilder sb3 = new StringBuilder();
                    if (agnt.b == null) {
                        sb3.append(" effectiveConnectionType");
                    }
                    if (agnt.a == 0) {
                        sb3.append(" networkTransportType");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb3.toString()));
                }
                b3.tu((Object)new addv((amqs)b4, a));
                return;
            }
            case 2: {
                final Object a30 = this.a;
                final amqq amqq = (amqq)o;
                final addy addy = (addy)a30;
                if (addy.c.W()) {
                    final aknr d = aknt.d();
                    ((ahaz)d).copyOnWrite();
                    aknt.Z((aknt)d.instance, amqq);
                    addy.a.d((aknt)((ahaz)d).build());
                }
                return;
            }
            case 1: {
                final Object a31 = this.a;
                final int intValue = (int)o;
                final acpd acpd = (acpd)a31;
                final int d2 = acpd.c.d;
                if (d2 != 45) {
                    if (d2 != 48) {
                        acpd.c(intValue);
                    }
                }
                return;
            }
            case 0: {
                final Object a32 = this.a;
                final int width = ((Rect)o).width();
                final acpd acpd2 = (acpd)a32;
                final DisplayMetrics displayMetrics = acpd2.a.getResources().getDisplayMetrics();
                final aodm c2 = acpd2.c;
                aodq a33;
                if (c2.d == 48) {
                    a33 = (aodq)c2.e;
                }
                else {
                    a33 = aodq.a;
                }
                int n2 = a33.b;
                if (width >= tpe.aZ(displayMetrics, 840)) {
                    n2 = a33.d;
                }
                else if (width >= tpe.aZ(displayMetrics, 525)) {
                    n2 = a33.c;
                }
                if (n2 <= 0) {
                    n2 = n;
                }
                acpd2.c(n2);
            }
        }
    }
}
