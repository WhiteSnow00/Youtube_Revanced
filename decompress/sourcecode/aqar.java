import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqar extends agzi implements ahax
{
    public static final aqar a;
    private static volatile ahbe e;
    public int b;
    public int c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(aqar.class, a = new aqar());
    }
    
    private aqar() {
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
                if ((e = aqar.e) == null) {
                    synchronized (aqar.class) {
                        if (aqar.e == null) {
                            aqar.e = (ahbe)new agzb((agzi)aqar.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqar.a;
            }
            case 4: {
                return new agza((agzi)aqar.a);
            }
            case 3: {
                return new aqar();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqar.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100b\u0001\u0002\u100b\u0002", new Object[] { "b", "c", "d" });
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
