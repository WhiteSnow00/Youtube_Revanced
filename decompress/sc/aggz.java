import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aggz extends ahbh implements ahcw
{
    public static final aggz a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aggz.class, (ahbh)(a = new aggz()));
    }
    
    private aggz() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aggz.b) == null) {
                    synchronized (aggz.class) {
                        if (aggz.b == null) {
                            aggz.b = (ahdd)new ahba((ahbh)aggz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aggz.a;
            }
            case 4: {
                return new ahaz((ahbh)aggz.a);
            }
            case 3: {
                return new aggz();
            }
            case 2: {
                return newMessageInfo((MessageLite)aggz.a, "\u0001\u0000", (Object[])null);
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
