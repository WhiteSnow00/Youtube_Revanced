import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiee extends ahbh implements ahcw
{
    private static final aiee a;
    private static volatile ahdd b;
    private int c;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aiee.class, (ahbh)(a = new aiee()));
    }
    
    private aiee() {
    }
    
    public static aied a() {
        return (aied)aiee.a.createBuilder();
    }
    
    static aiee b() {
        return aiee.a;
    }
    
    public static aiee c() {
        return aiee.a;
    }
    
    public static void e(final aiee aiee, final aoru aoru) {
        aiee.f(aoru);
    }
    
    private void f(final aoru aoru) {
        this.d = aoru.g;
        this.c |= 0x1;
    }
    
    public aoru d() {
        aoru aoru;
        if ((aoru = aoru.b(this.d)) == null) {
            aoru = aoru.a;
        }
        return aoru;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aiee.b) == null) {
                    synchronized (aiee.class) {
                        if (aiee.b == null) {
                            aiee.b = (ahdd)new ahba((ahbh)aiee.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aiee.a;
            }
            case 4: {
                return new aied();
            }
            case 3: {
                return new aiee();
            }
            case 2: {
                return newMessageInfo((MessageLite)aiee.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "c", "d", aoru.a() });
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
