import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apcq extends agzi implements ahax
{
    public static final apcq a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private aioe f;
    private ajsq g;
    private ajsq h;
    private ahfw i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(apcq.class, a = new apcq());
    }
    
    private apcq() {
        this.j = 2;
        final agyc b = agyc.b;
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
                if ((b2 = apcq.b) == null) {
                    synchronized (apcq.class) {
                        if (apcq.b == null) {
                            apcq.b = (ahbe)new agzb((agzi)apcq.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apcq.a;
            }
            case 4: {
                return new agza((agzi)apcq.a);
            }
            case 3: {
                return new apcq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apcq.a, "\u0001\u0006\u0000\u0001\u0002\r\u0006\u0000\u0000\u0006\u0002\u1409\u0004\u0003\u1409\u0005\u0004\u1409\u0006\b\u1409\u000b\u000b\u1409\u0007\r\u1409\b", new Object[] { "c", "d", "e", "f", "i", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
