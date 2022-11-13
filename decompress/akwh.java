import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akwh extends ahbh implements ahcw
{
    public static final akwh a;
    private static volatile ahdd i;
    public int b;
    public String c;
    public int d;
    public int e;
    public ahbx f;
    public int g;
    public int h;
    
    static {
        ahbh.registerDefaultInstance((Class)akwh.class, (ahbh)(a = new akwh()));
    }
    
    private akwh() {
        this.c = "";
        this.f = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = akwh.i) == null) {
                    synchronized (akwh.class) {
                        if (akwh.i == null) {
                            akwh.i = (ahdd)new ahba((ahbh)akwh.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return akwh.a;
            }
            case 4: {
                return new ahaz((byte[][])null, (char[][][])null);
            }
            case 3: {
                return new akwh();
            }
            case 2: {
                return newMessageInfo((MessageLite)akwh.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u100b\u0001\u0003\u100b\u0002\u0004\u001b\u0005\u100b\u0003\u0006\u100b\u0004", new Object[] { "b", "c", "d", "e", "f", akwk.class, "g", "h" });
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
