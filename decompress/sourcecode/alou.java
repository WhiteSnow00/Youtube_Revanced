import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alou extends agzi implements ahax
{
    public static final alou a;
    private static volatile ahbe h;
    public int b;
    public long c;
    public long d;
    public long e;
    public alot f;
    public ajsq g;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(alou.class, a = new alou());
    }
    
    private alou() {
        this.i = 2;
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
                if ((h = alou.h) == null) {
                    synchronized (alou.class) {
                        if (alou.h == null) {
                            alou.h = (ahbe)new agzb((agzi)alou.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return alou.a;
            }
            case 4: {
                return new agza((agzi)alou.a);
            }
            case 3: {
                return new alou();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alou.a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0002\u0001\u1002\u0000\u0002\u1002\u0001\u0005\u1409\u0005\u0006\u1002\u0004\u0007\u1409\u0006", new Object[] { "b", "c", "d", "f", "e", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
