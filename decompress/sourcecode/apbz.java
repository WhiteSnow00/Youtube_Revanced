import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apbz extends agzi implements ahax
{
    public static final apbz a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ajsq f;
    private aioe g;
    private ahfw h;
    private aioe i;
    private byte j;
    
    static {
        agzi.registerDefaultInstance(apbz.class, a = new apbz());
    }
    
    private apbz() {
        this.j = 2;
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
                if ((b2 = apbz.b) == null) {
                    synchronized (apbz.class) {
                        if (apbz.b == null) {
                            apbz.b = (ahbe)new agzb((agzi)apbz.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apbz.a;
            }
            case 4: {
                return new agza((agzi)apbz.a);
            }
            case 3: {
                return new apbz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apbz.a, "\u0001\u0006\u0000\u0001\u0004\u000b\u0006\u0000\u0000\u0006\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\n\u1409\n\u000b\u1409\u000b", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
