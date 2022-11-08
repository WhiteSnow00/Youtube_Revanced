import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiti extends agzi implements ahax
{
    public static final aiti a;
    private static volatile ahbe l;
    public int b;
    public ajsq c;
    public ajsq d;
    public aorm e;
    public aorm f;
    public aioe g;
    public ajsq h;
    public ajsq i;
    public aibc j;
    public agyc k;
    private ahyq m;
    private ajsq n;
    private ahfw o;
    private byte p;
    
    static {
        agzi.registerDefaultInstance(aiti.class, a = new aiti());
    }
    
    private aiti() {
        this.p = 2;
        this.k = agyc.b;
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
                final ahbe l;
                if ((l = aiti.l) == null) {
                    synchronized (aiti.class) {
                        if (aiti.l == null) {
                            aiti.l = (ahbe)new agzb((agzi)aiti.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return aiti.a;
            }
            case 4: {
                return new agza((agzi)aiti.a);
            }
            case 3: {
                return new aiti();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiti.a, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u000b\u0001\u1409\u0000\u0002\u1409\u0002\u0003\u1409\u0004\u0004\u1409\u0005\u0005\u1409\u0006\u0006\u1409\t\u0007\u1409\n\b\u100a\u000b\t\u1409\u0003\n\u1409\u0007\u000b\u1409\b\f\u1409\u0001", new Object[] { "b", "c", "e", "g", "m", "h", "j", "o", "k", "f", "n", "i", "d" });
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
