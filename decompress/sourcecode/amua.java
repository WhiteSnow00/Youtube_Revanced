import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amua extends agzi implements ahax
{
    public static final amua a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(amua.class, a = new amua());
    }
    
    private amua() {
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
                if ((b = amua.b) == null) {
                    synchronized (amua.class) {
                        if (amua.b == null) {
                            amua.b = (ahbe)new agzb((agzi)amua.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amua.a;
            }
            case 4: {
                return new agza((agzi)amua.a);
            }
            case 3: {
                return new amua();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amua.a, "\u0001\u0000", null);
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
