import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ardb extends ahcz implements aheo
{
    public static final ardb a;
    private static volatile ahev g;
    public int b;
    public String c;
    public String d;
    public int e;
    public int f;
    
    static {
        ahcz.registerDefaultInstance(ardb.class, a = new ardb());
    }
    
    private ardb() {
        this.c = "";
        this.d = "";
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
                if ((g = ardb.g) == null) {
                    synchronized (ardb.class) {
                        if (ardb.g == null) {
                            ardb.g = (ahev)new ahcs((ahcz)ardb.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ardb.a;
            }
            case 4: {
                return new ahcr((ahcz)ardb.a);
            }
            case 3: {
                return new ardb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ardb.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1004\u0002\u0003\u1004\u0003\u0004\u1008\u0001", new Object[] { "b", "c", "e", "f", "d" });
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
