import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aozh extends ahbh implements ahcw
{
    public static final aozh a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aozh.class, (ahbh)(a = new aozh()));
    }
    
    private aozh() {
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
                if ((d = aozh.d) == null) {
                    synchronized (aozh.class) {
                        if (aozh.d == null) {
                            aozh.d = (ahdd)new ahba((ahbh)aozh.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aozh.a;
            }
            case 4: {
                return new ahaz((ahbh)aozh.a);
            }
            case 3: {
                return new aozh();
            }
            case 2: {
                return newMessageInfo((MessageLite)aozh.a, "\u0001\u0001\u0001\u0000\uf3fb\u30fa\uf3fb\u30fa\u0001\u0000\u0000\u0001\uf3fb\u30fa\u143c\u0000", new Object[] { "c", "b", akbo.class });
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
