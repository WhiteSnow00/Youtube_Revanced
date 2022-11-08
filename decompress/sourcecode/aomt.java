import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aomt extends agzi implements ahax
{
    public static final aomt a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private aioe e;
    private ahfw f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)aomt.class, (agzi)(a = new aomt()));
    }
    
    private aomt() {
        this.g = 2;
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
                if ((b2 = aomt.b) == null) {
                    synchronized (aomt.class) {
                        if (aomt.b == null) {
                            aomt.b = (ahbe)new agzb((agzi)aomt.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aomt.a;
            }
            case 4: {
                return new agza((agzi)aomt.a);
            }
            case 3: {
                return new aomt();
            }
            case 2: {
                return newMessageInfo((MessageLite)aomt.a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0004\u1409\u0001\u0005\u1409\u0002", new Object[] { "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
