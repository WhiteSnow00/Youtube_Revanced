import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aosv extends agzi implements ahax
{
    public static final aosv a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ajsq f;
    private anss g;
    private aioe h;
    private aioe i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(aosv.class, a = new aosv());
    }
    
    private aosv() {
        this.j = 2;
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
                if ((b2 = aosv.b) == null) {
                    synchronized (aosv.class) {
                        if (aosv.b == null) {
                            aosv.b = (ahbe)new agzb((agzi)aosv.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aosv.a;
            }
            case 4: {
                return new agza((agzi)aosv.a);
            }
            case 3: {
                return new aosv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aosv.a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0006\u0001\u1409\u0001\u0002\u1409\u0002\u0003\u1409\u0004\u0006\u1409\u0007\u0007\u1409\b\b\u1409\u0003", new Object[] { "c", "d", "e", "g", "h", "i", "f" });
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
