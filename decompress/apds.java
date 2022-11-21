import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apds extends ahcz implements aheo
{
    public static final apds a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private anxb f;
    private anxb g;
    private anxb h;
    private anxb i;
    private ahjl j;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(apds.class, a = new apds());
    }
    
    private apds() {
        this.k = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = apds.b) == null) {
                    synchronized (apds.class) {
                        if (apds.b == null) {
                            apds.b = (ahev)new ahcs((ahcz)apds.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apds.a;
            }
            case 4: {
                return new ahcr((ahcz)apds.a);
            }
            case 3: {
                return new apds();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apds.a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1409\u0002\u0003\u1409\u0005\u0006\u1409\n\u0007\u1409\u0004\b\u1409\u0003\t\u1409\u0001", new Object[] { "c", "d", "f", "i", "j", "h", "g", "e" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
