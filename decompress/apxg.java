import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxg extends ahcz implements aheo
{
    public static final apxg a;
    private static volatile ahev f;
    public int b;
    public int c;
    public Object d;
    public String e;
    
    static {
        ahcz.registerDefaultInstance(apxg.class, a = new apxg());
    }
    
    private apxg() {
        this.c = 0;
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
                if ((f = apxg.f) == null) {
                    synchronized (apxg.class) {
                        if (apxg.f == null) {
                            apxg.f = (ahev)new ahcs((ahcz)apxg.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apxg.a;
            }
            case 4: {
                return new ahcr((ahcz)apxg.a);
            }
            case 3: {
                return new apxg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apxg.a, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u103c\u0000\u0003\u103c\u0000\u0004\u103c\u0000\u0005\u103c\u0000\u0006\u103c\u0000\u0007\u103c\u0000", new Object[] { "d", "c", "b", "e", apxj.class, apxf.class, apxy.class, apxt.class, apxn.class, apxs.class });
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
