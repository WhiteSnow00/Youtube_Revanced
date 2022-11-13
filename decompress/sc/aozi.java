import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aozi extends ahbh implements ahcw
{
    public static final aozi a;
    private static volatile ahdd g;
    public int b;
    public ajut c;
    public ajut d;
    public aida e;
    public aozh f;
    private ahhu h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)aozi.class, (ahbh)(a = new aozi()));
    }
    
    private aozi() {
        this.i = 2;
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = aozi.g) == null) {
                    synchronized (aozi.class) {
                        if (aozi.g == null) {
                            aozi.g = (ahdd)new ahba((ahbh)aozi.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aozi.a;
            }
            case 4: {
                return new ahaz((ahbh)aozi.a);
            }
            case 3: {
                return new aozi();
            }
            case 2: {
                return newMessageInfo((MessageLite)aozi.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0005\u1409\u0004\u0006\u1409\u0005", new Object[] { "b", "c", "d", "e", "h", "f" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
