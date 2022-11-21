import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alxl extends ahcz implements aheo
{
    public static final alxl a;
    private static volatile ahev e;
    public int b;
    public String c;
    public String d;
    
    static {
        ahcz.registerDefaultInstance(alxl.class, a = new alxl());
    }
    
    private alxl() {
        this.c = "";
        this.d = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = alxl.e) == null) {
                    synchronized (alxl.class) {
                        if (alxl.e == null) {
                            alxl.e = (ahev)new ahcs((ahcz)alxl.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return alxl.a;
            }
            case 4: {
                return new ahcr((ahcz)alxl.a);
            }
            case 3: {
                return new alxl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alxl.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u1008\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d" });
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
