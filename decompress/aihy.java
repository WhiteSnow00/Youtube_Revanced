import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aihy extends ahbh implements ahcw
{
    public static final aihy a;
    public static final ahbf b;
    private static volatile ahdd c;
    
    static {
        ahbh.registerDefaultInstance((Class)aihy.class, (ahbh)(a = new aihy()));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aiia.a, (Object)aiib.a, (MessageLite)aiib.a, (ahbm)null, 123258328, ahek.k, (Class)aiib.class);
    }
    
    private aihy() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aihy.c) == null) {
                    synchronized (aihy.class) {
                        if (aihy.c == null) {
                            aihy.c = (ahdd)new ahba((ahbh)aihy.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aihy.a;
            }
            case 4: {
                return new ahaz((ahbh)aihy.a);
            }
            case 3: {
                return new aihy();
            }
            case 2: {
                return newMessageInfo((MessageLite)aihy.a, "\u0001\u0000", (Object[])null);
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
