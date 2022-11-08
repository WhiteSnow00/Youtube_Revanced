import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahkv extends agzi implements ahax
{
    public static final ahkv a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public String d;
    public String e;
    private int g;
    
    static {
        agzi.registerDefaultInstance((Class)ahkv.class, (agzi)(a = new ahkv()));
    }
    
    private ahkv() {
        this.d = "";
        this.e = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = ahkv.f) == null) {
                    synchronized (ahkv.class) {
                        if (ahkv.f == null) {
                            ahkv.f = (ahbe)new agzb((agzi)ahkv.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahkv.a;
            }
            case 4: {
                return new agza((agzi)ahkv.a);
            }
            case 3: {
                return new ahkv();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahkv.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1008\u0002\u0004\u1008\u0003", new Object[] { "g", "b", "c", "d", "e" });
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
