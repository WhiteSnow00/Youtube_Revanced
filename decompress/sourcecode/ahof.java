import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahof extends agzi implements ahax
{
    public static final ahof a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance(ahof.class, a = new ahof());
    }
    
    private ahof() {
        this.b = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = ahof.c) == null) {
                    synchronized (ahof.class) {
                        if (ahof.c == null) {
                            ahof.c = (ahbe)new agzb((agzi)ahof.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahof.a;
            }
            case 4: {
                return new agza((int[][][])null, (char[][])null);
            }
            case 3: {
                return new ahof();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahof.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", ahom.class });
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