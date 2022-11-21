import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aejt extends ahcz implements aheo
{
    public static final aejt a;
    private static volatile ahev f;
    public int b;
    public String c;
    public String d;
    public String e;
    
    static {
        ahcz.registerDefaultInstance(aejt.class, a = new aejt());
    }
    
    private aejt() {
        this.c = "";
        this.d = "";
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
                if ((f = aejt.f) == null) {
                    synchronized (aejt.class) {
                        if (aejt.f == null) {
                            aejt.f = (ahev)new ahcs((ahcz)aejt.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aejt.a;
            }
            case 4: {
                return new ahcr((ahcz)aejt.a);
            }
            case 3: {
                return new aejt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aejt.a, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002\u1008\u0001\u0004\u1008\u0006\u0005\u1008\u0007", new Object[] { "b", "c", "d", "e" });
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
