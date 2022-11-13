import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aihz extends ahbh implements ahcw
{
    public static final aihz a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aihz.class, (ahbh)(a = new aihz()));
    }
    
    private aihz() {
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
                if ((d = aihz.d) == null) {
                    synchronized (aihz.class) {
                        if (aihz.d == null) {
                            aihz.d = (ahdd)new ahba((ahbh)aihz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aihz.a;
            }
            case 4: {
                return new ahaz((ahbh)aihz.a);
            }
            case 3: {
                return new aihz();
            }
            case 2: {
                return newMessageInfo((MessageLite)aihz.a, "\u0001\u0001\u0001\u0000\uf3fb\u30fa\uf3fb\u30fa\u0001\u0000\u0000\u0001\uf3fb\u30fa\u143c\u0000", new Object[] { "c", "b", akbo.class });
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
