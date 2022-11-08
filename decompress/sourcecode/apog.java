import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apog extends agzi implements ahax
{
    public static final apog a;
    private static volatile ahbe i;
    public int b;
    public ajsq c;
    public ajsq d;
    public anss e;
    public anss f;
    public int g;
    public agyc h;
    private ahfw j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance((Class)apog.class, (agzi)(a = new apog()));
    }
    
    private apog() {
        this.k = 2;
        this.h = agyc.b;
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
                final ahbe i;
                if ((i = apog.i) == null) {
                    synchronized (apog.class) {
                        if (apog.i == null) {
                            apog.i = (ahbe)new agzb((agzi)apog.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return apog.a;
            }
            case 4: {
                return new agza((agzi)apog.a);
            }
            case 3: {
                return new apog();
            }
            case 2: {
                return newMessageInfo((MessageLite)apog.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0005\u0006\u100a\u0006\u0007\u100c\u0004", new Object[] { "b", "c", "d", "e", "f", "j", "h", "g", apms.m });
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
