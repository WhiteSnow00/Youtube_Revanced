import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agph extends agzi implements ahax
{
    public static final agph a;
    private static volatile ahbe d;
    public int b;
    public agyc c;
    
    static {
        agzi.registerDefaultInstance(agph.class, a = new agph());
    }
    
    private agph() {
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
                if ((d = agph.d) == null) {
                    synchronized (agph.class) {
                        if (agph.d == null) {
                            agph.d = (ahbe)new agzb((agzi)agph.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return agph.a;
            }
            case 4: {
                return new agza((agzi)agph.a);
            }
            case 3: {
                return new agph();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agph.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100a\u0000", new Object[] { "b", "c" });
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
