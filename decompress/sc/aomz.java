import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aomz extends ahbh implements ahcw
{
    public static final aomz a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aomz.class, (ahbh)(a = new aomz()));
    }
    
    private aomz() {
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
                if ((d = aomz.d) == null) {
                    synchronized (aomz.class) {
                        if (aomz.d == null) {
                            aomz.d = (ahdd)new ahba((ahbh)aomz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aomz.a;
            }
            case 4: {
                return new ahaz((ahbh)aomz.a);
            }
            case 3: {
                return new aomz();
            }
            case 2: {
                return newMessageInfo((MessageLite)aomz.a, "\u0001\u0002\u0001\u0000\uf5b1\u2f1e\uf3fb\u30fa\u0002\u0000\u0000\u0002\uf5b1\u2f1e\u143c\u0000\uf3fb\u30fa\u143c\u0000", new Object[] { "c", "b", ajab.class, akbo.class });
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
