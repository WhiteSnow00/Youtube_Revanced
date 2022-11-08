import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahhe extends agzi implements ahax
{
    public static final ahhe a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance(ahhe.class, a = new ahhe());
    }
    
    private ahhe() {
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
                if ((c = ahhe.c) == null) {
                    synchronized (ahhe.class) {
                        if (ahhe.c == null) {
                            ahhe.c = (ahbe)new agzb((agzi)ahhe.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahhe.a;
            }
            case 4: {
                return new agza((float[])null, (boolean[])null);
            }
            case 3: {
                return new ahhe();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahhe.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", ahhd.class });
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
