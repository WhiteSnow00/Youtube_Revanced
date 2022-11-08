import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahjg extends agzi implements ahax
{
    public static final ahjg a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ajsq f;
    private ajsq g;
    private ajsq h;
    private ajsq i;
    private ajsq j;
    private aioe k;
    private ahfw l;
    private byte m;
    
    static {
        agzi.registerDefaultInstance((Class)ahjg.class, (agzi)(a = new ahjg()));
    }
    
    private ahjg() {
        this.m = 2;
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
                if ((b2 = ahjg.b) == null) {
                    synchronized (ahjg.class) {
                        if (ahjg.b == null) {
                            ahjg.b = (ahbe)new agzb((agzi)ahjg.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return ahjg.a;
            }
            case 4: {
                return new agza((agzi)ahjg.a);
            }
            case 3: {
                return new ahjg();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahjg.a, "\u0001\t\u0000\u0001\u0005\u000f\t\u0000\u0000\t\u0005\u1409\u0003\u0006\u1409\u0004\u0007\u1409\u0005\b\u1409\u0006\n\u1409\b\u000b\u1409\t\f\u1409\n\u000e\u1409\u000b\u000f\u1409\f", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k", "l" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.m = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
