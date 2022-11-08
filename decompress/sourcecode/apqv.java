import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqv extends agzi implements ahax
{
    public static final apqv a;
    private static volatile ahbe b;
    private int c;
    private aioe d;
    private ajsq e;
    private ajsq f;
    private ajsq g;
    private ajsq h;
    private ajsq i;
    private ajsq j;
    private aioe k;
    private anss l;
    private apqu m;
    private ahfw n;
    private byte o;
    
    static {
        agzi.registerDefaultInstance((Class)apqv.class, (agzi)(a = new apqv()));
    }
    
    private apqv() {
        this.o = 2;
        final agyc b = agyc.b;
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
                final ahbe b2;
                if ((b2 = apqv.b) == null) {
                    synchronized (apqv.class) {
                        if (apqv.b == null) {
                            apqv.b = (ahbe)new agzb((agzi)apqv.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apqv.a;
            }
            case 4: {
                return new agza((agzi)apqv.a);
            }
            case 3: {
                return new apqv();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqv.a, "\u0001\u000b\u0000\u0001\u0002\u000f\u000b\u0000\u0000\u000b\u0002\u1409\u0002\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u1409\u0005\u0007\u1409\b\b\u1409\n\n\u1409\u000e\u000b\u1409\u0006\f\u1409\t\r\u1409\u0000\u000f\u1409\u000b", new Object[] { "c", "e", "f", "g", "h", "j", "l", "n", "i", "k", "d", "m" });
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
