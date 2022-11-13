import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aklt extends ahbh implements ahcw
{
    public static final aklt a;
    private static volatile ahdd h;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    private int i;
    
    static {
        ahbh.registerDefaultInstance((Class)aklt.class, (ahbh)(a = new aklt()));
    }
    
    private aklt() {
    }
    
    public static void a(final aklt aklt) {
        aklt.i |= 0x1;
        aklt.b = true;
    }
    
    public static void b(final aklt aklt) {
        aklt.i |= 0x2;
        aklt.c = true;
    }
    
    public static void c(final aklt aklt) {
        aklt.i |= 0x8;
        aklt.d = true;
    }
    
    public static void d(final aklt aklt) {
        aklt.i |= 0x10;
        aklt.e = true;
    }
    
    public static void e(final aklt aklt) {
        aklt.i |= 0x20;
        aklt.f = true;
    }
    
    public static void f(final aklt aklt) {
        aklt.i |= 0x40;
        aklt.g = true;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = aklt.h) == null) {
                    synchronized (aklt.class) {
                        if (aklt.h == null) {
                            aklt.h = (ahdd)new ahba((ahbh)aklt.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aklt.a;
            }
            case 4: {
                return new ahaz((ahbh)aklt.a);
            }
            case 3: {
                return new aklt();
            }
            case 2: {
                return newMessageInfo((MessageLite)aklt.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0003\u0003\u1007\u0004\u0004\u1007\u0005\u0005\u1007\u0006\u0006\u1007\u0001", new Object[] { "i", "b", "d", "e", "f", "g", "c" });
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
