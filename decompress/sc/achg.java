import java.util.ArrayList;
import java.util.Iterator;
import j$.util.Optional;
import j$.util.stream.Stream$_CC;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import android.os.Bundle;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import j$.util.function.Function$_CC;
import java.util.function.Function;

// 
// Decompiled by Procyon v0.6.0
// 

public final class achg implements Function
{
    public static final achg a;
    public static final achg b;
    public static final achg c;
    public static final achg d;
    public static final achg e;
    public static final achg f;
    public static final achg g;
    public static final achg h;
    public static final achg i;
    public static final achg j;
    public static final achg k;
    public static final achg l;
    public static final achg m;
    public static final achg n;
    public static final achg o;
    public static final achg p;
    public static final achg q;
    public static final achg r;
    public static final achg s;
    public static final achg t;
    private final int u;
    
    static {
        t = new achg(20);
        s = new achg(19);
        r = new achg(18);
        q = new achg(17);
        p = new achg(16);
        o = new achg(15);
        n = new achg(14);
        m = new achg(13);
        l = new achg(12);
        k = new achg(11);
        j = new achg(10);
        i = new achg(9);
        h = new achg(8);
        g = new achg(7);
        f = new achg(6);
        e = new achg(5);
        d = new achg(4);
        c = new achg(3);
        b = new achg(2);
        a = new achg(1);
    }
    
    public achg(final int u) {
        this.u = u;
    }
    
    @Override
    public final Function andThen(final Function function) {
        switch (this.u) {
            default: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 19: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 18: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 17: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 16: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 15: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 14: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 13: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 12: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 11: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 10: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 9: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 8: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 7: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 6: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 5: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 4: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 3: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 2: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 1: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
            case 0: {
                return Function$_CC.$default$andThen((Function)this, function);
            }
        }
    }
    
