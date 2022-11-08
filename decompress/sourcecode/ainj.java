import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ainj extends agzi implements ahax
{
    public static final ainj a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ainj.class, a = new ainj());
    }
    
    private ainj() {
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
                if ((b = ainj.b) == null) {
                    synchronized (ainj.class) {
                        if (ainj.b == null) {
                            ainj.b = (ahbe)new agzb((agzi)ainj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ainj.a;
            }
            case 4: {
                return new agza((agzi)ainj.a);
            }
            case 3: {
                return new ainj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ainj.a, "\u0001\u0000", null);
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
