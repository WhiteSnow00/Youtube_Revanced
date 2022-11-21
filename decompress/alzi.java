import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alzi extends ahcz implements aheo
{
    public static final alzi a;
    private static volatile ahev f;
    public int b;
    public String c;
    public String d;
    public alze e;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(alzi.class, a = new alzi());
    }
    
    private alzi() {
        this.g = 2;
        this.c = "";
        final ahbt b = ahbt.b;
        this.d = "";
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
                if ((f = alzi.f) == null) {
                    synchronized (alzi.class) {
                        if (alzi.f == null) {
                            alzi.f = (ahev)new ahcs((ahcz)alzi.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alzi.a;
            }
            case 4: {
                return new ahcr((ahcz)alzi.a);
            }
            case 3: {
                return new alzi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alzi.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001\u1008\u0000\u0003\u1008\u0002\u0004\u1409\u0003", new Object[] { "b", "c", "d", "e" });
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
