import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqzk extends ahbh implements ahcw
{
    private static final aqzk a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aqzk.class, (ahbh)(a = new aqzk()));
    }
    
    private aqzk() {
    }
    
    public static aqzk a() {
        return aqzk.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aqzk.b) == null) {
                    synchronized (aqzk.class) {
                        if (aqzk.b == null) {
                            aqzk.b = (ahdd)new ahba((ahbh)aqzk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqzk.a;
            }
            case 4: {
                return new ahaz((ahbh)a());
            }
            case 3: {
                return new aqzk();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqzk.a, "\u0001\u0000", (Object[])null);
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
