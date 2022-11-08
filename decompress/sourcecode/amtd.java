import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amtd extends agzi implements ahax
{
    public static final amtd a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(amtd.class, a = new amtd());
    }
    
    private amtd() {
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
                if ((b = amtd.b) == null) {
                    synchronized (amtd.class) {
                        if (amtd.b == null) {
                            amtd.b = (ahbe)new agzb((agzi)amtd.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amtd.a;
            }
            case 4: {
                return new agza((agzi)amtd.a);
            }
            case 3: {
                return new amtd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amtd.a, "\u0001\u0000", null);
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
