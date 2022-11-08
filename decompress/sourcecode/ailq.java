import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ailq extends agzi implements ahax
{
    public static final ailq a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ailq.class, a = new ailq());
    }
    
    private ailq() {
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
                if ((b = ailq.b) == null) {
                    synchronized (ailq.class) {
                        if (ailq.b == null) {
                            ailq.b = (ahbe)new agzb((agzi)ailq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ailq.a;
            }
            case 4: {
                return new agza((agzi)ailq.a);
            }
            case 3: {
                return new ailq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ailq.a, "\u0001\u0000", null);
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
