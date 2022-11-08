import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ailr extends agzi implements ahax
{
    public static final ailr a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ailr.class, a = new ailr());
    }
    
    private ailr() {
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
                if ((b = ailr.b) == null) {
                    synchronized (ailr.class) {
                        if (ailr.b == null) {
                            ailr.b = (ahbe)new agzb((agzi)ailr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ailr.a;
            }
            case 4: {
                return new agza((agzi)ailr.a);
            }
            case 3: {
                return new ailr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ailr.a, "\u0001\u0000", null);
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
