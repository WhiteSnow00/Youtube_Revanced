import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahxh extends agzi implements ahax
{
    public static final ahxh a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(ahxh.class, a = new ahxh());
    }
    
    private ahxh() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = ahxh.e) == null) {
                    synchronized (ahxh.class) {
                        if (ahxh.e == null) {
                            ahxh.e = (ahbe)new agzb((agzi)ahxh.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahxh.a;
            }
            case 4: {
                return new agza((agzi)ahxh.a);
            }
            case 3: {
                return new ahxh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahxh.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001", new Object[] { "b", "c", "d" });
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
