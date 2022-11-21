import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidf extends ahcz implements aheo
{
    private static final aidf a;
    private static volatile ahev b;
    private int c;
    private int d;
    private int e;
    
    static {
        ahcz.registerDefaultInstance(aidf.class, a = new aidf());
    }
    
    private aidf() {
    }
    
    public static aide a() {
        return (aide)aidf.a.createBuilder();
    }
    
    static aidf b() {
        return aidf.a;
    }
    
    public static void c(final aidf aidf, final aidc aidc) {
        aidf.e(aidc);
    }
    
    public static void d(final aidf aidf, final aidd aidd) {
        aidf.f(aidd);
    }
    
    private void e(final aidc aidc) {
        this.d = aidc.e;
        this.c |= 0x1;
    }
    
    private void f(final aidd aidd) {
        this.e = aidd.d;
        this.c |= 0x2;
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
                if ((b = aidf.b) == null) {
                    synchronized (aidf.class) {
                        if (aidf.b == null) {
                            aidf.b = (ahev)new ahcs((ahcz)aidf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aidf.a;
            }
            case 4: {
                return new aide();
            }
            case 3: {
                return new aidf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aidf.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001", new Object[] { "c", "d", aidc.a(), "e", aidd.a() });
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
