import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alhy extends ahcz implements aheo
{
    public static final alhy a;
    private static volatile ahev f;
    public int b;
    public apry c;
    public String d;
    public alji e;
    
    static {
        ahcz.registerDefaultInstance(alhy.class, a = new alhy());
    }
    
    private alhy() {
        this.d = "";
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
                if ((f = alhy.f) == null) {
                    synchronized (alhy.class) {
                        if (alhy.f == null) {
                            alhy.f = (ahev)new ahcs((ahcz)alhy.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alhy.a;
            }
            case 4: {
                return new ahcr((ahcz)alhy.a);
            }
            case 3: {
                return new alhy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alhy.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1008\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d", "e" });
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
