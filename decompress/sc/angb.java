import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class angb extends ahbh implements ahcw
{
    public static final angb a;
    private static volatile ahdd e;
    public int b;
    public aicz c;
    public anfz d;
    private anga f;
    private aloa g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)angb.class, (ahbh)(a = new angb()));
    }
    
    private angb() {
        this.h = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = angb.e) == null) {
                    synchronized (angb.class) {
                        if (angb.e == null) {
                            angb.e = (ahdd)new ahba((ahbh)angb.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return angb.a;
            }
            case 4: {
                return new ahaz((ahbh)angb.a);
            }
            case 3: {
                return new angb();
            }
            case 2: {
                return newMessageInfo((MessageLite)angb.a, "\u0001\u0004\u0000\u0001\uea9e\u1ca7\uf830\u3ded\u0004\u0000\u0000\u0004\uea9e\u1ca7\u1409\u0002\ueb11\u1f11\u1409\u0001\ue917\u25ba\u1409\u0000\uf830\u3ded\u1409\u0003", new Object[] { "b", "g", "c", "f", "d" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
