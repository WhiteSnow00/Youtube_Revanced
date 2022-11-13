import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqc extends ahbh implements ahcw
{
    public static final agqc a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)agqc.class, (ahbh)(a = new agqc()));
    }
    
    private agqc() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = agqc.b) == null) {
                    synchronized (agqc.class) {
                        if (agqc.b == null) {
                            agqc.b = (ahdd)new ahba((ahbh)agqc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agqc.a;
            }
            case 4: {
                return new ahaz((ahbh)agqc.a);
            }
            case 3: {
                return new agqc();
            }
            case 2: {
                return newMessageInfo((MessageLite)agqc.a, "\u0000\u0000", (Object[])null);
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
