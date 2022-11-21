import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiso extends ahcz implements aheo
{
    public static final aiso a;
    private static volatile ahev g;
    public int b;
    public int c;
    public Object d;
    public String e;
    public aisl f;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(aiso.class, a = new aiso());
    }
    
    private aiso() {
        this.c = 0;
        this.h = 2;
        this.e = "";
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
                if ((g = aiso.g) == null) {
                    synchronized (aiso.class) {
                        if (aiso.g == null) {
                            aiso.g = (ahev)new ahcs((ahcz)aiso.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aiso.a;
            }
            case 4: {
                return new ahcr((ahcz)aiso.a);
            }
            case 3: {
                return new aiso();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aiso.a, "\u0001\u0004\u0001\u0001\u0001\u0005\u0004\u0000\u0000\u0002\u0001\u143c\u0000\u0003\u1009\u0003\u0004\u143c\u0000\u0005\u1008\u0002", new Object[] { "d", "c", "b", akfj.class, "f", aowb.class, "e" });
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
