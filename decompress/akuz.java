import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akuz extends ahbh implements ahcw
{
    public static final akuz a;
    private static volatile ahdd d;
    public int b;
    public aklg c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akuz.class, (ahbh)(a = new akuz()));
    }
    
    private akuz() {
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
                final ahdd d;
                if ((d = akuz.d) == null) {
                    synchronized (akuz.class) {
                        if (akuz.d == null) {
                            akuz.d = (ahdd)new ahba((ahbh)akuz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akuz.a;
            }
            case 4: {
                return new ahaz((ahbh)akuz.a);
            }
            case 3: {
                return new akuz();
            }
            case 2: {
                return newMessageInfo((MessageLite)akuz.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
