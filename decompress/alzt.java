import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alzt extends ahcz implements aheo
{
    public static final alzt a;
    private static volatile ahev f;
    public int b;
    public float c;
    public float d;
    public ahej e;
    
    static {
        ahcz.registerDefaultInstance(alzt.class, a = new alzt());
    }
    
    private alzt() {
        this.e = ahej.a;
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
                if ((f = alzt.f) == null) {
                    synchronized (alzt.class) {
                        if (alzt.f == null) {
                            alzt.f = (ahev)new ahcs((ahcz)alzt.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alzt.a;
            }
            case 4: {
                return new ahcr((boolean[])null, (short[][])null);
            }
            case 3: {
                return new alzt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alzt.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u1001\u0000\u00022\u0003\u1001\u0001", new Object[] { "b", "c", "e", alzs.a, "d" });
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
