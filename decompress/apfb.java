import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apfb extends ahcz implements aheo
{
    public static final apfb a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private anxb f;
    private anxb g;
    private ahjl h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(apfb.class, a = new apfb());
    }
    
    private apfb() {
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
                if ((b = apfb.b) == null) {
                    synchronized (apfb.class) {
                        if (apfb.b == null) {
                            apfb.b = (ahev)new ahcs((ahcz)apfb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apfb.a;
            }
            case 4: {
                return new ahcr((ahcz)apfb.a);
            }
            case 3: {
                return new apfb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apfb.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005", new Object[] { "c", "d", "e", "f", "g", "h" });
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
