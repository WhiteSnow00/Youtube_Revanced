import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apci extends agzi implements ahax
{
    public static final apci a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ajsq f;
    private ajsq g;
    private ajsq h;
    private aioe i;
    private ahfw j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(apci.class, a = new apci());
    }
    
    private apci() {
        this.k = 2;
        emptyProtobufList();
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
                if ((b2 = apci.b) == null) {
                    synchronized (apci.class) {
                        if (apci.b == null) {
                            apci.b = (ahbe)new agzb((agzi)apci.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apci.a;
            }
            case 4: {
                return new agza((agzi)apci.a);
            }
            case 3: {
                return new apci();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apci.a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0005\u0006\u1409\u0004\u0007\u1409\u0003\t\u1409\t", new Object[] { "c", "d", "e", "f", "i", "h", "g", "j" });
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
