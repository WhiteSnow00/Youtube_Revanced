import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apbg extends agzi implements ahax
{
    public static final apbg a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private apbh e;
    private apbf f;
    private aioe g;
    private ahfw h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(apbg.class, a = new apbg());
    }
    
    private apbg() {
        this.i = 2;
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
                if ((b2 = apbg.b) == null) {
                    synchronized (apbg.class) {
                        if (apbg.b == null) {
                            apbg.b = (ahbe)new agzb((agzi)apbg.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apbg.a;
            }
            case 4: {
                return new agza((agzi)apbg.a);
            }
            case 3: {
                return new apbg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apbg.a, "\u0001\u0005\u0000\u0001\u0001\f\u0005\u0000\u0000\u0005\u0001\u1409\u0001\u0005\u1409\u0005\t\u1409\b\n\u1409\u0000\f\u1409\n", new Object[] { "c", "e", "f", "g", "d", "h" });
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
