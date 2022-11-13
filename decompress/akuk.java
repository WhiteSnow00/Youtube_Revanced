import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akuk extends ahbh implements ahcw
{
    public static final akuk a;
    private static volatile ahdd b;
    private int c;
    private ajbd d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akuk.class, (ahbh)(a = new akuk()));
    }
    
    private akuk() {
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
                if ((b = akuk.b) == null) {
                    synchronized (akuk.class) {
                        if (akuk.b == null) {
                            akuk.b = (ahdd)new ahba((ahbh)akuk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akuk.a;
            }
            case 4: {
                return new ahaz((ahbh)akuk.a);
            }
            case 3: {
                return new akuk();
            }
            case 2: {
                return newMessageInfo((MessageLite)akuk.a, "\u0001\u0001\u0000\u0001\uf3cf\u26e0\uf3cf\u26e0\u0001\u0000\u0000\u0001\uf3cf\u26e0\u1409\u0000", new Object[] { "c", "d" });
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
