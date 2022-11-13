import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anit extends ahbh implements ahcw
{
    public static final anit a;
    private static volatile ahdd b;
    private int c;
    private aiqj d;
    private ajut e;
    private ankk f;
    private ahhu g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)anit.class, (ahbh)(a = new anit()));
    }
    
    private anit() {
        this.h = 2;
        emptyProtobufList();
        final ahab b = ahab.b;
        emptyProtobufList();
        emptyProtobufList();
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
                if ((b = anit.b) == null) {
                    synchronized (anit.class) {
                        if (anit.b == null) {
                            anit.b = (ahdd)new ahba((ahbh)anit.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anit.a;
            }
            case 4: {
                return new ahaz((ahbh)anit.a);
            }
            case 3: {
                return new anit();
            }
            case 2: {
                return newMessageInfo((MessageLite)anit.a, "\u0001\u0004\u0000\u0001\u0002\u0007\u0004\u0000\u0000\u0004\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0007\u1409\u0006", new Object[] { "c", "d", "e", "f", "g" });
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
