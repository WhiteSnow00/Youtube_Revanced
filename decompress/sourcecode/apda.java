import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apda extends agzi implements ahax
{
    public static final apda a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ajsq f;
    private ajsq g;
    private aibc h;
    private aibc i;
    private aioe j;
    private ahfw k;
    private byte l;
    
    static {
        agzi.registerDefaultInstance(apda.class, a = new apda());
    }
    
    private apda() {
        this.l = 2;
        emptyProtobufList();
        final agyc b = agyc.b;
        emptyProtobufList();
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
                if ((b2 = apda.b) == null) {
                    synchronized (apda.class) {
                        if (apda.b == null) {
                            apda.b = (ahbe)new agzb((agzi)apda.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apda.a;
            }
            case 4: {
                return new agza((agzi)apda.a);
            }
            case 3: {
                return new apda();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apda.a, "\u0001\b\u0000\u0001\u0002\u000f\b\u0000\u0000\b\u0002\u1409\u0002\u0003\u1409\u0004\u0004\u1409\u0005\u0005\u1409\u0006\u0006\u1409\u0007\b\u1409\u000b\u000b\u1409\u0003\u000f\u1409\t", new Object[] { "c", "d", "f", "g", "h", "i", "k", "e", "j" });
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
