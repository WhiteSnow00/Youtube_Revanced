import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alte extends agzi implements ahax
{
    public static final alte a;
    private static volatile ahbe h;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public long g;
    
    static {
        agzi.registerDefaultInstance(alte.class, a = new alte());
    }
    
    private alte() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = alte.h) == null) {
                    synchronized (alte.class) {
                        if (alte.h == null) {
                            alte.h = (ahbe)new agzb((agzi)alte.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return alte.a;
            }
            case 4: {
                return new agza((agzi)alte.a);
            }
            case 3: {
                return new alte();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alte.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\u100c\u0000\u0003\u1004\u0003\u0004\u1004\u0004\u0005\u1004\u0005\u0006\u1002\u0006", new Object[] { "b", "c", alsb.h, "d", "e", "f", "g" });
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
