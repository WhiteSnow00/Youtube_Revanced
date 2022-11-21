import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aprc extends ahcz implements aheo
{
    public static final aprc a;
    private static volatile ahev f;
    public int b;
    public aprb c;
    public int d;
    public boolean e;
    
    static {
        ahcz.registerDefaultInstance(aprc.class, a = new aprc());
    }
    
    private aprc() {
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
                if ((f = aprc.f) == null) {
                    synchronized (aprc.class) {
                        if (aprc.f == null) {
                            aprc.f = (ahev)new ahcs((ahcz)aprc.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aprc.a;
            }
            case 4: {
                return new ahcr((ahcz)aprc.a);
            }
            case 3: {
                return new aprc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aprc.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u100c\u0001\u0003\u1007\u0002", new Object[] { "b", "c", "d", aprh.m, "e" });
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
