import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajep extends ahbh implements ahcw
{
    public static final ajep a;
    public static final ahbf b;
    private static volatile ahdd c;
    
    static {
        final ajep a2 = new ajep();
        ahbh.registerDefaultInstance((Class)ajep.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 259738798, ahek.k, (Class)ajep.class);
    }
    
    private ajep() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = ajep.c) == null) {
                    synchronized (ajep.class) {
                        if (ajep.c == null) {
                            ajep.c = (ahdd)new ahba((ahbh)ajep.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajep.a;
            }
            case 4: {
                return new ahaz((ahbh)ajep.a);
            }
            case 3: {
                return new ajep();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajep.a, "\u0001\u0000", (Object[])null);
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
