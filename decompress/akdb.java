import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akdb extends ahcz implements aheo
{
    public static final akdb a;
    private static volatile ahev g;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    
    static {
        ahcz.registerDefaultInstance(akdb.class, a = new akdb());
    }
    
    private akdb() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = akdb.g) == null) {
                    synchronized (akdb.class) {
                        if (akdb.g == null) {
                            akdb.g = (ahev)new ahcs((ahcz)akdb.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return akdb.a;
            }
            case 4: {
                return new ahcr((ahcz)akdb.a);
            }
            case 3: {
                return new akdb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akdb.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1004\u0003", new Object[] { "b", "c", "d", "e", "f" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
