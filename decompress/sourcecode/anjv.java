import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anjv extends agzi implements ahax
{
    public static final anjv a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(anjv.class, a = new anjv());
    }
    
    private anjv() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = anjv.b) == null) {
                    synchronized (anjv.class) {
                        if (anjv.b == null) {
                            anjv.b = (ahbe)new agzb((agzi)anjv.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anjv.a;
            }
            case 4: {
                return new agza((agzi)anjv.a);
            }
            case 3: {
                return new anjv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anjv.a, "\u0001\u0000", null);
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
