import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anwz extends ahbh implements ahcw
{
    public static final anwz a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)anwz.class, (ahbh)(a = new anwz()));
    }
    
    private anwz() {
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = anwz.b) == null) {
                    synchronized (anwz.class) {
                        if (anwz.b == null) {
                            anwz.b = (ahdd)new ahba((ahbh)anwz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anwz.a;
            }
            case 4: {
                return new ahaz((ahbh)anwz.a);
            }
            case 3: {
                return new anwz();
            }
            case 2: {
                return newMessageInfo((MessageLite)anwz.a, "\u0001\u0000", (Object[])null);
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
