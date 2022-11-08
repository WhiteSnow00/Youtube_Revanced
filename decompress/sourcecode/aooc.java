import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aooc extends agzi implements ahax
{
    public static final aooc a;
    private static volatile ahbe h;
    public int b;
    public long c;
    public float d;
    public long e;
    public long f;
    public aitx g;
    
    static {
        agzi.registerDefaultInstance((Class)aooc.class, (agzi)(a = new aooc()));
    }
    
    private aooc() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = aooc.h) == null) {
                    synchronized (aooc.class) {
                        if (aooc.h == null) {
                            aooc.h = (ahbe)new agzb((agzi)aooc.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aooc.a;
            }
            case 4: {
                return new agza((agzi)aooc.a);
            }
            case 3: {
                return new aooc();
            }
            case 2: {
                return newMessageInfo((MessageLite)aooc.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1001\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u1009\u0004", new Object[] { "b", "c", "d", "e", "f", "g" });
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
