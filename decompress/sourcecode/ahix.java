import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahix extends agzi implements ahax
{
    public static final ahix a;
    private static volatile ahbe b;
    private int c;
    private anss d;
    private anss e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)ahix.class, (agzi)(a = new ahix()));
    }
    
    private ahix() {
        this.f = 2;
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
                final ahbe b2;
                if ((b2 = ahix.b) == null) {
                    synchronized (ahix.class) {
                        if (ahix.b == null) {
                            ahix.b = (ahbe)new agzb((agzi)ahix.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahix.a;
            }
            case 4: {
                return new agza((agzi)ahix.a);
            }
            case 3: {
                return new ahix();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahix.a, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0002\u0004\u1409\u0003\u0005\u1409\u0004", new Object[] { "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
