import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akcr extends ahcz implements aheo
{
    public static final akcr a;
    private static volatile ahev g;
    public int b;
    public String c;
    public int d;
    public int e;
    public int f;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(akcr.class, a = new akcr());
    }
    
    private akcr() {
        this.h = 2;
        this.c = "";
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
                if ((g = akcr.g) == null) {
                    synchronized (akcr.class) {
                        if (akcr.g == null) {
                            akcr.g = (ahev)new ahcs((ahcz)akcr.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return akcr.a;
            }
            case 4: {
                return new ahcr((ahcz)akcr.a);
            }
            case 3: {
                return new akcr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akcr.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u100c\u0002\u0005\u100c\u0004", new Object[] { "b", "c", "d", akan.e, "e", akco.a(), "f", akan.d });
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
