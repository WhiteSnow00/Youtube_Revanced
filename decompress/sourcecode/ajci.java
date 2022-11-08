import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajci extends agzi implements ahax
{
    public static final ajci a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ajci.class, a = new ajci());
    }
    
    private ajci() {
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
                if ((b = ajci.b) == null) {
                    synchronized (ajci.class) {
                        if (ajci.b == null) {
                            ajci.b = (ahbe)new agzb((agzi)ajci.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajci.a;
            }
            case 4: {
                return new agza((agzi)ajci.a);
            }
            case 3: {
                return new ajci();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajci.a, "\u0001\u0000", null);
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
