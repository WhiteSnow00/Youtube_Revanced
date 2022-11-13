import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidl extends ahbh implements ahcw
{
    public static final aidl a;
    private static volatile ahdd e;
    public int b;
    public ahbx c;
    public ajut d;
    private ahhu f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aidl.class, (ahbh)(a = new aidl()));
    }
    
    private aidl() {
        this.g = 2;
        this.c = emptyProtobufList();
        final ahab b = ahab.b;
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
                final ahdd e;
                if ((e = aidl.e) == null) {
                    synchronized (aidl.class) {
                        if (aidl.e == null) {
                            aidl.e = (ahdd)new ahba((ahbh)aidl.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aidl.a;
            }
            case 4: {
                return new ahaz((ahbh)aidl.a);
            }
            case 3: {
                return new aidl();
            }
            case 2: {
                return newMessageInfo((MessageLite)aidl.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001\u041b\u0002\u1409\u0000\u0004\u1409\u0002", new Object[] { "b", "c", aidk.class, "d", "f" });
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
