import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apfh extends ahcz implements aheo
{
    public static final apfh a;
    private static volatile ahev b;
    private int c;
    private aibx d;
    private aibx e;
    private aibx f;
    private aibx g;
    private aibx h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(apfh.class, a = new apfh());
    }
    
    private apfh() {
        this.i = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = apfh.b) == null) {
                    synchronized (apfh.class) {
                        if (apfh.b == null) {
                            apfh.b = (ahev)new ahcs((ahcz)apfh.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apfh.a;
            }
            case 4: {
                return new ahcr((ahcz)apfh.a);
            }
            case 3: {
                return new apfh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apfh.a, "\u0001\u0005\u0000\u0001\u0002\u0016\u0005\u0000\u0000\u0005\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0016\u1409\u0005", new Object[] { "c", "d", "e", "f", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
