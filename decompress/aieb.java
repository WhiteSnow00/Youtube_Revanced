import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aieb extends ahbh implements ahcw
{
    private static final aieb a;
    private static volatile ahdd b;
    private int c;
    private Object d;
    
    static {
        ahbh.registerDefaultInstance((Class)aieb.class, (ahbh)(a = new aieb()));
    }
    
    private aieb() {
        this.c = 0;
    }
    
    public static aidz a() {
        return (aidz)aieb.a.createBuilder();
    }
    
    static aieb c() {
        return aieb.a;
    }
    
    public static aieb d() {
        return aieb.a;
    }
    
    public static void f(final aieb aieb, final aiee aiee) {
        aieb.i(aiee);
    }
    
    public static void g(final aieb aieb, final aiec aiec) {
        aieb.h(aiec);
    }
    
    private void h(final aiec d) {
        d.getClass();
        this.d = d;
        this.c = 2;
    }
    
    private void i(final aiee d) {
        d.getClass();
        this.d = d;
        this.c = 1;
    }
    
    public aiea b() {
        return aiea.a(this.c);
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aieb.b) == null) {
                    synchronized (aieb.class) {
                        if (aieb.b == null) {
                            aieb.b = (ahdd)new ahba((ahbh)aieb.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aieb.a;
            }
            case 4: {
                return new aidz();
            }
            case 3: {
                return new aieb();
            }
            case 2: {
                return newMessageInfo((MessageLite)aieb.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000", new Object[] { "d", "c", aiee.class, aiec.class });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public aiee e() {
        if (this.c == 1) {
            return (aiee)this.d;
        }
        return aiee.c();
    }
}
