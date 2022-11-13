import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqul extends ahbh implements ahcw
{
    public static final aqul a;
    private static volatile ahdd f;
    public int b;
    public int c;
    public Object d;
    public String e;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aqul.class, (ahbh)(a = new aqul()));
    }
    
    private aqul() {
        this.c = 0;
        this.g = 2;
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aqul.f) == null) {
                    synchronized (aqul.class) {
                        if (aqul.f == null) {
                            aqul.f = (ahdd)new ahba((ahbh)aqul.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqul.a;
            }
            case 4: {
                return new ahaz((ahbh)aqul.a);
            }
            case 3: {
                return new aqul();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqul.a, "\u0001\t\u0001\u0001\u0001\t\t\u0000\u0000\u0002\u0001\u1008\u0000\u0002\u103c\u0000\u0003\u103c\u0000\u0004\u103c\u0000\u0005\u103c\u0000\u0006\u143c\u0000\u0007\u143c\u0000\b\u103c\u0000\t\u103c\u0000", new Object[] { "d", "c", "b", "e", aquh.class, aque.class, aqud.class, aquk.class, aqui.class, aquj.class, aquf.class, aqug.class });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
