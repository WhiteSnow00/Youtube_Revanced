import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alxy extends ahcz implements aheo
{
    public static final alxy a;
    private static volatile ahev h;
    public int b;
    public ajsp c;
    public alkv d;
    public ajdk e;
    public alxx f;
    public aimz g;
    
    static {
        ahcz.registerDefaultInstance(alxy.class, a = new alxy());
    }
    
    private alxy() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev h;
                if ((h = alxy.h) == null) {
                    synchronized (alxy.class) {
                        if (alxy.h == null) {
                            alxy.h = (ahev)new ahcs((ahcz)alxy.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return alxy.a;
            }
            case 4: {
                return new ahcr((ahcz)alxy.a);
            }
            case 3: {
                return new alxy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alxy.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0005\u1009\u0004\u0006\u1009\u0005", new Object[] { "b", "c", "d", "e", "f", "g" });
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
