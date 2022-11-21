import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsr extends ahcz implements aheo
{
    public static final aqsr a;
    private static volatile ahev g;
    public int b;
    public String c;
    public String d;
    public long e;
    public long f;
    
    static {
        ahcz.registerDefaultInstance(aqsr.class, a = new aqsr());
    }
    
    private aqsr() {
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
                if ((g = aqsr.g) == null) {
                    synchronized (aqsr.class) {
                        if (aqsr.g == null) {
                            aqsr.g = (ahev)new ahcs((ahcz)aqsr.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aqsr.a;
            }
            case 4: {
                return new ahcr((ahcz)aqsr.a);
            }
            case 3: {
                return new aqsr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqsr.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1003\u0002\u0004\u1003\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
