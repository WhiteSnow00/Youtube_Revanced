import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aojd extends ahbh implements ahcw
{
    public static final aojd a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aojd.class, (ahbh)(a = new aojd()));
    }
    
    private aojd() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aojd.b) == null) {
                    synchronized (aojd.class) {
                        if (aojd.b == null) {
                            aojd.b = (ahdd)new ahba((ahbh)aojd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aojd.a;
            }
            case 4: {
                return new ahaz((ahbh)aojd.a);
            }
            case 3: {
                return new aojd();
            }
            case 2: {
                return newMessageInfo((MessageLite)aojd.a, "\u0001\u0000", (Object[])null);
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
