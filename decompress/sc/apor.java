import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apor extends ahbh implements ahcw
{
    public static final apor a;
    private static volatile ahdd d;
    public ahbx b;
    public ahbx c;
    
    static {
        ahbh.registerDefaultInstance((Class)apor.class, (ahbh)(a = new apor()));
    }
    
    private apor() {
        this.b = emptyProtobufList();
        this.c = emptyProtobufList();
    }
    
    public final void a() {
        final ahbx b = this.b;
        if (!b.c()) {
            this.b = ahbh.mutableCopy(b);
        }
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = apor.d) == null) {
                    synchronized (apor.class) {
                        if (apor.d == null) {
                            apor.d = (ahdd)new ahba((ahbh)apor.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apor.a;
            }
            case 4: {
                return new ahaz((short[])null, (boolean[][])null);
            }
            case 3: {
                return new apor();
            }
            case 2: {
                return newMessageInfo((MessageLite)apor.a, "\u0001\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u001b\u0003\u001b", new Object[] { "b", apoo.class, "c", apoq.class });
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
