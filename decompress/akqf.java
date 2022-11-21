import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akqf extends ahcz implements aheo
{
    public static final akqf a;
    private static volatile ahev f;
    public int b;
    public int c;
    public Object d;
    public String e;
    
    static {
        ahcz.registerDefaultInstance(akqf.class, a = new akqf());
    }
    
    private akqf() {
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
                if ((f = akqf.f) == null) {
                    synchronized (akqf.class) {
                        if (akqf.f == null) {
                            akqf.f = (ahev)new ahcs((ahcz)akqf.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akqf.a;
            }
            case 4: {
                return new ahcr((ahcz)akqf.a);
            }
            case 3: {
                return new akqf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akqf.a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1035\u0000\u0003\u1035\u0000", new Object[] { "d", "c", "b", "e" });
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
