import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqi extends ahcz implements aheo
{
    public static final apqi a;
    private static volatile ahev b;
    private int c;
    private apqj d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apqi.class, a = new apqi());
    }
    
    private apqi() {
        this.e = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = apqi.b) == null) {
                    synchronized (apqi.class) {
                        if (apqi.b == null) {
                            apqi.b = (ahev)new ahcs((ahcz)apqi.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apqi.a;
            }
            case 4: {
                return new ahcr((ahcz)apqi.a);
            }
            case 3: {
                return new apqi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apqi.a, "\u0001\u0001\u0000\u0001\ue2f3\u2437\ue2f3\u2437\u0001\u0000\u0000\u0001\ue2f3\u2437\u1409\u0000", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
