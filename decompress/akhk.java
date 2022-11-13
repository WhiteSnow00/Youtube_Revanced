import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akhk extends ahbh implements ahcw
{
    public static final akhk a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)akhk.class, (ahbh)(a = new akhk()));
    }
    
    private akhk() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = akhk.b) == null) {
                    synchronized (akhk.class) {
                        if (akhk.b == null) {
                            akhk.b = (ahdd)new ahba((ahbh)akhk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akhk.a;
            }
            case 4: {
                return new ahaz((ahbh)akhk.a);
            }
            case 3: {
                return new akhk();
            }
            case 2: {
                return newMessageInfo((MessageLite)akhk.a, "\u0001\u0000", (Object[])null);
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
