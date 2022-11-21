import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqut extends ahcz implements aheo
{
    private static final aqut a;
    private static volatile ahev b;
    private int c;
    private boolean d;
    
    static {
        ahcz.registerDefaultInstance(aqut.class, a = new aqut());
    }
    
    private aqut() {
    }
    
    public static aqut a() {
        return aqut.a;
    }
    
    public static aqut b() {
        return aqut.a;
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
                if ((b = aqut.b) == null) {
                    synchronized (aqut.class) {
                        if (aqut.b == null) {
                            aqut.b = (ahev)new ahcs((ahcz)aqut.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqut.a;
            }
            case 4: {
                return new ahcr((ahcz)a());
            }
            case 3: {
                return new aqut();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqut.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "c", "d" });
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
