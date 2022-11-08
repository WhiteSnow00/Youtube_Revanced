import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aopn extends agzi implements ahax
{
    public static final aopn a;
    private static volatile ahbe l;
    public int b;
    public ajsq c;
    public anss d;
    public anss e;
    public ajsq f;
    public ajsq g;
    public ajsq h;
    public anss i;
    public ajsq j;
    public anss k;
    private ajsq m;
    private anss n;
    private anss o;
    private byte p;
    
    static {
        agzi.registerDefaultInstance((Class)aopn.class, (agzi)(a = new aopn()));
    }
    
    private aopn() {
        this.p = 2;
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
                final ahbe l;
                if ((l = aopn.l) == null) {
                    synchronized (aopn.class) {
                        if (aopn.l == null) {
                            aopn.l = (ahbe)new agzb((agzi)aopn.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return aopn.a;
            }
            case 4: {
                return new agza((agzi)aopn.a);
            }
            case 3: {
                return new aopn();
            }
            case 2: {
                return newMessageInfo((MessageLite)aopn.a, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\f\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007\t\u1409\b\n\u1409\t\u000b\u1409\n\f\u1409\u000b", new Object[] { "b", "c", "m", "d", "e", "f", "g", "n", "o", "h", "i", "j", "k" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.p = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
