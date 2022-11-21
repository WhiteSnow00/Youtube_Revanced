import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akea extends ahcz implements aheo
{
    public static final akea a;
    private static volatile ahev d;
    public int b;
    public Object c;
    
    static {
        ahcz.registerDefaultInstance(akea.class, a = new akea());
    }
    
    private akea() {
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
                if ((d = akea.d) == null) {
                    synchronized (akea.class) {
                        if (akea.d == null) {
                            akea.d = (ahev)new ahcs((ahcz)akea.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akea.a;
            }
            case 4: {
                return new ahcr((ahcz)akea.a);
            }
            case 3: {
                return new akea();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akea.a, "\u0001\u0002\u0001\u0000\uec16\u387f\uf5ea\u7a12\u0002\u0000\u0000\u0000\uec16\u387f\u103c\u0000\uf5ea\u7a12\u103c\u0000", new Object[] { "c", "b", aicx.class, aout.class });
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
