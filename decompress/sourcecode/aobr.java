import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aobr extends agzi implements ahax
{
    public static final aobr a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ajsq f;
    private ajsq g;
    private aioe h;
    private ahfw i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(aobr.class, a = new aobr());
    }
    
    private aobr() {
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
                if ((b2 = aobr.b) == null) {
                    synchronized (aobr.class) {
                        if (aobr.b == null) {
                            aobr.b = (ahbe)new agzb((agzi)aobr.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aobr.a;
            }
            case 4: {
                return new agza((agzi)aobr.a);
            }
            case 3: {
                return new aobr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aobr.a, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0003\u0005\u1409\u0004\u0007\u1409\u0006\t\u1409\u0007", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
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
