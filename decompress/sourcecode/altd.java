import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class altd extends agzi implements ahax
{
    public static final altd a;
    private static volatile ahbe d;
    public boolean b;
    public ahqi c;
    private int e;
    
    static {
        agzi.registerDefaultInstance(altd.class, a = new altd());
    }
    
    private altd() {
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
                if ((d = altd.d) == null) {
                    synchronized (altd.class) {
                        if (altd.d == null) {
                            altd.d = (ahbe)new agzb((agzi)altd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return altd.a;
            }
            case 4: {
                return new agza((agzi)altd.a);
            }
            case 3: {
                return new altd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)altd.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1009\u0001", new Object[] { "e", "b", "c" });
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
