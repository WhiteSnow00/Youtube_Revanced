import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoph extends ahcz implements aheo
{
    public static final aoph a;
    private static volatile ahev g;
    public int b;
    public int c;
    public int d;
    public aopi e;
    public anxb f;
    private ajws h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(aoph.class, a = new aoph());
    }
    
    private aoph() {
        this.i = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = aoph.g) == null) {
                    synchronized (aoph.class) {
                        if (aoph.g == null) {
                            aoph.g = (ahev)new ahcs((ahcz)aoph.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aoph.a;
            }
            case 4: {
                return new ahcr((ahcz)aoph.a);
            }
            case 3: {
                return new aoph();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoph.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0003\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1409\u0002\u0004\u1409\u0004\u0005\u1409\u0005", new Object[] { "b", "c", "d", "e", "h", "f" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
