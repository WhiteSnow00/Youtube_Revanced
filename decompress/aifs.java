import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aifs extends ahbh implements ahcw
{
    public static final aifs a;
    private static volatile ahdd b;
    private int c;
    private ajkd d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aifs.class, (ahbh)(a = new aifs()));
    }
    
    private aifs() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aifs.b) == null) {
                    synchronized (aifs.class) {
                        if (aifs.b == null) {
                            aifs.b = (ahdd)new ahba((ahbh)aifs.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aifs.a;
            }
            case 4: {
                return new ahaz((ahbh)aifs.a);
            }
            case 3: {
                return new aifs();
            }
            case 2: {
                return newMessageInfo((MessageLite)aifs.a, "\u0001\u0001\u0000\u0001\uee5d\u21e7\uee5d\u21e7\u0001\u0000\u0000\u0001\uee5d\u21e7\u1409\u0000", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
