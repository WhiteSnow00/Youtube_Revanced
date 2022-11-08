import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ailz extends agzi implements ahax
{
    public static final ailz a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ailz.class, a = new ailz());
    }
    
    private ailz() {
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
                if ((b = ailz.b) == null) {
                    synchronized (ailz.class) {
                        if (ailz.b == null) {
                            ailz.b = (ahbe)new agzb((agzi)ailz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ailz.a;
            }
            case 4: {
                return new agza((agzi)ailz.a);
            }
            case 3: {
                return new ailz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ailz.a, "\u0001\u0000", null);
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
