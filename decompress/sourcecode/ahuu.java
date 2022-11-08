import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahuu extends agzi implements ahax
{
    public static final ahuu a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ahuu.class, a = new ahuu());
    }
    
    private ahuu() {
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
                if ((b = ahuu.b) == null) {
                    synchronized (ahuu.class) {
                        if (ahuu.b == null) {
                            ahuu.b = (ahbe)new agzb((agzi)ahuu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahuu.a;
            }
            case 4: {
                return new agza((agzi)ahuu.a);
            }
            case 3: {
                return new ahuu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahuu.a, "\u0001\u0000", null);
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
