import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class apop extends agzi implements ahax
{
    public static final apop a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private aioe e;
    private ahyq f;
    private ahyq g;
    private apoz h;
    private appj i;
    private ajsq j;
    private ahfw k;
    private byte l;
    
    static {
        agzi.registerDefaultInstance((Class)apop.class, (agzi)(a = new apop()));
    }
    
    private apop() {
        this.l = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        final agyc b = agyc.b;
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
                if ((b2 = apop.b) == null) {
                    synchronized (apop.class) {
                        if (apop.b == null) {
                            apop.b = (ahbe)new agzb((agzi)apop.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apop.a;
            }
            case 4: {
                return new agza((agzi)apop.a);
            }
            case 3: {
                return new apop();
            }
            case 2: {
                return newMessageInfo((MessageLite)apop.a, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0000\b\u0001\u1409\u0000\u0002\u1409\u0001\u0005\u1409\u0004\u0006\u1409\u0005\t\u1409\u0007\n\u1409\b\f\u1409\u0002\r\u1409\u0003", new Object[] { "c", "d", "e", "h", "i", "j", "k", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.l = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
