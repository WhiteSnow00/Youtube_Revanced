import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amtc extends agzi implements ahax
{
    public static final amtc a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(amtc.class, a = new amtc());
    }
    
    private amtc() {
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
                if ((b = amtc.b) == null) {
                    synchronized (amtc.class) {
                        if (amtc.b == null) {
                            amtc.b = (ahbe)new agzb((agzi)amtc.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amtc.a;
            }
            case 4: {
                return new agza((agzi)amtc.a);
            }
            case 3: {
                return new amtc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amtc.a, "\u0001\u0000", null);
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
