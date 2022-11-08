import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahle extends agzi implements ahax
{
    public static final ahle a;
    private static volatile ahbe g;
    public int b;
    public int c;
    public boolean d;
    public float e;
    public int f;
    private int h;
    private int i;
    private int j;
    
    static {
        agzi.registerDefaultInstance((Class)ahle.class, (agzi)(a = new ahle()));
    }
    
    private ahle() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = ahle.g) == null) {
                    synchronized (ahle.class) {
                        if (ahle.g == null) {
                            ahle.g = (ahbe)new agzb((agzi)ahle.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahle.a;
            }
            case 4: {
                return new agza((agzi)ahle.a);
            }
            case 3: {
                return new ahle();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahle.a, "\u0001\u0005\u0000\u0003\u0007E\u0005\u0000\u0000\u0000\u0007\u1004\u0005A\u100c<C\u1007>D\u1001?E\u1004@", new Object[] { "h", "i", "j", "b", "c", ahho.i, "d", "e", "f" });
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
