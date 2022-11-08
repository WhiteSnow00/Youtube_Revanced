import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahxz extends agzi implements ahax
{
    public static final ahxz a;
    private static volatile ahbe m;
    public int b;
    public ajsq c;
    public anss d;
    public aorm e;
    public ajsq f;
    public ajsq g;
    public ajsq h;
    public int i;
    public aioe j;
    public aioe k;
    public String l;
    private ahfw n;
    private byte o;
    
    static {
        agzi.registerDefaultInstance(ahxz.class, a = new ahxz());
    }
    
    private ahxz() {
        this.o = 2;
        this.l = "";
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
                final ahbe m;
                if ((m = ahxz.m) == null) {
                    synchronized (ahxz.class) {
                        if (ahxz.m == null) {
                            ahxz.m = (ahbe)new agzb((agzi)ahxz.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return ahxz.a;
            }
            case 4: {
                return new agza((agzi)ahxz.a);
            }
            case 3: {
                return new ahxz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahxz.a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\t\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1004\u0006\b\u1409\b\t\u1409\u0007\n\u1409\t\u000b\u1008\n", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "n", "j", "k", "l" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.o = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}