    @Override
    public final Object apply(Object o) {
        final int u = this.u;
        int i = 0;
        final boolean b = false;
        boolean b2 = false;
    Label_0590_Outer:
        while (true) {
            Label_0789: {
                switch (u) {
                    default: {
                        final adet adet = (adet)o;
                        final afel afel = new afel(((List)adet.a).size());
                        Collections.sort((List<Object>)adet.a, afid.c());
                        o = ((List<Object>)adet.a).iterator();
                        if (o instanceof afgp) {
                            final afgp afgp = (afgp)o;
                            break Label_0820;
                        }
                        break Label_0789;
                    }
                    case 19: {
                        if (((byte[])o).length > 0) {
                            b2 = true;
                        }
                        return b2;
                    }
                    case 18: {
                        return ((Bundle)o).getByteArray("S11Y_SESSION_DETECTION_RESPONSE");
                    }
                    case 17: {
                        return o;
                    }
                    case 16: {
                        return new adrn((adro)o);
                    }
                    case 15: {
                        final ahab ahab = (ahab)o;
                        final afkk c = adrh.c;
                        final byte[] j = ahab.I();
                        final int length = j.length;
                        final Byte[] array = new Byte[length];
                        for (int n = 0; i < length; ++i, ++n) {
                            array[n] = j[i];
                        }
                        return array;
                    }
                    case 14: {
                        boolean b3 = b;
                        if (((long)o & 0x20L) == 0x0L) {
                            b3 = true;
                        }
                        return b3;
                    }
                    case 13: {
                        return ((nxe)o).b();
                    }
                    case 12: {
                        aqni aqni;
                        if ((aqni = ((aqnd)o).f) == null) {
                            aqni = aqni.a;
                        }
                        return aqni;
                    }
                    case 11: {
                        final aqnd aqnd = (aqnd)o;
                        aqnf aqnf;
                        if ((aqnf = aqnd.e) == null) {
                            aqnf = aqnf.a;
                        }
                        int d;
                        if ((aqnf.b & 0x2) != 0x0) {
                            aqnf aqnf2;
                            if ((aqnf2 = aqnd.e) == null) {
                                aqnf2 = aqnf.a;
                            }
                            d = aqnf2.d;
                        }
                        else {
                            d = -16777216;
                        }
                        return d;
                    }
                    case 10: {
                        aqnk aqnk;
                        if ((aqnk = ((aqnd)o).g) == null) {
                            aqnk = aqnk.a;
                        }
                        return aqnk;
                    }
                    case 9: {
                        return ((aqnd)o).d;
                    }
                    case 8: {
                        return ((aqmu)o).e.size();
                    }
                    case 7: {
                        return ((aqmu)o).c;
                    }
                    case 6: {
                        return ((aqmu)o).d;
                    }
                    case 4: {
                        break Label_0789;
                    }
                    case 3: {
                        break Label_0789;
                    }
                    case 2: {
                        break Label_0789;
                    }
                    case 1: {
                        break Label_0789;
                    }
                    case 5:
                    case 0: {
                        Label_0797: {
                            break Label_0797;
                            Object o2 = o;
                            o = ((ahbh)ahvi.a).createBuilder();
                            final afel afel;
                            afgp afgp;
                            BufferedReader bufferedReader;
                            String line;
                            int int1;
                            ahvi ahvi;
                            final Throwable t;
                            final Throwable t2;
                            BufferedReader bufferedReader2;
                            String line2;
                            int int2;
                            ahvi ahvi2;
                            final Throwable t3;
                            int b4;
                            afde afde;
                            int a;
                            int a2;
                            afid afid;
                            int a3;
                            int a4;
                            afid afid2;
                            Block_25_Outer:Block_17_Outer:
                            while (true) {
                                try {
                                    bufferedReader = new BufferedReader(new FileReader(new File((File)o2, "cpufreq/cpuinfo_max_freq")));
                                    try {
                                        line = bufferedReader.readLine();
                                        line.getClass();
                                        int1 = Integer.parseInt(line);
                                        ((ahaz)o).copyOnWrite();
                                        ahvi = (ahvi)((ahaz)o).instance;
                                        ahvi.b |= 0x1;
                                        ahvi.c = int1;
                                        bufferedReader.close();
                                    }
                                    finally {
                                        try {
                                            bufferedReader.close();
                                        }
                                        finally {
                                            adds.f(t, t2);
                                        }
                                    }
                                    try {
                                        bufferedReader2 = new BufferedReader(new FileReader(new File((File)o2, "cpufreq/scaling_cur_freq")));
                                        try {
                                            line2 = bufferedReader2.readLine();
                                            line2.getClass();
                                            int2 = Integer.parseInt(line2);
                                            ((ahaz)o).copyOnWrite();
                                            ahvi2 = (ahvi)((ahaz)o).instance;
                                            ahvi2.b |= 0x2;
                                            ahvi2.d = int2;
                                            bufferedReader2.close();
                                        }
                                        finally {
                                            try {
                                                bufferedReader2.close();
                                            }
                                            finally {
                                                adds.f((Throwable)o2, t3);
                                            }
                                        }
                                    }
                                    catch (final Exception ex) {}
                                    b4 = ((ahvi)((ahaz)o).instance).b;
                                    if ((b4 & 0x1) == 0x0) {
                                        if ((b4 & 0x2) == 0x0) {
                                            o = Stream$_CC.empty();
                                            return o;
                                        }
                                    }
                                    o = Stream$_CC.of((Object)((ahaz)o).build());
                                    return o;
                                    return ((ajtr)o).b;
                                    while (true) {
                                        Block_19_Outer:Label_1027_Outer:
                                        while (true) {
                                            Label_0968: {
                                                Label_1027:Label_1137_Outer:
                                                while (true) {
                                                    Label_0988: {
                                                    Label_1137:
                                                        while (true) {
                                                            while (true) {
                                                                Label_0874: {
                                                                    while (true) {
                                                                        Block_30: {
                                                                            while (true) {
                                                                                Block_21: {
                                                                                    Block_29: {
                                                                                        Block_31: {
                                                                                            while (true) {
                                                                                                while (true) {
                                                                                                Block_24:
                                                                                                    while (true) {
                                                                                                        afgp.c = afgp.a.next();
                                                                                                        afgp.b = true;
                                                                                                        break Label_0874;
                                                                                                        afde = ((afid)o).c;
                                                                                                        break Label_0988;
                                                                                                        Label_0948: {
                                                                                                            iftrue(Label_0961:)(a < 0);
                                                                                                        }
                                                                                                        break Block_24;
                                                                                                        iftrue(Label_1131:)(a2 < 0);
                                                                                                        break Block_31;
                                                                                                        a = ((afid)o).b.a(afid.b);
                                                                                                        a3 = ((afid)o).c.a(afid.c);
                                                                                                        iftrue(Label_0933:)(a < 0 || a3 > 0);
                                                                                                        break Block_21;
                                                                                                        iftrue(Label_1099:)(a4 < 0 || a2 > 0);
                                                                                                        break Block_29;
                                                                                                        Label_1156:
                                                                                                        o = afel.g();
                                                                                                        iftrue(Label_1176:)(!((afeq)o).isEmpty());
                                                                                                        o = affq.a;
                                                                                                        return o;
                                                                                                        iftrue(Label_0874:)(afgp.b);
                                                                                                        continue Block_25_Outer;
                                                                                                    }
                                                                                                    o2 = ((afid)o).b;
                                                                                                    break Label_0968;
                                                                                                    Label_1112: {
                                                                                                        o2 = afid2.b;
                                                                                                    }
                                                                                                    continue Block_19_Outer;
                                                                                                    return ((achd)o).a();
                                                                                                    Label_1099:
                                                                                                    iftrue(Label_1112:)(a4 > 0);
                                                                                                    break Block_30;
                                                                                                    o2 = afid;
                                                                                                    break Label_1027;
                                                                                                    return ((Optional)o).get();
                                                                                                    o = afgp.next();
                                                                                                    break Block_19_Outer;
                                                                                                    o = afid.f((afde)o2, (afde)o);
                                                                                                    break Block_19_Outer;
                                                                                                    Label_1210:
                                                                                                    o = new affq((afeq)o);
                                                                                                    return o;
                                                                                                    adkp.O(((afid)o2).m(), "Overlapping ranges not permitted but found %s overlapping %s", o, (Object)afid);
                                                                                                    afid2 = (afid)afgp.next();
                                                                                                    a4 = ((afid)o).b.a(afid2.b);
                                                                                                    a2 = ((afid)o).c.a(afid2.c);
                                                                                                    iftrue(Label_0837:)(a4 <= 0 && a2 >= 0);
                                                                                                    continue Block_17_Outer;
                                                                                                }
                                                                                                Label_0933: {
                                                                                                    iftrue(Label_0948:)(a > 0 || a3 < 0);
                                                                                                }
                                                                                                continue Label_1027_Outer;
                                                                                            }
                                                                                            o = affq.b;
                                                                                            return o;
                                                                                        }
                                                                                        o = ((afid)o).c;
                                                                                        continue Label_1137;
                                                                                        Label_0961: {
                                                                                            o2 = afid.b;
                                                                                        }
                                                                                        break Label_0968;
                                                                                        return ((ahbh)o).toBuilder();
                                                                                    }
                                                                                    o = afid2;
                                                                                    break Block_19_Outer;
                                                                                    afgp = new afgp((Iterator)o);
                                                                                    break Label_0820;
                                                                                }
                                                                                o2 = o;
                                                                                continue Label_1027;
                                                                                iftrue(Label_1156:)(!afgp.hasNext());
                                                                                continue Label_1137_Outer;
                                                                            }
                                                                            Label_1147: {
                                                                                afel.h(o);
                                                                            }
                                                                            continue Label_0590_Outer;
                                                                        }
                                                                        o2 = ((afid)o).b;
                                                                        continue Block_19_Outer;
                                                                    }
                                                                }
                                                                afid = (afid)afgp.c;
                                                                iftrue(Label_1147:)(!((afid)o).l(afid));
                                                                continue Block_17_Outer;
                                                            }
                                                            Label_1131: {
                                                                o = afid2.c;
                                                            }
                                                            continue Label_1137;
                                                        }
                                                        Label_0981: {
                                                            afde = afid.c;
                                                        }
                                                    }
                                                    adkp.O(((afde)o2).a(afde) <= 0, "intersection is undefined for disconnected ranges %s and %s", o, (Object)afid);
                                                    o2 = afid.f((afde)o2, afde);
                                                    continue Label_1027;
                                                }
                                                o = o;
                                                return new ArrayList();
                                            }
                                            iftrue(Label_0981:)(a3 > 0);
                                            continue Block_17_Outer;
                                        }
                                        iftrue(Label_1147:)(!afgp.hasNext());
                                        continue;
                                    }
                                    Label_1176: {
                                        iftrue(Label_1210:)(((afih)o).c != 1 || !((afid)agpc.W((Iterable)o)).equals((Object)afid.a));
                                    }
                                    return affq.b;
                                }
                                catch (final Exception ex2) {
                                    continue;
                                }
                                break;
                            }
                        }
                        break;
                    }
                }
            }
            break;
        }
    }
    
    @Override
    public final Function compose(final Function function) {
        switch (this.u) {
            default: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 19: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 18: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 17: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 16: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 15: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 14: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 13: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 12: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 11: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 10: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 9: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 8: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 7: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 6: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 5: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 4: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 3: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 2: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 1: {
                return Function$_CC.$default$compose((Function)this, function);
            }
            case 0: {
                return Function$_CC.$default$compose((Function)this, function);
            }
        }
    }
}
