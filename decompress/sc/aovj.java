import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aovj extends ahbh implements ahcw
{
    public static final aovj a;
    private static volatile ahdd d;
    public anuv b;
    public ahbx c;
    private int e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)aovj.class, (ahbh)(a = new aovj()));
    }
    
    private aovj() {
        this.f = 2;
        this.c = ahbh.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aovj.d) == null) {
                    synchronized (aovj.class) {
                        if (aovj.d == null) {
                            aovj.d = (ahdd)new ahba((ahbh)aovj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aovj.a;
            }
            case 4: {
                return new ahaz((ahbh)aovj.a);
            }
            case 3: {
                return new aovj();
            }
            case 2: {
                return newMessageInfo((MessageLite)aovj.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u001a", new Object[] { "e", "b", "c" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
