import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ailx extends agzi implements ahax
{
    public static final ailx a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    
    static {
        agzi.registerDefaultInstance(ailx.class, a = new ailx());
    }
    
    private ailx() {
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
                if ((d = ailx.d) == null) {
                    synchronized (ailx.class) {
                        if (ailx.d == null) {
                            ailx.d = (ahbe)new agzb((agzi)ailx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ailx.a;
            }
            case 4: {
                return new agza((agzi)ailx.a);
            }
            case 3: {
                return new ailx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ailx.a, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\u0003\u103c\u0000", new Object[] { "c", "b", ailt.class, ailm.class, aill.class });
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
