import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahok extends agzi implements ahax
{
    public static final ahok a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ahok.class, a = new ahok());
    }
    
    private ahok() {
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
                if ((b = ahok.b) == null) {
                    synchronized (ahok.class) {
                        if (ahok.b == null) {
                            ahok.b = (ahbe)new agzb((agzi)ahok.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahok.a;
            }
            case 4: {
                return new agza((agzi)ahok.a);
            }
            case 3: {
                return new ahok();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahok.a, "\u0001\u0000", null);
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
