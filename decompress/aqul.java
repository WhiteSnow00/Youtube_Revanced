import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqul extends ahcz implements aheo
{
    private static final aqul a;
    private static volatile ahev b;
    private int c;
    private String d;
    private amhy e;
    
    static {
        ahcz.registerDefaultInstance(aqul.class, a = new aqul());
    }
    
    private aqul() {
        this.d = "";
    }
    
    public static aqul b() {
        return aqul.a;
    }
    
    public static aqul c() {
        return aqul.a;
    }
    
    public amhy a() {
        amhy amhy;
        if ((amhy = this.e) == null) {
            amhy = amhy.d();
        }
        return amhy;
    }
    
    public String d() {
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
                if ((b = aqul.b) == null) {
                    synchronized (aqul.class) {
                        if (aqul.b == null) {
                            aqul.b = (ahev)new ahcs((ahcz)aqul.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqul.a;
            }
            case 4: {
                return new ahcr((ahcz)b());
            }
            case 3: {
                return new aqul();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqul.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001", new Object[] { "c", "d", "e" });
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
