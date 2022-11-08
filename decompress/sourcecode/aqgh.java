import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqgh extends agzi implements ahax
{
    public static final aqgh a;
    private static volatile ahbe b;
    private int c;
    private aqbm d;
    private aqgg e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)aqgh.class, (agzi)(a = new aqgh()));
    }
    
    private aqgh() {
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
                if ((b2 = aqgh.b) == null) {
                    synchronized (aqgh.class) {
                        if (aqgh.b == null) {
                            aqgh.b = (ahbe)new agzb((agzi)aqgh.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aqgh.a;
            }
            case 4: {
                return new agza((agzi)aqgh.a);
            }
            case 3: {
                return new aqgh();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqgh.a, "\u0001\u0002\u0000\u0001\u0004\t\u0002\u0000\u0000\u0002\u0004\u1409\u0003\t\u1409\b", new Object[] { "c", "d", "e" });
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
