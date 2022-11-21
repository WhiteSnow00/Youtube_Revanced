import android.os.Bundle;
import java.util.Iterator;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import j$.util.function.Function$_CC;
import java.util.function.Function;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adtc implements Function
{
    public static final adtc a;
    public static final adtc b;
    public static final adtc c;
    public static final adtc d;
    public static final adtc e;
    public static final adtc f;
    public static final adtc g;
    public static final adtc h;
    public static final adtc i;
    private final int j;
    
    static {
        i = new adtc(8);
        h = new adtc(7);
        g = new adtc(6);
        f = new adtc(5);
        e = new adtc(4);
        d = new adtc(3);
        c = new adtc(2);
        b = new adtc(1);
        a = new adtc(0);
    }
    
    private adtc(final int j) {
        this.j = j;
    }
    
    @Override
    public final Function andThen(final Function function) {
        switch (this.j) {
            default: {
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
        final int j = this.j;
        int i = 0;
        boolean b = false;
        switch (j) {
            default: {
                return ((afgj)o).b();
            }
            case 7: {
                return ((afhi)o).g();
            }
            case 6: {
                return ((afgc)o).g();
            }
            case 5: {
                final adgg adgg = (adgg)o;
                final afgc afgc = new afgc(((List)adgg.a).size());
                Collections.sort((List<Object>)adgg.a, afjt.c());
                final Iterator<Object> iterator = ((List<Object>)adgg.a).iterator();
                afig afig;
                if (iterator instanceof afig) {
                    afig = (afig)iterator;
                }
                else {
                    afig = new afig(iterator);
                }
                while (afig.hasNext()) {
                    afjt f = (afjt)afig.next();
                    while (afig.hasNext()) {
                        if (!afig.b) {
                            afig.c = afig.a.next();
                            afig.b = true;
                        }
                        final afjt afjt = (afjt)afig.c;
                        if (!f.l(afjt)) {
                            break;
                        }
                        final int a = f.b.a(afjt.b);
                        final int a2 = f.c.a(afjt.c);
                        afjt f2;
                        if (a >= 0 && a2 <= 0) {
                            f2 = f;
                        }
                        else if (a <= 0 && a2 >= 0) {
                            f2 = afjt;
                        }
                        else {
                            afev afev;
                            if (a >= 0) {
                                afev = f.b;
                            }
                            else {
                                afev = afjt.b;
                            }
                            afev afev2;
                            if (a2 <= 0) {
                                afev2 = f.c;
                            }
                            else {
                                afev2 = afjt.c;
                            }
                            adme.R(afev.a(afev2) <= 0, "intersection is undefined for disconnected ranges %s and %s", f, afjt);
                            f2 = afjt.f(afev, afev2);
                        }
                        adme.R(f2.m(), "Overlapping ranges not permitted but found %s overlapping %s", f, afjt);
                        final afjt afjt2 = (afjt)afig.next();
                        final int a3 = f.b.a(afjt2.b);
                        final int a4 = f.c.a(afjt2.c);
                        if (a3 <= 0 && a4 >= 0) {
                            continue;
                        }
                        if (a3 >= 0 && a4 <= 0) {
                            f = afjt2;
                        }
                        else {
                            afev afev3;
                            if (a3 <= 0) {
                                afev3 = f.b;
                            }
                            else {
                                afev3 = afjt2.b;
                            }
                            afev afev4;
                            if (a4 >= 0) {
                                afev4 = f.c;
                            }
                            else {
                                afev4 = afjt2.c;
                            }
                            f = afjt.f(afev3, afev4);
                        }
                    }
                    afgc.h(f);
                }
                final afgh g = afgc.g();
                if (g.isEmpty()) {
                    o = afhh.a;
                }
                else if (((afjx)g).c == 1 && ((afjt)agpx.an(g)).equals((Object)afjt.a)) {
                    o = afhh.b;
                }
                else {
                    o = new afhh(g);
                }
                return o;
            }
            case 4: {
                if (((byte[])o).length > 0) {
                    b = true;
                }
                return b;
            }
            case 3: {
                return ((Bundle)o).getByteArray("S11Y_SESSION_DETECTION_RESPONSE");
            }
            case 2: {
                return o;
            }
            case 1: {
                final ahbt ahbt = (ahbt)o;
                final ahbt b2 = adsx.b;
                final byte[] k = ahbt.I();
                final int length = k.length;
                final Byte[] array = new Byte[length];
                for (int n = 0; i < length; ++i, ++n) {
                    array[n] = k[i];
                }
                return array;
            }
            case 0: {
                return new adte((adtf)o);
            }
        }
    }
    
    @Override
    public final Function compose(final Function function) {
        switch (this.j) {
            default: {
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
