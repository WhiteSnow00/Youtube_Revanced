import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akwo extends ahcz implements aheo
{
    public static final akwo a;
    private static volatile ahev f;
    public int b;
    public aknh c;
    public String d;
    public String e;
    private akzf g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(akwo.class, a = new akwo());
    }
    
    private akwo() {
        this.h = 2;
        this.d = "";
        this.e = "";
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
                if ((f = akwo.f) == null) {
                    synchronized (akwo.class) {
                        if (akwo.f == null) {
                            akwo.f = (ahev)new ahcs((ahcz)akwo.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akwo.a;
            }
            case 4: {
                return new ahcr((ahcz)akwo.a);
            }
            case 3: {
                return new akwo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akwo.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0005\u1409\u0004", new Object[] { "b", "c", "d", "e", "g" });
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
