import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amwo extends agzi implements ahax
{
    private static final amwo a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(amwo.class, a = new amwo());
    }
    
    private amwo() {
    }
    
    public static /* synthetic */ amwo a() {
        return amwo.a;
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
                if ((b = amwo.b) == null) {
                    synchronized (amwo.class) {
                        if (amwo.b == null) {
                            amwo.b = (ahbe)new agzb((agzi)amwo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amwo.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new amwo();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amwo.a, "\u0001\u0000", null);
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
