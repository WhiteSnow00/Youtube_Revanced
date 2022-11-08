import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aopa extends agzi implements ahax
{
    public static final aopa a;
    private static volatile ahbe b;
    private int c;
    private aioe d;
    private aopc e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)aopa.class, (agzi)(a = new aopa()));
    }
    
    private aopa() {
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
                if ((b2 = aopa.b) == null) {
                    synchronized (aopa.class) {
                        if (aopa.b == null) {
                            aopa.b = (ahbe)new agzb((agzi)aopa.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aopa.a;
            }
            case 4: {
                return new agza((agzi)aopa.a);
            }
            case 3: {
                return new aopa();
            }
            case 2: {
                return newMessageInfo((MessageLite)aopa.a, "\u0001\u0002\u0000\u0001\u0001\u0006\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0006\u1409\u0005", new Object[] { "c", "d", "e" });
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
