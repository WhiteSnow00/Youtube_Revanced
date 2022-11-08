import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ailj extends agzi implements ahax
{
    public static final ailj a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ailj.class, a = new ailj());
    }
    
    private ailj() {
        final agyc b = agyc.b;
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
                if ((b = ailj.b) == null) {
                    synchronized (ailj.class) {
                        if (ailj.b == null) {
                            ailj.b = (ahbe)new agzb((agzi)ailj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ailj.a;
            }
            case 4: {
                return new agza((agzi)ailj.a);
            }
            case 3: {
                return new ailj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ailj.a, "\u0001\u0000", null);
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
