// 
// Decompiled by Procyon v0.6.0
// 

public final class attl
{
    public static final atpa a(atpa atpa, final atpa a, final boolean b) {
        final boolean d = d(atpa);
        final boolean d2 = d(a);
        if (!d && !d2) {
            return atpa.plus(a);
        }
        final atrf atrf = new atrf();
        atrf.a = a;
        atpa = (atpa)atpa.fold(atpb.a, (atqh)new attk(atrf, b));
        if (d2) {
            atrf.a = ((atpa)atrf.a).fold(atpb.a, (atqh)atoz.c);
        }
        return atpa.plus((atpa)atrf.a);
    }
    
    public static final atpa b(final attr attr, atpa a) {
        a.getClass();
        a = a(attr.c(), a, true);
        atpa plus;
        if (attt.a) {
            plus = a.plus((atpa)new attp(attt.c.incrementAndGet()));
        }
        else {
            plus = a;
        }
        if (a != atud.a && a.get(atow.a) == null) {
            return plus.plus((atpa)atud.a);
        }
        return plus;
    }
    
    public static final atvq c(atov atov, final atpa atpa, final Object o) {
        atov.getClass();
        atpa.getClass();
        final atox value = atpa.get((atoy)atvr.a);
        atvq atvq = null;
        final atvq atvq2 = null;
        if (value != null) {
            while (true) {
                while (!(atov instanceof atua)) {
                    final Object callerFrame = ((atpi)atov).getCallerFrame();
                    atvq atvq3;
                    if (callerFrame == null) {
                        atvq3 = atvq2;
                    }
                    else {
                        atov = (atov)callerFrame;
                        if (!(callerFrame instanceof atvq)) {
                            continue;
                        }
                        atvq3 = (atvq)callerFrame;
                    }
                    atvq = atvq3;
                    if (atvq3 != null) {
                        atvq3.L(atpa, o);
                        atvq = atvq3;
                        return atvq;
                    }
                    return atvq;
                }
                atvq atvq3 = atvq2;
                continue;
            }
        }
        return atvq;
    }
    
    public static final boolean d(final atpa atpa) {
        return (boolean)atpa.fold(false, (atqh)atoz.d);
    }
}
