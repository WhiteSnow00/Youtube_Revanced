import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aifu extends ahcz implements aheo
{
    private static final aifu a;
    private static volatile ahev b;
    private int c;
    private Object d;
    
    static {
        ahcz.registerDefaultInstance(aifu.class, a = new aifu());
    }
    
    private aifu() {
        this.c = 0;
    }
    
    public static aifs a() {
        return (aifs)aifu.a.createBuilder();
    }
    
    static aifu c() {
        return aifu.a;
    }
    
    public static aifu d() {
        return aifu.a;
    }
    
    public static void f(final aifu aifu, final aifx aifx) {
        aifu.i(aifx);
    }
    
    public static void g(final aifu aifu, final aifv aifv) {
        aifu.h(aifv);
    }
    
    private void h(final aifv d) {
        d.getClass();
        this.d = d;
        this.c = 2;
    }
    
    private void i(final aifx d) {
        d.getClass();
        this.d = d;
        this.c = 1;
    }
    
    public aift b() {
        return aift.a(this.c);
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
                if ((b = aifu.b) == null) {
                    synchronized (aifu.class) {
                        if (aifu.b == null) {
                            aifu.b = (ahev)new ahcs((ahcz)aifu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aifu.a;
            }
            case 4: {
                return new aifs();
            }
            case 3: {
                return new aifu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aifu.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000", new Object[] { "d", "c", aifx.class, aifv.class });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public aifx e() {
        if (this.c == 1) {
            return (aifx)this.d;
        }
        return aifx.c();
    }
}
