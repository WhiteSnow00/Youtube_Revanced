import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apcc extends agzi implements ahax
{
    public static final apcc a;
    private static volatile ahbe b;
    private int c;
    private aioe d;
    private ajsq e;
    private ajsq f;
    private ajsq g;
    private ajsq h;
    private ahfw i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(apcc.class, a = new apcc());
    }
    
    private apcc() {
        this.j = 2;
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
                if ((b2 = apcc.b) == null) {
                    synchronized (apcc.class) {
                        if (apcc.b == null) {
                            apcc.b = (ahbe)new agzb((agzi)apcc.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apcc.a;
            }
            case 4: {
                return new agza((agzi)apcc.a);
            }
            case 3: {
                return new apcc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apcc.a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0007\u1409\u0006\b\u1409\u0004", new Object[] { "c", "d", "e", "f", "g", "i", "h" });
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
