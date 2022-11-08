import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apns extends agzi implements ahax
{
    public static final apns a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)apns.class, (agzi)(a = new apns()));
    }
    
    private apns() {
        final agyc b = agyc.b;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = apns.b) == null) {
                    synchronized (apns.class) {
                        if (apns.b == null) {
                            apns.b = (ahbe)new agzb((agzi)apns.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apns.a;
            }
            case 4: {
                return new agza((agzi)apns.a);
            }
            case 3: {
                return new apns();
            }
            case 2: {
                return newMessageInfo((MessageLite)apns.a, "\u0001\u0000", (Object[])null);
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
