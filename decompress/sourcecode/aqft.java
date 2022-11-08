import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqft extends agzi implements ahax
{
    public static final aqft a;
    private static volatile ahbe d;
    public int b;
    public long c;
    
    static {
        agzi.registerDefaultInstance((Class)aqft.class, (agzi)(a = new aqft()));
    }
    
    private aqft() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = aqft.d) == null) {
                    synchronized (aqft.class) {
                        if (aqft.d == null) {
                            aqft.d = (ahbe)new agzb((agzi)aqft.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqft.a;
            }
            case 4: {
                return new agza((agzi)aqft.a);
            }
            case 3: {
                return new aqft();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqft.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1003\u0000", new Object[] { "b", "c" });
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
