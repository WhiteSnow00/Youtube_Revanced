// 
// Decompiled by Procyon v0.6.0
// 

public final class atpt
{
    public static final atli a(atli atli, final atli a, final boolean b) {
        final boolean d = d(atli);
        final boolean d2 = d(a);
        if (!d && !d2) {
            return atli.plus(a);
        }
        final atnn atnn = new atnn();
        atnn.a = a;
        atli = (atli)atli.fold((Object)atlj.a, (atmp)new atps(atnn, b));
        if (d2) {
            atnn.a = ((atli)atnn.a).fold((Object)atlj.a, (atmp)atlh.c);
        }
        return atli.plus((atli)atnn.a);
    }
    
    public static final atli b(final atpz atpz, atli a) {
        a.getClass();
        a = a(atpz.c(), a, true);
        atli plus;
        if (atqb.a) {
            plus = a.plus((atli)new atpx(atqb.c.incrementAndGet()));
        }
        else {
            plus = a;
        }
        if (a != atql.a && a.get((atlg)atle.a) == null) {
            return plus.plus((atli)atql.a);
        }
        return plus;
    }
    
    public static final atry c(atld atld, final atli atli, final Object o) {
        atld.getClass();
        atli.getClass();
        final atlf value = atli.get((atlg)atrz.a);
        atry atry = null;
        final atry atry2 = null;
        if (value != null) {
            while (true) {
                while (!(atld instanceof atqi)) {
                    final Object callerFrame = ((atlq)atld).getCallerFrame();
                    atry atry3;
                    if (callerFrame == null) {
                        atry3 = atry2;
                    }
                    else {
                        atld = (atld)callerFrame;
                        if (!(callerFrame instanceof atry)) {
                            continue;
                        }
                        atry3 = (atry)callerFrame;
                    }
                    atry = atry3;
                    if (atry3 != null) {
                        atry3.L(atli, o);
                        atry = atry3;
                        return atry;
                    }
                    return atry;
                }
                atry atry3 = atry2;
                continue;
            }
        }
        return atry;
    }
    
    public static final boolean d(final atli atli) {
        return (boolean)atli.fold((Object)false, (atmp)atlh.d);
    }
}
