import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahqa extends agzi implements ahax
{
    public static final ahqa a;
    private static volatile ahbe i;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    
    static {
        agzi.registerDefaultInstance(ahqa.class, a = new ahqa());
    }
    
    private ahqa() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe i;
                if ((i = ahqa.i) == null) {
                    synchronized (ahqa.class) {
                        if (ahqa.i == null) {
                            ahqa.i = (ahbe)new agzb((agzi)ahqa.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ahqa.a;
            }
            case 4: {
                return new agza((agzi)ahqa.a);
            }
            case 3: {
                return new ahqa();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahqa.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u100c\u0001\u0003\u1004\u0002\u0004\u100c\u0003\u0005\u100c\u0004\u0006\u100c\u0005", new Object[] { "b", "c", "d", ajbv.a(), "e", "f", aonj.i, "g", aonj.h, "h", aonj.e });
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
