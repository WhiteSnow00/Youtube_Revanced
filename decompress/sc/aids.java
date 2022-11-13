import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aids extends ahbh implements ahcw
{
    public static final aids a;
    private static volatile ahdd b;
    private int c;
    private ajrt d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aids.class, (ahbh)(a = new aids()));
    }
    
    private aids() {
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
                if ((b = aids.b) == null) {
                    synchronized (aids.class) {
                        if (aids.b == null) {
                            aids.b = (ahdd)new ahba((ahbh)aids.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aids.a;
            }
            case 4: {
                return new ahaz((ahbh)aids.a);
            }
            case 3: {
                return new aids();
            }
            case 2: {
                return newMessageInfo((MessageLite)aids.a, "\u0001\u0001\u0000\u0001\uf90f\u1b55\uf90f\u1b55\u0001\u0000\u0000\u0001\uf90f\u1b55\u1409\u0000", new Object[] { "c", "d" });
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
