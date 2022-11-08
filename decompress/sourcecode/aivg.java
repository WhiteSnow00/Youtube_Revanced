import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aivg extends agzi implements ahax
{
    public static final aivg a;
    private static volatile ahbe h;
    public int b;
    public ajsq c;
    public ajau d;
    public long e;
    public aioe f;
    public String g;
    private aibc i;
    private ajsq j;
    private aioe k;
    private ajsq l;
    private ahfw m;
    private amer n;
    private byte o;
    
    static {
        agzi.registerDefaultInstance(aivg.class, a = new aivg());
    }
    
    private aivg() {
        this.o = 2;
        final agyc b = agyc.b;
        this.g = "";
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
                final ahbe h;
                if ((h = aivg.h) == null) {
                    synchronized (aivg.class) {
                        if (aivg.h == null) {
                            aivg.h = (ahbe)new agzb((agzi)aivg.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aivg.a;
            }
            case 4: {
                return new agza((agzi)aivg.a);
            }
            case 3: {
                return new aivg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aivg.a, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\t\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0004\u1409\b\u0006\u1409\u0004\u0007\u1409\n\b\u1008\f\t\u1002\u0005\n\u1409\u0006\u000b\u1409\u0007\f\u1409\u000b", new Object[] { "b", "c", "d", "i", "m", "j", "f", "g", "e", "k", "l", "n" });
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
