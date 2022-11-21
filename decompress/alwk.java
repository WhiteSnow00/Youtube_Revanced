import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alwk extends ahcz implements aheo
{
    public static final alwk a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(alwk.class, a = new alwk());
    }
    
    private alwk() {
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
                final ahev d;
                if ((d = alwk.d) == null) {
                    synchronized (alwk.class) {
                        if (alwk.d == null) {
                            alwk.d = (ahev)new ahcs((ahcz)alwk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alwk.a;
            }
            case 4: {
                return new ahcr((ahcz)alwk.a);
            }
            case 3: {
                return new alwk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alwk.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "b", "c" });
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
