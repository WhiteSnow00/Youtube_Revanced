import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apql extends ahbh implements ahcw
{
    public static final apql a;
    public static final ahbf b;
    public static final ahbf c;
    private static volatile ahdd d;
    
    static {
        ahbh.registerDefaultInstance((Class)apql.class, (ahbh)(a = new apql()));
        b = ahbh.newSingularGeneratedExtension((MessageLite)apqx.a, (Object)0, (MessageLite)null, (ahbm)null, 162410900, ahek.e, (Class)Integer.class);
        c = ahbh.newSingularGeneratedExtension((MessageLite)apqx.a, (Object)false, (MessageLite)null, (ahbm)null, 162000138, ahek.h, (Class)Boolean.class);
    }
    
    private apql() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = apql.d) == null) {
                    synchronized (apql.class) {
                        if (apql.d == null) {
                            apql.d = (ahdd)new ahba((ahbh)apql.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apql.a;
            }
            case 4: {
                return new ahaz((ahbh)apql.a);
            }
            case 3: {
                return new apql();
            }
            case 2: {
                return newMessageInfo((MessageLite)apql.a, "\u0001\u0000", (Object[])null);
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
