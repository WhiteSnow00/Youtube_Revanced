import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akfv extends ahbh implements ahcw
{
    public static final akfv a;
    private static volatile ahdd b;
    private int c;
    private aotf d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akfv.class, (ahbh)(a = new akfv()));
    }
    
    private akfv() {
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
                if ((b = akfv.b) == null) {
                    synchronized (akfv.class) {
                        if (akfv.b == null) {
                            akfv.b = (ahdd)new ahba((ahbh)akfv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akfv.a;
            }
            case 4: {
                return new ahaz((ahbh)akfv.a);
            }
            case 3: {
                return new akfv();
            }
            case 2: {
                return newMessageInfo((MessageLite)akfv.a, "\u0001\u0001\u0000\u0001\uefc0\u3a0a\uefc0\u3a0a\u0001\u0000\u0000\u0001\uefc0\u3a0a\u1409\u0000", new Object[] { "c", "d" });
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
