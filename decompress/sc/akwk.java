import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akwk extends ahbh implements ahcw
{
    public static final akwk a;
    private static volatile ahdd c;
    public ahbx b;
    
    static {
        ahbh.registerDefaultInstance((Class)akwk.class, (ahbh)(a = new akwk()));
    }
    
    private akwk() {
        this.b = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = akwk.c) == null) {
                    synchronized (akwk.class) {
                        if (akwk.c == null) {
                            akwk.c = (ahdd)new ahba((ahbh)akwk.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akwk.a;
            }
            case 4: {
                return new ahaz((short[][])null, (byte[][][])null);
            }
            case 3: {
                return new akwk();
            }
            case 2: {
                return newMessageInfo((MessageLite)akwk.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", akwj.class });
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
