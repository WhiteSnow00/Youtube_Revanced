import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahku extends agzi implements ahax
{
    public static final ahku a;
    private static volatile ahbe d;
    public agzy b;
    public int c;
    private int e;
    
    static {
        agzi.registerDefaultInstance((Class)ahku.class, (agzi)(a = new ahku()));
    }
    
    private ahku() {
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
                if ((d = ahku.d) == null) {
                    synchronized (ahku.class) {
                        if (ahku.d == null) {
                            ahku.d = (ahbe)new agzb((agzi)ahku.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahku.a;
            }
            case 4: {
                return new agza((agzi)ahku.a);
            }
            case 3: {
                return new ahku();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahku.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u1004\u0000", new Object[] { "e", "b", ahkv.class, "c" });
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
