import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ailc extends agzi implements ahax
{
    public static final ailc a;
    private static volatile ahbe g;
    public int b;
    public int c;
    public int d;
    public int e;
    public aild f;
    
    static {
        agzi.registerDefaultInstance(ailc.class, a = new ailc());
    }
    
    private ailc() {
        this.e = -1;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = ailc.g) == null) {
                    synchronized (ailc.class) {
                        if (ailc.g == null) {
                            ailc.g = (ahbe)new agzb((agzi)ailc.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ailc.a;
            }
            case 4: {
                return new agza((agzi)ailc.a);
            }
            case 3: {
                return new ailc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ailc.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1009\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
