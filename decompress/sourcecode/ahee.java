import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahee extends agzi implements ahax
{
    public static final ahee a;
    private static volatile ahbe g;
    public int b;
    public Object c;
    public String d;
    public ahca e;
    public int f;
    
    static {
        agzi.registerDefaultInstance(ahee.class, a = new ahee());
    }
    
    private ahee() {
        this.b = 0;
        this.d = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = ahee.g) == null) {
                    synchronized (ahee.class) {
                        if (ahee.g == null) {
                            ahee.g = (ahbe)new agzb((agzi)ahee.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahee.a;
            }
            case 4: {
                return new agza((agzi)ahee.a);
            }
            case 3: {
                return new ahee();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahee.a, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\t\u0003\f\u0004<\u0000", new Object[] { "c", "b", "d", "e", "f", aheg.class });
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
