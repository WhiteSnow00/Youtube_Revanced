import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aifh extends ahcz implements aheo
{
    public static final aifh a;
    private static volatile ahev d;
    public int b;
    public Object c;
    
    static {
        ahcz.registerDefaultInstance(aifh.class, a = new aifh());
    }
    
    private aifh() {
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
                if ((d = aifh.d) == null) {
                    synchronized (aifh.class) {
                        if (aifh.d == null) {
                            aifh.d = (ahev)new ahcs((ahcz)aifh.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aifh.a;
            }
            case 4: {
                return new ahcr((ahcz)aifh.a);
            }
            case 3: {
                return new aifh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aifh.a, "\u0001\u0002\u0001\u0000\uec16\u387f\uf20f\u3e81\u0002\u0000\u0000\u0000\uec16\u387f\u103c\u0000\uf20f\u3e81\u103c\u0000", new Object[] { "c", "b", aicx.class, alpx.class });
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
