import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ailh extends agzi implements ahax
{
    public static final ailh a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ailh.class, a = new ailh());
    }
    
    private ailh() {
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
                if ((b = ailh.b) == null) {
                    synchronized (ailh.class) {
                        if (ailh.b == null) {
                            ailh.b = (ahbe)new agzb((agzi)ailh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ailh.a;
            }
            case 4: {
                return new agza((agzi)ailh.a);
            }
            case 3: {
                return new ailh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ailh.a, "\u0001\u0000", null);
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
