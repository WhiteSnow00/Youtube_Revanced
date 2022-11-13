import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apbr extends ahbh implements ahcw
{
    public static final apbr a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ajut e;
    private ajut f;
    private ahhu g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)apbr.class, (ahbh)(a = new apbr()));
    }
    
    private apbr() {
        this.h = 2;
        emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = apbr.b) == null) {
                    synchronized (apbr.class) {
                        if (apbr.b == null) {
                            apbr.b = (ahdd)new ahba((ahbh)apbr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apbr.a;
            }
            case 4: {
                return new ahaz((ahbh)apbr.a);
            }
            case 3: {
                return new apbr();
            }
            case 2: {
                return newMessageInfo((MessageLite)apbr.a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0006\u1409\u0004", new Object[] { "c", "d", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
