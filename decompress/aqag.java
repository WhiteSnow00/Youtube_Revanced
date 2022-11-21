import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqag extends ahcz implements aheo
{
    public static final aqag a;
    private static volatile ahev d;
    public int b;
    public ajws c;
    private ajws e;
    private ajws f;
    private ajws g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(aqag.class, a = new aqag());
    }
    
    private aqag() {
        this.h = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = aqag.d) == null) {
                    synchronized (aqag.class) {
                        if (aqag.d == null) {
                            aqag.d = (ahev)new ahcs((ahcz)aqag.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqag.a;
            }
            case 4: {
                return new ahcr((ahcz)aqag.a);
            }
            case 3: {
                return new aqag();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqag.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "b", "e", "c", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
