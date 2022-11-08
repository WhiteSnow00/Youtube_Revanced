import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apbl extends agzi implements ahax
{
    public static final apbl a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ahfw e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(apbl.class, a = new apbl());
    }
    
    private apbl() {
        this.f = 2;
        emptyProtobufList();
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
                if ((b2 = apbl.b) == null) {
                    synchronized (apbl.class) {
                        if (apbl.b == null) {
                            apbl.b = (ahbe)new agzb((agzi)apbl.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apbl.a;
            }
            case 4: {
                return new agza((agzi)apbl.a);
            }
            case 3: {
                return new apbl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apbl.a, "\u0001\u0002\u0000\u0001\u0002\u0005\u0002\u0000\u0000\u0002\u0002\u1409\u0005\u0005\u1409\u0000", new Object[] { "c", "e", "d" });
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
