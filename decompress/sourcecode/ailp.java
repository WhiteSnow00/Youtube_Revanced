import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ailp extends agzi implements ahax
{
    public static final ailp a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance(ailp.class, a = new ailp());
    }
    
    private ailp() {
        this.b = 0;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ailp.d) == null) {
                    synchronized (ailp.class) {
                        if (ailp.d == null) {
                            ailp.d = (ahbe)new agzb((agzi)ailp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ailp.a;
            }
            case 4: {
                return new agza((agzi)ailp.a);
            }
            case 3: {
                return new ailp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ailp.a, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\u0003\u103c\u0000\u0004\u103c\u0000", new Object[] { "c", "b", ailr.class, ailu.class, ails.class, aimb.class });
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
