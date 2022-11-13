import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahgz extends ahbh implements ahcw
{
    public static final ahgz a;
    private static volatile ahdd b;
    private int c;
    private afrf d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)ahgz.class, (ahbh)(a = new ahgz()));
    }
    
    private ahgz() {
        this.e = 2;
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
                if ((b = ahgz.b) == null) {
                    synchronized (ahgz.class) {
                        if (ahgz.b == null) {
                            ahgz.b = (ahdd)new ahba((ahbh)ahgz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahgz.a;
            }
            case 4: {
                return new ahaz((ahbh)ahgz.a);
            }
            case 3: {
                return new ahgz();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahgz.a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005\u1409\u0004", new Object[] { "c", "d" });
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
