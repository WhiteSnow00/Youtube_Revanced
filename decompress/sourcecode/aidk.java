import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidk extends agzi implements ahax
{
    public static final aidk a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance((Class)aidk.class, (agzi)(a = new aidk()));
    }
    
    private aidk() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aidk.b) == null) {
                    synchronized (aidk.class) {
                        if (aidk.b == null) {
                            aidk.b = (ahbe)new agzb((agzi)aidk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aidk.a;
            }
            case 4: {
                return new agza((agzi)aidk.a);
            }
            case 3: {
                return new aidk();
            }
            case 2: {
                return newMessageInfo((MessageLite)aidk.a, "\u0001\u0000", (Object[])null);
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
