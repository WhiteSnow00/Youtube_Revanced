import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahky extends ahbh implements ahcw
{
    public static final ahky a;
    private static volatile ahdd g;
    public int b;
    public aotp c;
    public ajut d;
    public aiqj e;
    public ahab f;
    private ahhu h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)ahky.class, (ahbh)(a = new ahky()));
    }
    
    private ahky() {
        this.i = 2;
        this.f = ahab.b;
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
                if ((g = ahky.g) == null) {
                    synchronized (ahky.class) {
                        if (ahky.g == null) {
                            ahky.g = (ahdd)new ahba((ahbh)ahky.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahky.a;
            }
            case 4: {
                return new ahaz((ahbh)ahky.a);
            }
            case 3: {
                return new ahky();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahky.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u100a\u0004", new Object[] { "b", "c", "d", "e", "h", "f" });
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
