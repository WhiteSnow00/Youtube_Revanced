import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akor extends ahbh implements ahcw
{
    public static final akor a;
    private static volatile ahdd f;
    public int b;
    public aklg c;
    public ahbx d;
    public int e;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)akor.class, (ahbh)(a = new akor()));
    }
    
    private akor() {
        this.g = 2;
        this.d = emptyProtobufList();
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
                if ((f = akor.f) == null) {
                    synchronized (akor.class) {
                        if (akor.f == null) {
                            akor.f = (ahdd)new ahba((ahbh)akor.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akor.a;
            }
            case 4: {
                return new ahaz((float[][])null, (float[][])null);
            }
            case 3: {
                return new akor();
            }
            case 2: {
                return newMessageInfo((MessageLite)akor.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u001b\u0004\u100c\u0001", new Object[] { "b", "c", "d", ahwq.class, "e", ajty.u });
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
