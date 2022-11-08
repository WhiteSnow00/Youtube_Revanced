import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apcy extends agzi implements ahax
{
    public static final apcy a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private apcx f;
    private ahfw g;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(apcy.class, a = new apcy());
    }
    
    private apcy() {
        this.h = 2;
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
                if ((b2 = apcy.b) == null) {
                    synchronized (apcy.class) {
                        if (apcy.b == null) {
                            apcy.b = (ahbe)new agzb((agzi)apcy.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apcy.a;
            }
            case 4: {
                return new agza((agzi)apcy.a);
            }
            case 3: {
                return new apcy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apcy.a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0005\u1409\u0004\u0006\u1409\u0002", new Object[] { "c", "d", "e", "g", "f" });
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
