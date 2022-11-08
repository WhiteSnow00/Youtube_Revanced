import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqia extends agzi implements ahax
{
    public static final aqia a;
    private static volatile ahbe c;
    public aqic b;
    private int d;
    private aqgv e;
    private aqfl f;
    private aqfw g;
    private aqhn h;
    private aqfp i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance((Class)aqia.class, (agzi)(a = new aqia()));
    }
    
    private aqia() {
        this.j = 2;
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
                final ahbe c;
                if ((c = aqia.c) == null) {
                    synchronized (aqia.class) {
                        if (aqia.c == null) {
                            aqia.c = (ahbe)new agzb((agzi)aqia.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqia.a;
            }
            case 4: {
                return new agza((agzi)aqia.a);
            }
            case 3: {
                return new aqia();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqia.a, "\u0001\u0006\u0000\u0001\u0001\u000f\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\n\u1409\n\u000e\u1409\u000b\u000f\u1409\f", new Object[] { "d", "b", "e", "f", "g", "h", "i" });
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
