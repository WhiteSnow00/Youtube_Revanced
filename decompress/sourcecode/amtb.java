import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amtb extends agzi implements ahax
{
    public static final amtb a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(amtb.class, a = new amtb());
    }
    
    private amtb() {
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
                if ((b = amtb.b) == null) {
                    synchronized (amtb.class) {
                        if (amtb.b == null) {
                            amtb.b = (ahbe)new agzb((agzi)amtb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amtb.a;
            }
            case 4: {
                return new agza((agzi)amtb.a);
            }
            case 3: {
                return new amtb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amtb.a, "\u0001\u0000", null);
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
