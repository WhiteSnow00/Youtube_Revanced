import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aici extends ahcz implements aheo
{
    public static final aici a;
    private static volatile ahev f;
    public int b;
    public String c;
    public ajws d;
    public akfj e;
    private ahjl g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(aici.class, a = new aici());
    }
    
    private aici() {
        this.h = 2;
        this.c = "";
        final ahbt b = ahbt.b;
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
                final ahev f;
                if ((f = aici.f) == null) {
                    synchronized (aici.class) {
                        if (aici.f == null) {
                            aici.f = (ahev)new ahcs((ahcz)aici.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aici.a;
            }
            case 4: {
                return new ahcr((ahcz)aici.a);
            }
            case 3: {
                return new aici();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aici.a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0003\u0001\u1008\u0000\u0002\u1409\u0001\u0004\u1409\u0003\u0006\u1409\u0005", new Object[] { "b", "c", "d", "g", "e" });
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
