import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoyo extends ahbh implements ahcw
{
    public static final aoyo a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aoyo.class, (ahbh)(a = new aoyo()));
    }
    
    private aoyo() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aoyo.b) == null) {
                    synchronized (aoyo.class) {
                        if (aoyo.b == null) {
                            aoyo.b = (ahdd)new ahba((ahbh)aoyo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoyo.a;
            }
            case 4: {
                return new ahaz((ahbh)aoyo.a);
            }
            case 3: {
                return new aoyo();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoyo.a, "\u0001\u0000", (Object[])null);
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
