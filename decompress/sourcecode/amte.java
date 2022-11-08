import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amte extends agzi implements ahax
{
    public static final amte a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(amte.class, a = new amte());
    }
    
    private amte() {
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
                if ((b = amte.b) == null) {
                    synchronized (amte.class) {
                        if (amte.b == null) {
                            amte.b = (ahbe)new agzb((agzi)amte.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amte.a;
            }
            case 4: {
                return new agza((agzi)amte.a);
            }
            case 3: {
                return new amte();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amte.a, "\u0001\u0000", null);
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
