import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aohj extends ahbh implements ahcw
{
    public static final aohj a;
    private static volatile ahdd f;
    public int b;
    public ahbx c;
    public boolean d;
    public ajut e;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aohj.class, (ahbh)(a = new aohj()));
    }
    
    private aohj() {
        this.g = 2;
        this.c = emptyProtobufList();
    }
    
    public final void a() {
        final ahbx c = this.c;
        if (!c.c()) {
            this.c = ahbh.mutableCopy(c);
        }
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
                if ((f = aohj.f) == null) {
                    synchronized (aohj.class) {
                        if (aohj.f == null) {
                            aohj.f = (ahdd)new ahba((ahbh)aohj.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aohj.a;
            }
            case 4: {
                return new ahaz((float[])null, (int[][])null);
            }
            case 3: {
                return new aohj();
            }
            case 2: {
                return newMessageInfo((MessageLite)aohj.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001\u041b\u0002\u1007\u0000\u0003\u1409\u0001", new Object[] { "b", "c", aohk.class, "d", "e" });
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
