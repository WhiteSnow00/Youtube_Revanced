import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apdb extends ahcz implements aheo
{
    public static final apdb a;
    private static volatile ahev g;
    public int b;
    public ahdh c;
    public aowg d;
    public aowg e;
    public aowg f;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(apdb.class, a = new apdb());
    }
    
    private apdb() {
        this.h = 2;
        this.c = ahcz.emptyIntList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = apdb.g) == null) {
                    synchronized (apdb.class) {
                        if (apdb.g == null) {
                            apdb.g = (ahev)new ahcs((ahcz)apdb.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return apdb.a;
            }
            case 4: {
                return new ahcr((ahcz)apdb.a);
            }
            case 3: {
                return new apdb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apdb.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0003\u0001\u001d\u0002\u1409\u0000\u0003\u1409\u0001\u0004\u1409\u0002", new Object[] { "b", "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
