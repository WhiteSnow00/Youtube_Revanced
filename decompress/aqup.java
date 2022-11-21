import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqup extends ahcz implements aheo
{
    private static final aqup a;
    private static volatile ahev b;
    private int c;
    private boolean d;
    
    static {
        ahcz.registerDefaultInstance(aqup.class, a = new aqup());
    }
    
    private aqup() {
    }
    
    public static aqup a() {
        return aqup.a;
    }
    
    public static aqup b() {
        return aqup.a;
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
                if ((b = aqup.b) == null) {
                    synchronized (aqup.class) {
                        if (aqup.b == null) {
                            aqup.b = (ahev)new ahcs((ahcz)aqup.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqup.a;
            }
            case 4: {
                return new ahcr((ahcz)a());
            }
            case 3: {
                return new aqup();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqup.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "c", "d" });
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
