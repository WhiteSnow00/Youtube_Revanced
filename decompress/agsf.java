import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agsf extends ahcz implements aheo
{
    public static final agsf a;
    private static volatile ahev f;
    public int b;
    public String c;
    public agsr d;
    public String e;
    
    static {
        ahcz.registerDefaultInstance(agsf.class, a = new agsf());
    }
    
    private agsf() {
        this.c = "";
        this.e = "";
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
                if ((f = agsf.f) == null) {
                    synchronized (agsf.class) {
                        if (agsf.f == null) {
                            agsf.f = (ahev)new ahcs((ahcz)agsf.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agsf.a;
            }
            case 4: {
                return new ahcr((ahcz)agsf.a);
            }
            case 3: {
                return new agsf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agsf.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", "e" });
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
