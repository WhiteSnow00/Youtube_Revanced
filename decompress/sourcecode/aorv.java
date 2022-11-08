import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aorv extends agzi implements ahax
{
    public static final aorv a;
    private static volatile ahbe b;
    private int c;
    private anss d;
    private anss e;
    private aioe f;
    private aioe g;
    private aioe h;
    private aioe i;
    private ahfw j;
    private anss k;
    private byte l;
    
    static {
        agzi.registerDefaultInstance(aorv.class, a = new aorv());
    }
    
    private aorv() {
        this.l = 2;
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
                if ((b2 = aorv.b) == null) {
                    synchronized (aorv.class) {
                        if (aorv.b == null) {
                            aorv.b = (ahbe)new agzb((agzi)aorv.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aorv.a;
            }
            case 4: {
                return new agza((agzi)aorv.a);
            }
            case 3: {
                return new aorv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aorv.a, "\u0001\b\u0000\u0001\u0002\u000e\b\u0000\u0000\b\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0005\u0006\u1409\u0007\n\u1409\f\r\u1409\u0004\u000e\u1409\u0006", new Object[] { "c", "d", "e", "f", "h", "j", "k", "g", "i" });
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
