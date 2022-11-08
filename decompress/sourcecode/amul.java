import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amul extends agzi implements ahax
{
    public static final amul a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(amul.class, a = new amul());
    }
    
    private amul() {
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
                if ((b = amul.b) == null) {
                    synchronized (amul.class) {
                        if (amul.b == null) {
                            amul.b = (ahbe)new agzb((agzi)amul.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amul.a;
            }
            case 4: {
                return new agza((agzi)amul.a);
            }
            case 3: {
                return new amul();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amul.a, "\u0001\u0000", null);
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
