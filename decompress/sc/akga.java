import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akga extends ahbh implements ahcw
{
    public static final akga a;
    private static volatile ahdd d;
    public int b;
    public akfz c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akga.class, (ahbh)(a = new akga()));
    }
    
    private akga() {
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
                if ((d = akga.d) == null) {
                    synchronized (akga.class) {
                        if (akga.d == null) {
                            akga.d = (ahdd)new ahba((ahbh)akga.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akga.a;
            }
            case 4: {
                return new ahaz((ahbh)akga.a);
            }
            case 3: {
                return new akga();
            }
            case 2: {
                return newMessageInfo((MessageLite)akga.a, "\u0001\u0001\u0000\u0001\uf35d\u27f3\uf35d\u27f3\u0001\u0000\u0000\u0001\uf35d\u27f3\u1409\u0000", new Object[] { "b", "c" });
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
