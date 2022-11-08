import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amwr extends agzi implements ahax
{
    private static final amwr a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(amwr.class, a = new amwr());
    }
    
    private amwr() {
    }
    
    public static /* synthetic */ amwr a() {
        return amwr.a;
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
                if ((b = amwr.b) == null) {
                    synchronized (amwr.class) {
                        if (amwr.b == null) {
                            amwr.b = (ahbe)new agzb((agzi)amwr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amwr.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new amwr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amwr.a, "\u0001\u0000", null);
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
