import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqdg extends ahbh implements ahcw
{
    public static final aqdg a;
    private static volatile ahdd f;
    public int b;
    public int c;
    public Object d;
    public ahdy e;
    
    static {
        ahbh.registerDefaultInstance((Class)aqdg.class, (ahbh)(a = new aqdg()));
    }
    
    private aqdg() {
        this.c = 0;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aqdg.f) == null) {
                    synchronized (aqdg.class) {
                        if (aqdg.f == null) {
                            aqdg.f = (ahdd)new ahba((ahbh)aqdg.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqdg.a;
            }
            case 4: {
                return new ahaz((ahbh)aqdg.a);
            }
            case 3: {
                return new aqdg();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqdg.a, "\u0001\u000e\u0001\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\u0003\u103c\u0000\u0004\u103c\u0000\u0005\u103c\u0000\u0006\u103c\u0000\u0007\u103c\u0000\b\u103c\u0000\t\u103c\u0000\n\u103c\u0000\u000b\u103c\u0000\f\u103c\u0000\r\u103c\u0000\u000e\u1009\u0000", new Object[] { "d", "c", "b", aocd.class, aobz.class, aobs.class, aoby.class, aobt.class, aobr.class, aobq.class, aobw.class, aobv.class, aobu.class, aocc.class, amfx.class, amfw.class, "e" });
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
