import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apcn extends agzi implements ahax
{
    public static final apcn a;
    private static volatile ahbe d;
    public int b;
    public agyc c;
    private ajsq e;
    private ajsq f;
    private aioe g;
    private ahfw h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(apcn.class, a = new apcn());
    }
    
    private apcn() {
        this.i = 2;
        this.c = agyc.b;
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
                final ahbe d;
                if ((d = apcn.d) == null) {
                    synchronized (apcn.class) {
                        if (apcn.d == null) {
                            apcn.d = (ahbe)new agzb((agzi)apcn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apcn.a;
            }
            case 4: {
                return new agza((agzi)apcn.a);
            }
            case 3: {
                return new apcn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apcn.a, "\u0001\u0005\u0000\u0001\u0003\r\u0005\u0000\u0000\u0004\u0003\u1409\u0002\u0004\u1409\u0003\u000b\u1409\t\f\u100a\n\r\u1409\u0006", new Object[] { "b", "e", "f", "h", "c", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
