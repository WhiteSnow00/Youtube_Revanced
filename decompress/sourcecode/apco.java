import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apco extends agzi implements ahax
{
    public static final apco a;
    private static volatile ahbe b;
    private int c;
    private apcp d;
    private apcp e;
    private ajsq f;
    private ajsq g;
    private ajsq h;
    private ajsq i;
    private ajsq j;
    private aioe k;
    private anss l;
    private ahfw m;
    private apcp n;
    private apcp o;
    private byte p;
    
    static {
        agzi.registerDefaultInstance(apco.class, a = new apco());
    }
    
    private apco() {
        this.p = 2;
        final agyc b = agyc.b;
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
                if ((b2 = apco.b) == null) {
                    synchronized (apco.class) {
                        if (apco.b == null) {
                            apco.b = (ahbe)new agzb((agzi)apco.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apco.a;
            }
            case 4: {
                return new agza((agzi)apco.a);
            }
            case 3: {
                return new apco();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apco.a, "\u0001\f\u0000\u0001\u0001\u0010\f\u0000\u0000\f\u0001\u1409\u000f\u0002\u1409\u0010\u0003\u1409\u0003\u0004\u1409\u0007\u0005\u1409\b\u0006\u1409\u000b\b\u1409\u000e\t\u1409\u0000\n\u1409\u0001\r\u1409\u0005\u000e\u1409\u0006\u0010\u1409\f", new Object[] { "c", "n", "o", "f", "i", "j", "k", "m", "d", "e", "g", "h", "l" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.p = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
