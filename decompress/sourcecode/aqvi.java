import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqvi extends agzi implements ahax
{
    public static final aqvi a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(aqvi.class, a = new aqvi());
    }
    
    private aqvi() {
        final agyc b = agyc.b;
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
                if ((b = aqvi.b) == null) {
                    synchronized (aqvi.class) {
                        if (aqvi.b == null) {
                            aqvi.b = (ahbe)new agzb((agzi)aqvi.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqvi.a;
            }
            case 4: {
                return new agza((agzi)aqvi.a);
            }
            case 3: {
                return new aqvi();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqvi.a, "\u0001\u0000", null);
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
