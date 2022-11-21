import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appg extends ahcz implements aheo
{
    public static final appg a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private ajws g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(appg.class, a = new appg());
    }
    
    private appg() {
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
                final ahev b;
                if ((b = appg.b) == null) {
                    synchronized (appg.class) {
                        if (appg.b == null) {
                            appg.b = (ahev)new ahcs((ahcz)appg.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return appg.a;
            }
            case 4: {
                return new ahcr((ahcz)appg.a);
            }
            case 3: {
                return new appg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)appg.a, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0004\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007", new Object[] { "c", "d", "e", "f", "g" });
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
