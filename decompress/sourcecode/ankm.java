import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ankm extends agzi implements ahax
{
    public static final ankm a;
    private static volatile ahbe b;
    private int c;
    private amin d;
    
    static {
        agzi.registerDefaultInstance(ankm.class, a = new ankm());
    }
    
    private ankm() {
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
                if ((b = ankm.b) == null) {
                    synchronized (ankm.class) {
                        if (ankm.b == null) {
                            ankm.b = (ahbe)new agzb((agzi)ankm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ankm.a;
            }
            case 4: {
                return new agza((agzi)ankm.a);
            }
            case 3: {
                return new ankm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ankm.a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005\u1009\u0004", new Object[] { "c", "d" });
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
