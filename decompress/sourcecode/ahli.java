import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahli extends agzi implements ahax
{
    public static final ahli a;
    private static volatile ahbe b;
    private int c;
    private ahlj d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)ahli.class, (agzi)(a = new ahli()));
    }
    
    private ahli() {
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
                final ahbe b2;
                if ((b2 = ahli.b) == null) {
                    synchronized (ahli.class) {
                        if (ahli.b == null) {
                            ahli.b = (ahbe)new agzb((agzi)ahli.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahli.a;
            }
            case 4: {
                return new agza((agzi)ahli.a);
            }
            case 3: {
                return new ahli();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahli.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0001", new Object[] { "c", "d" });
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
