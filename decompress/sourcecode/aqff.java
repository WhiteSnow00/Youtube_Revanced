import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqff extends agzi implements ahax
{
    public static final aqff a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)aqff.class, (agzi)(a = new aqff()));
    }
    
    private aqff() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aqff.b) == null) {
                    synchronized (aqff.class) {
                        if (aqff.b == null) {
                            aqff.b = (ahbe)new agzb((agzi)aqff.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqff.a;
            }
            case 4: {
                return new agza((agzi)aqff.a);
            }
            case 3: {
                return new aqff();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqff.a, "\u0001\u0000", (Object[])null);
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
