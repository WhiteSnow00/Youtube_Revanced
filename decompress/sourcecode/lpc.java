import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lpc extends agzi implements ahax
{
    public static final lpc a;
    private static volatile ahbe p;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public lpb o;
    
    static {
        agzi.registerDefaultInstance(lpc.class, a = new lpc());
    }
    
    private lpc() {
        emptyIntList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe p3;
                if ((p3 = lpc.p) == null) {
                    synchronized (lpc.class) {
                        if (lpc.p == null) {
                            lpc.p = (ahbe)new agzb((agzi)lpc.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return lpc.a;
            }
            case 4: {
                return new agza((agzi)lpc.a);
            }
            case 3: {
                return new lpc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)lpc.a, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1007\u0001\u0003\u1004\u0002\u0004\u1004\u0003\u0005\u1004\u0004\u0006\u1004\u0005\u0007\u1004\u0006\b\u1004\u0007\t\u1004\b\n\u1004\t\u000b\u1004\n\f\u1004\u000b\u000e\u1009\f", new Object[] { "b", "c", ahfu.a(), "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o" });
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
