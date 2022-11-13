import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akno extends ahbh implements ahcw
{
    public static final akno a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)akno.class, (ahbh)(a = new akno()));
    }
    
    private akno() {
        ahbh.emptyProtobufList();
        ahbh.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = akno.b) == null) {
                    synchronized (akno.class) {
                        if (akno.b == null) {
                            akno.b = (ahdd)new ahba((ahbh)akno.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akno.a;
            }
            case 4: {
                return new ahaz((ahbh)akno.a);
            }
            case 3: {
                return new akno();
            }
            case 2: {
                return newMessageInfo((MessageLite)akno.a, "\u0001\u0000", (Object[])null);
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
