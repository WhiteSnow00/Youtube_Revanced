import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akwd extends ahbh implements ahcw
{
    public static final akwd a;
    private static volatile ahdd j;
    public int b;
    public akli c;
    public akwz d;
    public aiqj e;
    public long f;
    public akwr g;
    public ahab h;
    public ahbx i;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)akwd.class, (ahbh)(a = new akwd()));
    }
    
    private akwd() {
        this.k = 2;
        this.h = ahab.b;
        this.i = emptyProtobufList();
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
                final ahdd j;
                if ((j = akwd.j) == null) {
                    synchronized (akwd.class) {
                        if (akwd.j == null) {
                            akwd.j = (ahdd)new ahba((ahbh)akwd.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return akwd.a;
            }
            case 4: {
                return new ahaz((ahbh)akwd.a);
            }
            case 3: {
                return new akwd();
            }
            case 2: {
                return newMessageInfo((MessageLite)akwd.a, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0001\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0006\u1409\u0004\u0007\u1002\u0005\b\u1009\u0006\n\u100a\b\u000b\u041b", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", ajbq.class });
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
