import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqh extends ahcz implements aheo
{
    public static final alqh a;
    private static volatile ahev e;
    public int b;
    public String c;
    public String d;
    
    static {
        ahcz.registerDefaultInstance(alqh.class, a = new alqh());
    }
    
    private alqh() {
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
                if ((e = alqh.e) == null) {
                    synchronized (alqh.class) {
                        if (alqh.e == null) {
                            alqh.e = (ahev)new ahcs((ahcz)alqh.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return alqh.a;
            }
            case 4: {
                return new ahcr((ahcz)alqh.a);
            }
            case 3: {
                return new alqh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alqh.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
