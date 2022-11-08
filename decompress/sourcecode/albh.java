import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albh extends agzi implements ahax
{
    public static final albh a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)albh.class, (agzi)(a = new albh()));
    }
    
    private albh() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = albh.b) == null) {
                    synchronized (albh.class) {
                        if (albh.b == null) {
                            albh.b = (ahbe)new agzb((agzi)albh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return albh.a;
            }
            case 4: {
                return new agza((agzi)albh.a);
            }
            case 3: {
                return new albh();
            }
            case 2: {
                return newMessageInfo((MessageLite)albh.a, "\u0001\u0000", (Object[])null);
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
