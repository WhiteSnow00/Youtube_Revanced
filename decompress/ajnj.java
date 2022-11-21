import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajnj extends ahcz implements aheo
{
    public static final ajnj a;
    private static volatile ahev e;
    public int b;
    public long c;
    public double d;
    
    static {
        ahcz.registerDefaultInstance(ajnj.class, a = new ajnj());
    }
    
    private ajnj() {
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
                if ((e = ajnj.e) == null) {
                    synchronized (ajnj.class) {
                        if (ajnj.e == null) {
                            ajnj.e = (ahev)new ahcs((ahcz)ajnj.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajnj.a;
            }
            case 4: {
                return new ahcr((ahcz)ajnj.a);
            }
            case 3: {
                return new ajnj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajnj.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1000\u0001", new Object[] { "b", "c", "d" });
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
