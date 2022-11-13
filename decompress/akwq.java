import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akwq extends ahbh implements ahcw
{
    public static final akwq a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akwq.class, (ahbh)(a = new akwq()));
    }
    
    private akwq() {
        this.b = 0;
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
                if ((d = akwq.d) == null) {
                    synchronized (akwq.class) {
                        if (akwq.d == null) {
                            akwq.d = (ahdd)new ahba((ahbh)akwq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akwq.a;
            }
            case 4: {
                return new ahaz((ahbh)akwq.a);
            }
            case 3: {
                return new akwq();
            }
            case 2: {
                return newMessageInfo((MessageLite)akwq.a, "\u0001\u0001\u0001\u0000\uf74e\u1ed4\uf74e\u1ed4\u0001\u0000\u0000\u0001\uf74e\u1ed4\u143c\u0000", new Object[] { "c", "b", ahyr.class });
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
