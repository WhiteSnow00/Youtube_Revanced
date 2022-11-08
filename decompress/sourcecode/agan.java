import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agan extends agzi implements ahax
{
    public static final agan a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(agan.class, a = new agan());
    }
    
    private agan() {
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
                if ((b = agan.b) == null) {
                    synchronized (agan.class) {
                        if (agan.b == null) {
                            agan.b = (ahbe)new agzb((agzi)agan.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agan.a;
            }
            case 4: {
                return new agza((agzi)agan.a);
            }
            case 3: {
                return new agan();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agan.a, "\u0000\u0000", null);
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
