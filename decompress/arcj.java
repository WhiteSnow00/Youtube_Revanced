import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arcj extends ahcz implements aheo
{
    private static final arcj a;
    private static volatile ahev b;
    private int c;
    private boolean d;
    
    static {
        ahcz.registerDefaultInstance(arcj.class, a = new arcj());
    }
    
    private arcj() {
    }
    
    public static arcj a() {
        return arcj.a;
    }
    
    public static arcj b() {
        return arcj.a;
    }
    
    public boolean c() {
        return this.d;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = arcj.b) == null) {
                    synchronized (arcj.class) {
                        if (arcj.b == null) {
                            arcj.b = (ahev)new ahcs((ahcz)arcj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return arcj.a;
            }
            case 4: {
                return new ahcr((ahcz)a());
            }
            case 3: {
                return new arcj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arcj.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "c", "d" });
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
