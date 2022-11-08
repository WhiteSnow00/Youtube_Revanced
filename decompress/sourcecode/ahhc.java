import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahhc extends agzi implements ahax
{
    public static final ahhc a;
    private static volatile ahbe f;
    public ajsq b;
    public ajsq c;
    public ajsq d;
    public ajsq e;
    private int g;
    private ahfw h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(ahhc.class, a = new ahhc());
    }
    
    private ahhc() {
        this.i = 2;
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
                final ahbe f;
                if ((f = ahhc.f) == null) {
                    synchronized (ahhc.class) {
                        if (ahhc.f == null) {
                            ahhc.f = (ahbe)new agzb((agzi)ahhc.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahhc.a;
            }
            case 4: {
                return new agza((agzi)ahhc.a);
            }
            case 3: {
                return new ahhc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahhc.a, "\u0001\u0005\u0000\u0001\u0004\t\u0005\u0000\u0000\u0005\u0004\u1409\u0000\u0005\u1409\u0001\u0006\u1409\u0002\u0007\u1409\u0003\t\u1409\u0004", new Object[] { "g", "b", "c", "d", "e", "h" });
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
