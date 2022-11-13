import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqrt extends ahbh implements ahcw
{
    private static final aqrt a;
    private static volatile ahdd b;
    private int c;
    private Object d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqrt.class, (ahbh)(a = new aqrt()));
    }
    
    private aqrt() {
        this.c = 0;
    }
    
    public static ahdd a() {
        return aqrt.a.getParserForType();
    }
    
    public static aqrt c() {
        return aqrt.a;
    }
    
    public aqrs b() {
        if (this.c == 1) {
            return (aqrs)this.d;
        }
        return aqrs.c();
    }
    
    public aqrw d() {
        if (this.c == 3) {
            return (aqrw)this.d;
        }
        return aqrw.b();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aqrt.b) == null) {
                    synchronized (aqrt.class) {
                        if (aqrt.b == null) {
                            aqrt.b = (ahdd)new ahba((ahbh)aqrt.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqrt.a;
            }
            case 4: {
                return new ahaz((ahbh)c());
            }
            case 3: {
                return new aqrt();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqrt.a, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\u0003\u103c\u0000", new Object[] { "d", "c", aqrs.class, aqsa.class, aqrw.class });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public aqsa e() {
        if (this.c == 2) {
            return (aqsa)this.d;
        }
        return aqsa.b();
    }
    
    public boolean f() {
        return this.c == 1;
    }
    
    public boolean g() {
        return this.c == 3;
    }
    
    public boolean h() {
        return this.c == 2;
    }
}
