import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atze extends ahbh implements ahcw
{
    public static final atze a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)atze.class, (ahbh)(a = new atze()));
    }
    
    private atze() {
        emptyProtobufList();
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
                if ((b = atze.b) == null) {
                    synchronized (atze.class) {
                        if (atze.b == null) {
                            atze.b = (ahdd)new ahba((ahbh)atze.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return atze.a;
            }
            case 4: {
                return new ahaz((ahbh)atze.a);
            }
            case 3: {
                return new atze();
            }
            case 2: {
                return newMessageInfo((MessageLite)atze.a, "\u0001\u0000", (Object[])null);
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
