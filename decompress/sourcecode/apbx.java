import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apbx extends agzi implements ahax
{
    public static final apbx a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ajsq f;
    private aioe g;
    private ahfw h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(apbx.class, a = new apbx());
    }
    
    private apbx() {
        this.i = 2;
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
                if ((b2 = apbx.b) == null) {
                    synchronized (apbx.class) {
                        if (apbx.b == null) {
                            apbx.b = (ahbe)new agzb((agzi)apbx.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apbx.a;
            }
            case 4: {
                return new agza((agzi)apbx.a);
            }
            case 3: {
                return new apbx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apbx.a, "\u0001\u0005\u0000\u0001\u0002\u0007\u0005\u0000\u0000\u0005\u0002\u1409\u0006\u0004\u1409\u0001\u0005\u1409\u0004\u0006\u1409\u0002\u0007\u1409\u0003", new Object[] { "c", "h", "d", "g", "e", "f" });
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
