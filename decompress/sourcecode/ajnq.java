import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajnq extends agzi implements ahax
{
    public static final ajnq a;
    private static volatile ahbe h;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    
    static {
        agzi.registerDefaultInstance((Class)ajnq.class, (agzi)(a = new ajnq()));
    }
    
    private ajnq() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = ajnq.h) == null) {
                    synchronized (ajnq.class) {
                        if (ajnq.h == null) {
                            ajnq.h = (ahbe)new agzb((agzi)ajnq.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ajnq.a;
            }
            case 4: {
                return new agza((agzi)ajnq.a);
            }
            case 3: {
                return new ajnq();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajnq.a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100b\u0001\u0003\u100c\u0002\u0004\u100c\u0003\u0007\u100c\u0006", new Object[] { "b", "c", ajkr.t, "d", "e", ajkr.r, "f", ajkr.s, "g", ahse.b });
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
