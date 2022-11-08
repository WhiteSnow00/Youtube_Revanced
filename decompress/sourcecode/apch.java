import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apch extends agzi implements ahax
{
    public static final apch a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ahfw f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(apch.class, a = new apch());
    }
    
    private apch() {
        this.g = 2;
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
                if ((b2 = apch.b) == null) {
                    synchronized (apch.class) {
                        if (apch.b == null) {
                            apch.b = (ahbe)new agzb((agzi)apch.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apch.a;
            }
            case 4: {
                return new agza((agzi)apch.a);
            }
            case 3: {
                return new apch();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apch.a, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0003\u0001\u1409\u0001\u0004\u1409\u0003\u0006\u1409\u0002", new Object[] { "c", "d", "f", "e" });
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
