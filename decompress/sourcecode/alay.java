import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alay extends agzi implements ahax
{
    public static final alay a;
    private static volatile ahbe b;
    private int c;
    private aioe d;
    private anss e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)alay.class, (agzi)(a = new alay()));
    }
    
    private alay() {
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
                if ((b2 = alay.b) == null) {
                    synchronized (alay.class) {
                        if (alay.b == null) {
                            alay.b = (ahbe)new agzb((agzi)alay.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return alay.a;
            }
            case 4: {
                return new agza((agzi)alay.a);
            }
            case 3: {
                return new alay();
            }
            case 2: {
                return newMessageInfo((MessageLite)alay.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0003\u1409\u0002", new Object[] { "c", "d", "e" });
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