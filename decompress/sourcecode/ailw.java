import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ailw extends agzi implements ahax
{
    public static final ailw a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ailw.class, a = new ailw());
    }
    
    private ailw() {
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
                if ((b = ailw.b) == null) {
                    synchronized (ailw.class) {
                        if (ailw.b == null) {
                            ailw.b = (ahbe)new agzb((agzi)ailw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ailw.a;
            }
            case 4: {
                return new agza((agzi)ailw.a);
            }
            case 3: {
                return new ailw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ailw.a, "\u0001\u0000", null);
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
