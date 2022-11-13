import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqm extends ahbh implements ahcw
{
    public static final apqm a;
    public static final ahbf b;
    public static final ahbf c;
    private static volatile ahdd d;
    
    static {
        ahbh.registerDefaultInstance((Class)apqm.class, (ahbh)(a = new apqm()));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aprr.a, (Object)0, (MessageLite)null, (ahbm)null, 153514762, ahek.e, (Class)Integer.class);
        c = ahbh.newSingularGeneratedExtension((MessageLite)aprr.a, (Object)false, (MessageLite)null, (ahbm)null, 167027722, ahek.h, (Class)Boolean.class);
    }
    
    private apqm() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = apqm.d) == null) {
                    synchronized (apqm.class) {
                        if (apqm.d == null) {
                            apqm.d = (ahdd)new ahba((ahbh)apqm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apqm.a;
            }
            case 4: {
                return new ahaz((ahbh)apqm.a);
            }
            case 3: {
                return new apqm();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqm.a, "\u0001\u0000", (Object[])null);
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
