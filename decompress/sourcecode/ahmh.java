import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmh extends agzi implements ahax
{
    public static final ahmh a;
    private static volatile ahbe d;
    public boolean b;
    public long c;
    private int e;
    
    static {
        agzi.registerDefaultInstance((Class)ahmh.class, (agzi)(a = new ahmh()));
    }
    
    private ahmh() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ahmh.d) == null) {
                    synchronized (ahmh.class) {
                        if (ahmh.d == null) {
                            ahmh.d = (ahbe)new agzb((agzi)ahmh.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahmh.a;
            }
            case 4: {
                return new agza((agzi)ahmh.a);
            }
            case 3: {
                return new ahmh();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahmh.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1003\u0001", new Object[] { "e", "b", "c" });
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
