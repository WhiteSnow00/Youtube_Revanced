import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aivp extends agzi implements ahax
{
    public static final aivp a;
    private static volatile ahbe b;
    private int c;
    private aivo d;
    private aivo e;
    private ajsq f;
    private ajsq g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(aivp.class, a = new aivp());
    }
    
    private aivp() {
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
                final ahbe b2;
                if ((b2 = aivp.b) == null) {
                    synchronized (aivp.class) {
                        if (aivp.b == null) {
                            aivp.b = (ahbe)new agzb((agzi)aivp.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aivp.a;
            }
            case 4: {
                return new agza((agzi)aivp.a);
            }
            case 3: {
                return new aivp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aivp.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "c", "d", "e", "f", "g" });
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
