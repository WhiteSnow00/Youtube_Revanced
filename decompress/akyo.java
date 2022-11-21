import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyo extends ahcz implements aheo
{
    public static final akyo a;
    private static volatile ahev d;
    public int b;
    public Object c;
    
    static {
        ahcz.registerDefaultInstance(akyo.class, a = new akyo());
    }
    
    private akyo() {
        this.b = 0;
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
                if ((d = akyo.d) == null) {
                    synchronized (akyo.class) {
                        if (akyo.d == null) {
                            akyo.d = (ahev)new ahcs((ahcz)akyo.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akyo.a;
            }
            case 4: {
                return new ahcr((ahcz)akyo.a);
            }
            case 3: {
                return new akyo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akyo.a, "\u0001\u0005\u0001\u0000\uf096\u1c97\ufa7b\u3dcc\u0005\u0000\u0000\u0000\uf096\u1c97\u103c\u0000\ufe19\u1e2d\u103c\u0000\uf24e\u1e33\u103c\u0000\uf1b4\u2976\u103c\u0000\ufa7b\u3dcc\u103c\u0000", new Object[] { "c", "b", ange.class, angb.class, angc.class, anga.class, angd.class });
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
