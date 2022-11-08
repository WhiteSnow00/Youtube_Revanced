import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahex extends agzi implements ahax
{
    public static final ahex a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ahex.class, a = new ahex());
    }
    
    private ahex() {
        emptyProtobufList();
        emptyProtobufList();
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
                if ((b = ahex.b) == null) {
                    synchronized (ahex.class) {
                        if (ahex.b == null) {
                            ahex.b = (ahbe)new agzb((agzi)ahex.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahex.a;
            }
            case 4: {
                return new agza((agzi)ahex.a);
            }
            case 3: {
                return new ahex();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahex.a, "\u0001\u0000", null);
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
