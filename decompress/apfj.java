import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apfj extends ahcz implements aheo
{
    public static final apfj a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private ajws g;
    private ahjl h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(apfj.class, a = new apfj());
    }
    
    private apfj() {
        this.i = 2;
        final ahbt b = ahbt.b;
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
                if ((b = apfj.b) == null) {
                    synchronized (apfj.class) {
                        if (apfj.b == null) {
                            apfj.b = (ahev)new ahcs((ahcz)apfj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apfj.a;
            }
            case 4: {
                return new ahcr((ahcz)apfj.a);
            }
            case 3: {
                return new apfj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apfj.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0004\u0006\u1409\u0003", new Object[] { "c", "d", "e", "f", "h", "g" });
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
