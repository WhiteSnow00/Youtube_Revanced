import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aodk extends agzi implements ahax
{
    public static final aodk a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aodk.class, a = new aodk());
    }
    
    private aodk() {
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
                if ((b = aodk.b) == null) {
                    synchronized (aodk.class) {
                        if (aodk.b == null) {
                            aodk.b = (ahbe)new agzb((agzi)aodk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aodk.a;
            }
            case 4: {
                return new agza((agzi)aodk.a);
            }
            case 3: {
                return new aodk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aodk.a, "\u0001\u0000", null);
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
