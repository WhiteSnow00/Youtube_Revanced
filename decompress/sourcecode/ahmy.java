import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmy extends agzi implements ahax
{
    public static final ahmy a;
    private static volatile ahbe e;
    public int b;
    public amqj c;
    public amph d;
    private amqk f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)ahmy.class, (agzi)(a = new ahmy()));
    }
    
    private ahmy() {
        this.g = 2;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = ahmy.e) == null) {
                    synchronized (ahmy.class) {
                        if (ahmy.e == null) {
                            ahmy.e = (ahbe)new agzb((agzi)ahmy.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahmy.a;
            }
            case 4: {
                return new agza((agzi)ahmy.a);
            }
            case 3: {
                return new ahmy();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahmy.a, "\u0001\u0003\u0000\u0001\ufe1a\u2336\ueda3\uf9d3\u0006\u0003\u0000\u0000\u0003\ufe1a\u2336\u1409\u0000\ufb9c\u2dd7\u1409\u0001\ueda3\uf9d3\u0006\u1409\u0002", new Object[] { "b", "c", "d", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
