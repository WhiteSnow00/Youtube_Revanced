import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aomz extends agzi implements ahax
{
    public static final aomz a;
    private static volatile ahbe j;
    public int b;
    public ajsq c;
    public ajsq d;
    public ajsq e;
    public aioe f;
    public aibc g;
    public aioe h;
    public agyc i;
    private ahfw k;
    private byte l;
    
    static {
        agzi.registerDefaultInstance((Class)aomz.class, (agzi)(a = new aomz()));
    }
    
    private aomz() {
        this.l = 2;
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
                if ((j = aomz.j) == null) {
                    synchronized (aomz.class) {
                        if (aomz.j == null) {
                            aomz.j = (ahbe)new agzb((agzi)aomz.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return aomz.a;
            }
            case 4: {
                return new agza((agzi)aomz.a);
            }
            case 3: {
                return new aomz();
            }
            case 2: {
                return newMessageInfo((MessageLite)aomz.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u100a\u0007", new Object[] { "b", "c", "d", "e", "f", "g", "h", "k", "i" });
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
