import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anhe extends ahbh implements ahcw
{
    public static final anhe a;
    private static volatile ahdd b;
    private int c;
    private ajut d;
    private ahhu e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)anhe.class, (ahbh)(a = new anhe()));
    }
    
    private anhe() {
        this.f = 2;
        emptyProtobufList();
        final ahab b = ahab.b;
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
                if ((b = anhe.b) == null) {
                    synchronized (anhe.class) {
                        if (anhe.b == null) {
                            anhe.b = (ahdd)new ahba((ahbh)anhe.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anhe.a;
            }
            case 4: {
                return new ahaz((ahbh)anhe.a);
            }
            case 3: {
                return new anhe();
            }
            case 2: {
                return newMessageInfo((MessageLite)anhe.a, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0004\u1409\u0002", new Object[] { "c", "d", "e" });
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
