import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajlf extends ahcz implements aheo
{
    public static final ajlf a;
    private static volatile ahev e;
    public int b;
    public boolean c;
    public boolean d;
    
    static {
        ahcz.registerDefaultInstance(ajlf.class, a = new ajlf());
    }
    
    private ajlf() {
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
                if ((e = ajlf.e) == null) {
                    synchronized (ajlf.class) {
                        if (ajlf.e == null) {
                            ajlf.e = (ahev)new ahcs((ahcz)ajlf.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajlf.a;
            }
            case 4: {
                return new ahcr((ahcz)ajlf.a);
            }
            case 3: {
                return new ajlf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajlf.a, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002\u1007\u0001\u0004\u1007\u0002", new Object[] { "b", "c", "d" });
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
