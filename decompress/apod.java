import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apod extends ahcz implements aheo
{
    public static final apod a;
    private static volatile ahev g;
    public int b;
    public int c;
    public Object d;
    public int e;
    public boolean f;
    
    static {
        ahcz.registerDefaultInstance(apod.class, a = new apod());
    }
    
    private apod() {
        this.c = 0;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = apod.g) == null) {
                    synchronized (apod.class) {
                        if (apod.g == null) {
                            apod.g = (ahev)new ahcs((ahcz)apod.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return apod.a;
            }
            case 4: {
                return new ahcr((ahcz)apod.a);
            }
            case 3: {
                return new apod();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apod.a, "\u0001\t\u0001\u0001\u0001\u000b\t\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u103c\u0000\u0003\u103c\u0000\u0004\u1007\b\u0005\u103c\u0000\u0006\u103c\u0000\t\u103c\u0000\n\u103c\u0000\u000b\u103c\u0000", new Object[] { "d", "c", "b", "e", apnc.i, apoe.class, apoc.class, "f", apof.class, apob.class, apny.class, apoa.class, apoj.class });
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
