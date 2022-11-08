import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajmn extends agzi implements ahax
{
    public static final ajmn a;
    private static volatile ahbe j;
    public int b;
    public ajsq c;
    public aorm d;
    public aioe e;
    public ajsq f;
    public ajsq g;
    public ajsq h;
    public agyc i;
    private ajsq k;
    private ahfw l;
    private byte m;
    
    static {
        agzi.registerDefaultInstance((Class)ajmn.class, (agzi)(a = new ajmn()));
    }
    
    private ajmn() {
        this.m = 2;
        this.i = agyc.b;
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
                final ahbe j;
                if ((j = ajmn.j) == null) {
                    synchronized (ajmn.class) {
                        if (ajmn.j == null) {
                            ajmn.j = (ahbe)new agzb((agzi)ajmn.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ajmn.a;
            }
            case 4: {
                return new agza((agzi)ajmn.a);
            }
            case 3: {
                return new ajmn();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajmn.a, "\u0001\t\u0000\u0001\u0002\u000e\t\u0000\u0000\b\u0002\u1409\u0001\u0003\u1409\u0002\u0006\u1409\u0005\u0007\u1409\u0006\n\u1409\u0007\u000b\u1409\b\f\u1409\t\r\u1409\u0004\u000e\u100a\n", new Object[] { "b", "c", "d", "k", "f", "g", "h", "l", "e", "i" });
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
