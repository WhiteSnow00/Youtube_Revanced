import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alrr extends agzi implements ahax
{
    public static final alrr a;
    private static volatile ahbe b;
    private int c;
    private aixb d;
    private alpx e;
    private alro f;
    private alru g;
    private amfn h;
    private alrn i;
    private alrq j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(alrr.class, a = new alrr());
    }
    
    private alrr() {
        this.k = 2;
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
                if ((b2 = alrr.b) == null) {
                    synchronized (alrr.class) {
                        if (alrr.b == null) {
                            alrr.b = (ahbe)new agzb((agzi)alrr.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return alrr.a;
            }
            case 4: {
                return new agza((agzi)alrr.a);
            }
            case 3: {
                return new alrr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alrr.a, "\u0001\u0007\u0000\u0001\ufd47\u1fc8\ufc49\u4483\u0007\u0000\u0000\u0007\ufd47\u1fc8\u1409\n\ue87a\u2102\u1409\u0000\ue90f\u285c\u1409\u0007\ue0de\u2926\u1409\t\uf02d\u2d31\u1409\f\ue55b\u37ee\u1409\u0001\ufc49\u4483\u1409\r", new Object[] { "c", "h", "d", "f", "g", "i", "e", "j" });
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
