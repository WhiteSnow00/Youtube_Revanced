import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ailf extends agzi implements ahax
{
    public static final ailf a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ailf.class, a = new ailf());
    }
    
    private ailf() {
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
                if ((b = ailf.b) == null) {
                    synchronized (ailf.class) {
                        if (ailf.b == null) {
                            ailf.b = (ahbe)new agzb((agzi)ailf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ailf.a;
            }
            case 4: {
                return new agza((agzi)ailf.a);
            }
            case 3: {
                return new ailf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ailf.a, "\u0001\u0000", null);
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
