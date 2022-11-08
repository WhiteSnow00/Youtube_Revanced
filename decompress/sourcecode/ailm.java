import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ailm extends agzi implements ahax
{
    public static final ailm a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ailm.class, a = new ailm());
    }
    
    private ailm() {
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
                if ((b = ailm.b) == null) {
                    synchronized (ailm.class) {
                        if (ailm.b == null) {
                            ailm.b = (ahbe)new agzb((agzi)ailm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ailm.a;
            }
            case 4: {
                return new agza((agzi)ailm.a);
            }
            case 3: {
                return new ailm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ailm.a, "\u0001\u0000", null);
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
