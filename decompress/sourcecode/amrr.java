import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amrr extends agzi implements ahax
{
    public static final amrr a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(amrr.class, a = new amrr());
    }
    
    private amrr() {
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
                if ((b = amrr.b) == null) {
                    synchronized (amrr.class) {
                        if (amrr.b == null) {
                            amrr.b = (ahbe)new agzb((agzi)amrr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amrr.a;
            }
            case 4: {
                return new agza((agzi)amrr.a);
            }
            case 3: {
                return new amrr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amrr.a, "\u0001\u0000", null);
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
