import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apnh extends agzi implements ahax
{
    public static final apnh a;
    private static volatile ahbe d;
    public int b;
    public long c;
    
    static {
        agzi.registerDefaultInstance((Class)apnh.class, (agzi)(a = new apnh()));
    }
    
    private apnh() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = apnh.d) == null) {
                    synchronized (apnh.class) {
                        if (apnh.d == null) {
                            apnh.d = (ahbe)new agzb((agzi)apnh.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apnh.a;
            }
            case 4: {
                return new agza((agzi)apnh.a);
            }
            case 3: {
                return new apnh();
            }
            case 2: {
                return newMessageInfo((MessageLite)apnh.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1002\u0000", new Object[] { "b", "c" });
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
