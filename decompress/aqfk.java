import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqfk extends ahbh implements ahcw
{
    public static final aqfk a;
    public static final ahbf b;
    private static volatile ahdd c;
    
    static {
        final aqfk a2 = new aqfk();
        ahbh.registerDefaultInstance((Class)aqfk.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aqhl.a, (Object)a2, (MessageLite)a2, (ahbm)null, 158796327, ahek.k, (Class)aqfk.class);
    }
    
    private aqfk() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aqfk.c) == null) {
                    synchronized (aqfk.class) {
                        if (aqfk.c == null) {
                            aqfk.c = (ahdd)new ahba((ahbh)aqfk.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqfk.a;
            }
            case 4: {
                return new ahaz((ahbh)aqfk.a);
            }
            case 3: {
                return new aqfk();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqfk.a, "\u0001\u0000", (Object[])null);
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
