import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akoc extends ahbh implements ahcw
{
    public static final akoc a;
    private static volatile ahdd g;
    public int b;
    public int c;
    public Object d;
    public ahab e;
    public ajut f;
    private ahhu h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)akoc.class, (ahbh)(a = new akoc()));
    }
    
    private akoc() {
        this.c = 0;
        this.i = 2;
        this.e = ahab.b;
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
                if ((g = akoc.g) == null) {
                    synchronized (akoc.class) {
                        if (akoc.g == null) {
                            akoc.g = (ahdd)new ahba((ahbh)akoc.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return akoc.a;
            }
            case 4: {
                return new ahaz((ahbh)akoc.a);
            }
            case 3: {
                return new akoc();
            }
            case 2: {
                return newMessageInfo((MessageLite)akoc.a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u100a\u0001\u0003\u1409\u0002\u0004\u143c\u0000\u0005\u103b\u0000", new Object[] { "d", "c", "b", "h", "e", "f", aiqj.class });
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
