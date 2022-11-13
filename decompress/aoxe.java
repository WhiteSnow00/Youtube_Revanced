import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoxe extends ahbh implements ahcw
{
    public static final aoxe a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)aoxe.class, (ahbh)(a = new aoxe()));
    }
    
    private aoxe() {
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
                if ((b = aoxe.b) == null) {
                    synchronized (aoxe.class) {
                        if (aoxe.b == null) {
                            aoxe.b = (ahdd)new ahba((ahbh)aoxe.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoxe.a;
            }
            case 4: {
                return new ahaz((ahbh)aoxe.a);
            }
            case 3: {
                return new aoxe();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoxe.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0002\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "c", "d", "e" });
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
