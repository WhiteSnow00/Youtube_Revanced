import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apoa extends agzi implements ahax
{
    public static final apoa a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public int d;
    public int e;
    private int g;
    
    static {
        agzi.registerDefaultInstance((Class)apoa.class, (agzi)(a = new apoa()));
    }
    
    private apoa() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = apoa.f) == null) {
                    synchronized (apoa.class) {
                        if (apoa.f == null) {
                            apoa.f = (ahbe)new agzb((agzi)apoa.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apoa.a;
            }
            case 4: {
                return new agza((agzi)apoa.a);
            }
            case 3: {
                return new apoa();
            }
            case 2: {
                return newMessageInfo((MessageLite)apoa.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1004\u0003", new Object[] { "g", "b", "c", "d", "e" });
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
