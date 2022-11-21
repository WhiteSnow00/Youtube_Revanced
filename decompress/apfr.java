import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apfr extends ahcz implements aheo
{
    public static final apfr a;
    private static volatile ahev b;
    private int c;
    private anxb d;
    private anxb e;
    private ahjl f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(apfr.class, a = new apfr());
    }
    
    private apfr() {
        this.g = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = apfr.b) == null) {
                    synchronized (apfr.class) {
                        if (apfr.b == null) {
                            apfr.b = (ahev)new ahcs((ahcz)apfr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apfr.a;
            }
            case 4: {
                return new ahcr((ahcz)apfr.a);
            }
            case 3: {
                return new apfr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apfr.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0003", new Object[] { "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
