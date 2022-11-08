import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahws extends agzi implements ahax
{
    public static final ahws a;
    private static volatile ahbe g;
    public int b;
    public ajcz c;
    public apgl d;
    public ahwh e;
    public amqj f;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(ahws.class, a = new ahws());
    }
    
    private ahws() {
        this.h = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = ahws.g) == null) {
                    synchronized (ahws.class) {
                        if (ahws.g == null) {
                            ahws.g = (ahbe)new agzb((agzi)ahws.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahws.a;
            }
            case 4: {
                return new agza((agzi)ahws.a);
            }
            case 3: {
                return new ahws();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahws.a, "\u0001\u0004\u0000\u0001\ufc43\u196f\ufba3\u2d47\u0004\u0000\u0000\u0004\ufc43\u196f\u1409\u0000\ufe1a\u2336\u1409\u0003\ue607\u2a05\u1409\u0001\ufba3\u2d47\u1409\u0002", new Object[] { "b", "c", "f", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
