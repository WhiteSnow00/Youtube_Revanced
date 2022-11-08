import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ankn extends agzi implements ahax
{
    public static final ankn a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ankn.class, a = new ankn());
    }
    
    private ankn() {
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
                if ((b = ankn.b) == null) {
                    synchronized (ankn.class) {
                        if (ankn.b == null) {
                            ankn.b = (ahbe)new agzb((agzi)ankn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ankn.a;
            }
            case 4: {
                return new agza((agzi)ankn.a);
            }
            case 3: {
                return new ankn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ankn.a, "\u0001\u0000", null);
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
