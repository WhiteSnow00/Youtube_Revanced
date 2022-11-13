import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akls extends ahbh implements ahcw
{
    public static final akls a;
    private static volatile ahdd i;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public String f;
    public boolean g;
    public String h;
    
    static {
        ahbh.registerDefaultInstance((Class)akls.class, (ahbh)(a = new akls()));
    }
    
    private akls() {
        this.f = "";
        this.h = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = akls.i) == null) {
                    synchronized (akls.class) {
                        if (akls.i == null) {
                            akls.i = (ahdd)new ahba((ahbh)akls.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return akls.a;
            }
            case 4: {
                return new ahaz((ahbh)akls.a);
            }
            case 3: {
                return new akls();
            }
            case 2: {
                return newMessageInfo((MessageLite)akls.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0003\u0003\u1008\u0004\u0004\u1007\u0005\u0005\u1008\u0006\u0006\u1007\u0001", new Object[] { "b", "c", "e", "f", "g", "h", "d" });
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
