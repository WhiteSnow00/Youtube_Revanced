import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajez extends ahbh implements ahcw
{
    public static final ajez a;
    public static final ahbf b;
    private static volatile ahdd c;
    
    static {
        final ajez a2 = new ajez();
        ahbh.registerDefaultInstance((Class)ajez.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 396717750, ahek.k, (Class)ajez.class);
    }
    
    private ajez() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = ajez.c) == null) {
                    synchronized (ajez.class) {
                        if (ajez.c == null) {
                            ajez.c = (ahdd)new ahba((ahbh)ajez.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajez.a;
            }
            case 4: {
                return new ahaz((ahbh)ajez.a);
            }
            case 3: {
                return new ajez();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajez.a, "\u0001\u0000", (Object[])null);
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
