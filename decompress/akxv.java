import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akxv extends ahcz implements aheo
{
    public static final akxv a;
    private static volatile ahev f;
    public int b;
    public aknh c;
    public alxj d;
    public String e;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(akxv.class, a = new akxv());
    }
    
    private akxv() {
        this.g = 2;
        this.e = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = akxv.f) == null) {
                    synchronized (akxv.class) {
                        if (akxv.f == null) {
                            akxv.f = (ahev)new ahcs((ahcz)akxv.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akxv.a;
            }
            case 4: {
                return new ahcr((ahcz)akxv.a);
            }
            case 3: {
                return new akxv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akxv.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1009\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
