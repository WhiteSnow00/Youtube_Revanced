import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoxz extends ahbh implements ahcw
{
    public static final aoxz a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)aoxz.class, (ahbh)(a = new aoxz()));
    }
    
    private aoxz() {
        this.f = 2;
        emptyProtobufList();
        emptyProtobufList();
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
                if ((b = aoxz.b) == null) {
                    synchronized (aoxz.class) {
                        if (aoxz.b == null) {
                            aoxz.b = (ahdd)new ahba((ahbh)aoxz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aoxz.a;
            }
            case 4: {
                return new ahaz((ahbh)aoxz.a);
            }
            case 3: {
                return new aoxz();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoxz.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "c", "d", "e" });
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