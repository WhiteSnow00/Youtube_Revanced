import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahkt extends agzi implements ahax
{
    public static final ahkt a;
    private static volatile ahbe b;
    private int c;
    private aioe d;
    private aioe e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)ahkt.class, (agzi)(a = new ahkt()));
    }
    
    private ahkt() {
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
                if ((b2 = ahkt.b) == null) {
                    synchronized (ahkt.class) {
                        if (ahkt.b == null) {
                            ahkt.b = (ahbe)new agzb((agzi)ahkt.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahkt.a;
            }
            case 4: {
                return new agza((agzi)ahkt.a);
            }
            case 3: {
                return new ahkt();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahkt.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "c", "d", "e" });
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
