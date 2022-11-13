import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akul extends ahbh implements ahcw
{
    public static final akul a;
    private static volatile ahdd b;
    private int c;
    private apmt d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akul.class, (ahbh)(a = new akul()));
    }
    
    private akul() {
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
                if ((b = akul.b) == null) {
                    synchronized (akul.class) {
                        if (akul.b == null) {
                            akul.b = (ahdd)new ahba((ahbh)akul.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akul.a;
            }
            case 4: {
                return new ahaz((ahbh)akul.a);
            }
            case 3: {
                return new akul();
            }
            case 2: {
                return newMessageInfo((MessageLite)akul.a, "\u0001\u0001\u0000\u0001\uf67c\u1eb1\uf67c\u1eb1\u0001\u0000\u0000\u0001\uf67c\u1eb1\u1409\u0000", new Object[] { "c", "d" });
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
