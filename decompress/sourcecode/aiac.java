import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiac extends agzi implements ahax
{
    public static final aiac a;
    private static volatile ahbe i;
    public int b;
    public ajsq c;
    public boolean d;
    public aioe e;
    public aioe f;
    public aioe g;
    public aioe h;
    private ajsq j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(aiac.class, a = new aiac());
    }
    
    private aiac() {
        this.k = 2;
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
                final ahbe i;
                if ((i = aiac.i) == null) {
                    synchronized (aiac.class) {
                        if (aiac.i == null) {
                            aiac.i = (ahbe)new agzb((agzi)aiac.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aiac.a;
            }
            case 4: {
                return new agza((agzi)aiac.a);
            }
            case 3: {
                return new aiac();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiac.a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0006\u0001\u1409\u0000\u0003\u1007\u0002\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007\t\u1409\b", new Object[] { "b", "c", "d", "j", "e", "f", "g", "h" });
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
