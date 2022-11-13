import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahhw extends ahbh implements ahcw
{
    public static final ahhw a;
    private static volatile ahdd e;
    public ahbx b;
    public ahbx c;
    public ahbx d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)ahhw.class, (ahbh)(a = new ahhw()));
    }
    
    private ahhw() {
        this.f = 2;
        this.b = emptyProtobufList();
        this.c = emptyProtobufList();
        this.d = emptyProtobufList();
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
                final ahdd e;
                if ((e = ahhw.e) == null) {
                    synchronized (ahhw.class) {
                        if (ahhw.e == null) {
                            ahhw.e = (ahdd)new ahba((ahbh)ahhw.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahhw.a;
            }
            case 4: {
                return new ahaz((ahbh)ahhw.a);
            }
            case 3: {
                return new ahhw();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahhw.a, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0001\u0001\u041b\u0002\u001b\u0003\u001b", new Object[] { "b", ahhy.class, "c", ahhv.class, "d", ahhx.class });
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
