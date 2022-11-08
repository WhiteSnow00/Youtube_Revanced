import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahdy extends agzi implements ahax
{
    public static final ahdy a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance(ahdy.class, a = new ahdy());
    }
    
    private ahdy() {
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
                if ((c = ahdy.c) == null) {
                    synchronized (ahdy.class) {
                        if (ahdy.c == null) {
                            ahdy.c = (ahbe)new agzb((agzi)ahdy.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahdy.a;
            }
            case 4: {
                return new agza((agzi)ahdy.a);
            }
            case 3: {
                return new ahdy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahdy.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[] { "b" });
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
