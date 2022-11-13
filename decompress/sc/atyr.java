import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atyr extends ahbh implements ahcw
{
    public static final atyr a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)atyr.class, (ahbh)(a = new atyr()));
    }
    
    private atyr() {
        emptyLongList();
        emptyLongList();
        emptyIntList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = atyr.b) == null) {
                    synchronized (atyr.class) {
                        if (atyr.b == null) {
                            atyr.b = (ahdd)new ahba((ahbh)atyr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return atyr.a;
            }
            case 4: {
                return new ahaz((ahbh)atyr.a);
            }
            case 3: {
                return new atyr();
            }
            case 2: {
                return newMessageInfo((MessageLite)atyr.a, "\u0001\u0000", (Object[])null);
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
