import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aodl extends agzi implements ahax
{
    private static final aodl a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aodl.class, a = new aodl());
    }
    
    private aodl() {
    }
    
    public static /* synthetic */ aodl a() {
        return aodl.a;
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
                if ((b = aodl.b) == null) {
                    synchronized (aodl.class) {
                        if (aodl.b == null) {
                            aodl.b = (ahbe)new agzb((agzi)aodl.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aodl.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new aodl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aodl.a, "\u0001\u0000", null);
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
