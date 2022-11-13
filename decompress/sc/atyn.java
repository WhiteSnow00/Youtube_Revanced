import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atyn extends ahbh implements ahcw
{
    public static final atyn a;
    private static volatile ahdd b;
    private int c;
    private afrg d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)atyn.class, (ahbh)(a = new atyn()));
    }
    
    private atyn() {
        this.e = 2;
        emptyProtobufList();
        ahbh.emptyProtobufList();
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
                if ((b = atyn.b) == null) {
                    synchronized (atyn.class) {
                        if (atyn.b == null) {
                            atyn.b = (ahdd)new ahba((ahbh)atyn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return atyn.a;
            }
            case 4: {
                return new ahaz((ahbh)atyn.a);
            }
            case 3: {
                return new atyn();
            }
            case 2: {
                return newMessageInfo((MessageLite)atyn.a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005\u1409\u0004", new Object[] { "c", "d" });
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
