import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aivd extends agzi implements ahax
{
    public static final aivd a;
    private static volatile ahbe i;
    public int b;
    public ajsq c;
    public ajau d;
    public amer e;
    public long f;
    public aioe g;
    public String h;
    private aibc j;
    private aibc k;
    private ahfw l;
    private aioe m;
    private byte n;
    
    static {
        agzi.registerDefaultInstance(aivd.class, a = new aivd());
    }
    
    private aivd() {
        this.n = 2;
        final agyc b = agyc.b;
        this.h = "";
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
                if ((i = aivd.i) == null) {
                    synchronized (aivd.class) {
                        if (aivd.i == null) {
                            aivd.i = (ahbe)new agzb((agzi)aivd.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aivd.a;
            }
            case 4: {
                return new agza((agzi)aivd.a);
            }
            case 3: {
                return new aivd();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aivd.a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\b\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0004\u0004\u1409\u0005\u0005\u1409\u0006\u0007\u1409\u0002\b\u1409\b\t\u1008\t\n\u1002\u0003\u000b\u1409\n", new Object[] { "b", "c", "d", "j", "k", "l", "e", "g", "h", "f", "m" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.n = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
