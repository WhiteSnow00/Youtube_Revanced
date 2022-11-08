import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmf extends agzi implements ahax
{
    public static final ahmf a;
    private static volatile ahbe h;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    
    static {
        agzi.registerDefaultInstance((Class)ahmf.class, (agzi)(a = new ahmf()));
    }
    
    private ahmf() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = ahmf.h) == null) {
                    synchronized (ahmf.class) {
                        if (ahmf.h == null) {
                            ahmf.h = (ahbe)new agzb((agzi)ahmf.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ahmf.a;
            }
            case 4: {
                return new agza((agzi)ahmf.a);
            }
            case 3: {
                return new ahmf();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahmf.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1004\u0003\u0005\u1004\u0004", new Object[] { "b", "c", "d", "e", "f", "g" });
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
