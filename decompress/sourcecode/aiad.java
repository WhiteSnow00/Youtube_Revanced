import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiad extends agzi implements ahax
{
    public static final aiad a;
    private static volatile ahbe d;
    public int b;
    public float c;
    private int e;
    
    static {
        agzi.registerDefaultInstance(aiad.class, a = new aiad());
    }
    
    private aiad() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = aiad.d) == null) {
                    synchronized (aiad.class) {
                        if (aiad.d == null) {
                            aiad.d = (ahbe)new agzb((agzi)aiad.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aiad.a;
            }
            case 4: {
                return new agza((agzi)aiad.a);
            }
            case 3: {
                return new aiad();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiad.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1001\u0001", new Object[] { "e", "b", "c" });
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
