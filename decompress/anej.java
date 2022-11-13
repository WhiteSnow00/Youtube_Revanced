import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anej extends ahbh implements ahcw
{
    public static final anej a;
    private static volatile ahdd i;
    public int b;
    public int c;
    public Object d;
    public anen e;
    public anel f;
    public anuv g;
    public boolean h;
    private anuv j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)anej.class, (ahbh)(a = new anej()));
    }
    
    private anej() {
        this.c = 0;
        this.k = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = anej.i) == null) {
                    synchronized (anej.class) {
                        if (anej.i == null) {
                            anej.i = (ahdd)new ahba((ahbh)anej.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return anej.a;
            }
            case 4: {
                return new ahaz((ahbh)anej.a);
            }
            case 3: {
                return new anej();
            }
            case 2: {
                return newMessageInfo((MessageLite)anej.a, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u103e\u0000\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u103b\u0000\u0006\u1007\u0005\u0007\u1409\u0006", new Object[] { "d", "c", "b", "e", "f", "g", "h", "j" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
