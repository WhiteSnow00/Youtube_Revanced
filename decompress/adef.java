import java.util.Iterator;
import java.util.List;
import java.io.IOException;
import java.io.FileNotFoundException;
import j$.util.Optional;
import java.util.concurrent.Executor;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Future;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.apps.tiktok.account.AccountId;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adef implements afty
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public adef(final adeg b, final aded a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public adef(final adeg a, final afaq b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adef(final adeo a, final Object b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adef(final adgc a, final agoe b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adef(final adjv a, final String b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adef(final adjv a, final Set b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adef(final admj a, final String b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adef(final adpp a, final String b, final int c, final byte[] array) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adef(final adpp b, final zme a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public adef(final adrh b, final adqk a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public adef(final aejd b, final AccountId a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public adef(final aekv b, final AccountId a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public adef(final aeng a, final ListenableFuture b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public adef(final aftz b, final aems a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public adef(final ahdc b, final AccountId a, final int c, final byte[] array, final byte[] array2) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public adef(final atke b, final aejm a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public adef(final ziy a, final aezs b, final int c, final byte[] array, final byte[] array2, final byte[] array3) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final ListenableFuture a() {
        switch (this.c) {
            default: {
                final Object a = this.a;
                final Object b = this.b;
                final aeng aeng = (aeng)a;
                afwm.u((Future)aeng.b);
                final Long n = (Long)afwm.u((Future)b);
                final aemp a2 = aeng.a;
                n.longValue();
                return a2.a();
            }
            case 16: {
                return ((aftz)this.b).a(this.a);
            }
            case 15: {
                final Object b2 = this.b;
                final String l = aujg.l((AccountId)this.a);
                final ArrayList list = new ArrayList();
                final ahdc ahdc = (ahdc)b2;
                final afke k = ((aglu)ahdc.b).g().k();
                while (k.hasNext()) {
                    list.add(ahdc.i(new File((File)k.next(), l)));
                }
                return afwm.M((Iterable)list).j(afwm.y(), (Executor)afum.a);
            }
            case 14: {
                return ((aekv)this.b).h.b((aezf)new aekn((AccountId)this.a, 5), (Executor)afum.a);
            }
            case 13: {
                final Object b3 = this.b;
                final Object a3 = this.a;
                final aejh aejh = (aejh)((atke)b3).a();
                return aftq.e(aejh.a((aejm)a3), (aezf)new abkr(aejh, 20), (Executor)afum.a);
            }
            case 12: {
                return ((aejd)this.b).a((AccountId)this.a);
            }
            case 11: {
                final Object b4 = this.b;
                final Object a4 = this.a;
                final Optional empty = Optional.empty();
                final adrh adrh = (adrh)b4;
                adrh.q = empty;
                adkp.T(adrh.n.isPresent(), "Expected meeting to be connected before calling %s.", "beginCoWatching");
                adrh.o = Optional.of((Object)aftq.e((ListenableFuture)adrh.n.get(), (aezf)new abks(adrh, (adqk)a4, 5), adrh.j));
                return (ListenableFuture)adrh.o.get();
            }
            case 10: {
                final Object a5 = this.a;
                final Object b5 = this.b;
                synchronized (((admj)a5).l) {
                    ((admj)a5).w();
                    ((admj)a5).u(admm.a((String)b5).l());
                    ((admj)a5).A();
                    return afvn.a;
                }
            }
            case 9: {
                final Object b6 = this.b;
                final String d = ((zme)this.a).d();
                final ArrayList list2 = new ArrayList();
                final adpp adpp = (adpp)b6;
                for (final admv admv : ((adku)adpp.d).c().values()) {
                    final String e = admv.e;
                    if (!e.isEmpty() && (!admv.w || admv.x) && e.equals(d)) {
                        final ahaz builder = ((ahbh)admv).toBuilder();
                        final boolean i = ((adlw)adpp.j).i();
                        final boolean h = ((adlw)adpp.j).h();
                        if (i || h) {
                            if ((((admv)builder.instance).c & 0x200) == 0x0) {
                                final adms a6 = adms.a;
                                builder.copyOnWrite();
                                final admv admv2 = (admv)builder.instance;
                                a6.getClass();
                                admv2.N = a6;
                                admv2.c |= 0x200;
                            }
                            final ahaz builder2 = ((ahbh)adms.a).createBuilder();
                            if (i) {
                                final aphv h2 = aphv.h;
                                builder2.copyOnWrite();
                                final adms adms = (adms)builder2.instance;
                                adms.d = h2.aD;
                                adms.b |= 0x2;
                            }
                            else {
                                final aphv j = aphv.i;
                                builder2.copyOnWrite();
                                final adms adms2 = (adms)builder2.instance;
                                adms2.d = j.aD;
                                adms2.b |= 0x2;
                            }
                            builder.copyOnWrite();
                            final admv admv3 = (admv)builder.instance;
                            final adms n2 = (adms)builder2.build();
                            n2.getClass();
                            admv3.N = n2;
                            admv3.c |= 0x200;
                        }
                        final String m = ((admv)builder.instance).k;
                        list2.add(builder.build());
                    }
                }
                return afwm.m((Object)list2);
            }
            case 8: {
                final Object a7 = this.a;
                final Object b7 = this.b;
                final adpp adpp2 = (adpp)a7;
                final adku adku = (adku)adpp2.d;
                final String s = (String)b7;
                ListenableFuture listenableFuture;
                if (adku.b(s) == null) {
                    listenableFuture = afwm.m((Object)false);
                }
                else {
                    ((admj)((arkg)adpp2.i).a()).v(s);
                    listenableFuture = afwm.m((Object)true);
                }
                return listenableFuture;
            }
            case 7: {
                return afwm.m((Object)aezp.j((Object)((adjv)this.a).q.get(this.b)));
            }
            case 6: {
                ((adjv)this.a).A((asjs)new ush((Set)this.b, 13), aphu.k);
                return afvn.a;
            }
            case 5: {
                final Object a8 = this.a;
                final Object b8 = this.b;
                final adjv adjv = (adjv)a8;
                final admv b9 = adjv.g.b((String)b8);
                ListenableFuture listenableFuture2;
                if (b9 == null) {
                    listenableFuture2 = afwm.m((Object)aeyo.a);
                }
                else {
                    listenableFuture2 = afwm.m((Object)aezp.k((Object)adjv.a(b9)));
                }
                return listenableFuture2;
            }
            case 4: {
                final Object a9 = this.a;
                final Object b10 = this.b;
                final ListenableFuture m2 = afwm.m(b10);
                final adgc adgc = (adgc)a9;
                adgc.f = m2;
                return adgc.b.c(adgc.c, ((agoe)b10).a, (adeo)aden.a);
            }
            case 3: {
                final Object a10 = this.a;
                final Object b11 = this.b;
                final Iterator iterator2 = ((abn)((ziy)a10).d).e().keySet().iterator();
                while (iterator2.hasNext()) {
                    ((aezs)b11).a(iterator2.next());
                }
                return afwm.m((Object)null);
            }
            case 2: {
                return afwm.m((Object)((adeo)this.a).a(this.b));
            }
            case 1: {
                final Object b12 = this.b;
                final Object a11 = this.a;
                final adeg adeg = (adeg)b12;
                adeg.f();
                final File file = new File(adeg.a, adds.e((aded)a11));
                ListenableFuture listenableFuture3;
                if (file.exists() && file.canRead()) {
                    try {
                        listenableFuture3 = afwm.m((Object)afpj.d(file));
                    }
                    catch (final FileNotFoundException ex) {
                        listenableFuture3 = afwm.m((Object)null);
                    }
                }
                else {
                    listenableFuture3 = afwm.m((Object)null);
                }
                return listenableFuture3;
            }
            case 0: {
                final Object a12 = this.a;
                final Object b13 = this.b;
                final adeg adeg2 = (adeg)a12;
                final afeq r = afeq.r((Object)new File(adeg2.a, (String)((afaq)b13).a()));
                adeg2.f();
                ListenableFuture listenableFuture4;
                if (r != null && !((List)r).isEmpty()) {
                    final ArrayList list3 = new ArrayList(((afih)r).c);
                    final afkf d2 = r.D();
                    while (((Iterator)d2).hasNext()) {
                        final File file2 = (File)((Iterator)d2).next();
                        if (file2.exists()) {
                            final String a13 = adeg2.a;
                            final int andIncrement = adeg2.b.getAndIncrement();
                            final StringBuilder sb = new StringBuilder();
                            sb.append(andIncrement);
                            sb.append(".rm");
                            final File file3 = new File(a13, sb.toString());
                            try {
                                adeg.d(file2, file3);
                                list3.add((Object)file3);
                            }
                            catch (final IOException ex2) {}
                        }
                    }
                    listenableFuture4 = adeg.g(list3);
                }
                else {
                    listenableFuture4 = afwm.m((Object)null);
                }
                return listenableFuture4;
            }
        }
    }
}
