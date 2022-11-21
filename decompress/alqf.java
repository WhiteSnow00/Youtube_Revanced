import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqf extends ahcz implements aheo
{
    public static final alqf a;
    private static volatile ahev f;
    public int b;
    public String c;
    public int d;
    public boolean e;
    
    static {
        ahcz.registerDefaultInstance(alqf.class, a = new alqf());
    }
    
    private alqf() {
        this.c = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = alqf.f) == null) {
                    synchronized (alqf.class) {
                        if (alqf.f == null) {
                            alqf.f = (ahev)new ahcs((ahcz)alqf.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alqf.a;
            }
            case 4: {
                return new ahcr((ahcz)alqf.a);
            }
            case 3: {
                return new alqf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alqf.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u1007\u0002", new Object[] { "b", "c", "d", alqg.a(), "e" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
