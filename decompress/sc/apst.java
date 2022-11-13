import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apst extends ahbh implements ahcw
{
    public static final apst a;
    private static volatile ahdd f;
    public int b;
    public String c;
    public int d;
    public String e;
    private aiqj g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)apst.class, (ahbh)(a = new apst()));
    }
    
    private apst() {
        this.h = 2;
        this.c = "";
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = apst.f) == null) {
                    synchronized (apst.class) {
                        if (apst.f == null) {
                            apst.f = (ahdd)new ahba((ahbh)apst.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apst.a;
            }
            case 4: {
                return new ahaz((ahbh)apst.a);
            }
            case 3: {
                return new apst();
            }
            case 2: {
                return newMessageInfo((MessageLite)apst.a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u100b\u0001\u0004\u1008\u0002\u0006\u1409\u0004", new Object[] { "b", "c", "d", "e", "g" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
