import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahgj extends agzi implements ahax
{
    public static final ahgj a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ahgj.class, a = new ahgj());
    }
    
    private ahgj() {
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
                if ((b = ahgj.b) == null) {
                    synchronized (ahgj.class) {
                        if (ahgj.b == null) {
                            ahgj.b = (ahbe)new agzb((agzi)ahgj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahgj.a;
            }
            case 4: {
                return new agza((agzi)ahgj.a);
            }
            case 3: {
                return new ahgj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahgj.a, "\u0000\u0000", null);
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
