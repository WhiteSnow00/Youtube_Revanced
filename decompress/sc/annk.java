import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class annk extends ahbh implements ahcw
{
    public static final annk a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)annk.class, (ahbh)(a = new annk()));
    }
    
    private annk() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = annk.b) == null) {
                    synchronized (annk.class) {
                        if (annk.b == null) {
                            annk.b = (ahdd)new ahba((ahbh)annk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return annk.a;
            }
            case 4: {
                return new ahaz((ahbh)annk.a);
            }
            case 3: {
                return new annk();
            }
            case 2: {
                return newMessageInfo((MessageLite)annk.a, "\u0000\u0000", (Object[])null);
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
