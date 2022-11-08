import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoti extends agzi implements ahax
{
    public static final aoti a;
    private static volatile ahbe g;
    public ajsq b;
    public aorm c;
    public ajsq d;
    public anss e;
    public agyc f;
    private int h;
    private aioe i;
    private ahfw j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(aoti.class, a = new aoti());
    }
    
    private aoti() {
        this.k = 2;
        this.f = agyc.b;
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
                final ahbe g;
                if ((g = aoti.g) == null) {
                    synchronized (aoti.class) {
                        if (aoti.g == null) {
                            aoti.g = (ahbe)new agzb((agzi)aoti.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aoti.a;
            }
            case 4: {
                return new agza((agzi)aoti.a);
            }
            case 3: {
                return new aoti();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoti.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u100a\u0005\u0007\u1409\u0006", new Object[] { "h", "b", "c", "d", "e", "i", "f", "j" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
