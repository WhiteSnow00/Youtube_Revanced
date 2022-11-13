import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apub extends ahbh implements ahcw
{
    public static final apub a;
    private static volatile ahdd b;
    private int c;
    private aiqj d;
    private aiqj e;
    private aiqj f;
    private aiqj g;
    private aiqj h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)apub.class, (ahbh)(a = new apub()));
    }
    
    private apub() {
        this.i = 2;
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
                final ahdd b;
                if ((b = apub.b) == null) {
                    synchronized (apub.class) {
                        if (apub.b == null) {
                            apub.b = (ahdd)new ahba((ahbh)apub.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apub.a;
            }
            case 4: {
                return new ahaz((ahbh)apub.a);
            }
            case 3: {
                return new apub();
            }
            case 2: {
                return newMessageInfo((MessageLite)apub.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004", new Object[] { "c", "d", "e", "f", "g", "h" });
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
