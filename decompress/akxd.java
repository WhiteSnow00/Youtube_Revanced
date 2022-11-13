import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akxd extends ahbh implements ahcw
{
    public static final akxd a;
    private static volatile ahdd b;
    private int c;
    private akxi d;
    private akxf e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)akxd.class, (ahbh)(a = new akxd()));
    }
    
    private akxd() {
        this.f = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = akxd.b) == null) {
                    synchronized (akxd.class) {
                        if (akxd.b == null) {
                            akxd.b = (ahdd)new ahba((ahbh)akxd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akxd.a;
            }
            case 4: {
                return new ahaz((ahbh)akxd.a);
            }
            case 3: {
                return new akxd();
            }
            case 2: {
                return newMessageInfo((MessageLite)akxd.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
