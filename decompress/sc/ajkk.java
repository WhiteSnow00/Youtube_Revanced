import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajkk extends ahbh implements ahcw
{
    public static final ajkk a;
    private static volatile ahdd e;
    public int b;
    public ahbx c;
    public int d;
    
    static {
        ahbh.registerDefaultInstance((Class)ajkk.class, (ahbh)(a = new ajkk()));
    }
    
    private ajkk() {
        this.c = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ajkk.e) == null) {
                    synchronized (ajkk.class) {
                        if (ajkk.e == null) {
                            ajkk.e = (ahdd)new ahba((ahbh)ajkk.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajkk.a;
            }
            case 4: {
                return new ahaz((char[])null, (short[][][])null);
            }
            case 3: {
                return new ajkk();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajkk.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u1004\u0000", new Object[] { "b", "c", ajkj.class, "d" });
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
