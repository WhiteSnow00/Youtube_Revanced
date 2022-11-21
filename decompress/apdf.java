import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apdf extends ahcz implements aheo
{
    public static final apdf a;
    private static volatile ahev d;
    public int b;
    public Object c;
    
    static {
        ahcz.registerDefaultInstance(apdf.class, a = new apdf());
    }
    
    private apdf() {
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
                if ((d = apdf.d) == null) {
                    synchronized (apdf.class) {
                        if (apdf.d == null) {
                            apdf.d = (ahev)new ahcs((ahcz)apdf.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apdf.a;
            }
            case 4: {
                return new ahcr((ahcz)apdf.a);
            }
            case 3: {
                return new apdf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apdf.a, "\u0001\u0001\u0001\u0000\uec16\u387f\uec16\u387f\u0001\u0000\u0000\u0000\uec16\u387f\u103c\u0000", new Object[] { "c", "b", aicx.class });
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
