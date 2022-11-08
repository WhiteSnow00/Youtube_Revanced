import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lpn extends agzi implements ahax
{
    public static final lpn a;
    private static volatile ahbe g;
    public int b;
    public akja c;
    public agyc d;
    public agyc e;
    public agyc f;
    
    static {
        agzi.registerDefaultInstance(lpn.class, a = new lpn());
    }
    
    private lpn() {
        this.d = agyc.b;
        final agyc b = agyc.b;
        this.e = b;
        this.f = b;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = lpn.g) == null) {
                    synchronized (lpn.class) {
                        if (lpn.g == null) {
                            lpn.g = (ahbe)new agzb((agzi)lpn.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return lpn.a;
            }
            case 4: {
                return new agza((agzi)lpn.a);
            }
            case 3: {
                return new lpn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)lpn.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u100a\u0001\u0003\u100a\u0002\u0004\u100a\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
