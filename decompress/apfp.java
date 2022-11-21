import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apfp extends ahcz implements aheo
{
    public static final apfp a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private anxb e;
    private anxb f;
    private aisc g;
    private ahjl h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(apfp.class, a = new apfp());
    }
    
    private apfp() {
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
                if ((b = apfp.b) == null) {
                    synchronized (apfp.class) {
                        if (apfp.b == null) {
                            apfp.b = (ahev)new ahcs((ahcz)apfp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apfp.a;
            }
            case 4: {
                return new ahcr((ahcz)apfp.a);
            }
            case 3: {
                return new apfp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apfp.a, "\u0001\u0005\u0000\u0001\u0005\n\u0005\u0000\u0000\u0005\u0005\u1409\u0007\u0006\u1409\b\b\u1409\n\t\u1409\u0002\n\u1409\u0003", new Object[] { "c", "f", "g", "h", "d", "e" });
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
