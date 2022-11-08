import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apcb extends agzi implements ahax
{
    public static final apcb a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ajsq f;
    private aibc g;
    private aibc h;
    private aibc i;
    private aibc j;
    private aioe k;
    private aioe l;
    private ahfw m;
    private byte n;
    
    static {
        agzi.registerDefaultInstance(apcb.class, a = new apcb());
    }
    
    private apcb() {
        this.n = 2;
        emptyProtobufList();
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
                if ((b2 = apcb.b) == null) {
                    synchronized (apcb.class) {
                        if (apcb.b == null) {
                            apcb.b = (ahbe)new agzb((agzi)apcb.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apcb.a;
            }
            case 4: {
                return new agza((agzi)apcb.a);
            }
            case 3: {
                return new apcb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apcb.a, "\u0001\n\u0000\u0001\u0001\u000e\n\u0000\u0000\n\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0005\u1409\u0005\u0006\u1409\u0006\u0007\u1409\u000b\t\u1409\r\u000b\u1409\u0007\r\u1409\t\u000e\u1409\b", new Object[] { "c", "d", "e", "f", "g", "h", "l", "m", "i", "k", "j" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.n = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
