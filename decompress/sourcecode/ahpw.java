import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahpw extends agzi implements ahax
{
    public static final ahpw a;
    private static volatile ahbe b;
    private int c;
    private aibc d;
    private aibc e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(ahpw.class, a = new ahpw());
    }
    
    private ahpw() {
        this.f = 2;
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
                final ahbe b2;
                if ((b2 = ahpw.b) == null) {
                    synchronized (ahpw.class) {
                        if (ahpw.b == null) {
                            ahpw.b = (ahbe)new agzb((agzi)ahpw.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahpw.a;
            }
            case 4: {
                return new agza((agzi)ahpw.a);
            }
            case 3: {
                return new ahpw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahpw.a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0002\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "c", "d", "e" });
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
