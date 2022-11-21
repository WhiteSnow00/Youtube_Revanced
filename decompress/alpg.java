import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpg extends ahcz implements aheo
{
    public static final alpg a;
    public static final ahcx b;
    private static volatile ahev g;
    public int c;
    public String d;
    public aisc e;
    public aisc f;
    private byte h;
    
    static {
        final alpg a2 = new alpg();
        ahcz.registerDefaultInstance(alpg.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aisc.a, a2, (MessageLite)a2, null, 350823535, ahgc.k, alpg.class);
    }
    
    private alpg() {
        this.h = 2;
        this.d = "";
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
                final ahev g;
                if ((g = alpg.g) == null) {
                    synchronized (alpg.class) {
                        if (alpg.g == null) {
                            alpg.g = (ahev)new ahcs((ahcz)alpg.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return alpg.a;
            }
            case 4: {
                return new ahcr((ahcz)alpg.a);
            }
            case 3: {
                return new alpg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alpg.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "c", "d", "e", "f" });
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
