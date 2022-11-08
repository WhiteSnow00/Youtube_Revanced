import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ankp extends agzi implements ahax
{
    public static final ankp a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ankp.class, a = new ankp());
    }
    
    private ankp() {
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
                if ((b = ankp.b) == null) {
                    synchronized (ankp.class) {
                        if (ankp.b == null) {
                            ankp.b = (ahbe)new agzb((agzi)ankp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ankp.a;
            }
            case 4: {
                return new agza((agzi)ankp.a);
            }
            case 3: {
                return new ankp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ankp.a, "\u0001\u0000", null);
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
