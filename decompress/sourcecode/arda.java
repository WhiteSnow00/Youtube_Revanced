import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arda extends agzi implements ahax
{
    public static final arda a;
    private static volatile ahbe g;
    public int b;
    public int c;
    public String d;
    public long e;
    public long f;
    
    static {
        agzi.registerDefaultInstance((Class)arda.class, (agzi)(a = new arda()));
    }
    
    private arda() {
        this.d = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = arda.g) == null) {
                    synchronized (arda.class) {
                        if (arda.g == null) {
                            arda.g = (ahbe)new agzb((agzi)arda.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return arda.a;
            }
            case 4: {
                return new agza((agzi)arda.a);
            }
            case 3: {
                return new arda();
            }
            case 2: {
                return newMessageInfo((MessageLite)arda.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u1002\u0002\u0004\u1002\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
