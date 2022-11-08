import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aprd extends agzi implements ahax
{
    public static final aprd a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)aprd.class, (agzi)(a = new aprd()));
    }
    
    private aprd() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aprd.b) == null) {
                    synchronized (aprd.class) {
                        if (aprd.b == null) {
                            aprd.b = (ahbe)new agzb((agzi)aprd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aprd.a;
            }
            case 4: {
                return new agza((agzi)aprd.a);
            }
            case 3: {
                return new aprd();
            }
            case 2: {
                return newMessageInfo((MessageLite)aprd.a, "\u0001\u0000", (Object[])null);
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
