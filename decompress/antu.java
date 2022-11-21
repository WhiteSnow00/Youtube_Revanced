import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class antu extends ahcz implements aheo
{
    public static final antu a;
    private static volatile ahev d;
    public int b;
    public Object c;
    
    static {
        ahcz.registerDefaultInstance(antu.class, a = new antu());
    }
    
    private antu() {
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
                if ((d = antu.d) == null) {
                    synchronized (antu.class) {
                        if (antu.d == null) {
                            antu.d = (ahev)new ahcs((ahcz)antu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return antu.a;
            }
            case 4: {
                return new ahcr((ahcz)antu.a);
            }
            case 3: {
                return new antu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)antu.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u103b\u0000\u0002\u103c\u0000", new Object[] { "c", "b", antv.class });
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
