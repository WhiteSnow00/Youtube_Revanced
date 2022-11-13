import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akvl extends ahbh implements ahcw
{
    public static final akvl a;
    private static volatile ahdd i;
    public int b;
    public aklg c;
    public ahbx d;
    public long e;
    public long f;
    public int g;
    public float h;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)akvl.class, (ahbh)(a = new akvl()));
    }
    
    private akvl() {
        this.j = 2;
        this.d = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = akvl.i) == null) {
                    synchronized (akvl.class) {
                        if (akvl.i == null) {
                            akvl.i = (ahdd)new ahba((ahbh)akvl.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return akvl.a;
            }
            case 4: {
                return new ahaz((boolean[][][])null, (short[][])null);
            }
            case 3: {
                return new akvl();
            }
            case 2: {
                return newMessageInfo((MessageLite)akvl.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u001b\u0003\u1003\u0001\u0004\u1003\u0002\u0005\u100b\u0003\u0006\u1001\u0004", new Object[] { "b", "c", "d", akvj.class, "e", "f", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
