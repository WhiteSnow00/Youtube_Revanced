import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apbp extends agzi implements ahax
{
    public static final apbp a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ajsq f;
    private aioe g;
    private apbo h;
    private ahfw i;
    private anss j;
    private anss k;
    private byte l;
    
    static {
        agzi.registerDefaultInstance(apbp.class, a = new apbp());
    }
    
    private apbp() {
        this.l = 2;
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
                if ((b2 = apbp.b) == null) {
                    synchronized (apbp.class) {
                        if (apbp.b == null) {
                            apbp.b = (ahbe)new agzb((agzi)apbp.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apbp.a;
            }
            case 4: {
                return new agza((agzi)apbp.a);
            }
            case 3: {
                return new apbp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apbp.a, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0000\b\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0005\u0007\u1409\u0004\n\u1409\t\u000b\u1409\n", new Object[] { "c", "d", "e", "f", "g", "i", "h", "j", "k" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.l = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
