import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amwq extends agzi implements ahax
{
    private static final amwq a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(amwq.class, a = new amwq());
    }
    
    private amwq() {
    }
    
    public static /* synthetic */ amwq a() {
        return amwq.a;
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
                if ((b = amwq.b) == null) {
                    synchronized (amwq.class) {
                        if (amwq.b == null) {
                            amwq.b = (ahbe)new agzb((agzi)amwq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amwq.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new amwq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amwq.a, "\u0001\u0000", null);
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
