import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atxe extends ahbh implements ahcw
{
    public static final atxe a;
    private static volatile ahdd e;
    public int b;
    public int c;
    public atxf d;
    
    static {
        ahbh.registerDefaultInstance((Class)atxe.class, (ahbh)(a = new atxe()));
    }
    
    private atxe() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = atxe.e) == null) {
                    synchronized (atxe.class) {
                        if (atxe.e == null) {
                            atxe.e = (ahdd)new ahba((ahbh)atxe.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return atxe.a;
            }
            case 4: {
                return new ahaz((ahbh)atxe.a);
            }
            case 3: {
                return new atxe();
            }
            case 2: {
                return newMessageInfo((MessageLite)atxe.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
