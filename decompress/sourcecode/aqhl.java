import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqhl extends agzi implements ahax
{
    public static final aqhl a;
    private static volatile ahbe b;
    private int c;
    private aqfp d;
    private aqfp e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)aqhl.class, (agzi)(a = new aqhl()));
    }
    
    private aqhl() {
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
                if ((b2 = aqhl.b) == null) {
                    synchronized (aqhl.class) {
                        if (aqhl.b == null) {
                            aqhl.b = (ahbe)new agzb((agzi)aqhl.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aqhl.a;
            }
            case 4: {
                return new agza((agzi)aqhl.a);
            }
            case 3: {
                return new aqhl();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqhl.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "c", "d", "e" });
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
