import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apmf extends agzi implements ahax
{
    public static final apmf a;
    private static volatile ahbe b;
    private int c;
    private apmh d;
    private ajsq e;
    private ajsq f;
    private aqbm g;
    private apmg h;
    private apmi i;
    private ajsq j;
    private ajsq k;
    private aioe l;
    private aioe m;
    private ahfw n;
    private byte o;
    
    static {
        agzi.registerDefaultInstance((Class)apmf.class, (agzi)(a = new apmf()));
    }
    
    private apmf() {
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
                if ((b2 = apmf.b) == null) {
                    synchronized (apmf.class) {
                        if (apmf.b == null) {
                            apmf.b = (ahbe)new agzb((agzi)apmf.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apmf.a;
            }
            case 4: {
                return new agza((agzi)apmf.a);
            }
            case 3: {
                return new apmf();
            }
            case 2: {
                return newMessageInfo((MessageLite)apmf.a, "\u0001\u000b\u0000\u0001\u0001\u000f\u000b\u0000\u0000\u000b\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0004\u0005\u1409\u0005\u0006\u1409\u0006\u0007\u1409\u0007\b\u1409\r\f\u1409\n\u000e\u1409\u000b\u000f\u1409\u0003", new Object[] { "c", "d", "e", "f", "h", "i", "j", "k", "n", "l", "m", "g" });
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
