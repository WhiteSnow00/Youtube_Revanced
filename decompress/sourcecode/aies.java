import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aies extends agzi implements ahax
{
    public static final aies a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ajsq f;
    private aioe g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance((Class)aies.class, (agzi)(a = new aies()));
    }
    
    private aies() {
        this.h = 2;
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
                if ((b2 = aies.b) == null) {
                    synchronized (aies.class) {
                        if (aies.b == null) {
                            aies.b = (ahbe)new agzb((agzi)aies.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aies.a;
            }
            case 4: {
                return new agza((agzi)aies.a);
            }
            case 3: {
                return new aies();
            }
            case 2: {
                return newMessageInfo((MessageLite)aies.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "c", "d", "e", "f", "g" });
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
