import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahkx extends agzi implements ahax
{
    public static final ahkx a;
    private static volatile ahbe d;
    public agzy b;
    public ahkw c;
    private int e;
    
    static {
        agzi.registerDefaultInstance((Class)ahkx.class, (agzi)(a = new ahkx()));
    }
    
    private ahkx() {
        this.b = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ahkx.d) == null) {
                    synchronized (ahkx.class) {
                        if (ahkx.d == null) {
                            ahkx.d = (ahbe)new agzb((agzi)ahkx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahkx.a;
            }
            case 4: {
                return new agza((agzi)ahkx.a);
            }
            case 3: {
                return new ahkx();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahkx.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u1009\u0000", new Object[] { "e", "b", alud.class, "c" });
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
