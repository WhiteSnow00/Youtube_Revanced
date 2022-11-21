import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appr extends ahcz implements aheo
{
    public static final appr a;
    private static volatile ahev b;
    private int c;
    private aies d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(appr.class, a = new appr());
    }
    
    private appr() {
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
                if ((b = appr.b) == null) {
                    synchronized (appr.class) {
                        if (appr.b == null) {
                            appr.b = (ahev)new ahcs((ahcz)appr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return appr.a;
            }
            case 4: {
                return new ahcr((ahcz)appr.a);
            }
            case 3: {
                return new appr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)appr.a, "\u0001\u0001\u0000\u0001\ueb11\u1f11\ueb11\u1f11\u0001\u0000\u0000\u0001\ueb11\u1f11\u1409\u0000", new Object[] { "c", "d" });
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
