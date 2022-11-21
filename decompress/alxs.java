import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alxs extends ahcz implements aheo
{
    public static final alxs a;
    public static final ahcx b;
    private static volatile ahev e;
    public String c;
    public String d;
    private int f;
    
    static {
        final alxs a2 = new alxs();
        ahcz.registerDefaultInstance(alxs.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aisc.a, a2, (MessageLite)a2, null, 191842732, ahgc.k, alxs.class);
    }
    
    private alxs() {
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
                if ((e = alxs.e) == null) {
                    synchronized (alxs.class) {
                        if (alxs.e == null) {
                            alxs.e = (ahev)new ahcs((ahcz)alxs.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return alxs.a;
            }
            case 4: {
                return new ahcr((ahcz)alxs.a);
            }
            case 3: {
                return new alxs();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alxs.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "f", "c", "d" });
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
