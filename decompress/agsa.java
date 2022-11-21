import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agsa extends ahcz implements aheo
{
    public static final agsa a;
    private static volatile ahev f;
    public String b;
    public int c;
    public agrk d;
    public int e;
    
    static {
        ahcz.registerDefaultInstance(agsa.class, a = new agsa());
    }
    
    private agsa() {
        this.b = "";
        ahcz.emptyProtobufList();
        ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = agsa.f) == null) {
                    synchronized (agsa.class) {
                        if (agsa.f == null) {
                            agsa.f = (ahev)new ahcs((ahcz)agsa.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agsa.a;
            }
            case 4: {
                return new ahcr((ahcz)agsa.a);
            }
            case 3: {
                return new agsa();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agsa.a, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0004\u0004\t\u0005\f", new Object[] { "b", "c", "d", "e" });
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
