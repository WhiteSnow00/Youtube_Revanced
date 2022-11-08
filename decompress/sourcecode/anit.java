import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anit extends agzi implements ahax
{
    public static final anit a;
    private static volatile ahbe j;
    public int b;
    public aibc c;
    public ajsq d;
    public int e;
    public int f;
    public int g;
    public int h;
    public ajsq i;
    private ajsq k;
    private ajsq l;
    private ajsq m;
    private aniu n;
    private byte o;
    
    static {
        agzi.registerDefaultInstance(anit.class, a = new anit());
    }
    
    private anit() {
        this.o = 2;
        emptyProtobufList();
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
                final ahbe j;
                if ((j = anit.j) == null) {
                    synchronized (anit.class) {
                        if (anit.j == null) {
                            anit.j = (ahbe)new agzb((agzi)anit.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return anit.a;
            }
            case 4: {
                return new agza((agzi)anit.a);
            }
            case 3: {
                return new anit();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anit.a, "\u0001\u000b\u0000\u0001\u0001\u000e\u000b\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1004\u0005\u0004\u1004\u0006\u0005\u1004\u0007\u0006\u1004\b\u0007\u1409\u0002\t\u1409\u0003\f\u1409\n\r\u1409\u000b\u000e\u1409\f", new Object[] { "b", "c", "d", "e", "f", "g", "h", "k", "l", "m", "n", "i" });
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
