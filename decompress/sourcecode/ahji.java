import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahji extends agzi implements ahax
{
    public static final ahji a;
    private static volatile ahbe c;
    public ahjk b;
    private int d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)ahji.class, (agzi)(a = new ahji()));
    }
    
    private ahji() {
        this.e = 2;
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
                final ahbe c;
                if ((c = ahji.c) == null) {
                    synchronized (ahji.class) {
                        if (ahji.c == null) {
                            ahji.c = (ahbe)new agzb((agzi)ahji.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahji.a;
            }
            case 4: {
                return new agza((agzi)ahji.a);
            }
            case 3: {
                return new ahji();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahji.a, "\u0001\u0001\u0000\u0001\uf8da\u25c5\uf8da\u25c5\u0001\u0000\u0000\u0001\uf8da\u25c5\u1409\u0000", new Object[] { "d", "b" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
