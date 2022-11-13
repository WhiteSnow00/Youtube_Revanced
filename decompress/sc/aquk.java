import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aquk extends ahbh implements ahcw
{
    public static final aquk a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public ahbx d;
    
    static {
        ahbh.registerDefaultInstance((Class)aquk.class, (ahbh)(a = new aquk()));
    }
    
    private aquk() {
        this.c = "";
        this.d = ahbh.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aquk.e) == null) {
                    synchronized (aquk.class) {
                        if (aquk.e == null) {
                            aquk.e = (ahdd)new ahba((ahbh)aquk.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aquk.a;
            }
            case 4: {
                return new ahaz((float[][][])null, (boolean[][])null);
            }
            case 3: {
                return new aquk();
            }
            case 2: {
                return newMessageInfo((MessageLite)aquk.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001a", new Object[] { "b", "c", "d" });
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
