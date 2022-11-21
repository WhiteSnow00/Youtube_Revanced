import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alxg extends ahcz implements aheo
{
    public static final alxg a;
    private static volatile ahev j;
    public int b;
    public ajws c;
    public anxb d;
    public anxb e;
    public anxb f;
    public ahdp g;
    public ajws h;
    public anxb i;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(alxg.class, a = new alxg());
    }
    
    private alxg() {
        this.k = 2;
        this.g = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev j;
                if ((j = alxg.j) == null) {
                    synchronized (alxg.class) {
                        if (alxg.j == null) {
                            alxg.j = (ahev)new ahcs((ahcz)alxg.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return alxg.a;
            }
            case 4: {
                return new ahcr((ahcz)alxg.a);
            }
            case 3: {
                return new alxg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alxg.a, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0007\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u041b\u0007\u1409\u0005\b\u1409\u0006", new Object[] { "b", "c", "d", "e", "f", "g", anxb.class, "h", "i" });
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
