import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aohl extends ahbh implements ahcw
{
    public static final aohl a;
    private static volatile ahdd c;
    public ahbx b;
    private byte d;
    
    static {
        ahbh.registerDefaultInstance((Class)aohl.class, (ahbh)(a = new aohl()));
    }
    
    private aohl() {
        this.d = 2;
        this.b = emptyProtobufList();
    }
    
    public final void a() {
        final ahbx b = this.b;
        if (!b.c()) {
            this.b = ahbh.mutableCopy(b);
        }
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte d = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aohl.c) == null) {
                    synchronized (aohl.class) {
                        if (aohl.c == null) {
                            aohl.c = (ahdd)new ahba((ahbh)aohl.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aohl.a;
            }
            case 4: {
                return new ahaz((byte[][][])null, (byte[][])null);
            }
            case 3: {
                return new aohl();
            }
            case 2: {
                return newMessageInfo((MessageLite)aohl.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "b", aohj.class });
            }
            case 1: {
                if (o == null) {
                    d = 0;
                }
                this.d = d;
                return null;
            }
            case 0: {
                return this.d;
            }
        }
    }
}
