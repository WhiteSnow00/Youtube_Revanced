import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apyp extends agzi implements ahax
{
    private static final apyp a;
    private static volatile ahbe b;
    private int c;
    private int d;
    private apyn e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(apyp.class, a = new apyp());
    }
    
    private apyp() {
        this.f = 2;
    }
    
    public static apyo a() {
        return (apyo)apyp.a.createBuilder();
    }
    
    private void e(final apyn e) {
        e.getClass();
        this.e = e;
        this.c |= 0x2;
    }
    
    private void f(final apyq apyq) {
        this.d = apyq.d;
        this.c |= 0x1;
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
                final ahbe b2;
                if ((b2 = apyp.b) == null) {
                    synchronized (apyp.class) {
                        if (apyp.b == null) {
                            apyp.b = (ahbe)new agzb((agzi)apyp.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apyp.a;
            }
            case 4: {
                return new apyo();
            }
            case 3: {
                return new apyp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apyp.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u100c\u0000\u0002\u1409\u0001", new Object[] { "c", "d", apyq.a(), "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
