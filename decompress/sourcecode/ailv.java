import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ailv extends agzi implements ahax
{
    public static final ailv a;
    private static volatile ahbe d;
    public int b;
    public agyc c;
    
    static {
        agzi.registerDefaultInstance(ailv.class, a = new ailv());
    }
    
    private ailv() {
        this.c = agyc.b;
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
                if ((d = ailv.d) == null) {
                    synchronized (ailv.class) {
                        if (ailv.d == null) {
                            ailv.d = (ahbe)new agzb((agzi)ailv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ailv.a;
            }
            case 4: {
                return new agza((agzi)ailv.a);
            }
            case 3: {
                return new ailv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ailv.a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005\u100a\u0000", new Object[] { "b", "c" });
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
